package com.mokykla.mm.projektas4.projektas4.dao;

import com.mokykla.mm.projektas4.projektas4.model.User;
import java.util.List;

public interface UserDAO {

    List<User> getUsers();

    void createUser(User user);

    void deleteUser(String username);

    void updateUser(String name, User user);

}
