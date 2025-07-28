package enumeration.ex2;

public class ClassGradeEx2_2 {
  public static void main(String[] args) {
    int price = 10000;

    DiscountService discountService = new DiscountService();


    /*
    Ctrl + Shift + / 를 누르면 한번에 주석 처리 가능함.
    ClassGrade newclassGrade = new ClassGrade();
    int result = discountService.discount(ClassGrade.DIAMOND, price);
    System.out.println("newClassGrade 등급의 할인 금액:  " + result);
    */
  }
}

/*
package enumeration.ex2;

public class ClassGradeEx2_2 {

  public static void main(String[] args) {
    int price = 10000;

    DiscountService discountService = new DiscountService();

    ClassGrade newClassGrade = new ClassGrade(); // 생성자 private으로 막아야함.

    int result = discountService.discount(newClassGrade, price);
    System.out.println("newClassGrade 등급의 할인 금액: " + result);
  }

}

private 생성자를 사용해서 외부에서 ClassGrade를 임의로 생성하지 못함.

private 생성자 덕분에 ClassGrade의 인스턴스를 생성하는 것은 ClassGrade 클래스 내부에서만 할 수 있다.
앞서 우리가 정의한 상수들은 ClassGrade 클래스 내부에서 ClassGrade 객체를 생성한다.

이제 ClassGrade 인스턴스를 사용할때는 ClassGrade 내부에 정의한 상수를 사용해야한다.

쉽게 이야기해서 ClassGrade 타입에 값을 전달할 때는 우리가 앞서 열거한
BASIC, GOLD, DIAMOND만 사용할 수 있다.

타입 안전 열거형 패턴 (Type-Safe Enum Pattern)의 장점
-타입 안정성 향상: 정해진 객체만 사용할 수 있기 때문에, 잘못된 값을 입력하는 문제를 근본적으로 방지할 수 있다.

-데이터 일관성: 정해진 객체만 사용하므로 데이터의 일관성이 보장된다.

제한된 인스턴스 생성: 클래스는 사전에 정의된 몇 개의 인스턴스만 생성하고, 외부에서는 이 인스턴스들만 사용할 수 있도록
한다. 이를 통해 미리 정의된 값들만 사용하도록 보장한다.






 */