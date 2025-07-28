package lang.string.method;

public class StringUtilsMain1 {

  public static void main(String[] args) {
    int num = 100;
    boolean bool = true;
    Object obj = new Object();
    String str = "Hello, Java!";

    // valueOf 메서드
    String numString = String.valueOf(num); // num을 String으로 바꿈. Integer 클래스의 toString()은 숫자를 문자열로.
    System.out.println("숫자의 문자열 값: " + numString);
    String boolString = String.valueOf(bool); // "true" , "false"로 반환 문자열임.
    System.out.println("불리언의 문자열 값: " + boolString);
    String objString = String.valueOf(obj);
    System.out.println("객체의 문자열 값: " + objString);

    /*
    valueOf() 메서드는 받은 객체의 toString() 메서드를 호출. obj는 Object 형이므로
    당연히 Object 클래스에 있는 toString()을 이용! 그리고 getClass()나 HashcodeString같은 메서드는 String이 리턴이므로
    바로 합칠수 있는것.
     */

    // 문자 + x -> 문자
    String numString2 = "" + num;
    System.out.println("빈문자열 + num: " + numString2);

    // toCharArray 메서드
    char[] strCharArray = str.toCharArray();
    System.out.println("문자열을 문자 배열로 변환: " + strCharArray);
    /*
    System.out.println("문자열을 문자 배열로 변환: " + strCharArray);
    "문자열을 문자 배열로 변환:"이라는 문자열과 char형 배열을 합치려는데 이때
    strCharArray는 StringBuilder.append(char[])이 호출됨 -> char[]이 Object처럼 처리되어 참조 정보가 출력됨.
    */

    //  toCharArray()는 Byte 배열을 char 배열로.
    for(char c : strCharArray) {
      System.out.print(c);
      /*
      원래 배열을 그대로 출력하면 문자열처럼 합치듯이 보이는데 여기서는 각 요소에 있는 하나의 문자를 char c로 받으므로 당연히
      한문자씩 나옴 근데 print니까 이어지는것.
       */
    }

  }

}

/*
package lang.string.method;

public class StringUtilsMain1 {
  public static void main(String[] args) {
    int num = 100;
    boolean bool = true;
    Object obj = new Object();
    String str = "Hello, Java!";

    // valueOf 메서드
    String numString = String.valueOf(num);
    System.out.println("숫자의 문자열 값: " + numString);
    String boolString = String.valueOf(bool);
    System.out.println("불리언의 문자열 값: " + boolString);
    String objString = String.valueOf(Obj);
    System.out.println("객체의 문자열 값: " + objString);
    String numString2 = "" + num;
    System.out.println("빈문자열 + num:" + numString2);

    // toCharArray 메서드
    System.out.println("문자열을 문자 배열로 변환: " + strCharArray);
    for(char c : strCharArray) {
      System.out.println(c);
    }

    System.out.println();

}

 */
