/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.acrosys.interfaces;

import com.acrosys.models.User;
import java.util.List;

/**
 *
 * @author kryle
 */
public interface UserInterface {
    public boolean Login(User user);
    public void saveUser(User user);
    public void signinUser(User user);
    public void updateUser(User user, int id);
    public void deleteUser(String un);
    public List<User> searchUser(String searchKey, String searchString);
    public List<User> userList();
    public User getUser(String un);
}
