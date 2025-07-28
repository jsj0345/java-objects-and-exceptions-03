package nested.nested;

public class NestedOuterMain {
  public static void main(String[] args) {
    NestedOuter.Nested nested = new NestedOuter.Nested();

    /*
    윗 문장만 작성해도 문제가 없는게 어차피 내부 클래스는 바깥 클래스에 있는 정적 멤버 변수들한테 접근 가능해서 문제X.
     */
    nested.print();
    System.out.println("nestedClass = " + nested.getClass());
    /*
    출력이 nested.nested.NestedOuter$Nested로나옴.

    저기서 $를 기준으로 왼쪽은 바깥 클래스 오른쪽은 내부 클래스.
     */



  }
}

/*
package nested.nested;

public class NestedOuterMain {

  public static void main(String[] args) {
    NestedOuter.Nested nested = new NestedOuter.Nested();
    nested.print();

    System.out.println("nestedClass = " + nested.getClass());

    출력이 nested.nested.NestedOuter$Nested로 나옴.

    저기서 $를 기준으로 왼쪽은 바깥 클래스 오른쪽은 내부 클래스.
  }

}

 */
