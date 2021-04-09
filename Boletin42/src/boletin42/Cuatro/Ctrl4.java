/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin42.Cuatro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author camiletlinux
 */
public class Ctrl4 {
    
    Vista4 vista;
    Ctrl4(Vista4 vista){
        this.vista = vista;
        vista.addWindowListener(new CtrlWindowListener());
        vista.setActionListener(new Oyente4());
        
    }
    
    class CtrlWindowListener extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e){
            System.out.println("Ejercicio4: Cerrado.");
            System.exit(0);
        }
    }  
    
    class Oyente4 implements ActionListener{
        Boolean ok = true;
        @Override
        public void actionPerformed(ActionEvent ae){
            String command = ae.getActionCommand();
            
            vista.actualizarColor(command);
            switch(command){
                case "r":
                    System.out.println("Botón rojo pulsado.");
                    break;
                case "g":
                    System.out.println("Botón verde pulsado.");
                    break;
                case "b":
                    System.out.println("Botón azul pulsado.");
                    break;
            }
        }
    } 
}
