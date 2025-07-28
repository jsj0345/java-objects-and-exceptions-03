package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

  public void sendMessage(String data) {
    String address = "http://example.com";
    NetworkClientV3 client = new NetworkClientV3(address);
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
    } catch(ConnectExceptionV3 e) {
      System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지 : " + e.getMessage());
    } catch (SendExceptionV3 e) {
      System.out.println("[전송 오류] 전송 데이터: " + e.getSendData() + ", 메시지: " + e.getMessage());
    } finally {
      client.disconnect();
    }
  }

}

/*
package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

  public void sendMessage(String data) {
    String address = "https://example.com";

    NetworkClientV3 client = new NetworkClientV3(address);
    client.initError(data);

    try {
      client.connect();
      client.send(data);
    } catch (ConnectExceptionV3 e) {
      System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
    } catch (SendExceptionV3 e) {
      System.out.println("[전송 오류] 전송 데이터: " + e.getSendData() + ", 메시지: " + e.getMessage());
    } finally {
      client.disconnect();
    }

  }

}

 */