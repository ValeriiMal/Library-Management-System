package org.valmal.service;

import org.valmal.bean.Book;

import java.util.List;

public interface BookService {
    void insert(Book book);
    void update(Book book);
    void delete(Book book);
    Book findBookById(int id);
    List<Book> getBooks();
    List<Book> findBooksByTitle(String title);
    List<Book> findBooksByAuthors(String authors);
    List<Book> findBooksByYear(String year);
    List<Book> findBooksByGenre(String genre);
    List<Book> findBooksByExample(Book book);

    String booksToString(List<Book> books);
    int available(Book book);
    boolean isAvailable(Book book);

    Integer readersCountById(int i);
}
