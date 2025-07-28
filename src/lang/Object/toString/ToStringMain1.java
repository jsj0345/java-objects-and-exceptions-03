package lang.Object.toString;

public class ToStringMain1 {
  public static void main(String[] args) {
    Object object = new Object();
    String string = object.toString();

    //toString() 반환값 출력
    System.out.println(string);

    //object 직접 출력
    System.out.println(object);

  }

}

/*
package lang.Object.toString;

public class ToStringMain1 {
  public static void main(String[] args) {
    Object object = new Object();
    String string = object.toString();

    //toString() 반환값 출력.
    System.out.println(string);

    //object 직접 출력
    System.out.println(object);

    object.toString()으로 얻은 정보를 string에 저장하고 난 후에 출력한 것과
    object를 직접적으로 출력한 것이 같은 이유는 뭘까?
  }
}

 */