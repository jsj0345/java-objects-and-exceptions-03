package lang.string.method;

public class StringInfoMain {

  public static void main(String[] args) {
    String str = "Hello, Java!";
    System.out.println("문자열의 길이: " + str.length()); // 12
    System.out.println("문자열이 비어 있는지: " + str.isEmpty()); // false
    System.out.println("문자열이 비어 있거나 공백인지: " + str.isBlank()); // false
    System.out.println("문자열이 비어 있거나 공백인지: " +"         ".isBlank()); // true

    char c = str.charAt(7);
    System.out.println("7번 인덱스의 문자 = " + c); // J

    /*
    그러면 char a ='A';는 A라는 값이 내부적으로 문자 배열 char[]로 변환되어 출력된다고
    너가 말했는데 변환되어 출력될때는 printStream의 내부적인 처리가 있어서 문자열처럼 출력 되는게 보이는거네.
    */

    /*
   ✅ println(char)을 호출하면, 내부적으로 char가 char[] 배열로 변환되어 출력되므로 문자열처럼 보인다.
   ✅ println(char[])을 호출하면, new String(char[])으로 변환되므로 문자열처럼 출력된다.
   ✅ char는 자동으로 문자 출력되지만, int 같은 다른 타입은 그대로 출력된다.

    📌 즉, char 타입은 PrintStream이 자동으로 문자 변환 처리를 해주기 때문에 문자열처럼 보이는 것! 🚀
    */
  }
}

/*
package lang.string.method;

public class StringInfoMain {
  public static void main(String[] args) {
    String str = "Hello, Java!";
    System.out.println("문자열의 길이: " + str.length());
    System.out.println("문자열이 비어 있는지: " + str.isEmpty());
    System.out.println("문자열이 비어 있거나 공백인지1: " + str.isBlank());
    System.out.println("문자열이 비어 있거나 공백인지2: " + "    ".isBlank());

    char c = str.charAt(7);
    System.out.println("7번 인덱스의 문자: " + c);
  }
}


 */
