package lang.immutable.address;

public class MemberMainV1 {
  public static void main(String[] args) {
    Address address = new Address("서울"); // ctrl+Alt+v로 객체 생성
    MemberV1 memberA = new MemberV1("회원A", address);
    MemberV1 memberB = new MemberV1("회원B", address);

    // 회원A, 회원B의 처음 주소는 모두 서울.
    System.out.println("memberA = " + memberA);
    System.out.println("memberB = " + memberB);
    // 출력 결과가 address=Address{value='서울'}}이 나올텐데
    // 이러한 이유는 문자열을 합칠때 자동으로 toString()을 호출.

    memberB.getAddress().setValue("부산");
    System.out.println("부산 -> memberB.address");
    System.out.println("memberA = " + memberA); // side effect
    System.out.println("memberB = " + memberB);
  }
}

/*
package lang.immutable.address;

public class MemberMainV1 {
  public static void main(String[] args) {
    Address address = new Address("서울");

    MemberV1 memberA = new MemberV1("회원A",address);
    MemberV1 memberB = new MemberV1("회원B",address);

    //회원 A, 회원B의 처음 주소는 모두 서울
    System.out.println("memberA = " + memberA);
    System.out.println("memberB = " + memberB);

    //회원 B의 주소를 부산으로 변경해야함
    memberB.getAddress().setValue("부산");
    System.out.println("부산 -> memberB.address");
    System.out.println("memberA = " + memberA);
    System.out.println("memberB = " + memberB);
  }
}
 */