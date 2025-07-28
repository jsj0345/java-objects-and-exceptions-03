package nested.local;

/*
내부 클래스 (Inner Class)
외부 클래스의 멤버처럼 정의됨.

외부 클래스의 인스턴스가 필수임.

외부 인스턴스 없이 내부 클래스를 만들려고 하면 컴파일 에러남.

개발자가 직접 외부 클래스 인스턴스를 기준으로 생성해야 함.

 */

/*
지역 클래스 (Local Class)
메서드나 블록 내부에서 정의됨.

외부 클래스의 인스턴스를 암묵적으로 캡처함.

외부 인스턴스를 직접 전달할 필요 없음.

지역 클래스 정의 위치가 이미 외부 클래스 인스턴스의 맥락 안이기 때문에, 컴파일러가 알아서 처리함.
 */

public class LocalOuterV1 {

  private int outInstanceVar = 3;

  public void process(int paramVar) {
    int localVar = 1;

    class LocalPrinter { // 지역 클래스는 지역 변수 처럼 접근 제어자를 사용할 수 없다.
       int value = 0;

       public void printData() {
         System.out.println("value = " + value);
         System.out.println("localVar = " + localVar);
         System.out.println("paramVar = " + paramVar);
         System.out.println("outInstanceVar = " + outInstanceVar);
       }

    }

    LocalPrinter printer = new LocalPrinter();
    printer.printData();
  }

  public static void main(String[] args) {
    LocalOuterV1 localOuter = new LocalOuterV1();
    localOuter.process(2);
  }

}

/*
package nested.local;

public class LocalOuterV1 {

  private int outInstanceVar = 3;

  public void process(int paramVar) {

    int localVar = 1;

    class LocalPrinter {
      int value = 0;

      public void printData() {
        System.out.println("value = " + value);
        System.out.println("localVar = " + localVar);
        System.out.println("paramVar = " + paramVar);
        System.out.println("outInstanceVar = " + outInstanceVar);
      }
    }

    LocalPrinter printer = new LocalPrinter();
    printer.printData();
  }

  public static void main(String[] args) {
    LocalOuterV1 localOuter = new LocalOuterV1();
    localOuter.process(2);
  }

}



 */