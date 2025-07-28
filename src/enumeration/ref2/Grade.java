package enumeration.ref2;

public enum Grade {
  BASIC(10), GOLD(20), DIAMOND(30);

  private final int discountPercent;

  Grade(int discountPercent) { // private이 포함 되어 있는거라 생략 가능.
    this.discountPercent = discountPercent;
  }

  public int getDiscountPercent() {
    return discountPercent;
  }

  /*
  public int discount(int price){
    return price * this.discountPercent / 100;
  }

   */
}

/*
package enumeration.ref2;

public enum Grade {
  BASIC(10), GOLD(20), DIAMOND(30);

  private final int discountPercent;

  Grade(int discountPercent){
    this.discountPercent = discountPercent;
  }

  public int getDiscountPercent() {
    return discountPercent;
  }

}


 */
