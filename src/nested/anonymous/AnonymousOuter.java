package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter { // 클래스명을 바꾸고 싶으면 shif+f6을 눌러보자.

  private int outInstanceVar = 3;

  public void process(int paramVar) {
    int localVar = 1;

    Printer printer = new Printer() {
      /*
      앞에서 LocalOuter 클래스를 보면..

      클래스를 생성하고 인스턴스를 생성해야 했음.

      그러한 과정을 위에 Printer printer = new Printer()로 끝낸 것.

      인터페이스를 구현 하면서 인터페이스의 구현체를 이름 없이 만듬.

      익명 클래스는 독자적으로 클래스를 만드는게 불가능함.

      왜냐면 우리가 보통 메인 메서드에서 인스턴스를 생성하고 참조값을 갖는 참조변수로 호출을 하는데..

      익명 클래스로 클래스를 만든다? 이상함.

      익명 클래스는 상속 받을 클래스나 인터페이스가 있어야 생성 가능.  (단 한번만 사용 할 클래스 여서
      특정 부모 클래스(인터페이스)를 상속 받고 바로 생성하는 경우 사용.)

       */
      int value = 0;

      @Override
      public void print() {
        System.out.println("value = " + value);
        System.out.println("localVar = " + localVar);
        System.out.println("paramVar = " + paramVar);
        System.out.println("outInstanceVar = " + outInstanceVar);
      }
    };

    printer.print();

    System.out.println("printer.class = " + printer.getClass());
    /*
    익명 클래스의 경우, 출력이 다음과 같이 나옴
    printer.class = class nested.anonymous.AnonymousOuter$1
    원래는 $다음 클래스 명이 나오는데 익명 클래스는 이름이 없으므로 숫자로 나옴.
     */

  }

  /*
  익명 클래스는 이름이 없는 지역 클래스이다.
  특정 부모 클래스(인터페이스)를 상속 받고 바로 생성하는 경우 사용한다.
  지역 클래스가 일회성으로 사용되는 경우나 간단한 구현을 제공할 때 사용한다.
   */

  public static void main(String[] args) {
    AnonymousOuter main = new AnonymousOuter();
    main.process(2);

  }

}

/*
package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

  private int outInstanceVar = 3;

  public void process(int paramVar) {

    int localVar = 1;

    Printer printer = new Printer() {

    앞에서 LocalOuter 클래스를 보면..

      클래스를 생성하고 인스턴스를 생성해야 했음.

      그러한 과정을 위에 Printer printer = new Printer()로 끝낸 것.

      인터페이스를 구현 하면서 인터페이스의 구현체를 이름 없이 만듬.

      익명 클래스는 독자적으로 클래스를 만드는게 불가능함.

      왜냐면 우리가 보통 메인 메서드에서 인스턴스를 생성하고 참조값을 갖는 참조변수로 호출을 하는데..

      익명 클래스로 클래스를 만든다? 이상함.

      익명 클래스는 상속 받을 클래스나 인터페이스가 있어야 생성 가능.  (단 한번만 사용 할 클래스 여서
      특정 부모 클래스(인터페이스)를 상속 받고 바로 생성하는 경우 사용.)


      int value = 0;

      @Override
      public void print() {
        System.out.println("value = " + value);
        System.out.println("localVar = " + localVar);
        System.out.println("paramVar = " + paramVar);
        System.out.println("outInstanceVar = " + outInstanceVar);
      }
    };

    printer.print();
    System.out.println("printer.class = " + printer.getClass());
  }

  익명 클래스는 이름이 없는 지역 클래스이다.
  특정 부모 클래스(인터페이스)를 상속 받고 바로 생성하는 경우 사용한다.
  지역 클래스가 일회성으로 사용되는 경우나 간단한 구현을 제공할 때 사용한다.



  public static void main(String[] args) {
    AnonymousOuter main = new AnonymousOuter();
    main.process(2);
  }

}

  new Printer() {body}

  익명 클래스는 클래스의 본문(body)을 정의하면서 동시에 생성한다.
  new 다음에 바로 상속 받으면서 구현 할 부모 타입을 입력하면 된다.
  이 코드는 마치 인터페이스 Printer를 생성하는 것 처럼 보인다.
  하지만 자바에서 인터페이스를 생성하는 것을 불가능하다.
  이 코드는 인터페이스를 생성하는 것이 아니고, Printer 라는 이름의 인터페이스를
  구현한 익명 클래스를 생성하는 것이다.
  {body} 부분에 Printer 인터페이스를 구현한 코드를 작성하면 된다.
  이 부분이 바로 익명 클래스의 본문이 된다.
  쉽게 이야기해서 Printer를 상속(구현) 하면서 바로 생성하는 것이다.

  익명 클래스 특징

  - 익명 클래스는 이름 없는 지역 클래스를 선언하면서 동시에 생성한다.

  - 익명 클래스는 부모 클래스를 상속 받거나, 또는 인터페이스를 구현해야 한다.
  익명 클래스를 사용할 때는 상위 클래스나 인터페이스가 필요하다.

  - 익명 클래스는 말 그대로 이름이 없다. 이름을 가지지 않으므로, 생성자를 가질 수 없다.

  익명 클래스는 단 한번만 인스턴스를 생성할 수 있다.




}




 */

