/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dontdie;

import java.awt.Cursor;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Strawhatsheik
 */
public class Button extends JButton {
     
    
    
    public Button(ImageIcon image){
    
    super(image);
    this.setBounds(175, 390, 50, 50);
    this.setFocusPainted(false);
    this.setMargin(new Insets(0, 0, 0, 0));
    this.setContentAreaFilled(false);
    this.setBorderPainted(false);
    this.setOpaque(false);
    this.setBorder(new EmptyBorder(0,0,0,0));
    this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    
    
}
