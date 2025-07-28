package enumeration.test;

import java.util.Arrays;
import java.util.Scanner;

import static enumeration.test.AuthGrade.*;

public class AuthGradeMain2 {
  public static void main(String[] args) {
    AuthGrade[] grades = AuthGrade.values();
    Scanner scanner = new Scanner(System.in);
    System.out.print("당신의 등급을 입력하세요" + Arrays.toString(grades)+":");
    AuthGrade authGrade = AuthGrade.valueOf(scanner.nextLine().toUpperCase());
    authGrade.getInformation(authGrade);
  }
}
