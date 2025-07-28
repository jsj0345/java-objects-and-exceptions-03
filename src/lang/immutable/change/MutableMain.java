package lang.immutable.change;

public class MutableMain {
  public static void main(String[] args) {
    MutableObj obj = new MutableObj(10);
    obj.add(20);
    System.out.println("obj = "+obj.getValue());
    /*
    obj.getValue()를 쓰면 int형이 반환된다.
    문자열이랑 합치려는 대상은 문자열화 시키는데
    만약에 그 대상이 숫자면 valueOf()라는 메서드가 String 클래스에 있는
    valueOf가 실행된다.
     */

  }
}

/*
package lang.immutable.change;

public class MutableMain {
  public static void main(String[] args) {
    MutableObj obj = new MutableObj(10);
    obj.add(20);
    System.out.println("obj = " +obj.getValue());
  }
}
 */