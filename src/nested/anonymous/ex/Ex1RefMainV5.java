package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV5 {

  public static void hello(Process process) {

    System.out.println("프로그램 시작");
    process.run();
    System.out.println("프로그램 종료");
  }

  public static void main(String[] args) {

    hello(() -> {
      int randomValue = new Random().nextInt(6) + 1;
      System.out.println("주사위 = " + randomValue);
    });

    /*
    람다식을 보면 뭐 익명클래스나 지역 클래스처럼 선언하는게 없는데 좀 더 자세히 보면
    어찌됐든 hello 메서드엔 Process 형인 매개 변수가 들어가야 한다.
    근데 왜 저거는 가능할까? 그냥 저건 익명 클래스 Process a = new Process() {});
    이게 생략 되어 있는 것이다.
    그래서 람다식을 처음 보면 hello메서드의 매개변수와 상관없이 전달이 되는 건가? 라는 의문을 품을 수 있다.
     */


    hello(() -> {
      for (int i = 1; i<=3; i++){
        System.out.println("i = " + i);
      }
    });

  }

}

/*
package nested.anonymous.ex;

public class Ex1RefMainV5 {

  public static void hello(Process process) {
    System.out.println("프로그램 시작");
    //코드 조각 시작
    process.run();
    //코드 조각 종료
    System.out.println("프로그램 종료");
  }

  public static void main(String[] args) {
    hello( () -> {
      int randomValue = new Random().nextInt(6) + 1;
      System.out.println("주사위 = " + randomValue);
    } ) ;

    hello(() -> {
      for (int i = 1; i<=3; i++) {
        System.out.println("i = " + i);
      }
    });
  }

}
 */

