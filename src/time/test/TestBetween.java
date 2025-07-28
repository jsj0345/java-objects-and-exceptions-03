package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
  public static void main(String[] args) {
    LocalDate startDate = LocalDate.of(2024,1,1);
    LocalDate endDate = LocalDate.of(2024,11,21);

    System.out.println("시작 날짜: " + startDate);
    System.out.println("목표 날짜: " + endDate);
    Period period = Period.between(startDate,endDate);
    System.out.println("남은 기간: " + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일");

    long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
    System.out.println("디데이: " + daysBetween + "일 남음");



    /*
    long secondsBetween = ChronoUnit.SECONDS.between(lt1, lt2);
    System.out.println("secondsBetween = " + secondsBetween);
    long minutesBetween = ChronoUnit.MINUTES.between(lt1, lt2);
    System.out.println("minutesBetween = " + minutesBetween);
    */


  }
}

/*
package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
  public static void main(String[] args) {
    LocalDate startDate = LocalDate.of(2024,1,1);
    LocalDate endDate = LocalDate.of(2024,11,21);

    System.out.println("시작 날짜: " + startDate);
    System.out.println("목표 날짜: " + endDate);
    Period period = Period.between(startDate, endDate);
    System.out.println("남은 기간: " + period.getYear() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일");

    long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
    System.out.println("디데이: " + daysBetween + "일 남음");
  }
}
 */
















/*
import java.time.*;
import java.time.temporal.ChronoUnit;
public class ChangeTimePlusMain {
 public static void main(String[] args) {
 LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
 System.out.println("dt = " + dt);
 LocalDateTime plusDt1 = dt.plus(10, ChronoUnit.YEARS);
 System.out.println("plusDt1 = " + plusDt1);
 LocalDateTime plusDt2 = dt.plusYears(10);
 System.out.println("plusDt2 = " + plusDt2);
 Period period = Period.ofYears(10);
 LocalDateTime plusDt3 = dt.plus(period);
 System.out.println("plusDt3 = " + plusDt3);
 }
}
 */
