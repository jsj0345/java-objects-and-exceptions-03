package nested.nested.ex1;

public class Network {

  public void sendMessage(String text) {
    NetworkMessage networkMessage = new NetworkMessage(text);
    networkMessage.print();
  }


}


/*
package nested.nested.ex1;

public class Network {

  public void SendMessage(String text) {
    NetworkMessage networkMessage = new NetworkMessage(text);
    networkMessage.print();
  }

}
 */
