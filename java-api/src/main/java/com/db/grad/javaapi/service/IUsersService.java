package com.db.grad.javaapi.service;


import com.db.grad.javaapi.model.Users;

import java.util.List;

public interface IUsersService {
    public List<Users> getAllUsers();

    public Users addUser(Users theUser);

    public long getNoOfUsers();

    public boolean removeUser(int uniqueId);

    public Users getUsersById(int uniqueId);

    public Users getUsersByEmail(String UserEmail);

    public Users updateUserDetails(Users UserToUpdate);
}