package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

  public static void main(String[] args) {
    ChronoUnit[] values = ChronoUnit.values();

    for (ChronoUnit value : values) {
      System.out.println("value = " + value);
    }


    System.out.println("HOURS = " + ChronoUnit.HOURS); // toString()을 알맞게 재정의를 한 듯.
    //ChronoUnit.HOURS를 쓰고나서 옆에 .soutv을 작성해보자. (ChronoUnit.HOURS.soutv)
    // + 연산자로 연결하면 , 자동으로 ChronoUnit.HOURS.toString()이 호출 되고 이것은 return name;
    System.out.println("HOURS.duration = " + ChronoUnit.HOURS.getDuration().getSeconds());
    System.out.println("DAYS = " + ChronoUnit.DAYS);
    System.out.println("DAYS.duration = " + ChronoUnit.DAYS.getDuration().getSeconds());

    //차이 구하기
    LocalTime lt1 = LocalTime.of(1,10,0);
    LocalTime lt2 = LocalTime.of(1,20,0);

    long secondsBetween = ChronoUnit.SECONDS.between(lt1, lt2);
    System.out.println("secondsBetween = " + secondsBetween);

    long minutesBetween = ChronoUnit.MINUTES.between(lt1, lt2);
    System.out.println("minutesBetween = " + minutesBetween);


  }

}

/*
package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

  public static void main(String[] args) {

    ChronoUnit[] Values = ChronoUnit.values();

    for(ChronoUnit value : values) {
      System.out.println("value = " + value);
    }

    System.out.println("HOURS = " + ChronoUnit.HOURS);
    System.out.println("HOURS.duration = " +
    ChronoUnit.HOURS.getDuration().getSeconds());
    System.out.println("DAYS = " + ChronoUnit.DAYS);
    System.out.println("DAYS.duration = " +
    ChronoUnit.DAYS.getDuration().getSeconds());

    //차이 구하기
    LocalTime lt1 = LocalTime.of(1, 10, 0);
    LocalTime lt2 = LocalTime.of(1, 20, 0);

    long secondsBetween = ChronoUnit.SECONDS.between(lt1, lt2);
    System.out.println("secondsBetween = " + secondsBetween);

    long minutesBetween = ChronoUnit.MINUTES.between(lt1, lt2);
    System.out.println("minutesBetween = " + minutesBetween);
  }

}



 */