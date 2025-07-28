package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;

import java.time.temporal.TemporalAdjusters;


// 입력 받은 월의 첫날 요일과 마지막날 요일을 구해라.

/*
출력 결과

firstDayOfWeek = MONDAY
lastDayOfWeek = WEDNESDAY
 */

public class TestAdjusters {

  public static void main(String[] args) {
    int year = 2024;
    int month = 1;
    LocalDate dt1 = LocalDate.of(year,month, 1);
    System.out.println("lastDayOfWeek = " + dt1.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek());
    System.out.println("firstDayOfWeek = " + dt1.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek());

    System.out.println("lastDayOfWeek = " + dt1.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth());
    System.out.println("lastDayOfWeek = " + dt1.with(TemporalAdjusters.firstDayOfMonth()).getDayOfMonth());
  }

}

/*
package time.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;


public class TestAdjusters {

  public static void main(String[] args) {
    int year = 2024;
    int month = 1;
    LocalDate dt1 = LocalDate.of(year,month,1);
    System.out.println("lastDayOfWeek = " + dt1.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek());
    System.out.println("firstDayOfWeek = " + dt1.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek());
  }
}
 */
