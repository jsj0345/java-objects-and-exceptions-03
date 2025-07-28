package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Calendar {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("년도를 입력하세요: ");
    int year = scanner.nextInt();
    scanner.nextLine();

    System.out.print("월을 입력하세요: ");
    int month = scanner.nextInt();
    scanner.nextLine();

    String str = "                    ";
    StringBuilder sb = new StringBuilder(str);


    LocalDate ldt = LocalDate.of(year,month,1);

    System.out.println(ldt.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek().toString().substring(0,2));

    for(int i=1; i<=ldt.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth(); i++) {
      if(i==1) {
        System.out.println("Su Mo Tu We Th Fr Sa");


        if(ldt.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek().toString().substring(0,2).equals("MO")) {
          str = sb.insert(4,i).toString();
          // System.out.println(str);
        }

        if(ldt.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek().toString().substring(0,2).equals("TU")) {
          str = sb.insert(7,i).toString();
          // System.out.println(str);
        }

        if(ldt.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek().toString().substring(0,2).equals("WE")) {
          str = sb.insert(10,i).toString();
          // System.out.println(str);
        }

        if(ldt.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek().toString().substring(0,2).equals("TH")) {
          str = sb.insert(13,i).toString();
          // System.out.println(str);
        }

        if(ldt.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek().toString().substring(0,2).equals("FR")) {
          str = sb.insert(16,i).toString();
          // System.out.println(str);
        }

        if(ldt.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek().toString().substring(0,2).equals("SA")) {
          str = sb.insert(19,i).toString();
          // System.out.println(str);
        }

        if(ldt.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek().toString().substring(0,2).equals("SU")) {
          str = sb.insert(1,i).toString();
          // System.out.println(str);
        }
      }





    }




  }
}
