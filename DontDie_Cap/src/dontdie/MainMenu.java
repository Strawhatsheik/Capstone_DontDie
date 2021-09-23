/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dontdie;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Strawhatsheik
 */
public class MainMenu extends State {
    
    
    //Variable
    //'G' buttons to begin adventures
    JButton goJA, goSA, goPA;
    //Constructor
    public MainMenu() {
        
    //Title of window        
    super("Don't Die! How long can you survive?");
    //Adds the panel which holds all components
    JPanel panel = new JPanel();
    //Sets layout to nothing so it can be custom
    panel.setLayout(null);
    //Sets background color
    panel.setBackground(Color.WHITE);
    //Add the panel to the contents(content is the container for everything and is created in the super class State                                   )
    contents.add(panel);
    

   
    //Opening banner
    JLabel pic = new JLabel(new ImageIcon(("Resources/Main_Menu/banner.PNG")));
    pic.setBounds(0, 0, 844, 191);
    panel.add(pic);
    
    //Start pirates setup
    JLabel picturePA = new JLabel(new ImageIcon(("Resources/Pirates_Adv/PIRATES.png")));
    picturePA.setBounds(400, 195, 300, 188);
    panel.add(picturePA);
     //Tooltip to talk about adventure
    picturePA.setToolTipText("A high seas adventure! You have been captured by pirates, can you get out of it alive, matey! Arrghh!!!");
    
    goPA = new JButton(new ImageIcon(("Resources/Main_Menu/buttongo.PNG")));
    goPA.setBounds(175, 390, 50, 50);
    panel.add(goPA);
    //End pirate adventure setup
    
    //Start jungle adventure setup
    JLabel pictureJA = new JLabel(new ImageIcon("Resources/Jungle_Adv/JUNGLE.png"));
    pictureJA.setBounds(50, 195, 300, 188);
    panel.add(pictureJA);
    //Tooltip to talk about adventure
     pictureJA.setToolTipText("A mysterious and deadly forest awaits! Can you claim the treasure and return???");
    
    goJA = new JButton(new ImageIcon(("Resources/Main_Menu/buttongo.PNG")));
    goJA.setBounds(525, 390, 50, 50);
    panel.add(goJA);
    
    //End jungle adventure setup
    
     //Start space adventure setup
    JLabel pictureSA = new JLabel(new ImageIcon(("Resources/Space_Adv/SPACE.png")));
    pictureSA.setBounds(50, 450, 300, 188);
    panel.add(pictureSA);
    //Tooltip to talk about adventure
     pictureSA.setToolTipText("Captains log: I've been abducted!! Abducted by strange aliens!! Can you return to Earth?!");
    
    goSA = new JButton(new ImageIcon(("Resources/Main_Menu/buttongo.PNG")));
    goSA.setBounds(175, 645, 50, 50);
    panel.add(goSA);
    
    //End space adventure setup
    
    
   //instantiate a button event handler
   ButtonHandler bh = new ButtonHandler();
  //Adds the buttonhandler to the buttons
  goPA.addActionListener(bh);
   goSA.addActionListener(bh);
    goJA.addActionListener(bh);
  
  
  
    //Make everything visible  
    setVisible(true);//Makes visible

    }

   


    
    
    
  private class ButtonHandler implements ActionListener{

        

   
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == goJA )
            {//Launch the jungle adventure
                Jungle jungle = new Jungle();
                jungle.level1.init();
                System.out.println("Jungle button pushed");
            }
            else if (e.getSource() == goPA )
            {//Launch the Pirate adventure
                Pirates pirate = new Pirates();
            }
            else if (e.getSource() == goSA )
            {//Launch the Space adventure
                Space space = new Space();
                //space.Space();
            }
            
        }
}



}
