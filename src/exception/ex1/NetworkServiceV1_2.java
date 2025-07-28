package exception.ex1;

public class NetworkServiceV1_2 {

  public void sendMessage(String data) {

    NetworkClientV1 client = new NetworkClientV1("http://example.com");
    client.initError(data);

    String connectResult = client.connect();


    if(isError(connectResult)) {
      System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
      return;
    }

    /*
    아래 코드 조건을 보면 결과가 성공이 아니다. 라는 표현일때 true인데 이거 자체가 좀 해석하기가 빡셈
    이거를 오류다. 라고 표현을 하고 싶으면?
    ctrl + alt + shift + T를 눌러보자.
    누르고나서 Extract Method를 실행 해보자.

    if( !connectResult.equals("success") ) { // (!connectResult.equals("success")) 이거 표현자체가 좀 복잡함. 어떻게 바꿀까?
      System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
      return;
    }
     */

    String sendResult = client.send(data);
    if(isError(sendResult)) {
      System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
      return;
    }

    client.disconnect();

  }

  private static boolean isError(String resultCode) {
    return !resultCode.equals("success");
  }


}

/*
package exception.ex1;

public class NetworkServiceV1_2 {

  public void sendMessage(String data) {
    NetworkClientV1 client = new NetworkClientV1("http://example.com");
    client.initEroor(data);
    
    String connectResult = client.connect();
    if(isError(connectResult)) {
      System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
      return;
    }
    
    String sendResult = client.send(data);
    if(isError(sendResult)) {
      System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
      return;
    }
    
    client.disconnect();
  }
  
  private static boolean isError(String resultCode) {
    return !resultCode.equals("success");
  }
  
}    
  
        

 */


