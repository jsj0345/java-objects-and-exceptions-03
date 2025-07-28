package lang.wrapper;

public class MyIntegerNullMain0 {
  public static void main(String[] args) {
    int[] intArr = {-1,0,1,2,3};
    System.out.println(findValue(intArr, -1));
    System.out.println(findValue(intArr, 0));
    System.out.println(findValue(intArr, 1));
    System.out.println(findValue(intArr, 100));
  }

  private static int findValue(int[] intArr, int target) {
    for (int value : intArr) {
      if(value == target) {
        return value;
      }
    }
    return -1;  // 배열에 -1이 있을때도 -1 반환, 없는값을 반환 할 때도 -1. 구분을 못함.
  }
}

/*
package lang.wrapper;

public class MyIntegerNullMain0 {

  public static void main(String[] args) {
    int[] intArr = {-1,0,1,2,3};
    System.out.println(findValue(intArr,-1));
    System.out.println(findValue(intArr,0));
    System.out.println(findValue(intArr,1));
    System.out.println(findValue(intArr,100));
  }

  private static int findValue(int[] intArr, int target) {
    for(int value : intArr) {
      if(value == target) {
        return value;
      }
    }

    return -1;
  }

}



 */
