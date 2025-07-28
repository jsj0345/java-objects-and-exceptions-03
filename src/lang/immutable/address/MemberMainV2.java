package lang.immutable.address;

public class MemberMainV2 {
  public static void main(String[] args) {
    ImmutableAddress address = new ImmutableAddress("서울"); // ctrl+Alt+v로 객체 생성
    MemberV2 memberA = new MemberV2("회원A", address);
    MemberV2 memberB = new MemberV2("회원B", address);

    // 회원A, 회원B의 처음 주소는 모두 서울.
    System.out.println("memberA = " + memberA);
    System.out.println("memberB = " + memberB);
    // 출력 결과가 address=Address{value='서울'}}이 나올텐데
    // 이러한 이유는 문자열을 합칠때 자동으로 toString()을 호출.

    // 회원B의 주소를 부산으로 변경해야함.
    // memberB.getAddress().setValue("부산"); 컴파일 오류.
    memberB.setAddress(new ImmutableAddress("부산")); // 객체가 다름.
    System.out.println("memberA = " + memberA);
    System.out.println("memberB = " + memberB);

  }
}

/*
package lang.immutable.address;

public class MemberMainV2 {
  public static void main(String[] args) {
    ImmutableAddress address = new ImmutableAddress("서울");
    MemberV2 memberA = new MemberV2("회원A", address);
    MemberV2 memberB = new MemberV2("회원B", address);

    // 회원A, 회원B의 처음 주소는 모두 서울.
    System.out.println("memberA = " + memberA);
    System.out.println("memberB = " + memberB);
    // 출력 결과가 address=Address{value='서울'}}이 나올텐데
    // 이러한 이유는 문자열을 합칠때 자동으로 toString()을 호출.

    //회원B의 주소를 부산으로 변경해야함
    //memberB.getAddress().setValue("부산");
    memberB.setAddress(new ImmutableAddress("부산"));
    System.out.println("memberA = " + memberA);
    System.out.println("memberB = " + memberB);
  }
}

 */
