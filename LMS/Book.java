package LMS;

public class Book {
    private String title;
    private String author;
    private int publishedYear;
    private String isbn;

    public Book(String title, String author, int publishedYear, String isbn) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.isbn = isbn;
    }

    public String getBookInfo() {
        return String.format("Title: %s, Author: %s, Year: %d, ISBN: %s", title, author, publishedYear, isbn);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public String getIsbn() {
        return isbn;
    }
}