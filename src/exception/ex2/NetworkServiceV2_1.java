package exception.ex2;

public class NetworkServiceV2_1 {

  public void sendMessage(String data) throws NetworkClientExceptionV2 {
    String address = "http://example.com";
    NetworkClientV2 client = new NetworkClientV2(address);
    client.initError(data);

    client.connect(); // alt+enter를 하면 자동으로 throws ~ 를 붙일수있음.
    client.send(data);
    client.disconnect();

  }

}

/*
package exception.ex2;

public class NetworkServiceV2_1 {

  public void sendMessage(String data) throws NetworkClientExceptionV2 {
    String address = "http://example.com";
    NetworkClientV2 client = new NetworkClientV2(address);
    client.initError(data);

    client.connect(); // alt+enter를 하면 자동으로 throws ~ 를 붙일수있음
    client.send(data);
    client.disconnect();
  }

}

여기서는 예외를 별도로 처리하지 않고, throws를 통해 밖으로 던짐.
 */

