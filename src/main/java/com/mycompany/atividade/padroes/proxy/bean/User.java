/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.atividade.padroes.proxy.bean;

/**
 *
 * @author Magdiel Ildefonso
 */
public class User {
    private String name;
    private String pass;
    private String type;
    
    public User(String n, String p, String t){
        this.name = n;
        this.pass = p;
        this.type = t;
        
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
