package lang.string.builder;

public class StringBuilderMain1_1 {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("A");
    sb.append("B");
    sb.append("C");
    sb.append("D");
    System.out.println("sb = "+sb);

    sb.insert(4,"Java");
    System.out.println("insert = " + sb);

    sb.delete(4,8);
    System.out.println("delete = " + sb);

    sb.reverse();
    System.out.println("reverse = " + sb);

    String string = sb.toString();
    System.out.println(string);

    /*
    String str1 ="A";
    str1 ="A" +"B";
    System.out.println(str1);
    기존 객체는 남아있음. 하지만 str1이라는 참조형 변수가 "A"라는 객체의 참조값을 안담으니 이제 가비지 컬렉션에 의해 정리 될 수 있음.
    객체 자체가 없어진다. 이게아님.
    */

    /*
    정리해서 말하면 이거네. String은 불변 객체여서 새로운 객체들을 반환하면서 그 반환된 객체의 멤버 변수 값들이 다른값으로 초기화 되는거지.
    기존 값들은 남아 있다. 이거네.
    물론 이제 남아 있는 값들의 참조값을 담는 변수가 없으면 GC에 의해 정리 될 수 있다. 라는 거고
    StringBuilder는 가변 객체이기때문에 StringBuilder 클래스에 있는 멤버 변수들을 계속 바꿀 수 있어서 동일한 인스턴스를 계속 참조하는거네.
     */

    /*
    가변 객체는 setter 같은걸 이용해서 인스턴스 내에 있는 변수의 값이 바뀌잖아.
    StringBuilder도 append() reverse() 이런 메서드로 변수의 값이 바뀌잖아? setter랑 일맥상 좀 비슷한 개념.
     */


  }

}

/*
package lang.string.builder;

public class StringBuilderMain1_1 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("A");
    sb.append("B");
    sb.append("C");
    sb.append("D");
    System.out.println("sb = " + sb);

    sb.insert(4,"Java");
    System.out.println("insert = " + sb);

    sb.delete(4,8);
    System.out.println("delete = " + sb);

    sb.reverse();
    System.out.println("reverse = " + sb);

    // StringBuilder -> String
    String string = sb.toString();
    System.out.println("string = " + string);
  }
}
 */
