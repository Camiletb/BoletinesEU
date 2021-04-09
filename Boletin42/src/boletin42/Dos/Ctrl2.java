/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin42.Dos;

/**
 *
 * @author camiletlinux
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author camiletlinux
 */
public class Ctrl2 {
  
    Vista2 vista;
    Modelo2 modelo;
    
    
    public Ctrl2(Vista2 vista, Modelo2 modelo){
        this.vista = vista;
        this.modelo = modelo;
        vista.addWindowListener(new PControlWindowListener());
        vista.setActionListener(new Oyente2());
        
    }
    
    class PControlWindowListener extends WindowAdapter{
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Ejercicio1: Cerrado.");
                System.exit(0);
            }
        }  
    
    class Oyente2 implements ActionListener{
        Boolean ok = true;
        @Override
        public void actionPerformed(ActionEvent ae){
            String command = ae.getActionCommand();
            
            switch(command){
                case "A":
                    System.out.println("Botón A pulsado.");
                    //modelo.Pulsado(command);
                    vista.ActualizarVista(modelo.Pulsado(command));
                    break;
                case "B":
                    System.out.println("Botón B pulsado.");
                    
                    //modelo.Pulsado(command);
                    vista.ActualizarVista(modelo.Pulsado(command));
                    break;
                case "C":
                    System.out.println("Botón C pulsado.");
                    //vista.ActualizarVista(command);
                    //modelo.Pulsado(command);
                    vista.ActualizarVista(modelo.Pulsado(command));
                    break;
                case "D":
                    System.out.println("Botón D pulsado.");
                    //vista.ActualizarVista(command);
                    //modelo.Pulsado(command);
                    vista.ActualizarVista(modelo.Pulsado(command));
                    break;
                case "E":
                    System.out.println("Botón E pulsado.");
                    //vista.ActualizarVista(command);
                    //modelo.Pulsado(command);
                    vista.ActualizarVista(modelo.Pulsado(command));
                    break;
                case "F":
                    System.out.println("Botón F pulsado.");
                    //vista.ActualizarVista(command);
                    //modelo.Pulsado(command);
                    vista.ActualizarVista(modelo.Pulsado(command));
                    break;
                    
                case "R1":
                    System.out.println("Botón R1 pulsado.");
                    //vista.ActualizarVista(command);
                    //modelo.Pulsado(command);
                    vista.ActualizarVista(modelo.Pulsado(command));
                    break;
                case "R2":
                    System.out.println("Botón R2 pulsado.");
                    //vista.ActualizarVista(command);
                    //modelo.Pulsado(command);
                    vista.ActualizarVista(modelo.Pulsado(command));
                    break;
                    
                case "lista":
                    System.out.println("Botón L1 pulsado.");
                    //vista.ActualizarVista(command);
                    //modelo.Pulsado(command);
                    String item = vista.getItem();
                    vista.ActualizarVista(modelo.Pulsado(item));
                    break;
            }
        }
    } 
    
}