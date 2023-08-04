package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.model.Users;

import java.util.List;
import java.util.Optional;

public interface IBookUserService {
    public List<BookUser> getAllBookUsers();

    public BookUser addBookUser(BookUser theUser);

    public long getNoOfBookUsers();

    public boolean removeBookUser(int bookId, int userId);

    public Optional<List<Integer>> findUsersForBook(int bookId);

    public Optional<List<Integer>> findBooksForUser(int userId);

    public BookUser updateBookUserDetails(BookUser UserToUpdate);
}