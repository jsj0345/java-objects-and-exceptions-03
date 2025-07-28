package nested.anonymous.ex;

public class Ex0Main {

  public static void hello(String str) {
    System.out.println("프로그램 시작");
    System.out.println(str);
    System.out.println("프로그램 종료");
  }



  public static void main(String[] args) {
    Ex0Main.hello("Hello Java");
    Ex0Main.hello("Hello Spring");
    /*
    참고 println()에는 어떠한 형태가 있는 값이 들어가야 하는데 void가 들어가면 불가능.
     */
  }

}

/*
package nested.anonymous.ex;

public class Ex0Main {

  public static void helloJava() {
    System.out.println("프로그램 시작");
    System.out.println("Hello Java");
    System.out.println("프로그램 종료");
  }

  public static void helloSpring() {
    System.out.println("프로그램 시작");
    System.out.println("Hello Spring");
    System.out.println("프로그램 종료");
  }

  public static void main(String[] args) {
    Ex0Main.helloSpring();
    Ex0Main.helloJava();
  }

}

 */
