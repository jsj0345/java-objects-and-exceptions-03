package nested.local;

public class LocalOuterV4 {

  private int outInstanceVar = 3;

  public Printer process(int paramVar) {
    int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

    class LocalPrinter implements Printer {
       int value = 0; //

       @Override
       public void print() {
         System.out.println("value = " + value);

         //인스턴스는 지역 변수보다 더 오래 살아남는다.
         System.out.println("localVar = " + localVar);
         System.out.println("paramVar = " + paramVar);
         System.out.println("outInstanceVar = " + outInstanceVar);
       }


    }

    LocalPrinter printer = new LocalPrinter();
    // 만약 localVar의 값을 변경한다면? 다시 캡쳐해야 하나??
    // localVar = 10; // 컴파일 오류
    // paramVar = 20; // 컴파일 오류  -> 캡처를 했는데 다시 바꾸면 동기화 문제 발생.
    /*
    이렇게 되면 스택 영역에 존재하는 지역 변수의 값과 인스턴스에 캡처한 캡처 변수의 값이
    서로 달라지는 문제가 발생한다.

    이것을 동기화 문제라 한다.

    물론 자바 언어를 설계할 때 지역 변수의 값이 변경되면 인스턴스에 캡처한
    변수의 값도 함께 변경하도록 설계하면 된다.

    하지만 이로 인해 수 많은 문제들이 파생될 수 있다.

    [캡처 변수의 값을 변경하지 못하는 이유]
    - 지역 변수의 값을 변경하면 인스턴스에 캡처한 변수의 값도 변경해야 한다.
    - 반대로 인스턴스에 있는 캡처 변수의 값을 변경하면 해당 지역 변수의 값도 다시 변경해야 한다.
    - 개발자 입장에서 보면 예상하지 못한 곳에서 값이 변경될 수 있다. 이는 디버깅을 어렵게 한다.
     */

    return printer;
  }

  public static void main(String[] args) {
    LocalOuterV4 localOuter = new LocalOuterV4();
    Printer printer = localOuter.process(2);
    printer.print();
  }

}

/*
package nested.local;

public class LocalOuterV4 {

  private int outInstanceVar = 3;

  public Printer process(int paramVar) {

    int localVar = 1;

    class LocalPrinter implements Printer {

      int value = 0;

      @Override
      public void print() {
        System.out.println("value = " + value);
        System.out.println("localVar = " + localVar);
        System.out.println("paramVar = " + paramVar);
        System.out.println("outInstanceVar = " + outInstanceVar);
      }

    }

    Printer printer = new LocalPrinter();
    // 만약 localVar의 값을 변경한다면? 다시 캡처해야 하나??


 */






