/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.atividade.padroes.proxy;

import com.mycompany.atividade.padroes.proxy.bean.User;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Magdiel Ildefonso
 */
public class PermissionManager implements PromptCommand{
    private User user;
    private PromptCommandImpl command;
    
    public PermissionManager(){
        command = new PromptCommandImpl();
    }
    
    public User getUser(){
        if(this.user!=null){
            return this.user;
        }
        return null;
    }
    
    public void login(User user){
        this.user = user;
    }
    
    public void logout(){
        this.user = null;
    }
    
    public void runCommand(String com){
        if(user.getType().equals("Admin")){
            try {
                command.runCommand(com);
            } catch (Exception ex) {
                Logger.getLogger(PermissionManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }
}
