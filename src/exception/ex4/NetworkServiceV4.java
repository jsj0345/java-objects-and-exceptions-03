package exception.ex4;


public class NetworkServiceV4 {

  public void sendMessage(String data) {
    String address = "http://example.com";
    NetworkClientV4 client = new NetworkClientV4(address);
    client.initError(data);

    try {
      client.connect();
      client.send(data); // throw new RuntimeException("ex");
      /*
      catch를 보면 NetworkClientExceptionV2는 Exception을 상속 받음.
      체크 예외인데 언체크예외인 부류는 Exception이 아니면 상속 받을 수가 없음.

      즉, NetworkClientExceptionV2는 RuntimeException의 하위 관계가아님. 그래서 예외 처리 불가.
      언체크 예외이므로 처리가 불가하니 자동으로 throws 던짐.
       */
    } finally {
      client.disconnect();
    }
  }

}

/*
package exception.ex4;

public class NetworkServiceV4 {

  public void sendMessage(String data) {
    String address = "https://example.com";

    NetworkClientV4 client = new NetworkClientV4(address);
    client.initError(data);

    try {
      client.connect();
      client.send(data);
    } finally {
      client.disconnect();
    }

  }
}
 */