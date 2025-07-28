package exception.basic.checked;

public class CheckedThrowMain {

  public static void main(String[] args) throws MyCheckedException {
    Service service = new Service();
    service.catchThrow();
    System.out.println("정상 종료");

    /*
    위 코드를 실행하면 다음과 같이 결과가 나온다.

    Exception in thread "main" exception.basic.checked.MyCheckedException: ex
	     at exception.basic.checked.Client.call(Client.java:8)
	     at exception.basic.checked.Service.catchThrow(Service.java:62)
	     at exception.basic.checked.CheckedThrowMain.main(CheckedThrowMain.java:7)

	  예외가 main() 밖으로 던져지면 예외 정보와 스택 트레이스 (Stack Trace)를 출력하고 프로그램이 종료된다.
	  스택 트레이스 정보를 활용하면 예외가 어디서 발생했는지, 그리고 어떤 경로를 거쳐서 넘어왔는지 확인 할 수 있다.

	  위에 적힌 영문이 스택 트레이스다.


    */
  }
}

/*
package exception.basic.checked;

public class CheckedThrowMain {

  public static void main(String[] args) throws MyCheckedException {
    Service service = new Service();
    service.callThrow();
    System.out.println("정상 종료");
  }

}
 */
