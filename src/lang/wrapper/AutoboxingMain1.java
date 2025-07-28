package lang.wrapper;

public class AutoboxingMain1 {
  public static void main(String[] args) {
    // Primitive -> Wrapper
    int value = 7;
    Integer boxedValue = Integer.valueOf(value);
    
    // Wrapper -> Primitive
    int unboxedValue = boxedValue.intValue();
    System.out.println("boxedValue = " + boxedValue);
    System.out.println("unboxedValue = " + unboxedValue);

    Integer boxedValue1 = value;
    int unboxedValue1 = boxedValue1;

    System.out.println(boxedValue1);
    System.out.println(unboxedValue1);
  }
}

/*
package lang.wrapper;

public class AutoboxingMain1 {

  public static void main(String[] args) {
    // Primitive -> Wrapper
    int value = 7;
    Integer boxedValue = Integer.valueOf(value);

    // Wrapper -> Primitive
    int unboxedValue = boxedValue.intValue();

    System.out.println("boxedValue = " + boxedValue);
    System.out.println("unboxedValue = " + unboxedValue);
  }

}
 */