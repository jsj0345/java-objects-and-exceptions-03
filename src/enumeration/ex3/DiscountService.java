package enumeration.ex3;

import static enumeration.ex3.Grade.*;

// import static enumeration.ex3.Grade.*;

// import static을 쓰면 필드 앞에 클래스명을 쓸 필요 X. 실무에서 많이 씀.

public class DiscountService {

  public int discount(Grade classGrade, int price) {
    int discountPercent = 0;


    if (classGrade == BASIC) {
      discountPercent = 10;
    } else if(classGrade == GOLD) {
      discountPercent = 20;
    } else if(classGrade == DIAMOND){
      discountPercent = 30;
    } else {
      System.out.println("할인X");
    }

    return (int)(price * ((double)discountPercent / 100)) ;

  }
}

/*
package enumeration.ex3;

public class DiscountService {

  public int discount(Grade grade, int price) {
    int discountPercent = 0;

    if(grade == Grade.BASIC) {
      discountPercent = 10;
    } else if (grade == Grade.GOLD) {
      discountPercent = 20;
    } else if (grade == Grade.DIAMOND) {
      discountPercent = 30;
    } else {
      System.out.println("할인X");
    }

    return price * discountPercent / 100;
  }

}

 */