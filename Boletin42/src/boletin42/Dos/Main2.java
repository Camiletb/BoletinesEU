/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin42.Dos;

import boletin42.Dos.Modelo2;
import boletin42.Dos.Ctrl2;

/**
 *
 * @author camiletlinux
 */
public class Main2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Vista2 miframe = new Vista2();
        Modelo2 modelo = new Modelo2();
        Ctrl2 ctrl = new Ctrl2(miframe, modelo);
        
        miframe.setSize(400, 250);
        miframe.setVisible(true);
        
    }
    
}
