package lang.string.test;

public class TestString10 {
  public static void main(String[] args) {
    String fruits = "apple,banana,mango";
    String[] fruits_split = fruits.split(",");
    for (String s : fruits_split) {
      System.out.println(s);
    }

    String result = String.join("->", fruits_split);
    System.out.println("joinedString = " + result);
  }
}
