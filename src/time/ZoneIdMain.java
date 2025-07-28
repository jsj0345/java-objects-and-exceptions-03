package time;

import java.time.ZoneId;

public class ZoneIdMain {
  
  public static void main(String[] args) {

    for(String availableZoneId : ZoneId.getAvailableZoneIds() ){
      // System.out.println("availableZoneId = " + availableZoneId);
      ZoneId zoneId = ZoneId.of(availableZoneId);
      System.out.println(zoneId + " | " + zoneId.getRules());
    }

    ZoneId zoneId = ZoneId.systemDefault(); // 현재 운영체제가 가지고 있는 Zone기반
    System.out.println("ZoneId.systemDefault = " + zoneId);

    ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
    System.out.println("seoulZoneId = " + seoulZoneId);
  }
  
}

/*
package time;

import java.time.ZoneId;

public class ZoneIdMain {

  public static void main(String[] args) {

    for(String availableZoneId : ZoneId.getAvailableZoneIds()) {
      ZoneId zoneId = ZoneId.of(availableZoneId);
      System.out.println(zoneId + " | " + zoneId.getRules());
   }

   ZoneId zoneId = ZoneId.systemDefault();
   System.out.println("ZoneId.systemDefault = " + zoneId);

   ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
   System.out.println("seoulZoneId = " + seoulZoneId);

  }

}


ZoneId.systemDefault() : 시스템이 사용하는 기본 ZoneId를 반환한다.

-각 PC 환경 마다 다른 결과가 나올 수 있다.

ZoneId.of() : 타임존을 직접 제공해서 ZoneId를 반환한다.

ZoneId는 내부에 일광 절약 시간 관련 정보, UTC와의 오프셋 정보를 포함하고 있다.

public class ZonedDateTime {
  private final LocalDateTime dateTime;
  private final ZoneOffset offset;
  private final ZoneId zone;
}

ZonedDateTime: 시간대를 고려한 날짜와 시간을 표현할 때 사용한다.
여기에는 시간대를 표현하는 타임존이 포함된다.




 */
