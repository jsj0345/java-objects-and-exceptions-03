package exception.basic.unchecked;

/**
 * RuntimeException을 상속 받은 예외는 언체크 예외가 됩니다.
 */

public class MyUncheckedException extends RuntimeException{
  public MyUncheckedException(String message) {
    super(message);
  }
}

/*
package exception.basic.unchecked;

public class MyUncheckedException extends RuntimeException {
  public MyUncheckedException(String message) {
    super(message);
  }
}

 */