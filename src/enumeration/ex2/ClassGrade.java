package enumeration.ex2;

public class ClassGrade {

  public static final ClassGrade BASIC = new ClassGrade(); // X001
  public static final ClassGrade GOLD = new ClassGrade(); // X002
  public static final ClassGrade DIAMOND = new ClassGrade(); // X003

  //private 생성자 추가
  private ClassGrade() {

  }
}

/*
package enumeration.ex2;

public class ClassRefMain {
  public static void main(String[] args) {
    System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
    System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
    System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

먼저 회원 등급을 다루는 클래스를 만들고, 각각의 회원 등급별로 상수를 선언한다.

이때 각각의 상수마다 별도의 인스턴스를 생성하고, 생성한 인스턴스를 대입한다.

각각을 상수로 선언하기 위해 static, final을 사용한다.

static을 사용해서 상수를 메서드 영역에 선언한다.

final을 사용해서 인스턴스(참조값)를 변경할 수 없게 한다.


 */
