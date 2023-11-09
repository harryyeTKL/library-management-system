package LMS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String isbn) {
        books = books.stream()
                .filter(book -> !book.getIsbn().equals(isbn))
                .collect(Collectors.toList());
    }

    public List<Book> getBooksPublishedAfterYear(int year) {
        return books.stream()
                .filter(book -> book.getPublishedYear() > year)
                .collect(Collectors.toList());
    }

    public List<String> getAuthorsOfBooksPublishedBeforeYear(int year) {
        return books.stream()
                .filter(book -> book.getPublishedYear() < year)
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }
}