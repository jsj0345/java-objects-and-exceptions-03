package exception.ex2;

public class NetworkServiceV2_4 {

  public void sendMessage(String data) {
    String address = "http://example.com";
    NetworkClientV2 client = new NetworkClientV2(address);
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
    } catch (NetworkClientExceptionV2 e) {
      System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
    }
      client.disconnect();
  }

}

/*
package exception.ex2;

public class NetworkServiceV2_4 {

  public void sendMessage(String data) {
    String address = "http://example.com";

    NetworkClientV2 client = new NetworkClientV2(address);
    client.initError(data);

    try {
      client.connect();
      client.send(data);
    } catch (NetworkClientExceptionV2 e) {
      System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
    }

    //NetworkClientExceptionV2이 아닌 다른 예외가 발생하면 호출되지 않음..
    client.disconnect();

  }

}

이 코드를 보면 예외 처리가 끝난 다음에 정상 흐름의 마지막에 client.disconnect()를 호출했다.
이렇게 하면 예외가 모두 처리되었기 때문에 client.disconnect()가 항상 호출될 것 같다.

하지만 지금과 같은 방식에는 큰 문제가 있다.

바로 catch에서 잡을 수 없는 예외가 발생할 때이다.

근데 만약에 connect나 send 메서드에 다른 예외가 있다고 생각하자.

이럴때는 예외 처리를 못할것이고 자원 해제가 안된다. 이것 또한 문제이다.

새로운 대안이 필요하다.
 */