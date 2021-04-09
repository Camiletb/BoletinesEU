/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin42.Cuatro;

import boletin42.Cuatro.Vista4;
import boletin42.Cuatro.Ctrl4;

/**
 *
 * @author camiletlinux
 */
public class Main4 {
    public static void main(String[] args) {
        // TODO code application logic here
        Vista4 miframe = new Vista4();
        Ctrl4 ctrl = new Ctrl4(miframe);
        
        miframe.setSize(600, 400);
        miframe.setVisible(true);
        
    }
}
