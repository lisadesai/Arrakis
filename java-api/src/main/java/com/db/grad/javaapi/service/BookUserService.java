package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.repository.BookUserRepository;
import com.db.grad.javaapi.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookUserService implements IBookUserService{
    private BookUserRepository itsBookUserRepo;

    @Autowired
    public BookUserService( BookUserRepository buRepo )
    {
        itsBookUserRepo = buRepo;
        //makes the repo in this service the one from the query
    }
    @Override
    public List<BookUser> getAllBookUsers() {
        return itsBookUserRepo.findAll();
    }

    @Override
    public BookUser addBookUser(BookUser theUser) {
        return itsBookUserRepo.save(theUser);
    }

    @Override
    public long getNoOfBookUsers() {
        return itsBookUserRepo.count();
    }

    @Override
    public boolean removeBookUser(int bookId, int userId) {
        boolean result = false;
        List<BookUser> bookusers = itsBookUserRepo.findAll();
        for (BookUser bu : bookusers) {
            if (Objects.equals(bu.getBook_id().getBook_id(), bookId)
                    & Objects.equals(bu.getUser_id().getUser_id(), userId)){
                System.out.println(bu);

                itsBookUserRepo.delete(bu);
                result = true;
                break;
            }
        }
        return  result;
    }

    @Override
    public Optional<List<Integer>> findUsersForBook(int bookId) {
        List<Integer> userIDs = new LinkedList<Integer>();
        List<BookUser> bookusers = itsBookUserRepo.findAll();
        for (BookUser bu : bookusers) {
            if (Objects.equals(bu.getBook_id().getBook_id(), bookId)){
                int id = bu.getUser_id().getUser_id();
                userIDs.add(id);
            }
        }  //if there is a user that matches return it if not return nothing
        return Optional.of(userIDs);
    }

    @Override
    public Optional<List<Integer>> findBooksForUser(int userId) {
        List<Integer> bookIDs = new LinkedList<Integer>();
        List<BookUser> bookusers = itsBookUserRepo.findAll();
        for (BookUser bu : bookusers) {
            if (Objects.equals(bu.getUser_id().getUser_id(), userId)){
                int id = bu.getBook_id().getBook_id();
                bookIDs.add(id);
            }
        }  //if there is a user that matches return it if not return nothing
        return Optional.of(bookIDs);
    }

    @Override
    public BookUser updateBookUserDetails(BookUser UserToUpdate) {
        return itsBookUserRepo.save( UserToUpdate );
    }
}