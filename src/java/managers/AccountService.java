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
        
        //hard coded
        if (username.equals("abe") || username.equals("barb")) {
            
            if (password.equals("password"))    {
                
                user.setUsername(username);
                user.setPassword(null);
        
                return user;
            }
        }  
        
        return null;
    }
}
