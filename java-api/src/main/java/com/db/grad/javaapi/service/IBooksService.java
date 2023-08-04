package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Book;

import java.util.List;

public interface IBooksService { //skeleton for service

    public List<Book> getAllBooks();

    public Book addBook(Book theBook);

    public long getNoOfBooks();


    public boolean removeBook(int uniqueId);

    public Book getBookById(int uniqueId);


    public Book getBookByName(String BooksName );

    public Book updateBookDetails(Book BookToUpdate);
}