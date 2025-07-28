package enumeration.ref1;

public class ClassGrade {

  public static final ClassGrade BASIC = new ClassGrade(10); // X001
  public static final ClassGrade GOLD = new ClassGrade(20); // X002
  public static final ClassGrade DIAMOND = new ClassGrade(30); // X003

  private final int discountPercent;

  //private 생성자 추가
  private ClassGrade(int discountPercent) {
    this.discountPercent = discountPercent;
  }

  public int getDiscountPercent() { // get을 쓰면 Intellij가 알아서 만들어줌.
    return discountPercent;
  }
}

/*
package enumeration.ref1;

public class ClassGrade {

  public static final ClassGrade BASIC = new ClassGrade(10);
  public static final ClassGrade GOLD = new ClassGrade(20);
  public static final ClassGrade DIAMOND = new ClassGrade(30);

  private final int discountPercent;

  private ClassGrade(int discountPercent) {
    this.discountPercent = discountPercent;
  }

  public int getDiscountPercent() {
    return discountPercent;
  }

}



 */
