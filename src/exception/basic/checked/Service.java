package exception.basic.checked;

public class Service {
  Client client = new Client();

  /**
   * 예외를 잡아서 처리하는 코드.
   */

  public void callCatch() {

    try {
      client.call();
      /*
      call()은 throw를 실행한 순간 끝난다.


      throw가 발생했으면 call() 안에서 더 이상 아무것도 실행되지 않고, 남아있는 코드는 무시된다.

      무시 되면서 이제 예외를 호출 했던 코드 자리로 예외(폭탄)를 돌린다.
       */
    } catch (MyCheckedException e) { // 폭탄 해체.MyCheckedException을 exception으로 작성해도됨. 왜냐하면 하위 클래스의 예외들 다 잡음.
      /*
      catch (MyCheckedException e)를 보자.

      원래 client.call()에서 throw new MyCheckedException();이 있는데
      이걸 보면 참조값을 따로 담는 변수가 없는데 어떻게 e가 MyCheckedException 클래스로 접근 가능한가?

      catch문은 자동으로 예외 객체를 잡아서 e에 초기화 해주는 기능이 있기 때문이다.
       */


      // 예외 처리 로직
      System.out.println("예외 처리, message = " + e.getMessage());
    }

    System.out.println("정상 흐름");

    /*
    Client 클래스를 보면..

    client.call() 메서드에서 MyCheckedException 예외를 발생 시키고
    예외를 처리 할 능력이 없어서 예외를 던짐.

    그래서 던진 예외가 client.call()에 오게 되는 것

    이 예외를 처리해야함.

    catch문에 MyCheckedException e가 가능한 이유는
    client.call(); 자체는 반환하는 것이 없지만 throw new MyCheckedException(); 이 있어서
    MyCheckedException e = new MyCheckedException();이 가능한 것.
     */

  }

  /**
   * 체크 예외를 밖으로 던지는 코드
   * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다.
   */

  public void catchThrow() throws MyCheckedException {
    client.call();
  }

}

/*
package exception.basic.checked;

checked 예외는 예외를 잡아서 처리하거나, 던지거나 둘중 하나를 필수로 선택해야 한다.

public class Service {
  Client client = new Client();

  예외를 잡아서 처리하는 코드.

  public void callCatch() {
    try {
      client.call();

      call()은 throw를 실행한 순간 끝난다.

      throw가 발생 했으면 call() 안에서 더 이상 아무것도 실행되지 않고, 남아있는 코드가 무시 된다.

      무시 되면서 이제 예외를 호출 했던 코드 자리로 예외(폭탄)을 돌린다.
    } catch (MyCheckedException e) { // 폭탄 해체. MyCheckedException을 Exception으로 작성해도 된다. 왜냐하면 하위 클래스의 예외들을 다 잡는다.

      catch (MyCheckedException e)를 보자.

      원래 client.call()에서 throw new MyCheckedException();이 있는데
      이걸 보면 참조값을 따로 담는 변수가 없는데 어떻게 e가 MyCheckedException 클래스로 접근 가능한가?

      catch문은 자동으로 예외 객체를 잡아서 e에 초기화 해주는 기능이 있기 때문이다.

      // 예외 처리 로직
      System.out.println("예외 처리, message = " + e.getMessage());
    }

    System.out.println("정상 흐름");
  }

  * 체크 예외를 밖으로 던지는 코드
  * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야한다.

  public void callThrow() throws MyCheckedException {
    client.call();
  }

  Client 클래스를 보면..

  client.call() 메서드에서 MyCheckedException 예외를 발생 시키고
  예외를 처리 할 능력이 없어서 예외를 던짐.

  그래서 던진 예외가 client.call()에 오게 되는 것

  이 예외를 처리해야함.

  catch문에 MyCheckedException e가 가능한 이유는
  client.call(); 자체는 반환하는 것이 없지만 throw new MyCheckedException(); 이 있어서
  MyCheckedException e = new MyCheckedException();이 가능한 것.



}
 */
