package nl.saxion.oop.week2;

public class Book {
    private String title, isbn;
    private int numberOfPages;
    private Author author;

    public Book(String isbn, String title, int numberOfPages, Author author){
        this.isbn = isbn;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    @Override
    public String toString() {
        return isbn + " " + " '" + title + "'  - " + author.getName() + ", " + numberOfPages + " pages";
    }

    public Author getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
}
