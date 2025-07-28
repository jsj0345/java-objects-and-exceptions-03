package lang.practice;

public class TestString11 {
  public static void main(String[] args) {
    String str = "Hello Java";
    StringBuilder sb = new StringBuilder();
    String str_reversed = sb.append(str).reverse().toString();
    System.out.println(str_reversed);

  }
}
