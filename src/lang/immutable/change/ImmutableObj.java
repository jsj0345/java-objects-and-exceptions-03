package lang.immutable.change;

public class ImmutableObj {
  private final int value;

  public ImmutableObj(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public ImmutableObj add(int addValue) {
    int result = value + addValue;
    return new ImmutableObj(result);
  }
}

/*
package lang.immutable.change;

public class MutableObj {
  private int value;

  public MutableObj(int value) {
    this.value = value;
  }

  public void add(int addValue) {
    value = value + addValue;
  }

  public int getValue() {
     return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

}
 */