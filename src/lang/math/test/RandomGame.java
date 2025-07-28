package lang.math.test;

import java.util.Random;

public class RandomGame {
  public static void main(String[] args) {
    Random random = new Random();
    int random_number = random.nextInt(20) + 1; // 1~10
    System.out.println("공의 개수는 "+ random_number+"개 입니다.");

    int random_number1 = random.nextInt(3) + 1;
    System.out.println("섞어야 할 횟수는 " + random_number1 + "번 입니다");

    int random_number2 = random.nextInt(2) + 1;
    System.out.println("맵 번호는 " + random_number2 + "번 입니다.");


  }

}
