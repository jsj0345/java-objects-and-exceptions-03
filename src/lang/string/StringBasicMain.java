package lang.string;

public class StringBasicMain {
  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = new String("hello");


    // 소문자로 시작하는 형 -> 기본형, 대문자로 시작하는 형 -> 참조형

    System.out.println("str1 = " + str1);
    System.out.println("str2 = " + str2);
  }
}

/*
package lang.string;

public class StringBasicMain {
  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = new String("hello");

    System.out.println("str1 = " + str1);
    System.out.println("str2 = " + str2);
  }
}

String은 클래스다. int, boolean 같은 기본형이 아닌 참조형.
따라서, str1 변수에는 String 인스턴스의 참조값만 들어갈 수 있다.

str1과 str2의 차이점은 저렇게 선언하면 어떤 메모리 영역에 저장되는가이다.

따라서, 다음 코드는 뭔가 어색함.
String str1 = "hello";


 */
