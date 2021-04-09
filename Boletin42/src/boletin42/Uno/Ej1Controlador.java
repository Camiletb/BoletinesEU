/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin42.Uno;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author camiletlinux
 */
public class Ej1Controlador {
  
    Ej1 vista;
    public Ej1Controlador(Ej1 vista){
        this.vista = vista;
        vista.addWindowListener(new PControlWindowListener());
        vista.setActionListener(new Oyente1());
        
    }
    
    class PControlWindowListener extends WindowAdapter{
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Ejercicio1: Cerrado.");
                System.exit(0);
            }
        }  
    
    class Oyente1 implements ActionListener{
        Boolean ok = true;
        @Override
        public void actionPerformed(ActionEvent ae){
            String command = ae.getActionCommand();
            
            switch(command){
                case "si":
                    ok = true;
                    System.out.println("Ejercicio1: Botón \"Si\" pulsado.");
                    break;
                    
                case "no":
                    ok = false;
                    System.out.println("Ejercicio1: Botón \"No\" pulsado.");
                    break;
                case "pulsado":
                    System.out.println("Ejercicio1: Botón \"Añadir\" pulsado.");
                    vista.ActualizarVista(ok);
                    break;
            }
        }
    } 
    
}
