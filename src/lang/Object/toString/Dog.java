package lang.Object.toString;

public class Dog {
  private String dogName;
  private int age;

  public Dog(String dogName, int age) {
    this.dogName = dogName;
    this.age = age;
  }


  @Override
  public String toString() {
    return "dogName=" +dogName + "/" + "age=" + age;
  }
  // toString() 메서드를 만들기가 귀찮으면 어떻게 할까?


  // alt+insert로 toString()을 만들음.

  /*
  @Override
  public String toString() {
    return "Dog{" +
        "dogName='" + dogName + '\'' +
        ", age=" + age +
        '}';

   */
  }



/*
package lang.Object.toString;

public class Dog {
  private String dogName;

  private int age;

  public Dog(String dogName, int age) {
    this.dogName = dogName;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Dog{" +
             "dogName='" + dogName + '\' ' +
             ", age=" + age +
             '}';
   }

}

 */

























