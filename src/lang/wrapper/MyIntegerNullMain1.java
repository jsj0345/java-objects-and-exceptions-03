package lang.wrapper;

public class MyIntegerNullMain1 {

  public static void main(String[] args) {
    MyInteger[] intArr = new MyInteger[]{new MyInteger(-1),new MyInteger(0),new MyInteger(1)
      ,new MyInteger(2), new MyInteger(3)};
    System.out.println(findValue(intArr, -1));
    System.out.println(findValue(intArr, 0));
    System.out.println(findValue(intArr, 1));
    System.out.println(findValue(intArr, 100));
  }

  private static MyInteger findValue(MyInteger[] intArr, int target) {
    for (MyInteger myInteger : intArr) {
      if(myInteger.getValue() == target) {
        return myInteger;
      }
    }
    return null;  // 배열에 -1이 있을때도 -1 반환, 없는값을 반환 할 때도 -1. 구분을 못함.
  }

}

/*
package lang.wrapper;

public class MyIntegerNullMain1 {

  public static void main(String[] args) {
    MyInteger[] intArr = new MyInteger[]{new MyInteger(-1), new MyInteger(0), new MyInteger(1), newMyInteger(2), new MyInteger(3)};
    System.out.println(findValue(intArr,-1));
    System.out.println(findValue(intArr, 0));
    System.out.println(findValue(intArr,1));
    System.out.println(findValue(intArr,100));
  }

  private static MyInteger findValue(MyInteger[] intArr, int target) {
    for(MyInteger myInteger : intArr) {
      if(myInteger.getValue() == target) {
        return myInteger;
      }
    }

    return null;
  }

}

 */
