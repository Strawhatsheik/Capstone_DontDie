/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dontdie;


import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *This is an abstract class, to be called by the various states, or windows
 * such as menu or game
 * @author Strawhatsheik
 */
public abstract class State extends JFrame{
  //Variables
   public Container contents;
   public String title; 
   
 //Constructor
    public State(String title)
    {super(title);
   this.title = title;
    setSize(800,800);//sets size(in pixels)
   // setVisible(true);//Makes visible
    setResizable(true);//Allows user to resize
    setLocationRelativeTo(null);//Starts window in center of screen
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Causes window to exit when red 'x' pushed
    contents = getContentPane();
   getContentPane().setBackground(Color.YELLOW);
  
    }

}
