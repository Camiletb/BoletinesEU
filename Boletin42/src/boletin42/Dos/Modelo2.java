/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin42.Dos;

import java.lang.String;
/**
 *
 * @author camiletlinux
 */
public final class Modelo2{
    
    private String ultimo;
    
    Modelo2(){
        ultimo = " ";
    }
    public String Pulsado(String command){

        
        ultimo = command;
        return ultimo;

    }
  
}
