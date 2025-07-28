package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

  public static void main(String[] args) {
    LocalDateTime nowDt = LocalDateTime.now();
    LocalDateTime ofDt = LocalDateTime.of(2016,8,16,8,10,1);
    System.out.println("현재 날짜시간 = " + nowDt);
    System.out.println("지정 날짜시간 = " + ofDt);


    //날짜와 시간 분리
    LocalDate localDate = ofDt.toLocalDate();
    LocalTime localTime = ofDt.toLocalTime();
    System.out.println("localDate = " + localDate);
    System.out.println("localTime = " + localTime);

    //날짜와 시간 합체
    LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
    System.out.println("localDateTime = " + localDateTime);

    //계산(불변)
    LocalDateTime ofDtPlus = ofDt.plusDays(1000);
    System.out.println("지정 날짜시간+1000d = " + ofDtPlus);
    LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
    System.out.println("지정 날짜시간+1y= " + ofDtPlus1Year);

    // 비교
    System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDt.isBefore(ofDt));
    System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowDt.isAfter(ofDt));
    System.out.println("현재 날짜시간이 지정 날짜시간이랑 같은가? " + nowDt.isEqual(ofDt));


  }

}


/*
package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

  public static void main(String[] args) {
    LocalDateTime nowDt = LocalDateTime.now();
    LocalDateTime ofDt = LocalDateTime.of(2016,8,16,8,10,1);
    System.out.println("현재 날짜시간 = " + nowDt);
    System.out.println("지정 날짜시간 = " + ofDt);

    //날짜와 시간 분리
    LocalDate localDate = ofDt.toLocalDate();
    LocalTime localTime = ofDt.toLocalTime();
    System.out.println("localDate = " + localDate);
    System.out.println("localTime = " + localTime);

    //날짜와 시간 합체
    LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
    System.out.println("localDateTime = " + localDateTime);

    //계산(불변)
    LocalDateTime ofDtPlus = ofDt.plusDays(1000);
    System.out.println("지정 날짜시간+1000d = " + ofDtPlus);
    LocalDateTIme ofDtPlus1Year = ofDt.plusYears(1);
    System.out.println("지정 날짜시간+1년 = " + ofDtPlus1Year);

    // 비교
    System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDt.isBefore(ofDt));
    System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowDt.isAfter(ofDt));
    System.out.println("현재 날짜시간이 지정 날짜시간이랑 같은가? " + nowDt.isEqual(ofDt));
  }
}

분리
-날짜(LocalDate)와 시간(LocalTime)을 toXxx() 메서드로 분리할 수 있다.

합체
-LocalDateTime.of(localDate, localTime)
날짜와 시간을 사용해서 LocalDateTime을 만든다.

계산
-plusXXX(): 특정 날짜와 시간을 더한다.

isEqual() vs equals()
-isEqual()는 단순히 비교 대상이 시간적으로 같으면 true를 반환한다. 객체가 다르고, 타임존이 달라도
시간적으로 같으면 true를 반환한다.
쉽게 이야기해서 시간을 계산해서 시간으로만 둘을 비교한다.

-equals() 객체의 타입, 타임존 등등 내부 데이터의 모든 구성요소가 같아야 true를 반환한다.




 */
