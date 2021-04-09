/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin42.Dos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author camiletlinux
 */
public class Vista2 extends JFrame{
    
    JComboBox list;
    JLabel listaLabel, usado;
    JPanel botones, centro, grupo, lista, aux;
    JButton a, b, c, d, e, f;
    ButtonGroup bg;
    JRadioButton R1, R2;
    String[] items = {"L1", "L2", "L3"};
    
    
    Vista2(){
        super("Ejercicio 3");
        
        botones = new JPanel();
        botones.setPreferredSize(new Dimension(150, 50));
        
        a = new JButton("A");
        b = new JButton("B");
        c = new JButton("C");
        d = new JButton("D");
        e = new JButton("E");
        f = new JButton("F");
        
        a.setActionCommand("A");
        b.setActionCommand("B");
        c.setActionCommand("C");
        d.setActionCommand("D");
        e.setActionCommand("E");
        f.setActionCommand("F");
        
        botones.add(a);
        botones.add(b);
        botones.add(c);
        botones.add(d);
        botones.add(e);
        botones.add(f);
        
        centro = new JPanel();
        centro.setLayout(new BorderLayout());
        
        grupo = new JPanel();
        
        grupo.setLayout(new BoxLayout(grupo, BoxLayout.Y_AXIS));
        grupo.setBorder(BorderFactory.createTitledBorder("Grupo R"));
        grupo.setPreferredSize(new Dimension(100, 20));
        
        bg = new ButtonGroup();
        R1 = new JRadioButton("R1");
        R2 = new JRadioButton("R2");
        
        bg.add(R1);
        bg.add(R2);
        grupo.add(R1);
        grupo.add(R2);

        lista = new JPanel();
        listaLabel = new JLabel("Lista: ");
        
        list = new JComboBox(items);
        lista.add(listaLabel);
        lista.add(list);
        
        list.setActionCommand("lista");
        
        
        centro.add(grupo, BorderLayout.WEST);
               
        centro.add(lista, BorderLayout.EAST);
        
        usado = new JLabel("Último botón usado");
        
        
        this.add(botones, BorderLayout.NORTH);
        this.add(centro, BorderLayout.CENTER);
        aux = new JPanel();
        aux.setPreferredSize(new Dimension(100, 70));
        
        aux.add(usado);
        this.add(aux, BorderLayout.SOUTH);
        
        
        
    }
    
    public String getItem(){
        String x;
        x = String.valueOf(list.getSelectedItem());
        return x;
    }
    
    public void ActualizarVista(String command){
        String x;
        //x = mod
        switch(command){
                case "lista":
                    usado.setText(String.valueOf(list.getSelectedItem()));
                    break;
                    
                default:
                    usado.setText("" + command);
                    break;
            }
        
        
    }
    
    public void setActionListener(ActionListener al){
        R1.addActionListener(al);
        R2.addActionListener(al);
        
        a.addActionListener(al);
        b.addActionListener(al);
        c.addActionListener(al);
        d.addActionListener(al);
        e.addActionListener(al);
        f.addActionListener(al);
        
        list.addActionListener(al);
    }

    /**
     * @param args the command line arguments
     */
    
    
}
