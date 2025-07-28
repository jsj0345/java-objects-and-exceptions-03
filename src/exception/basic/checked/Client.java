package exception.basic.checked;

public class Client {

  public void call() throws MyCheckedException {

    // 문제 상황
    throw new MyCheckedException("ex"); // 예외를 처리하지 못하니까 던지는것.

    /*
    throw 예외 라고 하면 새로운 예외를 발생시킬 수 있다.
    예외도 객체이기 때문에 객체를 먼저 new로 생성하고 예외를 발생시켜야 한다.

    throws 예외는 발생시킨 예외를 메서드 밖으로 던질 때 사용하는 키워드이다.

    throw -> 예외 발생

    throws -> 밖으로 던지는 것

    throw로 가는 순간 더이상 코드는 진행되지않음. 예외를 처리해야함.
    만약에 반환값이 String이든 뭐든 형태가 있는거여도 throw를 마주치면
    리턴하지않음. 만약에 마주치기 전에 return이 있다? 그럼 return하고 끝남.
    왜냐? 그 메서드의 임무는 끝난거니까!
     */

  }

}

/*
package exception.basic.checked;

public class Client {
  public void call() throws MyCheckedException {
    // 문제 상황.
    throw new MyCheckedException("ex"); // 예외를 처리하지 못하니깐 던지는 것.

    throw 예외 라고 하면 새로운 예외를 발생시킬 수 있다.
    예외도 객체이기 때문에 객체를 먼저 new로 생성하고 예외를 발생시켜야 한다.

    throws 예외는 발생시킨 예외를 메서드 밖으로 던질 때 사용하는 키워드이다.

    throw -> 예외 발생.

    throws -> 밖으로 던지는 것.

    throw로 가는 순간 더이상 코드로 진행되지않음. 예외를 처리해야함.
    만약에 반환값이 String이든 뭐든 형태가 있는거여도 throw를 마주치면
    리턴하지않음. 만약에 마주치기 전에 return이 있다? 그럼 return하고 끝남.
    메서드의 임무는 끝난거니까.
  }
}



 */