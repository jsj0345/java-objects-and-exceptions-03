package nested.test;

public class LibraryMain {

  public static void main(String[] args) {
    Library library = new Library(4); // 최대 4권의 도서를 저장할 수 있는 도서관 생성.
    library.addBook("책1", "저자1");// 0 -> 1
    library.addBook("책2", "저자2"); // 1 -> 2
    library.addBook("책3", "저자3"); // 2 -> 3
    library.addBook("자바 ORM 표준 JPA 프로그래밍", "김영한"); // 3 -> 4
    library.addBook("OneMoreThing", "잡스"); //4
    library.showBooks(); // 도서관의 모든 도서 정보 출력.
  }
}
