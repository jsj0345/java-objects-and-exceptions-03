package lang.Object.equals;

public class EqualsMainV1 {
  public static void main(String[] args) {
    UserV2 user1 = new UserV2("id-100");
    UserV2 user2 = new UserV2("id-100");

    System.out.println("identity = " + (user1 == user2));
    System.out.println("equality = "+ user1.equals(user2));
  }
}

/*
Object에서 제공하는 equals 메서드는 다음과 같다.

public boolean equals(Object obj) {
        return (this == obj);
}

참조값이 같은지 물리적인 비교를 하기 때문에 false가 나온다.
 */