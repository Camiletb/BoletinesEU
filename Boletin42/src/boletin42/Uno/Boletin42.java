/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin42.Uno;

/**
 *
 * @author camiletlinux
 */
public class Boletin42 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ej1 uno = new Ej1();
        Ej1Controlador cuno = new Ej1Controlador(uno);
        
        uno.setVisible(true);
        uno.setSize(600, 400);
    }
    
}
