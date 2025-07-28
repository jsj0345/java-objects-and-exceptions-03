package lang.practice;

public class TestString5 {
  public static void main(String[] args) {
    String str = "hello.txt";
    String ext = ".txt";

    int index1 = str.indexOf(".txt");
    String str1 = str.substring(0,index1);
    String str2 = str.substring(index1);

    System.out.println("filename = " + str1);
    System.out.println("extName = " + str2);

  }
}
