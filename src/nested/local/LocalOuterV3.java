package nested.local;

import java.lang.reflect.Field;

/*
클래스 변수: 프로그램 종료 까지, 가장 길다(메서드 영역)
- 클래스 변수(static 변수)는 메서드 영역에 존재하고, 자바가 클래스 정보를 읽어 들이는 순간부터 프로그램 종료까지 존재한다.

인스턴스 변수: 인스턴스의 생존 기간(힙 영역)
- 인스턴스 변수는 본인이 소속된 인스턴스가 GC 되기 전까지 존재한다. 생존 주기가 긴 편이다.

지역 변수: 메서드 호출이 끝나면 사라짐(스택 영역)
- 지역 변수는 스택 영역의 스택 프레임 안에 존재한다.
따라서 메서드가 호출 되면 생성되고, 메서드 호출이 종료되면
스택 프레임이 제거되면서 그 안에 있는 지역 변수도 모두 제거된다.
생존 주기가 아주 짧다.
참고로 매개변수도 지역 변수의 한 종류이다.

(참고)

main() 메서드 코드 자체는 ➤ 메서드 영역에 저장됨

main() 메서드 실행 시 필요한 변수, 매개변수 등은 ➤ 스택 영역에 저장됨

 */

public class LocalOuterV3 {

  private int outInstanceVar = 3;

  public Printer process(int paramVar) {
    int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

    class LocalPrinter implements Printer {
       int value = 0; //
       /*
       field = final nested.local.LocalOuterV3 nested.local.LocalOuterV3$1LocalPrinter.this$0
       결과가 이렇게 나오는데 사실 LocalOuterV3 변수; 이게 숨어 있던거임.

       이전에 배운 내부클래스도 보면 되게 자연스럽게 외부 클래스의 변수에 접근 할 수 있었는데
       사실은 내부 클래스에서 외부 클래스의 참조값을 가지고 있어서 접근이 가능했던것임.

        */
       @Override
       public void print() {
         System.out.println("value = " + value);

         //인스턴스는 지역 변수보다 더 오래 살아남는다.
         System.out.println("localVar = " + localVar);
         System.out.println("paramVar = " + paramVar);
         System.out.println("outInstanceVar = " + outInstanceVar);
       }

       /*
       메서드 안에 선언된 클래스가 있으면 그 클래스는 지역 클래스잖아.
       근데 외부에서 메서드를 호출 한다면
       이때 지역클래스 위에 있으면서 메서드 안에 있는 모든 변수들의 값을 전부 다 캡처하는거야?

       -> 아니야! "사용한" 지역 변수만 캡처함.
        */
    }

    LocalPrinter printer = new LocalPrinter();

    // printer.print(); < 를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
    return printer;
  }

  public static void main(String[] args) {
    LocalOuterV3 localOuter = new LocalOuterV3();
    Printer printer = localOuter.process(2);
    /*
    printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행.
    근데 스택 프레임이 끝나면 당연히 지역 변수는 유효하지않음.
    그럼에도 불구하고 아래 처럼 printer.print();를 하면 변수들의 값이 정상적으로 출력이 된다.

    왜 그런걸까?

    자바는 이런 문제를 해결하기 위해 지역 클래스의 인스턴스를 생성하는 시점에 필요한 지역 변수를 복사해서 생성한 인
    스턴스에 함께 넣어둔다. 이런 과정을 변수 캡처(Capture)라 한다.

     */
    printer.print();

    //추가
    System.out.println("필드 확인");
    System.out.println(printer.getClass());
    Field[] fields = printer.getClass().getDeclaredFields();

    for (Field field : fields) {
      System.out.println("field = " + field);

      /*

      field = int nested.local.LocalOuterV3$1LocalPrinter.value
      field = final int nested.local.LocalOuterV3$1LocalPrinter.val$localVar
      field = final int nested.local.LocalOuterV3$1LocalPrinter.val$paramVar
      field = final nested.local.LocalOuterV3 nested.local.LocalOuterV3$1LocalPrinter.this$0

      지역 클래스 입장에선 localVar, paramVar, outInstanceVar는 외부 요소여서 $가 붙는거 같음.

       */
    }
  }

  /*
  그럼 결론이 지역 변수라는건 어떤 블록 내에서만 존재하는 변수고
  인스턴스 변수는 블록 내가아닌 클래스 안에 있는 변수 이렇게 생각하면돼?

  -> Yes
  */

}

/*
package nested.local;

public class LocalOuterV3 {

  private int outInstanceVar = 3;

  public Printer process(int paramVar) {

    int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

    class LocalPrinter implements Printer {

      int value = 0;

      @Override
      public void print() {
        System.out.println("value = " + value);

        // 인스턴스는 지역 변수보다 더 오래 살아남는다.
        System.out.println("localVar = " + localVar);
        System.out.println("paramVar = " + paramVar);

        System.out.println("outInstanceVar = " + outInstanceVar);
      }

    }

    Printer printer = new LocalPrinter();
    // printer.print()를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
    return printer;

    printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행.
    근데 스택 프레임이 끝나면 당연히 지역 변수는 유효하지않음.
    그럼에도 불구하고 아래 처럼 printer.print();를 하면 변수들의 값이 정상적으로 출력이 된다.

    왜 그런걸까?

    자바는 이런 문제를 해결하기 위해 지역 클래스의 인스턴스를 생성하는 시점에 필요한 지역 변수를 복사해서 생성한 인
    스턴스에 함께 넣어둔다. 이런 과정을 변수 캡처(Capture)라 한다.

 }

 public static void main(String[] args) {
   LocalOuterV3 localOuter = new LocalOuterV3();
   Printer printer = localOuter.process(2);



   //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행한다.
   printer.print();
 }


}



클래스 변수: 프로그램 종료 까지, 가장 길다(메서드 영역)
- 클래스 변수(static 변수)는 메서드 영역에 존재하고, 자바가 클래스 정보를 읽어 들이는 순간부터 프로그램 종료까지 존재한다.

인스턴스 변수: 인스턴스의 생존 기간(힙 영역)
- 인스턴스 변수는 본인이 소속된 인스턴스가 GC 되기 전까지 존재한다. 생존 주기가 긴 편이다.

지역 변수: 메서드 호출이 끝나면 사라짐(스택 영역)
- 지역 변수는 스택 영역의 스택 프레임 안에 존재한다.
따라서 메서드가 호출 되면 생성되고, 메서드 호출이 종료되면
스택 프레임이 제거되면서 그 안에 있는 지역 변수도 모두 제거된다.
생존 주기가 아주 짧다.
참고로 매개변수도 지역 변수의 한 종류이다.

(참고)

main() 메서드 코드 자체는 ➤ 메서드 영역에 저장됨

main() 메서드 실행 시 필요한 변수, 매개변수 등은 ➤ 스택 영역에 저장됨


 */




