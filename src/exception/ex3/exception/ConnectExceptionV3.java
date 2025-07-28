package exception.ex3.exception;

public class ConnectExceptionV3 extends NetworkClientExceptionV3{

  private final String address;

  public ConnectExceptionV3(String address, String message) {
    super(message);
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  /*
  예전에 생성자를 배웠을 때, 상속 관계면 자식 클래스에서 부모 클래스의 생성자를 호출 해야함. (super)

  근데 이러한 이유는 다음과 같다.

  main 메서드에서 부모 클래스의 객체를 만들면서 동시에 생성자를 호출했다고 가정하자.

  이때 주소값 X001을 받았다고 생각하자.

  이러한 상황에선 자식 클래스가 메모리에 생성 되지 않는다.

  근데 만약에 자식 클래스 객체를 생성하면서 동시에 super로 부모 클래스의 생성자까지 호출하면

  하나의 참조값 (X002)로 해결이 된다.

  즉 두가지는 아예 별개이므로 결론은 자식 클래스에서 부모 클래스의 생성자를 super로 호출 해야한다. (캡슐화 및 초기화)
   */

}

/*
package exception.ex3.exception;

public class ConnectExceptionV3 extends NetworkClientExceptionV3 {

  private final String address;

  public ConnectExceptionV3(String address, String message) {
    super(message);
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

}
 */
