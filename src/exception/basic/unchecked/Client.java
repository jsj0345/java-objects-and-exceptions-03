package exception.basic.unchecked;

public class Client {
  public void call() { // throws를 쓰지 않아도 오류가 발생 하지 않는다.
    throw new MyUncheckedException("ex");

    /*
    그럼 결론은 언체크 예외 같은 경우에는
    따로 예외를 던질 필요는 없고(알아서 던지니까) 받는 곳은
    어찌됐든 오류가 발생 하지 않게 하려면 catch를 해줘야 하는거네?

    -> O.K
     */
  }
}

/*
package exception.basic.unchecked;

public class Client {
  public void call() { // throws를 쓰지 않아도 오류가 발생 하지 않는다.
    throw new MyUncheckedException("ex");

    그럼 결론은 언체크 예외 같은 경우에는
    따로 예외를 던질 필요는 없고 (알아서 던지니까) 받는 곳은
    어찌됐든 오류가 발생 하지 않게 하려면 catch를 해줘야 하는거네?

    O.K

  }
}
 */
