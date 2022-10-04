/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import models.User;

/**
 *
 * @author meeye
 */
public class AccountService {

    public AccountService() {
    }
    
    public User login(String username, String password) {
        
        User user = new User();
        
        user.setUsername(username);
        user.setPassword(null);
        
        return user;
        
    }
}
