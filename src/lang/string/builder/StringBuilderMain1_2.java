package lang.string.builder;

public class StringBuilderMain1_2 {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    String string = sb.append("A").append("B").append("C").append("D")
        .insert(4,"Java")
        .delete(4,8)
        .reverse()
        .toString(); // 메서드 체이닝

    System.out.println(string);

    /*
    위에가 가능한 이유는 return this; 이기 때문.
     */

  }
}

/*
package lang.string.builder;

public class StringBuilderMain1_2 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    String string = sb.append("A").append("B").append("C").append("D")
          .insert(4,"Java")
          .delete(4,8)
          .reverse()
          .toString();

    System.out.println(string);


    위에가 가능한 이유는 return this;때문
*/

