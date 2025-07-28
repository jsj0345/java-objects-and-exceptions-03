package lang.string.immutable;

public class StringImmutable1 {
  public static void main(String[] args) {
    String str = "hello";
    str.concat(" java"); // 문자열을 합치는 메서드. 불변 객체라 return값을 받는 변수가 있어야함.
    System.out.println("str = " +str);

  }
}





/*
package lang.string.immutable;

public class immutable {
  public static void main(String[] args) {
    String str = "hello";
    str.concat("java"); // 문자열을 합치는 메서드. 불변 객체라 return값을 받는 변수가 있어야함.
    System.out.println("str = " +str);
  }

  str.concat("java")는 실제로 객체가 생성 된다. 하지만 참조하는 변수가 없으니 사용 불가능. .
  이건 당연한게 concat을 쓰면 새로운 객체가 반환되는데 그 객체로 접근 할 수 있는 참조값이 없으니
  위치도 모르는데 어떻게 접근함? 접근 불가.
}
 */