package enumeration.ex3;

public enum Grade {
  BASIC, GOLD, DIAMOND;
}

/*
자바는 타입 안전 열거형 패턴(Type-Safe Enum Pattern)을 매우 편리하게 사용할 수 있는 열거형(Enum Type)을
제공한다.

쉽게 이야기해서 자바의 열거형은 앞서 배운 타입 안전 열거형 패턴을 쉽게 사용할 수 있도록 프로그래밍 언어에서
지원하는 것이다.

영어인 enum은 enumeration의 줄임말인데, 번역하면 열거라는 뜻이고 , 어떤 항목을 나열하는 것을 뜻한다.
"Enumeration"은 일련의 명명된 상수들의 집합을 정의하는 것을 의미하며, 프로그래밍에서는 이러한 상수들을 사용하여
코드 내에서 미리 정의된 값들의 집합을 나타낸다.
쉽게 이야기해서 회원의 등급은 상수로 정의한 BASIC, GOLD, DIAMOND만 사용할 수 있다는 뜻이다.
자바의 enum은 타입 안전성을 제공하고, 코드의 가독성을 높이며,
예상 가능한 값들의 집합을 표현하는 데 사용된다.


public class Grade extends Enum {
 public static final Grade BASIC = new Grade();
 public static final Grade GOLD = new Grade();
 public static final Grade DIAMOND = new Grade();

 // private 생성자 추가
 private Grade() {}

}

열거형도 클래스이다.

열거형은 자동으로 java.lang.Enum을 상속 받는다.

외부에서 임의로 생성할 수 없다.

public enum.. 은 public class.. 같은 느낌.

 */