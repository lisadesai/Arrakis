package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.Users;
import com.db.grad.javaapi.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UsersService implements IUsersService {

    private UsersRepository itsUsersRepo;
    //creates a users repo for this service
    @Autowired
    public UsersService( UsersRepository uRepo )
    {
        itsUsersRepo = uRepo;
        //makes the repo in this service the one from the query
    }
    @Override
    public List<Users> getAllUsers() {
        return itsUsersRepo.findAll();
    }

    @Override
    public Users addUser(Users theUser) {
        return itsUsersRepo.save(theUser);
    }

    @Override
    public long getNoOfUsers() {
        return itsUsersRepo.count();
    }

    @Override
    public boolean removeUser(int uniqueId) {
        boolean result = false;

        Optional<Users> theUser = itsUsersRepo.findById(uniqueId);
        //may have a null value

        if(theUser.isPresent()) //if the user isnt null
        {
            itsUsersRepo.delete(theUser.get());
            result = true;
        }

        return  result;
    }

    @Override
    public Users getUsersById(int uniqueId) {
        return itsUsersRepo.findById(uniqueId).get();
    }

    @Override
    public Users getUsersByEmail(String UserEmail) {
        List<Users> users = itsUsersRepo.findAll();
        int count = 0;
        for (Users bb : users) {
            if (Objects.equals(bb.getEmail().toLowerCase(),UserEmail.toLowerCase())){
                return users.get(count);
            }
            count += 1;
        }
        return null;
    }

    @Override
    public Users updateUserDetails(Users UserToUpdate) {
        return itsUsersRepo.save( UserToUpdate );
    }
}