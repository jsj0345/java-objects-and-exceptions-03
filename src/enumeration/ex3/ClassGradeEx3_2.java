package enumeration.ex3;



public class ClassGradeEx3_2 {
  public static void main(String[] args) {
    int price = 10000;

    DiscountService discountService = new DiscountService();

    /*
    Grade grade = new Grade(); // Enum은 private 생성자가 있기 때문에 불가능.
    */


    /*
    Ctrl + Shift + / 를 누르면 한번에 주석 처리 가능함.
    ClassGrade newclassGrade = new ClassGrade();
    int result = discountService.discount(ClassGrade.DIAMOND, price);
    System.out.println("newClassGrade 등급의 할인 금액:  " + result);
    */
  }
}
