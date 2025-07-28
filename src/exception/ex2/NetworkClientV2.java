package exception.ex2;

public class NetworkClientV2  {

  private final String address;
  public boolean connectError; // boolean은 값이 초기화 되지 않으면 false로 초기화.
  public boolean sendError;


  public NetworkClientV2(String address) {
    this.address = address;
  }


  public void connect() throws NetworkClientExceptionV2 {
    if(connectError) {
      throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
    }

    //연결 성공
    System.out.println(address + " 서버 연결 성공");

  }

  public void send(String data) throws NetworkClientExceptionV2 {
    if (sendError) {
      throw new NetworkClientExceptionV2("sendError", address + " 데이터 전송 실패: " + data);
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
package exception.ex2;

public class NetworkClientV2 {

  private final String address;
  public boolean connectError;
  public boolean sendError;

  public NetworkClientV2(String address) {
    this.address = address;
  }

  public void connect() throws NetworkClientExceptionV2 {
    if(connectError) {
      throw new NetworkClientException("connectError", address + " 서버 연결 실패");
    }

    // 연결 성공
    System.out.println(address + " 서버 연결 성공");
  }

  public void disconnect() {
    System.out.println(address + " 서버 연결 해제");
  }

  public void init Error(String data) {

  if(data.contains("error1")) {
    connectError = true;
  }

  if(data.contains("error2")) {
    sendError = true;
  }

  }

}






 */



