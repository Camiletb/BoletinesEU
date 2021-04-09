/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin42.Uno;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author camiletlinux
 */
public class Ej1 extends JFrame{
    private JPanel arriba, centro;
    private JTextField objeto;
    private JTextArea lista;
    private ButtonGroup bg;
    private JRadioButton si, no;
    private JButton anyadir;
    
    Ej1(){
        arriba = new JPanel();
        arriba.setLayout(new FlowLayout(20));
        objeto = new JTextField();
        objeto.setPreferredSize(new Dimension(120, 20));
        bg = new ButtonGroup();
        si = new JRadioButton("Sí");
        no = new JRadioButton("No");
        bg.add(si);
        bg.add(no);
        
        
        
        anyadir = new JButton("Añadir");
        anyadir.setActionCommand("pulsado");
        si.setActionCommand("si");
        no.setActionCommand("no");
        
        arriba.add(objeto);
        arriba.add(si);
        arriba.add(no);
        arriba.add(anyadir);
        this.setLayout(new BorderLayout(10, 10));
        //arriba = new JPanel();
        
        
        this.add(arriba, BorderLayout.NORTH);
        
        
        centro = new JPanel();
        lista = new JTextArea(20, 50);
        
        centro.add(lista);
        this.add(centro, BorderLayout.CENTER);
        
        
    }
    
    public void setActionListener(ActionListener al){
        anyadir.addActionListener(al);
        si.addActionListener(al);
        no.addActionListener(al);
        
        
    }
    
    /*public String getObjeto(){
        return objeto.getText();
    }*/
    
    public void ActualizarVista(Boolean accion){
        if (accion == true){
            lista.append("" + objeto.getText() + " Sí" + "\n");
            
        }else{
            lista.append("" + objeto.getText() + " No" + "\n");
        }
        
        
    }
    
}
