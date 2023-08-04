package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    @Query(nativeQuery = true,
            value = "select * from users where email = :email")
    List<Users> findByUserEmail(Users email);
}