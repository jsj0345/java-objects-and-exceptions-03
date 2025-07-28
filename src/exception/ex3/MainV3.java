package exception.ex3;

import java.util.Scanner;

public class MainV3 {

  public static void main(String[] args)  {
    //NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
    NetworkServiceV3_2 networkService = new NetworkServiceV3_2();

    Scanner scanner = new Scanner(System.in);

    while(true) {
      System.out.print("전송할 문자: ");
      String input = scanner.nextLine();
      if(input.equals("exit")) {
        break;
      }
      networkService.sendMessage(input);
      System.out.println();
    }

    System.out.println("프로그램을 정상 종료합니다.");

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
package exception.ex3;

import exception.ex3.exception.NetworkClientExceptionV3;

import java.util.Scanner;

public class MainV3 {

  public static void main(String[] args) {
    NetworkServiceV3_1 networkService = new NetworkServiceV3_1();

    Scanner scanner = new Scanner(System.in);

    while(true) {
      System.out.print("전송할 문자: ");
      String input = scanner.nextLine();
      if(input.equals("exit")) {
        break;
      }
      networkService.sendMessage(input);
      System.out.println();
    }

    System.out.println("프로그램을 정상 종료합니다.");
  }

}
 */

