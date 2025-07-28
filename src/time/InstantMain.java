package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

  public static void main(String[] args) {
    //생성
    Instant now = Instant.now(); // UTC 기준.
    System.out.println("now = " + now);

    ZonedDateTime zdt = ZonedDateTime.now();
    Instant from = Instant.from(zdt);
    System.out.println("from = " + from);

    Instant epochStart = Instant.ofEpochSecond(0); // 1970년 1월 1일 자정부터 0초를 더하시오.
    System.out.println("epochSecond = " + epochStart);

    //계산
    Instant later = epochStart.plusSeconds(3600);
    System.out.println("later = " + later);

    //조회
    long laterEpochSecond = later.getEpochSecond(); // 1970년 1월 1일부터 흐른 시간.
    System.out.println("laterEpochSecond = " + laterEpochSecond);

  }
}

/*
package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

  public static void main(String[] args) {
    //생성
    Instant now = Instant.now(); // UTC 기준
    System.out.println("now = " + now);

    ZonedDateTime zdt = ZonedDateTime.now();
    Instant from = Instant.from(zdt);
    System.out.println("from = " + from);

    Instant epochStart = Instant.ofEpochSecond(0);
    System.out.println("epochStart = " + epochStart);

    //계산
    Instant later = epochStart.plusSeconds(3600);
    System.out.println("later = " + later);

    //조회
    long laterEpochSecond = later.getEpochSecond();
    System.out.println("laterEpochSecond = " + laterEpochSecond);
  }

}

now() : UTC를 기준 현재 시간의 Instant를 생성한다.
from() : 다른 타입의 날짜와 시간을 기준으로 instant를 생성한다.
참고로 Instant는 UTC를 기준으로 하기 때문에 시간대 정보가 필요하다.

ofEpochSecond() : 에포크 시간을 기준으로 Instant를 생성한다.
0초를 선택하면 에포크 시간인 1970년 1월 1일 0시 0분 0초로 생성된다.

plusSeconds() : 초를 더한다. 초, 밀리초, 나노초 정도만 더하는 간단한 메서드.




 */