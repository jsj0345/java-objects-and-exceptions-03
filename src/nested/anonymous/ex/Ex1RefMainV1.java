package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {

  public static void hello(Process process) {
    /*
    Process는 인터페이스인데 인터페이스로 접근 가능한 참조 변수를 매개 변수로 쓰는데 왜 이게 가능한가?
    원래 인터페이스는 인스턴스 생성 자체가 불가한데 왜 가능한걸까...

    이러한 이유는 다음과 같다.

    -> "인스턴스를 못 만든다"는 말의 정확한 의미는 자체로 new를 못한다. 라는 뜻이다.
    직접적으로 인스턴스 생성이 불가 하다. (인터페이스는 구현이 없기 때문에 어떤 동작을 해야 할지 알 수 없음.)

    결론: 인스턴스를 못 만든다 는 건 해당 타입 자체로는 new를 할 수 없다.

    그럼에도 불구하고 참조 변수는 왜 가능한가?

    자바에서 변수의 타입은 "참조 타입"일 뿐임. ( 즉 그러한 참조 타입으로만 접근 가능하다.)

    [요약]

    - 인터페이스/추상 클래스는 자체로는 인스턴스 생성이 불가하다.

    - 하지만 참조 변수 타입으로는 사용 가능하다. 왜냐면 어차피 그 타입이 아닌 다른 타입으로 new를 하면됨(다형성)

    예전엔 그냥 Process가 상위 개념이니까 상위개념은 하위개념을 담을 수 있다고 해서 Process process= new Dice();
    이게 가능하다고 외운 건데 지금 보면 인터페이스로 직접적인 접근도 불가하고 인스턴스를 직접 만들수 없으니까 저렇게 간접적으로 한거였네.
     */

    System.out.println("프로그램 시작");
    //코드 조각 시작
    process.run();
    //코드 조각 종료
    System.out.println("프로그램 종료");
  }

  static class Dice implements Process {

    @Override
    public void run() {
      int randomValue = new Random().nextInt(6) + 1;
      System.out.println("주사위 = " + randomValue);
    }
  }

  static class Sum implements Process {

    @Override
    public void run() {
      for (int i = 1; i<=3; i++){
        System.out.println("i = " + i);
      }
    }
  }

  public static void main(String[] args) {
    Process dice = new Dice();
    Process sum = new Sum();

    System.out.println("Hello 실행");
    hello(dice);
    hello(sum);
  }

}

/*
package nested.anonymous.ex;

import java.util.Random;

// 정적 중첩 클래스 사용

public class Ex1RefMainV1 {

  public static void hello(Process process) {
    System.out.println("프로그램 시작");
    //코드 조각 시작
    process.run();
    //코드 조각 종료
    System.out.println("프로그램 종료");
  }

  static class Dice implements Process {

    @Override
    public void run() {
      int randomValue = new Random().nextInt(6) + 1;
      System.out.println("주사위 = " + randomValue);
    }

  }

  static class Sum implements Process {

    @Override
    public void run() {
      for (int i = 1; i<=3; i++) {
        System.out.println("i = " + i);
      }
    }
  }

  public static void main(String[] args) {
    Process dice = new Dice();
    Process sum = new Sum();

    System.out.println("Hello 실행");
    hello(dice);
    hello(sum);
  }


    Process는 인터페이스인데 인터페이스로 접근 가능한 참조 변수를 매개 변수로 쓰는데 왜 이게 가능한가?
    원래 인터페이스는 인스턴스 생성 자체가 불가한데 왜 가능한걸까...

    이러한 이유는 다음과 같다.

    -> "인스턴스를 못 만든다"는 말의 정확한 의미는 자체로 new를 못한다. 라는 뜻이다.
    직접적으로 인스턴스 생성이 불가 하다. (인터페이스는 구현이 없기 때문에 어떤 동작을 해야 할지 알 수 없음.)

    결론: 인스턴스를 못 만든다 는 건 해당 타입 자체로는 new를 할 수 없다.

    그럼에도 불구하고 참조 변수는 왜 가능한가?

    자바에서 변수의 타입은 "참조 타입"일 뿐임. ( 즉 그러한 참조 타입으로만 접근 가능하다.)

    [요약]

    - 인터페이스/추상 클래스는 자체로는 인스턴스 생성이 불가하다.

    - 하지만 참조 변수 타입으로는 사용 가능하다. 왜냐면 어차피 그 타입이 아닌 다른 타입으로 new를 하면됨(다형성)

    예전엔 그냥 Process가 상위 개념이니까 상위개념은 하위개념을 담을 수 있다고 해서 Process process= new Dice();
    이게 가능하다고 외운 건데 지금 보면 인터페이스로 직접적인 접근도 불가하고 인스턴스를 직접 만들수 없으니까 저렇게 간접적으로 한거였네.



}


 */
