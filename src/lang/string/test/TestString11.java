package lang.string.test;

public class TestString11 {
  public static void main(String[] args) {
    String str = "Hello Java";
    StringBuilder sb = new StringBuilder(str);
    str = new String(sb.reverse());
    System.out.println(str);
  }
}

/*
StringBuilder에 있는 기본 생성자는 데이터 저장소같은 느낌이고(데이터 공간만 미리 확보)
멤버 변수를 초기화 할 때는 이 데이터 저장소를 이용해서 초기화.

 */
