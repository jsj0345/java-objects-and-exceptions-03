package lang.string.equals;

public class StringEqualsMain1 {

  public static void main(String[] args) {
    String str1 = new String("hello"); // 이런식으로 객체를 생성하면 String Pool 영역에 들어가지 않음.
    String str2 = new String("hello");
    System.out.println("new String() == 비교: " + (str1 == str2));
    System.out.println("new String() equals 비교: " + (str1.equals(str2)));

    String str3 = "hello";
    String str4 = "hello";
    System.out.println("리터럴 == 비교: " + (str3==str4)); // new를 안쓰고 문자열을 그냥 초기화하면 String pool영역으로.
    /*
    String pool 영역으로 가면 동일한 문자열은 동일한 참조값을 지님.
    당연히 true가 나옴.
     */
    System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));

  }
}

/*
package lang.string.equals;

public class StringEqaulsMain1 {
  public static void main(String[] args) {
    String str1 = new String("hello");
    String str2 = new String("hello");
    System.out.println("new String() == 비교: " + (str1 == str2));
    System.out.println("new String() equals 비교: " + (str1.equals(str2));

    String str3 = "hello";
    String str4 = "hello";
    System.out.println("리터럴 == 비교: " + (str3 == str4));
    System.out.println("리터럴 equals 비교: " + (str3.equals(str4));
  }
}

참고: 풀(Pool)은 자원이 모여있는 곳을 의미한다. 프로그래밍에서 풀(Pool)은 공용 자원을 모아둔 곳을 뜻한다.
여러 곳에서 함께 사용할 수 있는 객체를 필요할 때 마다 생성하고, 제거하는 것은 비효율적이다.
대신에 이렇게 문자열 풀에 필요한 String 인스턴스를 미리 만들어두고 여러곳에서 재사용할 수 있다면
성능과 메모리를 더 최적화 할 수 있다.
참고로 문자열 풀은 힙 영역을 사용한다. 그리고 문자열 풀에서 문자를 찾을 때는 해시 알고리즘을 사용하기
때문에 매우 빠른 속도로 원하는 String 인스턴스를 찾을 수 있다.



 */





