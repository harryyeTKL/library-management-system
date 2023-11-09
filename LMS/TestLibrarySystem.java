package LMS;

import java.util.List;

public class TestLibrarySystem {
    public static void main(String... args){
        // Creating instances of Book
        Book book1 = new Book("Clean Code", "Robert C. Martin", 2008, "978-7- 115");
        Book book2 = new Book("Moby Dick", "Herman Melville", 1851, "978-7- 116");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "978-7- 117");

        // Creating an instance of Library
        Library library = new Library();

        // Adding books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Removing a book from library
        library.removeBook("978-7- 116");

        // Get books published after year
        List<Book> booksAfterYear = library.getBooksPublishedAfterYear(1900);
        for (Book book : booksAfterYear) {
            System.out.println("Published After Year 1900: " + book.getBookInfo());
        }

        // Get authors of books published before year
        List<String> authorsBeforeYear = library.getAuthorsOfBooksPublishedBeforeYear(2000);
        for (String author : authorsBeforeYear) {
            System.out.println("Authors of Books Published Before Year 2000: " + author);
        }
    }
}