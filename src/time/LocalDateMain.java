package time;

import java.time.LocalDate;

public class LocalDateMain {

  public static void main(String[] args) {
    LocalDate nowDate = LocalDate.now(); // 오늘 날짜
    LocalDate ofDate = LocalDate.of(2013,11,21);
    System.out.println("오늘 날짜=" + nowDate);
    System.out.println("지정 날짜=" + ofDate);

    //계산(불변)
    ofDate = ofDate.plusDays(10);
    System.out.println("지정 날짜+10d = " + ofDate);
  }

}

/*
기본 날짜와 시간 - LocalDateTime

가장 기본이 되는 날짜와 시간 클래스는 LocalDate, LocalTime , LocalDateTime이다.

LocalDate : 날짜만 표현할 때 사용한다. 년,월,일을 다룬다.

LocalTime : 시간만을 표현할 때 사용한다. 시,분,초를 다룬다.
초는 밀리초,나노초 단위도 포함할 수 있다.

LocalDateTime: LocalDate와 LocalTime을 합한 개념이다.

now() : 현재 시간을 기준으로 생성한다.

of(...) : 특정 날짜를 기준으로 생성한다. 년,월,일을 입력할 수 있다.

plusDays(): 특정 일을 더한다.

주의! - 불변

모든 날짜 클래스는 불변이다. 따라서 변경이 발생하는 경우, 새로운 객체를 생성해서 반환하므로
반환값을 꼭 받아야 한다.


package time;

public class LocalDateMain {
  public static void main(String[] args) {
    LocalDate nowDate = LocalDate.now();
    LocalDate ofDate = LocalDate.of(2013, 11, 21);
    System.out.println("오늘 날짜 = " + nowDate);
    System.out.println("지정 날짜 = " + ofDate);

    //계산(불변)
    LocalDate plusDays = ofDate.plusDays(10);
    System.out.println("지정 날짜+10d = " + plusDays);
 }

}


 */
