package lang.string.chaining;

public class MethodChainingMain3 {
  public static void main(String[] args) {
    ValueAdder adder = new ValueAdder();
    int result = adder.add(1).add(2).add(3).getValue(); // 반환된 참조값으로 메서드를 계속 연결함.
    System.out.println("result = " + result);
    
  }
}

/*
package lang.string.chaining;

public class MethodChainingMain3 {
  public static void main(String[] args) {
    ValueAdder adder = new ValueAdder();
    int result = adder.add(1).add(2).add(3).getValue();
    System.out.println("result = " + result);
  }
}
 */