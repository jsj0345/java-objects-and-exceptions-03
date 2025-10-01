## 예외 처리

### 1. 예외 처리가 필요한 이유 - 시작 

예외 처리가 필요한 이유를 알아보기 위해 간단한 예제 프로그램을 만들어보자.

프로그램은 사용자의 입력을 받고, 입력 받은 문자를 외부 서버에 전송하는 프로그램이다.

프로그램 구성도

1. 사용자의 입력을 data로 Main에서 받는다.

2. Main에서 NetworkService로 sendMessage(data)로 보낸다.

3. NetworkService에선 NetworkClient로 connect(), send(data), disconnect()를 호출.

4. NetworkClient에선 외부 서버로 연결, 데이터 전송, 연결 해제 등을 함. 

전체 흐름을 한번 더 정리하면..

Main을 통해 사용자의 입력을 받으면 사용자의 입력을 NetworkService에 전달한다. 

NetworkService는 NetworkClient를 사용해서 외부 서버에 연결하고, 데이터를 전송하고, 전송 되면 연결을 종료한다.

예제 코드를 만들어보자.

```java
package exception.ex0;

public class NetworkClientV0 {
  
  private final String address;
  
  public NetworkClientV0(String address) {
    this.address = address;
  }
  
  public String connect() {
    //연결 성공
    System.out.println(address + " 서버 연결 성공");
    return address;
  }
  
  public String send(String data) {
    //전송 성공
    System.out.println(address + " 서버에 데이터 전송: " + data);
    return "success";
  }
  
  public void disconnect() {
    System.out.println(address + " 서버 연결 해제");
  }
  
}  
```

```java
package exception.ex0;

public class NetworkServiceV0 {
    
   public void sendMessage(String data) {
     String address = "http://example.com";
     NetworkClientV0 client = new NetworkClientV0(address);
     
     client.connect();
     client.send(data);
     client.disconnect(); 
   }
   
}
```

NetworkService는 복잡한 NetworkClient 사용 로직을 처리한다.

NetworkClient를 생성하고, 이때 접속할 외부 주소 주소도 함께 전달한다. 

```java
package exception.ex0;

import java.util.Scanner;

public class MainV0 {

  public static void main(String[] args) {
    NetworkServiceV0 networkService = new NetworkServiceV0(); 
    
    Scanner scanner = new Scanner(System.in);
    
    while(true) {
      System.out.print("전송할 문자 : ");
      String input = sc.nextLine();
      if(input.equals("exit")) {
        break;
      }
      networkService.sendMessage(input);
      System.out.println();
    }
    System.out.println("프로그램을 정상 종료합니다.");
  }
}
```

코드를 실행해보자.

<출력>

전송할 문자: abc
http://example.com 서버 연결 성공
http://example.com 서버에 데이터 전송: abc
http://example.com 서버 연결 해제

전송할 문자: exit
프로그램을 정상 종료합니다.

### 2. 예외 처리가 필요한 이유2 - 오류 상황 만들기

외부 서버와 통신할 때는 다음과 같은 다양한 문제들이 발생한다.

- 외부 서버와 연결에 실패한다. (네트워크 오류 등등)

- 데이터 전송에 문제가 발생한다.

오류 상황을 가상으로 시뮬레이션 해보자. 

오류 상황을 시뮬레이션 하기 위해 사용자의 입력 값을 활용한다.

- 연결 실패: 사용자가 입력하는 문자에 "error1" 단어가 있으면 연결에 실패한다. 

오류 코드는 "connectError"이다. 

- 전송 실패: 사용자가 입력하는 문자에 "error2" 단어가 있으면 데이터 전송에 실패한다.

오류 코드는 "sendError"이다. 

```java
package exception.ex1; 

public class NetworkClientV1 {

  private final String address;
  public boolean connectError;
  public boolean sendError;

  public NetworkClientV1(String address) {
    this.address = address;
  }

  public String connect() {
    if (connectError) {
      System.out.println(address + " 서버 연결 실패");
      return "connectError";
    }

    //연결 성공
    System.out.println(address + " 서버 연결 성공");
    return "success";
  }
  
  public String send(String data) {
    if(sendError) {
      System.out.println(address + " 서버에 데이터 전송 실패: " + data);
      return "sendError";
    }
    
    //전송 성공
    System.out.println(address + " 서버에 데이터 전송: " + data);
    return "success"; 
  }
  
  public void disconnect() {
    System.out.println(address + " 서버 연결 해제");
  }
  
  public void initError(String data) {
    if(data.contains("error1")) {
      connectError = true;
    }
    
    if(data.contains("error2")) {
      sendError = true; 
    }
  }
}
```

- NetworkClientV1에는 connectError, sendError 필드가 있다.

- connectError : 이 필드의 값이 true가 되면 연결에 실패하고 connectError 오류 코드를 반환.

- sendError : 이 필드의 값이 true가 되면 데이터 전송에 실패한다. sendError 오류 코드를 반환한다. 

initError(String data)

-> 이 메서드를 통해서 connectError, sendError 필드의 값을 true로 설정할 수 있다.

-> 사용자 입력 값에 "error1"이 있으면 connectError 오류가 발생하고, "error2"가 있으면

sendError 오류가 발생한다. 

```java
package exception.ex1;

public class NetworkServiceV1_1 {
  public void sendMessage(String data) {
    String address = "http://example.com";
    NetworkClientV1 client = new NetworkClientV1(address);
    client.initError(data);
    
    client.connect();
    client.send(data);
    client.disconnect();
  }
}
```

-> client.initError(data) : 사용자의 입력 값을 기반으로 오류를 활성화 한다.

```java
package exception.ex1;

import java.util.Scanner;

public class MainV1 {

  public static void main(String[] args) {
    NetworkServiceV1_1 networkService = new NetworkServiceV1_1();

    Scanner scanner = new Scanner(System.in);
    
    while(true) {
      System.out.print("전송할 문자 : ");
      String input = scanner.nextLine();
      
      if(input.equals("exit")) {
        break;
      }
      networkService.sendMessage(input);
      System.out.println();
    }
    System.out.println("프로그램을 정상 종료합니다.");
  }
}
```

이제 이 프로그램을 실행하면 error1, error2를 보내지 않으면 정상적이다. 

하지만 error1을 입력 데이터로 보낸다면?

connectError가 true가 된다. 

이 상태로 연결,전송,해제를 하면

http://example.com 서버 연결 실패
http://example.com 서버에 데이터 전송: error1
http://example.com 서버 연결 해제 

연결은 실패했는데 데이터 전송은 했다는게 이상하다. 이 점을 고쳐야한다.

그리고 오류가 발생했을 때 어떤 오류가 발생했는지 자세한 내역을 남기면 이후 디버깅에 도움이 될 것이다.

오류 로그를 남겨야 한다.

### 3. 예외 처리가 필요한 이유3 - 반환 값으로 예외 처리

반환 값을 사용해서 예외 상황을 처리해보자.

```java
package exception.ex1;

public class NetworkServiceV1_2 {
    
  public void sendMessage(String data) {
    NetworkClientV1 client = new NetworkClientV1("http://example.com");
    client.initError(data);
    
    String connectResult = client.connect(); 
    if(isError(connectResult)) {
      System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
      return; 
    }
    
    String sendResult = client.send(data); 
    if(isError(sendResult)) {
      System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
      return;
    }
    
    client.disconnect();
  }
  
  private static boolean isError(String resultCode) {
    return !resultCode.equals("success"); 
  }
}
```

```java
package exception.ex1;

import java.util.Scanner;

public class MainV1 {

  public static void main(String[] args) {
    NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
    
    Scanner scanner = new Scanner(System.in);

    while(true) {
      System.out.print("전송할 문자: ");
      String input = scanner.nextLine();
      if(input.equals("exit")) {
        break;
      }
      networkService.sendMessage(input);
      System.out.println();
    }

    System.out.println("프로그램을 정상 종료합니다.");

  }

}
```

이제 메인 메서드에서 실행을 해보자. 

실행을 하면 error1, error2를 전송할 문자로 보내보자.

결과는 다음과 같이 나온다.

**결과**
전송할 문자: error1
http://example.com 서버 연결 실패
[네트워크 오류 발생] 오류 코드: connectError

전송할 문자: error2
http://example.com 서버 연결 성공
http://example.com 서버에 데이터 전송 실패: error2
[네트워크 오류 발생] 오류 코드: sendError

여기서 보면 해결된것 처럼 보이지만 error1을 입력하면 isError 메서드로 인해 연결 실패 이건 성공적이나

error2를 입력하면 데이터 전송 실패까진 좋으나 서버 연결 해제를 못하고있다. isError로 인해 true가 되니까 해결을 못함. (return;) 을 보는순간 이제 코드는 더이상 실행안됨. 

이렇게 되면 네트워크 연결 자원이 고갈될 수 있다.  

이걸 어떻게 해결할까? disconnect()를 반드시 호출하도록 코드를 작성해보자.

```java
package exception.ex1;

public class NetworkServiceV1_3 {
  
  public void sendMessage(String data) {
    NetworkClientV1 client = new NetworkClientV1("http://example.com");
    client.initError(data);
    
    String connectResult = client.connect(); 
    if(isError(connectResult)) {
      System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
    } else {
      String sendResult = client.send(data);
      if(isError(sendResult)) {
        System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
      }
    }
    
    client.disconnect(); 
  }
  
  private static boolean isError(String resultCode) {
    return !resultCode.equals("success");
  }
}
```

이 코드는 오류 코드가 나오더라도 return;이 없어서 client.disconnect()가 실행된다. 

한번 실행해보자. 

```java
package exception.ex1;

import java.util.Scanner;

public class MainV1 {

  public static void main(String[] args) {
    NetworkServiceV1_3 networkService = new NetworkServiceV1_3();
    
    Scanner scanner = new Scanner(System.in);

    while(true) {
      System.out.print("전송할 문자: ");
      String input = scanner.nextLine();
      if(input.equals("exit")) {
        break;
      }
      networkService.sendMessage(input);
      System.out.println();
    }

    System.out.println("프로그램을 정상 종료합니다.");

  }

}
```

**결과**
전송할 문자: error1
http://example.com 서버 연결 실패
[네트워크 오류 발생] 오류 코드: connectError
http://example.com 서버 연결 해제

전송할 문자: error2
http://example.com 서버 연결 성공
http://example.com 서버에 데이터 전송 실패: error2
[네트워크 오류 발생] 오류 코드: sendError
http://example.com 서버 연결 해제

결과는 성공적이다. 

하지만 NetworkServiceV1_2, NetworkServiceV1_3을 보면 정상 흐름과 예외 흐름이 분리되어 있지 않다.

어떤 부분이 정상 흐름인지 어떤 부분이 예외 흐름인지 이해하기가 어렵다.

예를 들면, 

```java
public static void main(String[] args) {
  String connectResult = client.connect();
  if(isError(connectResult)) {
    System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
    return;
  }

  String sendResult = client.send(data);
  if(isError(sendResult)) {
    System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
    return;
  }
}
```

client.connect(); 까진 정상 흐름인데

if문부터는 예외 흐름이다. 

어찌됐든 정상 흐름과 예외 흐름이 섞여 있기 때문에 코드를 한눈에 이해하기가 어렵다.

쉽게 이야기해서 가장 중요한 정상 흐름이 한 눈에 들어오지 않는다.

어떻게 하면 정상 흐름과 예외 흐름을 분리할 수 있을까? 지금과 같이 반환 값을 사용해서 예외 상황을 처리하는 방식으로는

해결할 수 없는 것은 확실하다.

이런 문제를 해결하기 위해 바로 예외 처리 메커니즘이 존재한다.

지금부터 본격적으로 자바 예외 처리에 대해 알아보도록 하자. 

### 3. 예외 계층

- Object: 자바에서 기본형을 제외한 모든 것은 객체다. 예외도 객체이다.

모든 객체의 최상위 부모는 Object이므로 예외의 최상위 부모도 Object이다.

- Throwable: 최상위 예외이다. 하위에 Exception과 Error가 있다.

- Error: 메모리 부족이나 심각한 시스템 오류와 같이 애플리케이션에서 복구가 불가능한 시스템 예외이다.

애플리케이션 개발자는 이 예외를 잡으려고 해서는 안된다.

- Exception: 체크 예외

-> 애플리케이션 로직에서 사용할 수 있는 실질적인 최상위 예외이다. 

-> Exception과 그 하위 예외는 모두 컴파일러가 체크하는 체크 예외이다.

단 RuntimeException은 예외로 한다.

- RuntimeException: 언체크 예외, 런타임 예외

-> 컴파일러가 체크 하지 않는 언체크 예외이다.

-> RuntimeException과 그 자식 예외는 모두 언체크 예외이다.

-> RuntimeException의 이름을 따라서 RuntimeException과 그 하위 언체크 예외를 런타임 예외라고 많이 부른다.

여기서도 앞으로는 런타임 예외로 종종 부르겠다. 

**체크 예외 vs 언체크 예외(런타임 예외)**

- 체크 예외는 발생한 예외를 개발자가 명시적으로 처리해야 한다. 그렇지 않으면 컴파일 오류가 발생한다.

- 언체크 예외는 개발자가 발생한 예외를 명시적으로 처리하지 않아도 된다. 

### 4. 자바 예외 처리2 - 예외 기본 규칙

1. Main은 Service를 호출한다.

2. Service는 Client를 호출한다.

3. Client에서 예외가 발생했다.

4. Client에서 예외를 처리하지 못하고 밖으로 던진다. 여기서 Client의 밖은 Client를 호출한 Service를 뜻한다.

5. Service에 예외가 전달된다. Service에서 예외를 처리했다. 이후에는 애플리케이션 로직이 정상 흐름으로 동작한다.

6. 정상 흐름을 반환한다.

-> 예외를 처리하지 못하면 자신을 호출한 곳으로 예외를 던져야 한다.

예외에 대해서는 2가지 기본 규칙을 기억하자.

1. 예외를 잡아서 처리하거나 밖으로 던져야 한다.

2. 예외를 잡거나 던질 때 지정한 예외뿐만 아니라 그 예외의 자식들도 함께 처리할 수 있다.

ex) 예를 들어서, Exception을 catch로 잡으면 그 하위 예외들도 모두 잡을 수 있다.

ex) 예를 들어서, Exception을 throws로 던지면 그 하위 예외들도 모두 던질 수 있다. 

참고: 예외를 처리하지 못하고 계속 던지면 어떻게 될까?

-> 자바 main() 밖으로 예외를 던지면 예외 로그를 출력하면서 시스템이 종료된다.

### 5. 자바 예외 처리3 - 체크 예외

- Exception과 그 하위 예외는 모두 컴파일러가 체크하는 체크 예외이다. 단 RuntimeException은 예외로 한다.

- 체크 예외는 잡아서 처리하거나, 또는 밖으로 던지도록 선언해야한다. 그렇지 않으면 컴파일 오류가 발생한다.

**체크 예외 전체 코드**

```java
package exception.basic.checked;

/**
 * Exception을 상속받은 예외는 체크 예외가 된다.
 */

public class MyCheckedException extends Exception {
  public MyCheckedException(String message) {
    super(message); 
  }
}

```

- 예외 클래스를 만들려면 예외를 상속 받으면 된다.

- Exception을 상속받은 예외는 체크 예외가 된다.

```java
package exception.basic.checked;

public class Client {
  public void call() throws MyCheckedException { // 예외를 메서드 밖으로 던질 때 사용하는 키워드 
    throw new MyCheckedException("ex"); // 예외 발생 
  }
}
```

- throw 예외 라고 하면 새로운 예외를 발생시킬 수 있다. 예외도 객체이기 때문에 객체를 먼저 new로 생성하고

예외를 발생시켜야 한다. 

- throws 예외는 발생시킨 예외를 메서드 밖으로 던질 때 사용하는 키워드이다.

- throw, throws의 차이에 주의하자.

```java
package exception.basic.checked;

/**
 * Checked 예외는
 * 예외를 잡아서 처리하거나, 던지거나 둘중 하나를 필수로 선택해야 한다.
 */

public class Service {
  Client client = new Client();

  /**
   * 예외를 잡아서 처리하는 코드
   */
  public void callCatch() {
    try {
      client.call(); 
    } catch (MyChekedException e) {
      //예외 로직 처리
      System.out.println("예외 처리, message = " + e.getMessage());
    }
    System.out.println("정상 흐름");
  }

  /**
   * 체크 예외를 밖으로 던지는 코드
   * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다.
   */
  
  public void callThrow() throws MyCheckedException {
    client.call(); 
  }
}
```

```java
public class MyCheckedException extends Exception {
  public MyCheckedException(String message) {
    super(message); 
  }
}
```

- MyCheckedException는 Exception을 상속받았다. Exception을 상속 받으면 체크 예외가 된다.

- 참고로 RuntimeException을 상속 받으면 언체크 예외가 된다. 

- 여기서 super(message); 는 Exception보다 더 상위 개념인 Throwable에 매개변수로 String detailMessage가 있다. 

```java
package exception.basic.checked;

public class CheckedCatchMain {
  public static void main(String[] args) {
    Service service = new Service();
    service.callCatch();
    System.out.println("정상 종료");
  }
}
```

**실행 결과**
예외 처리, message=ex
정상 흐름
정상 종료

이렇게 나오는 이유는 Service 클래스에서 Client 객체를 생성함. 

그리고 생성한 객체를 갖는 참조변수가 call 메서드를 호출함.

call 메서드는 MyCheckedException을 던질 수도 있다고 throws를 적어놨는데

실제로 그 안에 예외가 있으니 예외가 발생하고 처리를 못했으니 호출한 쪽으로 던짐.

catch문에서 예외를 잡음. 

예외 처리, message=ex로 잡음 여기서 ex는 Throwable에 있는것. 

예외를 처리했으니 catch문 탈출. 

정상 종료로 끝.

만약에 try 코드 블럭에서 발생하는 예외가 있는데 catch가 잡을 수 없으면 예외를 밖으로 던져줘야 한다.

catch는 해당 타입과 그 하위 타입을 모두 잡을 수 있다.

아까 코드를 다시 보자. 

```java
package exception.basic.checked;

/**
 * Checked 예외는
 * 예외를 잡아서 처리하거나, 던지거나 둘중 하나를 필수로 선택해야 한다.
 */

public class Service {
  Client client = new Client();

  /**
   * 예외를 잡아서 처리하는 코드
   */
  public void callCatch() {
    try {
      client.call(); 
    } catch (MyChekedException e) {
      //예외 로직 처리
      System.out.println("예외 처리, message = " + e.getMessage());
    }
    System.out.println("정상 흐름");
  }

  /**
   * 체크 예외를 밖으로 던지는 코드
   * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다.
   */
  
  public void callThrow() throws MyCheckedException {
    client.call(); 
  }
}
```

여기서 client.call()에서 예외가 터진다. 

그러면 이 예외를 잡아야 한다. 

그래서 MyCheckedException e 에서 잡는데 여기서는 MyCheckedException만 잡는다. 

체크 예외면서 하위 예외들을 전부 다 잡고싶다면? Exception e로 바꾸자. 

상위 타입 예외를 잡으면 하위 타입까지 싹다 잡는다. 

여기서 한가지 의문이 있다.

MycheckedException e를 보면 MyCheckedException으로 접근 하기 위해 참조값을 받아야한다.

근데 new ~(); 이 문구가 없다. 

이것은 예외가 터진 곳에서 throw new ~(); 를 작성하는데 

이때 참조값이 e에 초기화 되는 느낌으로 보면 된다. 

이번에는 예외를 처리하지 않고, 밖으로 던지는 코드를 살펴보자.

```java
package exception.basic.checked;

public class CheckedThrowMain {
  public static void main(String[] args) throws MyCheckedException {
    Service service = new Service();
    service.callThrow();
    System.out.println("정상 종료");
    
  }
}
```

service 안에 callThrow() 메서드는 client.call()를 호출한다. 

call 메서드는 예외를 던진다. 

그런데 callThrow()는 예외를 처리할 능력이 없으니 예외를 던진다.

메인 메서드도 던진다. 던질 곳이 없다. 

그러면 프로그램이 종료되고 예외 정보와 스택 트레이스를 출력한다. 

**참고**

```java
public void callThrow() throws Exception {
  client.call();
}
```
throws에 MyCheckedException의 상위 타입인 Exception을 적어주어도 MyCheckedException을 던질 수 있다.

throws에 지정한 타입과 그 하위 타입 예외를 밖으로 던진다. 

물론 정확하게 MyCheckedException만 밖으로 던지고 싶다면 throws MyCheckedException을 적어주어야 한다. 

**체크 예외의 장단점**

체크 예외는 예외를 잡아서 처리할 수 없을 때, 예외를 밖으로 던지는 throws 예외를 필수로 선언해야 한다. 

그렇지 않으면 컴파일 오류가 발생한다. 이것 때문에 장점과 단점이 동시에 존재한다.

- 장점 : 개발자가 실수로 예외를 누락하지 않도록 컴파일러를 통해 문제를 잡아주는 훌륭한 장치이다.

이를 통해 개발자는 어떤 체크 예외가 발생하는지 쉽게 파악할 수 있다. 

- 단점 : 하지만 실제로는 개발자가 모든 체크 예외를 반드시 잡거나 던지도록 처리해야 하기 때문에, 너무 번거로운 일이 된다.

크게 신경쓰고 싶지 않은 예외까지 모두 챙겨야 한다. 

### 6. 자바 예외 처리4 - 언체크 예외

- RuntimeException과 그 하위 예외는 언체크 예외로 분류된다.

- 언체크 예외는 말 그대로 컴파일러가 예외를 체크하지 않는다는 뜻이다.

- 언체크 예외는 체크 예외와 기본적으로 동일하다. 차이가 있다면 예외를 던지는 throws를 선언하지 않고, 생략 할 수 있다.

- 생략한 경우 자동으로 예외를 던진다. 

**체크 예외 vs 언체크 예외**

- 체크 예외 : 예외를 잡아서 처리하지 않으면 항상 throws 키워드를 사용해서 던지는 예외를 선언해야 한다.

- 언체크 예외 : 예외를 잡아서 처리하지 않아도 throws 키워드를 생략할 수 있다. 

```java
package exception.basic.unchecked;

/**
 * RuntimeException을 상속받은 예외는 언체크 예외가 된다.
 */

public class MyUncheckedExcetpion extends RuntimeException {
  public MyUncheckedExcetpion(String message) {
    super(message); 
  }
}
```

```java
package exception.basic.unchecked;

public class Client {
  public void call() {
    throw new MyUncheckedExcetpion("ex");
  }
}
```

```java
package exception.basic.unchecked;

/**
 * UnChecked 예외는
 * 예외를 잡거나, 던지지 않아도 된다.
 * 예외를 잡지 않으면 자동으로 밖으로 던진다. 
 */

public class Service {
  
  Client client = new Client();

  /**
   * 필요한 경우 예외를 잡아서 처리하면 된다.
   */
  public void callCatch() {
     try {
      client.call(); 
     } catch (MyUncheckedException e) {
      //예외 처리 로직
      System.out.println("예외 처리, message = " + e.getMessage());
     }

    System.out.println("정상 로직");
  }

  
  public void callThrow() {
    client.call(); 
  }
}
```

```java
package exception.basic.unchecked;

public class UncheckedCatchMain {
  public static void main(String[] args) {
    Service service = new Service();
    service.callCatch();
    System.out.println("정상 종료");
  }
}
```

**언체크 예외를 밖으로 던지는 코드 - 선언**

```java
import exception.basic.unchecked.MyUncheckedException;

public class Client {
  public void call() throws MyUncheckedException {
    throw new MyUncheckedException("ex"); 
  }
}
```

- 참고로 언체크 예외도 throws 예외를 선언해도 된다. 물론 생략할 수 있다.

- 언체크 예외는 주로 생략하지만, 중요한 예외의 경우 이렇게 선언해두면 해당 코드를 호출하는 개발자가

이런 예외가 발생한다는 점을 IDE를 통해 좀 더 편리하게 인지할 수 있다.

**언체크 예외의 장단점**

- 장점 : 신경쓰고 싶지 않은 언체크 예외를 무시할 수 있다. 체크 예외의 경우 처리할 수 없는 예외를 밖으로 던지려면
항상 throws 예외를 선언해야 하지만, 언체크 예외는 이 부분을 생략할 수 있다.

- 단점 : 언체크 예외는 개발자가 실수로 예외를 누락할 수 있다. 반면에 체크 예외는 컴파일러를 통해 예외 누락을 잡아준다. 

























