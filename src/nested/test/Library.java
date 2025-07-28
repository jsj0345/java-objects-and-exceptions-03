package nested.test;

/*
도서관에서 사용할 수 있는 간단한 도서 관리 시스템을 만들어 보자.
이 시스템은 여러 권의 도서 정보를 관리할 수 있어야 한다.
각 도서는 도서 제목(title)과 저자명(author)을 가지고 있다.
시스템은 도서를 추가하고, 모든 도서의 정보를 출력하는 기능을 제공해야 한다.

Library 클래스를 완성해라

- LibraryMain과 실행 결과를 참고하자.

Book 클래스는 Library 내부에서만 사용된다. Library 클래스 외부로 노출하면 안된다.

Library 클래스는 Book 객체 배열을 사용해서 도서 목록을 관리한다.
 */

public class Library {
  //코드 작성
  private Book[] book;
  private int number;

  public Library(int book_amount) {
    book = new Book[book_amount];
  }

  private class Book {
    String book_name;
    String author;

    public Book(String book_name, String author) {
      this.book_name = book_name;
      this.author = author;
    }

  }

  public void addBook(String book_name, String author) {

    if(this.number < 4) {
      // 0 1 2 3
      // 1 2 3 4
      book[this.number] = new Book(book_name, author);
      this.number = this.number + 1;
    } else {
      System.out.println("도서관 저장 공간이 부족합니다.");
    }

  }

  public void showBooks() {
    System.out.println("== 책 목록 출력 ==");
    for(int i = 0; i <=this.number-1; i++) {

      System.out.println("도서 제목: " + book[i].book_name + ", 저자: " + book[i].author);
    }
  }
}
