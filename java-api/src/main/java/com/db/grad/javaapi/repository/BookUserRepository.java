package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.BookUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookUserRepository extends JpaRepository<BookUser, Integer> {
    @Query(nativeQuery = true,
            value = "select * from book_user where user_id = :user_id")
    List<BookUser> findBooksForUser(BookUser user_id);
    @Query(nativeQuery = true,
            value = "select * from book_user where book_id = :book_id")
    List<BookUser> findUsersForBook(BookUser book_id);

    //TODO BookUser or int?
}