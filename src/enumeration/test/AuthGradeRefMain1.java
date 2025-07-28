package enumeration.test;

public class AuthGradeRefMain1 {
  public static void main(String[] args) {
    getInformation(AuthGrade.GUEST);
    getInformation(AuthGrade.LOGIN);
    getInformation(AuthGrade.ADMIN);
  }

  private static void getInformation(AuthGrade authgrade) {
    System.out.println("grade="+authgrade.name() + ", level="+authgrade.getLevel()+", 설명="
        +authgrade.getDescription());
  }
}
