package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book_user")
@IdClass(BookUser.class)
public class BookUser implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name="book_id", nullable = false)
    private Book book_id;
    @Id
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private Users user_id;

    public Book getBook_id() {
        return book_id;
    }

    public void setBook_id(Book book_id) {
        this.book_id = book_id;
    }

    public Users getUser_id() {
        return user_id;
    }

    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }


    @Override
    public String toString() {
        return "BookUser{" +
                " book_id=" + book_id +
                ", user_id=" + user_id +
                '}';
    }
}