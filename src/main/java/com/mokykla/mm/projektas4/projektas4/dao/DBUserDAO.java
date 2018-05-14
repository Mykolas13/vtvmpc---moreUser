package com.mokykla.mm.projektas4.projektas4.dao;

import com.mokykla.mm.projektas4.projektas4.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DBUserDAO implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("SELECT u from User u", User.class).getResultList();
    }

    @Override
    public void createUser(User user) {

        entityManager.persist(user);
    }

    @Override
    public void deleteUser(String username) {

        User user = entityManager
                .createQuery("SELECT u from User u where username = :un", User.class)
                .setParameter("un", username).getSingleResult();
        if (entityManager.contains(user)) { entityManager.remove(user); }
        else { entityManager.remove(entityManager.merge(user)); }

    }

    @Override
    public void updateUser(String name, User newUser) {

        entityManager
           .createQuery("update User set username = :newusername, firstName = :newfirstName, lastName = :newlastName, email = :newemail")
                .setParameter("username", name)
                .setParameter("firstName", newUser.getFirstName())
                .setParameter("LastName", newUser.getLastName())
                .setParameter("email", newUser.getEmail())
                .executeUpdate();

    }
}
