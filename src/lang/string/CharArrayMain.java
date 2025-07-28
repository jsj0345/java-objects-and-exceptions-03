package lang.string;

public class CharArrayMain {
  public static void main(String[] args) {
    char[] charArr = new char[]{'h', 'e', 'l', 'l', 'o'};
    System.out.println(charArr); // printStream?을 이용해서 내부적으로 문자를 합치게끔 출력.

    String str = "hello";
    System.out.println("str = " + str);
  }
}




/*
System.out.println(charArr)의 동작 방식에 대해서 살펴보자.

public void println(char[] x) {
  this.print(x);
  this.newLine();
 }

 이 코드에서 this는 PrintStream 클래스의 인스턴스임.
 즉 PrintStream 클래스에 있는 print 메서드를 호출하고
 호출 한 다음에 배열을 문자열처럼 이어주는게 원리임.
 */

/*
package lang.string;

public class CharArrayMain {
  public static void main(String[] args) {
    char[] charArr = new char[]{'h','e','l','l','o'};
    System.out.println(charArr);

    String str = "hello";
    System.out.println("str = " + str);
  }
}
 */
