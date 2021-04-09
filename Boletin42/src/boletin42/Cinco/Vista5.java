/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin42.Cinco;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

/**
 *
 * @author camiletlinux
 */
class Vista5 extends JFrame{
    
    JPanel param;
    JLabel c1, c2, grosor;
    JComboBox combo1, combo2;
    String[] items = {"Rojo", "Lima", "Azul", "Morado", "Negro"};
    JSlider slider;
    
    Vista5(){
        
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        param = new JPanel();
        
        c1 = new JLabel("Color 1: ");
        c2 = new JLabel("Color 2: ");
        grosor = new JLabel("Grosor: ");
        
        combo1 = new JComboBox(items);
        combo2 = new JComboBox(items);
        
        slider = new JSlider(SwingConstants.HORIZONTAL);
        
        param.add(c1);
        param.add(combo1);
        param.add(c2);
        param.add(combo2);
        param.add(grosor);
        param.add(slider);
        this.add(param);
        
        
        
        
        
    }
}
