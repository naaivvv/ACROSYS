/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.acrosys.interfaces;

import com.acrosys.models.User;

/**
 *
 * @author kryle
 */
public interface UserInterface {
    public boolean Login(User user);
    public void saveUser(User user);
}
