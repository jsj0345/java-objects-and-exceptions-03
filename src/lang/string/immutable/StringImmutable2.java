package lang.string.immutable;

public class StringImmutable2 {
  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = str1.concat(" java"); // 문자열을 합치는 메서드.
    System.out.println("str1 = " + str1); // String은 불변 클래스여서 내부 속성 값이 final로 선언됨.
    System.out.println("str2 = " + str2);

  }
}

/*
package lang.string.immutable;

public class StringImmutable2 {
  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = str1.concat(" java"); // 문자열을 합치는 메서드
    System.out.println("str1 = " + str1);
    System.out.println("str2 = " + str2);
  }
}

String이 불변으로 설계된 이유

문자열 풀에 있는 String 인스턴스의 값이 중간에 변경되면 같은 문자열을 참고하는 다른 변수의 값도 함께 변경된다.

 */