package com.mokykla.mm.projektas4.projektas4.service;

import com.mokykla.mm.projektas4.projektas4.dao.UserDAO;
import com.mokykla.mm.projektas4.projektas4.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface UserService{

    List<User> getUsers();

    void createUser(User user);

    void deleteUser(String username);

    void updateUser(String name, User user);

    }
