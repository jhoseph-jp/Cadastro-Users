package com.example.cadastrousers;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.Exclude;

import java.io.Serializable;
import java.util.List;

public class Users implements Serializable {

    @Exclude
    private String key;
    private String firstName;
    private String lastName;
    private String age;
    private String userName;

    public Users() {}

    public Users(String firstName, String lastName, String age, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.userName = userName;
    }

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
