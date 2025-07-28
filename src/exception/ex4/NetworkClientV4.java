package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {

  private final String address;
  public boolean connectError; // boolean은 값이 초기화 되지 않으면 false로 초기화.
  public boolean sendError;


  public NetworkClientV4(String address) {
    this.address = address;
  }


  public void connect()  {
    if(connectError) {
      throw new ConnectExceptionV4(address , address + " 서버 연결 실패");
    }

    /*
    if(connectError) {
      throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
    }

    기존 코드를 보면 어떤 에러의 종류인지를 봐야 판단하는데 이제는 그런거랑 상관없이 예외를 세분화해서 어떤 예외인지
    한눈으로 알아 볼 수 있음.
     */

    //연결 성공
    System.out.println(address + " 서버 연결 성공");



  }

  public void send(String data)  {
    if (sendError) {
      throw new SendExceptionV4(data , address + " 데이터 전송 실패: " + data);
      // 중간에 다른 예외가 발생했다고 가정
      //throw new RuntimeException("ex"); // 전혀 생각치 못한 다른 예외가 발생했다고 생각.
      // 언체크 예외라 throws는 자동으로 된다.
    }

    //전송 성공
    System.out.println(address + " 서버에 데이터 전송: " + data);

  }

  public void disconnect() {
    System.out.println(address + " 서버 연결 해제");
  }

  public void initError(String data) {
    if(data.contains("error1")) {
      connectError = true;
    }

    if(data.contains("error2")) {
      sendError = true;
    }
  }

}

/*
package exception.ex4;

import exception.ex4.exception.ConnectException;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {

  private final String address;
  public boolean connectError;
  public boolean sendError;

  public NetworkClientV4(String address) {
    this.address = address;
  }

  public void connect() {
    if (connectError) {
      throw new ConnectExceptionV4(address, address + " 서버 연결 성공");
    }

    System.out.println(address + " 서버 연결 성공");
  }

  public void send(String data) {
    if (sendError) {
      throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: " + data);
    }

    System.out.println(address + " 서버에 데이터 전송: " + data);
  }

  public void disconnect() {
    System.out.println(address + " 서버 연결 해제");
  }

  public void initError(String data) {
    if(data.contains("error1")) {
      connectError = true;
    }

    if(data.contains("error2")) {
      sendError = true;
    }

  }

}

 */



