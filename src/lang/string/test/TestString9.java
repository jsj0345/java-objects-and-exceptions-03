package lang.string.test;

public class TestString9 {
  public static void main(String[] args) {
    String email = "hello@example.com";
    String[] split_email = email.split("@");

    System.out.println("ID: "+split_email[0]);
    System.out.println("Domain: "+split_email[1]);



  }
}
