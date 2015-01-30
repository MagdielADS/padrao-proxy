/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.atividade.padroes.proxy;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Magdiel Ildefonso
 */
public class PromptCommandImpl implements PromptCommand{
    
    public void runCommand(String command) throws Exception {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("cmd /c " + command);
        
        InputStream stream = pr.getInputStream();
        InputStreamReader inputReader = new InputStreamReader(stream);
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        int exitVal = pr.waitFor();
        System.out.println("Exited with error code" + exitVal);
    }    
}
