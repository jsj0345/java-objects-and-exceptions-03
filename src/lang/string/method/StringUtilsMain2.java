package lang.string.method;

public class StringUtilsMain2 {
  public static void main(String[] args) {
    int num = 100;
    boolean bool = true;
    String str = "Hello, Java!";

    // format 메서드
    String format1=String.format("num: %d, bool: %b, str:%s",num,bool,str);
    // + 연산자를 안써도 되는 간편함이 있음. 당연히 새로운 객체를 생성하는거니 format1에 담아야함. 불변성 때문.
    System.out.println(format1);

    String format2 = String.format("숫자: %.2f",10.1234);
    System.out.println(format2);

    // printf
    System.out.printf("숫자: %.2f\n",10.1234);
    // format를 안 받아 쓰고 한번에 쓰고 싶을때 씀.
    // \n은 enter를 의미.


    // matches 메서드
    String regex = "Hello, (Java!|World)";
    // Java! | World 에서 |는 또는을 의미함.
    System.out.println("'str'이 패턴과 일치하는가? "+str.matches(regex));
    // Hello, Java! 랑 regex에서 Hello, 까지는 똑같은데 Java!를 고르면 같으니까 true.
  }
}

/*
package lang.string.method;

public class StringUtilsMain2 {
  public static void main(String[] args) {
    int num = 100;
    boolean bool = true;
    String str = "Hello, Java!";

    // format 메서드
    String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
    // + 연산자를 안써도 되는 간편함이 있음. 당연히 새로운 객체를 생성하는거니 format1에 담아야함. 불변성 때문.
    // + 연산자를 안써도 되는 간편함이 있음. 당연히 새로운 객체를 생성하는거니 format1에 담아야함. 불변성 때문.
    System.out.println(format1);

    String format2 = String.format("숫자: %.2f", 10,1234);
    System.out.println(format2);

    // printf
    System.out.printf("숫자: %.2f\n",10.1234);
    // format을 안 받아 쓰고 한번에 쓰고 싶을때 씀.
    // \n은 enter를 의미.

    // matches 메서드
    String regex = "Hello, (Java!|World!)";
    System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));

   }
}
 */
