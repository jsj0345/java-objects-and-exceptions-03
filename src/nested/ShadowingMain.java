package nested;

public class ShadowingMain {

  public int value = 1;

  class Inner {
    public int value = 2;

    void go() {
      int value = 3;
      System.out.println("value = " + value); // 가장 가까운 것 부터.
      System.out.println("this.value = " + this.value); // 가까운 클래스의 멤버변수.
      System.out.println("ShadowingMain.this.value = " + ShadowingMain.this.value); // 지정한 클래스의 멤버변수.
      /*
      여기서 ShadowingMain.this가 흔히 수업시간에 보던 X001 이런느낌임. 
       */
    }
  }

  public static void main(String[] args) {
    ShadowingMain main = new ShadowingMain();
    ShadowingMain.Inner inner = main.new Inner();
    inner.go();
  }

}

/*
package nested;

public class ShadowingMain {

  public int value = 1;

  class Inner {
    public int value = 2;

    void go() {
      int value = 3;
      System.out.println("value = " + value); // 가장 가까운 것 부터.
      System.out.println("this.value = " + this.value); // 가까운 클래스의 멤버변수
      System.out.println("ShadowingMain.this.value = " + ShadowingMain.this.value); // 지정한 클래스의 멤버변수.


      여기서 ShadowingMain.this가 흔히 수업시간에 보던 X001 이런 느낌.
    }
   }

  public static void main(String[] args) {
    ShadowingMain main = new ShadowingMain();
    Inner inner = main.new Inner();
    inner.go();
  }

 }
 */
