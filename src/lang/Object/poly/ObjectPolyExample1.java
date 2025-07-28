package lang.Object.poly;

public class ObjectPolyExample1 {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Car car = new Car();
    action(dog);
    action(car);
  }

  private static void action(Object obj) {
    //obj.sound(); //컴파일 오류, Object는 sound()가 없다.
    //obj.move(); //컴파일 오류, Object는 move()가 없다.

    // 객체에 맞는 다운캐스팅 필요
    if(obj instanceof Dog dog) {
      dog.sound();

      /*
      Dog dog = (Dog) obj; << 이거를 생략할수 있음 obj instanceof Dog dog에서 이미 처리됐기 때문.
      */
    } else if(obj instanceof Car car){
      car.move();
    }
  }
}

/*
package lang.Object.poly;

public class ObjectPolyExample1 {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Car car = new Car();

    action(dog);
    action(car);
  }

  private static void action(Object obj) {
    //obj.sound(); // 컴파일 오류, Object는 sound()가 없다.
    //obj.move(; // 컴파일 오류, Object는 move()가 없다.

    // 객체에 맞는 다운캐스팅 필요
    if(obj instanceof Dog dog) { A instanceof B가 있으면 A가 B로 다운캐스팅이 가능한지를 물어보는 것.
      dog.sound();
    } else if(obj instanceof Car car) {
      car.move();
    }
  }

}

Object를 활용한 다형성의 한계

Object는 모든 객체를 대상으로 다형적 참조를 할 수 있다.

쉽게 이야기해서 Object는 모든 객체의 부모이므로 모든 객체를 담을 수 있다.

Object를 통해 전달 받은 객체를 호출하려면 각 객체에 맞는 다운 캐스팅 과정이 필요하다.

Object가 세상의 모든 메서드를 알고 있는 것이 아니다.

다형성을 제대로 활용하려면 자바 기본편에서 배운 것 처럼 다형적 참조 + 메서드 오버라이딩을 함께 사용해야 한다.

그런면에서 Object를 사용한 다형성에는 한계가 있다.

Object는 모든 객체의 부모이므로 모든 객체를 대상으로 다형적 참조를 할 수 있다.

하지만 Object에는 Dog.sound(), Car.move()와 같은 다른 객체의 메서드가 정의되어 있지 않다.

따라서 오버라이딩을 활용 할 수 없다.

결국 각 객체의 기능을 호출하려면 다운캐스팅을 해야 한다.

다형적 참조는 가능하나, 메서드 오버라이딩이 안되기 때문에 다형성을 활용하기에는 한계가 있다.

 */
