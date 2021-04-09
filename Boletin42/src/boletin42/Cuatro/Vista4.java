/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin42.Cuatro;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author camiletlinux
 */
public class Vista4 extends JFrame{
    private JButton r, g, b;
    private JPanel arriba, dibujo;
    private Dibujo dibu;
    
    Vista4(){
        
        super("Ejercicio 4");
        
        //Panel ARRIBA con los botones para cambiar el color
        arriba = new JPanel();
        r = new JButton("Rojo");
        g = new JButton("Verde");
        b = new JButton("Azul");
        
        r.setActionCommand("r");
        g.setActionCommand("g");
        b.setActionCommand("b");
        
        arriba.add(r);
        arriba.add(g);
        arriba.add(b);
        
        this.add(arriba, BorderLayout.NORTH);

        //Panel DIBUJO con el círculo
        dibujo = new JPanel();
        
        dibu = new Dibujo();
        add(dibu);
        
    }
    
    public void actualizarColor(String c){
        dibu.Pintar(c);
        dibu.repaint();
    }
    
    public void setActionListener(ActionListener al){
        r.addActionListener(al);
        g.addActionListener(al);
        b.addActionListener(al);
    }
}


