package exception.ex2;

public class NetworkServiceV2_5 {

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
    } finally {
      client.disconnect();
    }
  }

}

/*
package exception.ex2;

public class NetworkServiceV2_5 {

  public void sendMessage(String data) {
    String address = "http://example.com";
    NetworkClientV2 client = new NetworkClientV2(address);
    client.initError(data);

    try {
      client.connect();
      client.send(data); // throw new RuntimeException("ex");


      catch를 보면 NetworkClientExceptionV2는 Exception을 상속 받음.
      체크 예외인데 언체크예외인 부류는 Exception이 아니면 상속 받을 수가 없음.

      즉, NetworkClientExceptionV2는 RuntimeException의 하위 관계가 아님. 그래서 예외 처리 불가.
      언체크 예외이므로 처리가 불가하니 자동으로 throws 던짐
    } catch (NetworkClientExceptionV2 e) {
      System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
    } finally {
      client.disconnect();
    }

  }

}

try, catch 안에서 처리할 수 없는 예외가 발생해도 finally는 반드시 호출된다.

자바 예외 처리는 try~catch~finally 구조를 사용해서 처리할 수 있다.

정상 흐름과 예외 흐름을 분리해서, 코드를 읽기 쉽게 만든다.
사용한 자원을 항상 반환할 수 있도록 보장해준다.

 */
