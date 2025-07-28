package exception.basic.checked;

/**
 * Exception을 상속받은 예외는 체크 예외가 된다.
 */

public class MyCheckedException extends Exception {

  public MyCheckedException(String message) {
    super(message); // 오류 메시지 보관.
  }

  /*
  내가 궁금한게 throw 예외(); 이런식으로 작성 할 때
  그냥 그 예외로 접근 할 수 있는 참조값을 주는거고
  그 참조값으로 예외인 클래스로 접근해서 상위 클래스를 상속 받아서 예외 처리가 가능하다.
  이렇게 생각해도될까?

  -> Yes!

  예외 클래스를 만들려면 예외를 상속 받으면 된다.
  Exception을 상속 받은 예외는 체크 예외가 된다.
   */
}

/*
package exception.basic.checked;

Exception을 상속받은 예외는 체크 에외가 된다.

public class MyCheckedException extends Exception {

  public MyCheckedException(String message) {
    super(message);
  }

}

  내가 궁금한게 throw 예외(); 이런식으로 작성 할 때
  그냥 그 예외로 접근 할 수 있는 참조값을 주는거고
  그 참조값으로 예외인 클래스로 접근해서 상위 클래스를 상속 받아서 예외 처리가 가능하다.
  이렇게 생각해도될까?

  -> Yes!

  예외 클래스를 만들려면 예외를 상속 받으면 된다.
  Exception을 상속 받은 예외는 체크 예외가 된다.

*/