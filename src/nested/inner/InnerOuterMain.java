package nested.inner;

public class InnerOuterMain {

  public static void main(String[] args) {
    InnerOuter outer = new InnerOuter();
    InnerOuter.Inner inner = outer.new Inner();
    inner.print();

    System.out.println("innerClass = " + inner.getClass());
    System.out.println(inner.getInnerInstanceValue());

    /*
    NestedOuter.Nested nested = new NestedOuter.Nested();
    여기서 Nested 클래스는 static class임.

    우리가 앞서 배운걸 생각해보면 static에 접근 할 때는 클래스명.~ 이런식으로 접근함.
    똑같은 느낌임.

   근데 InnerOuter, Inner를 보면 둘다 인스턴스임.
   그래서 참조값을 알아 낸 다음에 접근을 해야함
   따라서 outer.new Inner(); 이런 형식임.

   */
  }
}

/*
package nested.inner;

public class InnerOuterMain {

  public static void main(String[] args) {
    InnerOuter outer = new InnerOuter();
    InnerOuter.Inner inner = outer.new Inner();
    inner.print();

    System.out.println("innerClass = " + inner.getClass());
  }

}
 */

