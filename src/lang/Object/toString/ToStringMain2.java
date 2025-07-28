package lang.Object.toString;

public class ToStringMain2 {
  public static void main(String[] args) {
    Car car = new Car("Model Y");
    Dog dog1 = new Dog("멍멍이1",2);
    Dog dog2 = new Dog("멍멍이2",5);

    System.out.println("1. 단순 toString 호출");
    System.out.println(car.toString());
    System.out.println(dog1.toString());
    System.out.println(dog2.toString());

    System.out.println("2. println 내부에서 toString 호출");
    System.out.println(car);
    System.out.println(dog1);
    System.out.println(dog2);

    System.out.println("3. Object 다형성 활용");
    ObjectPrinter.print(car);
    ObjectPrinter.print(dog1);
    ObjectPrinter.print(dog2);


    String refValue = Integer.toHexString(System.identityHashCode(dog1));
    System.out.println("refValue = "+ refValue);

    /*
    String refvalue = Integer.toHexString(System.identityHashCode(dog1));
    System.out.println("refValue = " +refValue);
     */

    /*
    String refValue = Integer.toHexString(System.identityHashCode(dog1));
    System.out.println("refValue = "+ refValue);

    toString()을 오버라이딩하면 참조값을 볼 수가 없음. 위 코드를 이용하자.
     */
  }
}

/*
package lang.Object.toString;

public class ToStringMain2 {
  public static void main(String[] args) {
    Car car = new Car("ModelY");
    Dog dog1 = new Dog("멍멍이1",2);
    Dog dog2 = new Dog("멍멍이2",5);

    System.out.println("1. 단순 toString 호출");
    System.out.println(car.toString());
    System.out.println(dog1.toString());
    System.out.println(dog2.toString());

    System.out.println("2. println 내부에서 toString 호출");
    // println 내부에서 toString 호출
    System.out.println(car);
    System.out.println(dog1);
    System.out.println(dog2);

    System.out.println("3. Object 다형성 활용");
    ObjectPrinter.print(car);
    ObjectPrinter.print(dog1);
    ObjectPrinter.print(dog2);

  }
}

정적 의존관계는 컴파일 시간에 결정되며, 주로 클래스 간의 관계를 의미한다.

앞서 보여준 클래스 의존 관계 그림이 바로 정적 의존관계이다.

쉽게 이야기해서 프로그램을 실행하지 않고, 클래스 내에서 사용하는 타입들만 보면

쉽게 의존 관계를 파악할 수 있다.

동적 의존관계는 프로그램을 실행하는 런타임에 확인할 수 있는 의존관계이다.
앞서 ObjectPrinter.print(Object obj)에 인자로 어떤 객체가 전달 될 지는
프로그램을 실행해봐야 알 수 있다.
어떤 경우에는 Car 인스턴스가 넘어오고, 어떤 경우에는 Dog 인스턴스가 넘어온다.
이렇게 런타임에 어떤 인스턴스를 사용하는지를 나타내는 것이 동적 의존관계이다.


BadObjectPrinter 는 구체적인 타입인 Car , Dog 를 사용한다. 따라서 이후에 출력해야 할 구체적인 클래스가 10
개로 늘어나면 구체적인 클래스에 맞추어 메서드도 10개로 계속 늘어나게 된다. 이렇게 BadObjectPrinter 클래스
가 구체적인 특정 클래스인 Car , Dog 를 사용하는 것을 BadObjectPrinter 는 Car , Dog 에 의존한다고 표현한
다.

참고로 단순히 의존관계 또는 어디에 의존한다고 하면 주로 정적 의존관계를 뜻한다.
예) ObjectPrinter 는 Object 에 의존한다.

 */
