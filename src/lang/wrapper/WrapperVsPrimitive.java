package lang.wrapper;

public class WrapperVsPrimitive {
  public static void main(String[] args) {
    int iterations = 1_000_000_000; // 일상에선 ,를 쓰지만 자바에서는 _ 를 쓴다.
    long startTime, endTime;

    // 기본형 long 사용
    long sumPrimitive = 0 ;
    startTime = System.currentTimeMillis();
    for(int i = 0; i< iterations; i++){
      sumPrimitive+=i;
    }
    endTime = System.currentTimeMillis();
    System.out.println("sumPrimitive = " + sumPrimitive);
    System.out.println("기본 자료형 lng 실행 시간:  " + (endTime - startTime) + "ms");

    // 래퍼 클래스 Long 사용
    long sumWrapper = 0L ;
    startTime = System.currentTimeMillis();
    for(int i = 0; i< iterations; i++){
      sumWrapper+=i;
    }
    endTime = System.currentTimeMillis();
    System.out.println("sumWrapper = " + sumWrapper);
    System.out.println("래버 클래스 Long 실행 시간:  " + (endTime - startTime) + "ms");
    /*
    결과를 살펴보면 기본형 연산이 래퍼 클래스보다 좀 더 빠른 것을 확인할 수 있다.
    참고로 계산 결과는 시스템 마다 다르다.

    기본형은 메모리에서 단순히 그 크기만큼의 공간을 차지한다.
    예를 들어, int는 보통 4바이트의 메모리를 사용한다.


     */

  }
}

/*
package lang.wrapper;

public class WrapperVsPrimitive {
  public static void main(String[] args) {
    int iterations = 1_000_000_000; // 반복 횟수 설정, 10억
    long startTime, endTime;

    // 기본형 long 사용
    long sumPrimitive = 0;
    startTime = System.currentTimeMillis();
    for(int i = 0; i < iterations; i++) {
      sumPrimitive +=i;
    }
    endTime = System.currentTimeMillis();
    System.out.println("sumPrimitive = " + sumPrimitive);
    System.out.println("기본 자료형 long 실행 시간: " + (endTime-startTime) + "ms");

    // 래퍼 클래스 Long 사용
    Long sumWrapper = 0L;
    startTime = System.currentTimeMillis();
    for(int i = 0; i < iterations; i++) {
      sumWrapper +=i; // 오토 박싱 발생.
    }
    endTime = System.currentTimeMillis();
    System.out.println("sumWrapper = " + sumWrapper);
    System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime-startTime) + "ms");
 }
}


 */
