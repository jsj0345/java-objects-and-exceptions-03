package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.of(2024,1,1,9,0,0);
    ZonedDateTime seoul = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
    ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
    ZonedDateTime newYork = seoul.withZoneSameInstant( ZoneId.of("America/New_York"));

    System.out.println("서울의 회의 시간: " + seoul);
    System.out.println("런던의 회의 시간: " + london);
    System.out.println("뉴욕의 회의 시간: " + newYork);

    // 문제에서 그 국가의 현재 시간도 보여야 하므로 withZoneSameInstant를 써야함.

  }

}

/*
package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.of(2024,1,1,9,0,0);
    ZonedDateTime seoul = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
    ZonedDateTime london = ZonedDateTime.of(ldt, ZoneId.of("Europe/London"));
    ZonedDateTime newYork = ZonedDateTime.of(ldt, ZoneId.of("America/New_York"));

    System.out.println("서울의 회의 시간: " + seoul);
    System.out.println("런던의 회의 시간: " + london);
    System.out.println("뉴욕의 회의 시간: " + newYork);
  }

}
 */
