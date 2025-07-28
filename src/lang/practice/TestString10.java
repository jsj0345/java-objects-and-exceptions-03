package lang.practice;

public class TestString10 {
  public static void main(String[] args) {
    String fruits = "apple,banana,mango";

    String[] fruits_array = fruits.split(",");

    for(String s : fruits_array){
      System.out.println(s);
    }

    String joinedString = String.join("->",fruits_array);
    System.out.println("joinedString = " + joinedString);
  }
}
