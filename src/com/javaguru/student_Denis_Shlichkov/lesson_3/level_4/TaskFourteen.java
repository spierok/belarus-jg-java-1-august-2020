/*
Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Book.

class Book {

    private String title

    Book(String bookTitle) {
        this.title = newTitle
    }

    public String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
 */
package lesson_3.level_4;

public class TaskFourteen {

}
class Book {

    private String title;

    Book(String newTitle) {
        this.title = newTitle;
    }

    public String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
