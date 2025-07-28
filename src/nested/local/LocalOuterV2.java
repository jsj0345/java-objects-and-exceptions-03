package nested.local;

public class LocalOuterV2 {

  private int outInstanceVar = 3;

  public void process(int paramVar) {
    int localVar = 1;

    class LocalPrinter implements Printer { // 지역 클래스는 지역 변수 처럼 접근 제어자를 사용할 수 없다.
       // 지역 클래스여도 인터페이스 상속받기 가능.
       int value = 0;

       @Override
       public void print() {
         System.out.println("value = " + value);
         System.out.println("localVar = " + localVar);
         System.out.println("paramVar = " + paramVar);
         System.out.println("outInstanceVar = " + outInstanceVar);
       }
    }

    LocalPrinter printer = new LocalPrinter();
    /*
    2. 컴파일러가 외부 인스턴스를 자동으로 캡쳐함 (지역 클래스 기준)
    지역 클래스 내부에서는 외부 클래스의 인스턴스 변수(outerField)에 접근 가능함.

    이건 컴파일러가 지역 클래스 안에 외부 클래스의 참조를 자동으로 저장해주기 때문임. 즉, Outer.this가 암묵적으로 전달됨.

    개발자가 직접 new Outer().new Inner()처럼 외부 참조를 넣어줄 필요가 없음.
    */
    printer.print();
  }

  public static void main(String[] args) {
    LocalOuterV2 localOuter = new LocalOuterV2();
    localOuter.process(2);
  }

  /*
  복습

  클래스 변수: 프로그램 종료 까지, 가장 길다(메서드 영역)
  - 클래스 변수(static 변수)는 메서드 영역에 존재하고, 자바가 클래스 정보를 읽어 들이는 순간부터 프로그램 종료까지 존재한다.

  인스턴스 변수: 인스턴스의 생존 기간(힙 영역)
  - 인스턴스 변수는 본인이 소속된 인스턴스가 GC 되기 전까지 존재한다. 생존 주기가 긴 편이다.

  지역 변수: 메서드 호출이 끝나면 사라짐(스택 영역)
  - 지역 변수는 스택 영역의 스택 프레임 안에 존재한다.
  따라서 메서드가 호출 되면 생성되고, 메서드 호출이 종료되면 스택 프레임이 제거되면서
  그 안에 있는 지역 변수도 모두 제거된다. 생존 주기가 아주 짧다.
  참고로 매개변수도 지역 변수의 한 종류이다.
   */



}

/*
package nested.local;

public class LocalOuterV2 {

  private int outInstanceVar = 3;

  public void process(int paramVar) {

    int localVar = 1;

    class LocalPrinter implements Printer { // 지역 클래스는 지역 변수처럼 접근 제어자를 사용 할 수 없다.
      // 지역 클래스여도 인터페이스 상속 받기 가능하다.
      int value = 0;

      @Override
      public void print() {
        System.out.println("value = " + value);
        System.out.println("paramVar = " + paramVar);
        System.out.println("localVar = " + localVar);
        System.out.println("outInstanceVar = " + outInstanceVar);
      }

   }

   Printer printer = new LocalPrinter();
   printer.print();

   컴파일러가 외부 인스턴스를 자동으로 캡쳐함 (지역 클래스 기준)
   지역 클래스 내부에서는 외부 클래스의 인스턴스 변수(outerField)에 접근 가능함.

   이건 컴파일러가 지역 클래스 안에 외부 클래스의 참조를 자동으로 저장해주기 때문임. 즉, Outer.this가 암묵적으로 전달됨.

   개발자가 직접 new Outer().new Inner() 처럼 외부 참조를 넣어줄 필요가 없음.

 }

 public static void main(String[] args) {
   LocalOuterV2 localOuter = new LocalOuterV2();
   localOuter.process(2);
 }



}




 */
