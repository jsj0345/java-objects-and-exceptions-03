package nested.nested.ex2;

public class Network {

  public void sendMessage(String text) {
    NetworkMessage networkMessage = new NetworkMessage(text);
    // 내부 클래스가 정적 클래스가 아니므로 주소값을 알아야 접근 가능.

    networkMessage.print();

    /*
    NetworkMessage networkMessage = new NetworkMessage(text);
    여기에서 나의 클래스에 포함된 중첩 클래스가 아니라 다른 곳에 있는
    중첩 클래스에 접근할 때는 바깥클래스.중첩클래스 로 접근해야 한다.
     */

  }

  private static class NetworkMessage {

    private String content;

    public NetworkMessage(String content) {
      this.content = content;
    }

    public void print() {
      System.out.println(content);
    }

  }

}

/*
package nested.nested.ex2;

public class Network {

  public void sendMessage(String text) {
    NetworkMessage networkMessage = new NetworkMessage(text);
    networkMessage.print();
  }

  private static class NetworkMessage {
    private String content;

    public NetworkMessage(String content) {
      this.content = content;
    }

    public void print() {
      System.out.println(content);
    }
  }

}

 */
