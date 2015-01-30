package com.mycompany.atividade.padroes.proxy;

import com.mycompany.atividade.padroes.proxy.bean.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        PermissionManager perm = new PermissionManager();
        User u = new User("Magdiel", "123", "Admin");
        User u2 = new User("Bruno", "123", "Simples");
        
        perm.login(u);
        
        //System.out.println(perm.runCommand("dir"));
    }
}
