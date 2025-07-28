package exception.basic.unchecked;

/**
 * UnChecked 예외는
 * 예외를 잡거나, 던지지 않아도 된다.
 * 예외를 잡지 않으면 자동으로 밖으로 던진다.
 */

public class Service {
  Client client = new Client();

  /**
   * 필요한 경우 예외를 잡아서 처리 할 수 있다.
   */
  public void callCatch() {
    /*
    try - catch 문은 꼭 메서드 안에서만 작성해야 하는가?

    정답 : O

    이러한 이유는 try-catch는 "실행 흐름을 제어"하기 위한 문법임.
    실행 흐름은 메서드 안에서만 일어나기 때문에,
    클래스의 본문(필드 선언 위치)에서는 try-catch를 쓸 수 없음.

     */

    try {
      client.call();
    } catch (MyUncheckedException e) {
      System.out.println("예외 처리, Message = " + e.getMessage());
    }
    System.out.println("정상 로직");

  }

  /**
   * 예외를 잡지 않아도 된다. 자연스럽게 상위로 넘어간다.
   * 체크 예외와 다르게 throws 예외 선언을 하지 않아도 됩니다.
   */
  public void callThrow() {
    client.call();
  }

}

/*
UnChecked 예외는
예외를 잡거나, 던지지 않아도 된다.
예외를 잡지 않으면 자동으로 밖으로 던진다.

public class Service {

  Client client = new Client();

  필요한 경우 예외를 잡아서 처리하면 된다.

  public void callCatch() {
    try {
      client.call();
    } catch (MyUncheckedException e) {
      // 예외 처리 로직
      System.out.println("예외 처리, message = " + e.getMessage());
    }

    System.out.println("정상 로직");
  }

  예외를 잡지 않아도 된다. 자연스럽게 상위로 넘어간다.
  체크 예외와 다르게 throws 예외 선언을 하지 않아도 된다.

  public void callThrow() {
    client.call();
  }

}


 */
