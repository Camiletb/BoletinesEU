/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin42.Cinco;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author camiletlinux
 */
public class Lienzo extends JPanel{
    String color = "r";
    Color r, g, b;
    
    //
    
    //this.setBackground(new Color(Color.WHITE));

    /*@Override
    public void setBackground(Color bg) {
        super.setBackground(bg); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponents(g);
        
        Dimension tamVentana = this.getSize();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4.0f));
        
        int centrox, centroy;
        
        centrox = tamVentana.width / 2;
        centroy = tamVentana.height / 2;
        
        switch(color){
            case "Rojo":
                
                g.setColor(new Color(170, 68, 80));
                g.drawLine(centrox - 120, centroy - 120, 240, 240);

                
                /*gra.fillOval(centrox - 120, centroy - 120, 240, 240);
                gra.setColor(new Color(164, 26, 60));
                gra.drawOval(centrox - 120, centroy - 120, 240, 240);*/
                break;
            case "Lima":                
                /*gra.setColor(new Color(34, 152, 102));
                gra.fillOval(centrox - 120, centroy - 120, 240, 240);
                gra.setColor(new Color(34, 117, 94));
                gra.drawOval(centrox - 120, centroy - 120, 240, 240);*/
                break;
            case "Azul":                
                /*gra.setColor(new Color(58, 87, 164));
                gra.fillOval(centrox - 120, centroy - 120, 240, 240);
                gra.setColor(new Color(54, 46, 185));
                gra.drawOval(centrox - 120, centroy - 120, 240, 240);*/
                break;                
            case "Morado":                
                /*gra.setColor(new Color(34, 152, 102));
                gra.fillOval(centrox - 120, centroy - 120, 240, 240);
                gra.setColor(new Color(34, 117, 94));
                gra.drawOval(centrox - 120, centroy - 120, 240, 240);*/
                break;
            case "Negro":                
                /*gra.setColor(new Color(58, 87, 164));
                gra.fillOval(centrox - 120, centroy - 120, 240, 240);
                gra.setColor(new Color(54, 46, 185));
                gra.drawOval(centrox - 120, centroy - 120, 240, 240);*/
                break;                
        }         
           
    }
    
    public void Pintar(String command){
        
        color = command;
        
    }
}
