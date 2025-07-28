package lang.practice;

public class TestString9 {
  public static void main(String[] args) {
    String email = "hello@example.com";
    String[] email_split = email.split("@");
    System.out.println("ID: " +email_split[0]);
    System.out.println("Domain: " +email_split[1]);
  }
}
