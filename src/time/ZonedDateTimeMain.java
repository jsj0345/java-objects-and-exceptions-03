package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {

  public static void main(String[] args) {
    ZonedDateTime nowZdt = ZonedDateTime.now(); // 운영 체제의 기본 시간대 확인.
    System.out.println("nowZdt = " + nowZdt);

    LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
    ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
    System.out.println("zdt1 = " + zdt1);

    ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneId.of("Asia/Seoul"));
    System.out.println("zdt2 = " + zdt2);

    ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
    System.out.println("utcZdt = " + utcZdt);

  }

}

/*

package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {

  public static void main(String[] args) {
    ZonedDateTime nowZdt = ZonedDateTime.now();
    System.out.println("nowZdt = " + nowZdt);

    LocalDateTime ldt = LocalDateTime.of(2030,1,1,13,30,50);
    ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul");
    System.out.println("zdt1 = " + zdt1);

    ZonedDateTime zdt2 = ZonedDateTime.of(2030,1,1,13,30,50,ZoneId.of("Asia/Seoul"));
    System.out.println("zdt2 = " + zdt2);

    ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
    System.out.println("utcZdt = " + utcZdt);
  }
}


withZoneSameInstant(ZoneId) : 타임존을 변경한다.
타임존에 맞추어 시간도 함께 변경된다.
이 메서드를 사용하면 지금 다른 나라는 몇 시 인지 확인할 수 있다.
예를 들어서 서울이 지금 9시라면, UTC 타임존으로 변경하면
0시를 확인할 수 있다.

 */