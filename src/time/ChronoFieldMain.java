package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {

  public static void main(String[] args) {
    ChronoField[] values = ChronoField.values();
    for(ChronoField value : values) {
      System.out.println(value + ", range = " + value.range());
    }

    System.out.println("MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
    System.out.println("DAY_OF_MONTH.range() = " + ChronoField.DAY_OF_MONTH.range());

  }

}

/*
ChronoField는 날짜 및 시간을 나타내는 데 사용되는 열거형이다.
이 열거형은 다양한 필드를 통해 날짜와 시간의 특정 부분을 나타낸다.


package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {

  public static void main(String[] args) {
    ChronoField[] values = ChronoField.values();
    for(ChronoField value : values) {
      System.out.println(value + ", range = " + value.range());
    }

    System.out.println("MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
    System.out.println("DAY_OF_MONTH.range() = " + ChronoField.DAY_OF_MONTH.range());

  }
}


 */
