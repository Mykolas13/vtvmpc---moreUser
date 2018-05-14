package com.mokykla.mm.projektas4.projektas4.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column
    @NotNull
    @Length(min = 1, max = 30)
    private String username;

    @Column
    @NotNull
    @Length(min = 1, max = 100)
    private String firstName;

    @Column
    @NotNull
    @Length(min = 1, max = 100)
    private String lastName;

    @Column
    @NotNull
    @Length(min = 1, max = 200)
    @Email
    private String email;

    public User() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User(@NotNull @Length(min = 1, max = 30) String username, @NotNull @Length(min = 1, max = 100) String firstName, @NotNull @Length(min = 1, max = 100) String lastName, @NotNull @Length(min = 1, max = 200) @Email String email) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
