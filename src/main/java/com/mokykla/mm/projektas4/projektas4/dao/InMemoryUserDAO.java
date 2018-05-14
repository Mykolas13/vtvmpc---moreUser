//package com.mokykla.mm.projektas4.projektas4.dao;
//
//import com.mokykla.mm.projektas4.projektas4.model.User;
//import org.springframework.stereotype.Repository;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;
//
////@Repository
//public class InMemoryUserDAO implements UserDAO{
//
//    private final List<User> users = new CopyOnWriteArrayList<>();
//
//    @Override
//    public List<User> getUsers() {
//
//        return Collections.unmodifiableList(users);
//    }
//
//    @Override
//    public void createUser(User user) {
//
//        users.add(user);
//    }
//
//    @Override
//    public void deleteUser(String username) {
//
//        for (User user: users) {
//
//            if (username.equals(user.getUsername())) {
//                users.remove(user);
//                break;
//            }
//        }
//    }
//
//    @Override
//    public void updateUser(String name, User user) {
//
//    }
//
//}

