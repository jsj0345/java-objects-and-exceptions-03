package enumeration.ex3;

public class EnumRefMain {

  public static void main(String[] args) {
    System.out.println("class BASIC = " + Grade.BASIC.getClass());
    System.out.println("class GOLD = " + Grade.GOLD.getClass());
    System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

    // System.out.println("ref BASIC = " + Grade.BASIC); 이렇게 쓰면 toString에 의해 참조값이 안보임.
    System.out.println("ref BASIC = " + EnumRefMain.refValue(Grade.BASIC));
    System.out.println("ref GOLD = " + EnumRefMain.refValue(Grade.GOLD));
    System.out.println("ref DIAMOND = " + EnumRefMain.refValue(Grade.DIAMOND));
  }

  private static String refValue(Object grade) {
    /*
    매개 변수가 Object형인 grade라는 변수인데..
    grade는 Enum을 상속받고 Enum은 Object를 상속 받기에 가능함.

    원래 extends를 쓰면 하나의 클래스만 상속 받을수 있지만 Object는 모든 클래스의 최상위 클래스이므로
    Grade 인스턴스를 생성하면 Object 클래스 , Enum 클래스 둘다 생김.
     */
    return Integer.toHexString(System.identityHashCode(grade)); // 이렇게 쓰면 참조값을 볼 수 있음.
  }

}

/*
package enumeration.ex3;

public class EnumRefMain {
  public static void main(String[] args) {
    System.out.println("class BASIC = " + Grade.BASIC.getClass());
    System.out.println("class GOLD = " + Grade.GOLD.getClass());
    System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

    System.out.println("ref BASIC = " + refValue(Grade.BASIC));
    System.out.println("ref GOLD = " + refValue(Grade.GOLD));
    System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
  }

  private static String refValue(Object grade) {
    return Integer.toHexString(System.identityHashCode(grade));
  }
}

 */
