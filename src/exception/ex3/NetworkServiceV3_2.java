package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

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
    } catch(ConnectExceptionV3 e) { // 우선순위인 오류 잡기
      System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지 : " + e.getMessage());
    } catch (NetworkClientExceptionV3 e) { // 우선순위 이외의 잡을 수 있는 오류들. (오류는 수 없이 많은데 모든 오류를 catch로 잡기 힘들다.)
      System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
    } catch (Exception e) { // Connect,NetworkClient 이외의 알 수 없는 오류.
      System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
    } finally {
      client.disconnect();
    }
  }

}

/*
package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;

public class NetworkServiceV3_2 {

  public void sendMessage(String data) {
    String address = "https://example.com";

    NetworkClientV3 client = new NetworkClientV3(address);
    client.initError(data);

    try {
      client.connect();
      client.send(data);
    } catch (ConnectExceptionV3 e) {
       System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
    } catch (NetworkClientException e) {
      System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
    } finally {
      client.disconnect();
    }
  }

}


예외 클래스를 각각의 예외 상황에 맞추어 만들면, 각 필요에 맞는 예외를 잡아서 처리할 수 있다.

예를 들면 e.getAddress(), e.getSendData()와 같이 각각의 예외 클래스가 가지는 고유의 기능을
활용 할 수 있다.

 */