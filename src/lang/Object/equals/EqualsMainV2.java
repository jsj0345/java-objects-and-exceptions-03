package lang.Object.equals;

public class EqualsMainV2 {
  public static void main(String[] args) {
    UserV2 user1 = new UserV2("id-100");
    UserV2 user2 = new UserV2("id-100");

    System.out.println("identity = " + (user1 == user2));
    System.out.println("equality = " + user1.equals(user2));
    // true

    /*
    String equals()는 내용 자체를 비교함.
    근데 위에 user2는 UserV2형이므로 String형이 아니니까 equals()를 오버라이드 해줘야함.
     */



  }
}
