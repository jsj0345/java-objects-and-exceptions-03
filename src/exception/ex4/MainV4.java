package exception.ex4;


import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {

  public static void main(String[] args)  {
    //NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
    //NetworkServiceV3_2 networkService = new NetworkServiceV3_2();

    //NetworkServiceV4 networkService = new NetworkServiceV4();
    NetworkServiceV5 networkService = new NetworkServiceV5();
    Scanner scanner = new Scanner(System.in);

    while(true) {
      System.out.print("전송할 문자: ");
      String input = scanner.nextLine();
      if(input.equals("exit")) {
        break;
      }
      try {
        networkService.sendMessage(input);
      } catch (Exception e) { // 모든 예외를 잡아서 처리함.
        MainV4.exceptionHandler(e);
      }

      System.out.println();
    }

    System.out.println("프로그램을 정상 종료합니다.");

  }

  // 공통 예외 처리
  private static void exceptionHandler(Exception e) {
    // 공통 처리
    System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
    System.out.println("==개발자용 디버깅 메시지==");
    e.printStackTrace(System.out); // 스택 트레이스 출력
    //e.printStackTrace(System.err);

    /*
    e.printStackTrace(System.out)과 e.printStackTrace(System.err)의 차이는..
    System.out은 스택 트레이스가 하얀색으로 보이고 System.err은 빨간색으로 보임.

     */

    // 필요하면 예외 별로 별도의 추가 처리 가능
    if (e instanceof SendExceptionV4 sendEx) {
      System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
    }

  }

  /*
  error1를 전송할 문자로 보낸다면..

  Exception in thread "main" exception.ex2.NetworkClientExceptionV2: http://example.com 서버 연결 실패
	at exception.ex2.NetworkClientV2.connect(NetworkClientV2.java:17)
	at exception.ex2.NetworkServiceV2_1.sendMessage(NetworkServiceV2_1.java:10)
	at exception.ex2.MainV2.main(MainV2.java:21)

	이렇게 스택 트레이스가 나오는데 맨 첫번째줄은 예외가 있는 객체고
	두번째~네번째는 예외가 어디서 발생했는지를 알려줌.
   */

}

/*
package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {

  public static void main(String[] args) {

    NetworkServiceV4 networkService = new NetworkServiceV4();

    Scanner scanner = new Scanner(System.in);

    while(true) {
      System.out.print("전송할 문자: ");
      String input = scanner.nextLine();

      if(input.equals("exit")) {
        break;
      }

      try {
        networkService.sendMessage(input);
      } catch (Exception e) {
        exceptionHandler(e);
      }

      System.out.println();
    }

    System.out.println("프로그램을 정상 종료합니다.");
  }

  private static void exceptionHandler(Exception e) {

    System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
    System.out.println("==개발자용 디버깅 메시지==");
    e.printStackTrace(System.out); // 스택 트레이스 출력
    // e.printStackTrace();

    // 필요하면 예외 별로 별도의 추가 처리 가능
    if (e instanceof SendExceptionV4 sendEx) {
      System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
    }

  }

}
 */

