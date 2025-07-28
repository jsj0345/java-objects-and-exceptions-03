package lang.wrapper;

public class WrapperClassMain {
  public static void main(String[] args) {
    // Integer newInteger = new Integer(10); // 미래에 삭제 예정, 대신에 ValueOf를 사용.
    // Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변

    Integer newInteger = Integer.valueOf(10); // x001
    // valueOf 메서드에서 return new Integer(i); 이렇게 있음. 즉 객체에 기본형 값을 담아서 Boxing 이라 부름.
    Integer integerObj = Integer.valueOf(10); // x001 마치 String Pool처럼 저장됨. 같은 값이면 같은 참조값 이용.

    /*
    String pool을 생각해보자. 같은 문자열이면 같은 참조값을 저장함.
    Integer도 마찬가지임.
     */

    Long longObj = Long.valueOf(100);
    Double doubleObj = Double.valueOf(10.5);
    System.out.println("newInteger = " + newInteger);
    System.out.println("integerObj = " + integerObj);
    System.out.println("longObj = " + longObj);
    System.out.println("doubleObj = " + doubleObj);

    System.out.println("내부 값 읽기");
    int intValue = integerObj.intValue(); // 객체 안에 있는 값을 꺼내는것이니까 언박싱.
    System.out.println("intValue = " + intValue);
    long longValue = longObj.longValue();
    System.out.println("longValue = " + longValue);

    System.out.println("비교");
    System.out.println("==: " + (newInteger == integerObj));
    System.out.println("equals: " + (newInteger.equals(integerObj)));

    Integer.toString(11);


  }
}

/*
@Deprecated -> 이제 없어질 예정임.

package lang.wrapper;

public class WrapperClassMain {

  public static void main(String[] args) {
    Integer newInteger = new Integer(10);
    Integer integerObj = Integer.valueOf(10);

    Long longObj = Long.ValueOf(100);
    Double doubleObj = Double.valueOf(10.5);

    System.out.println("newInteger = " + newInteger);
    System.out.println("integerObj = " + integerObj);
    System.out.println("longObj = " + longObj);
    System.out.println("doubleObj = " + doubleObj);

    System.out.println("내부 값 읽기");
    int intValue = integerObj.intValue();
    System.out.println("intValue = " + intValue);
    long longValue = longObj.longValue();
    System.out.println("longObj = " + longValue);

    System.out.println("비교");
    System.out.println("==: " + (newInteger == integerObj));
    System.out.println("equals: " + newInteger.equals(integerObj));

   }

 }

원래 객체를 println의 매개변수로 넣으면 주소값이 나와야하는데...

다형성과 메서드 오버라이딩에 의해서 Integer에 있는 toString() 메서드를 호출함. 이때 이 toString()은

@Override
public String toString() {
    return toString(value); // 내부 정수 값(int value)을 사용
}



이렇고 리턴 옆에 있는 toString()은 따로 정의되어 있는데 toString()에서 숫자를 문자열로 바꿈. 이걸 리턴한다음에..

value는 new Integer(10); 이렇게하면 Integer 클래스에 value라는 멤버변수에 10이 초기화된다.

println 메서드로 돌아가서 writeln()에 의해 콘솔창에 보이는 것..

 */
