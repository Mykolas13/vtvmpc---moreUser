package com.mokykla.mm.projektas4.projektas4.service;

import com.mokykla.mm.projektas4.projektas4.dao.UserDAO;
import com.mokykla.mm.projektas4.projektas4.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDao;
    @Transactional(readOnly = true)
    public List<User> getUsers() {

        return userDao.getUsers();
    }
    @Transactional
    public void createUser(User user) {

        userDao.createUser(user);
    }

    @Transactional
    public void deleteUser(String username) {

        userDao.deleteUser(username);
    }

    @Transactional
    public void updateUser(String name, User user) {

        userDao.updateUser(name, user);
    }


}
