package lang.wrapper.test;

public class WrapperTest1 {
  public static void main(String[] args) {
    String str1 = "10";
    String str2 = "20";

    int a = Integer.parseInt(str1);
    int b = Integer.parseInt(str2);
    int sum = a + b;

    System.out.println("두 수의 합: " + sum);
  }
}
