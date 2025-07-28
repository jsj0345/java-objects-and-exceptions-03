package enumeration.ref1;

public class DiscountService {

  public int discount(ClassGrade classGrade, int price) {
    return price * classGrade.getDiscountPercent() / 100;


    // return price * classGrade.getDiscountPercent() / 100;

    /*
    int discountPercent = classGrade.getDiscountPercent();
    return price * discountPercent / 100;

    맨 위에 코드 처럼 discountPercent를 쓰지않고
    return price * classGrade.getDiscountPercent() / 100;
    으로 바꾸고 싶으면 ctrl+alt+n을 눌러보자.
     */
  }

}

/*
package enumeration.ex2;

public class DiscountService {

  public int discount(ClassGrade classGrade, int price) {
    int discountPercent = 0;

    if (classGrade == ClassGrade.BASIC) {
      discountPercent = 10;
    } else if (classGrade == ClassGrade.GOLD) {
      discountPercent = 20;
    } else if (classGrade == ClassGrade.DIAMOND) {
      discountPercent = 30;
    } else {
      System.out.println("할인X");
    }

    return price * discountPercent / 100;

  }

}

 */