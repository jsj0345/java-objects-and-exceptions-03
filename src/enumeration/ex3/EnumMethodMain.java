package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
  public static void main(String[] args) {

    //모든 ENUM 반환
    Grade[] values = Grade.values();
    System.out.println("values = " + Arrays.toString(values));

    for(Grade value : values) {
      System.out.println("name=" + value.name() + ", ordinal=" + value.ordinal());
    }

    //String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
    String input = "GOLD";
    Grade gold = Grade.valueOf(input);
    System.out.println("gold = " + gold); //toString() 오버라이딩 가능.

  }
}

/*
package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

  public static void main(String[] args) {

    //모든 ENUM 반환.
    Grade[] values = Grade.values();
    System.out.println("values = " + Arrays.toString(values));

    for(Grade value : values) {
      System.out.println("name=" + value.name() + ", ordinal="+value.ordinal());
    }

    //String -> ENUM 변환
    String input = "GOLD";
    Grade gold = Grade.valueOf(input);

    System.out.println("gold = " + gold); // toString() 오버라이딩.
  }
}

ENUM - 주요 메서드

values() : 모든 ENUM 상수를 포함하는 배열을 반환한다.

valueOf(String name):주어진 이름과 일치하는 ENUM 상수를 반환한다.

name() : ENUM 상수의 이름을 문자열로 반환한다.

ordinal(): ENUM 상수의 선언 순서(0부터 시작)를 반환한다.

주의 ordinal()은 가급적 사용하지 않는 것이 좋다.
- ordinal()의 값은 가급적 사용하지 않는 것이 좋다.
왜냐하면 이 값을 사용하다가 중간에 상수를 선언하는 위치가 변경되면
전체 상수의 위치가 모두 변경될 수 있기 때문이다.

- 예를 들어, 중간에 BASIC 다음에 SILVER 등급이 추가되는 경우 GOLD,
DIAMOND 의 값이 하나씩 추가된다.




 */