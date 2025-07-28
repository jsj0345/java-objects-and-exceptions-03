package time;

import java.time.LocalTime;

public class LocalTimeMain {
  public static void main(String[] args) {
    LocalTime nowTime = LocalTime.now();
    LocalTime ofTime = LocalTime.of(9, 10, 30);

    System.out.println("현재 시간 = " + nowTime);
    System.out.println("지정 시간 = " + ofTime);

    //계산(불변)
    LocalTime ofTimePlus = ofTime.plusSeconds(30);
    System.out.println("지정 시간+30s = " + ofTimePlus);


  }
}

/*
package time;

import java.time.LocalTime;

public class LocalTimeMain {

  public static void main(String[] args) {
    LocalTime nowTime = LocalTime.now();
    LocalTime ofTime = LocalTime.of(9,10,30);

    System.out.println("현재 시간 = " + nowTime);
    System.out.println("지정 시간 = " + ofTime);

    //계산(불변)
    LocalTime ofTimePlus = ofTime.plusSeconds(30);
    System.out.println("지정 시간+30s = " + ofTimePlus);
  }

}

-now(): 현재 시간을 기준으로 생성한다.
-of(...) : 특정 시간을 기준으로 생성한다. 시,분,초,나노초를 입력할 수 있다.

-plusSeconds(): 특정 초를 더한다. 다양한 plusXXX() 메서드가 존재한다.






 */
