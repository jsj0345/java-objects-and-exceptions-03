package lang.immutable.address;

public class ImmutableAddress {

  private final String value;


  public ImmutableAddress(String value) {
    this.value = value;
  }

  /*
  final이 선언 됐을 때, 초기화를 하려면 딱 두가지 상황 일 때만 가능하다.
  먼저 클래스에 있는 멤버 변수는 heap영역에서 기본형일땐 0으로, 참조형일땐 NULL로 초기화를 해줌.
  그러나 직접적으로 초기화를 하진 않아서 기회를 한번 줌. 근데 이 기회를 활용할 수 있을 때는 두가지.

  첫 번째, 변수 선언과 동시에 초기화.
  두 번째, 생성자를 통한 초기화.
   */


  public String getValue() {
    return value;
  }



  @Override
  public String toString() {
    return "Address{" +
        "value='" + value + '\'' +
        '}';
  }


}

/*
package lang.immutable.address;

public class ImmutableAddress {
  private final String value;

  public ImmutableAddress(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "Address{" +
        "value='" + value + '\'' +
        '}';
  }


 */