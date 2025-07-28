package lang.immutable.test;

public class MyDateMain {
  public static void main(String[] args) {
    MyDate date1 = new MyDate(2024, 1, 1); // ctrl+alt+v를 이용
    // ctrl+alt+v를 이용하면 new MyDate(매개변수);를 적으면 형과 변수명을 알아서 정해줌.
    MyDate date2 = date1;
    System.out.println("date1 = " + date1);
    System.out.println("date2 = " + date2);

    System.out.println("2025 -> date1");
    date1.setYear(2025);
    System.out.println("date1 = " + date1);
    System.out.println("date2 = " + date2);
  }
}

/*
package lang.immutable.test;

public class MyDateMain {
  public static void main(String[] args) {
    MyDate date1 = new MyDate(2024,1,1);
    MyDate date2 = date1;
    System.out.println("date1 = " +date1);
    System.out.println("date2 = " +date2);

    System.out.println("2025 -> date1");
    date1.setYear(2025);
    System.out.println("date1 = " +date1);
    System.out.println("date2 = " +date2);
  }
}
 */
