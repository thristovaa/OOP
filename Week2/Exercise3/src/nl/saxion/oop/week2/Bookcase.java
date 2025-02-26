package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Bookcase {
    private ArrayList<Book> books = new ArrayList<>();
    private int maxCapacity;

    public Bookcase(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getBookCount() {
        return books.size();
    }

    public int getTotalNumberOfPages() {
        int total = 0;

        for(Book book : books) {
            total += book.getNumberOfPages();
        }

        return total;
    }

    public Author findAuthorByBookTitle(String title) {
        Author search = null;

        for (Book book : books){
            if (book.getTitle() == title){
                search = book.getAuthor();
            }
        }

        return search;
    }

    public ArrayList<Book> getBooksFromAuthor(String author) {
        ArrayList<Book> authorSearch = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().getName() == author) {
                authorSearch.add(book);
            }
        }

        return authorSearch;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public String toString() {
        for (Book book : books) {
            SaxionApp.printLine(book);
        }
        return " ";
    }
}
