package lang.string.method;

public class StringSplitJoinMain {
  public static void main(String[] args) {
    String str = "Apple,Banana,Orange";

    // split()
    String[] splitStr = str.split(",");
    for(String s : splitStr) {
      System.out.println(s);
    }

    /*
    ,를 마주치면 String splitStr[0] = "Apple"; 이런식으로 초기화가 되는거임.
    split 메서드 내부에 add메서드가 있는데 이 add 메서드가 , 를 마주칠때마다 , 전에 있는 문자열을 리턴하는거임. (반복문)
     */

    // splitStr[0] -> Apple , splitStr[1] -> Banana , splitStr[2] -> Orange.


    String joinStr = "";
    for(String string : splitStr) {
      joinStr += string +"-";
    }

    System.out.println("joinStr = " + joinStr);

    /*
    Apple-Banana-Orange- 로 나오는 이유는 향상된 for문으로 인해 인덱스 0,1,2,... 이 순으로 string전달.
    근데 이렇게 되면 마지막에 - 있기 때문에 불편함. join()을 활용해보자.
    */

    // join()
    String joinedStr = String.join("-","A","B","C");
    System.out.println("joinedStr = " +joinedStr);

    // 문자열 배열 연결
    String result = String.join("-",splitStr);
    // 나눠진 문자열을 다 보기 전까지 -로 이어주는 메서드
    System.out.println("result = "+ result);

    /*
    String은 불변 객체이므로 새로운 객체를 계속 반환해줘야 값들을 초기화 할 수 있음.
    똑같은 인스턴스 내에서는 값 변경이 불가능함. final 형이므로.
     */
  }
}



