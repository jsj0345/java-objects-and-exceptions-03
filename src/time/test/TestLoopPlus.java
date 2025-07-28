package time.test;

import java.time.LocalDate;

public class TestLoopPlus {
  public static void main(String[] args) {
    LocalDate dt1 = LocalDate.of(2024,1,1);



    for(int i=1; i<=5; i++) {
      System.out.println("날짜 " + i +": "+ dt1);
      dt1 = dt1.plusDays(14);
    } // fori 라고 입력하면 for문이 자동으로 만들어진다.

  }
}

/*
package time.test;

import java.time.LocalDate;

public class TestLoopPlus {
  public static void main(String[] args) {
    LocalDate dt1 = LocalDate.of(2024,1,1);

    for(int i = 1; i <=5 ; i++) {
      System.out.println("날짜 " + i + ": " + dt1);
      dt1 = dt1.plusDays(14);
    }

  }

}
 */
