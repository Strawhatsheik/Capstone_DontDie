package dontdie;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Timer;


/**
 *This class will create a scenario object
 * @author Strawhatsheik
 */
public class Scenario extends State{
    
    //Variables 
    //The 'path' variables denote the path to an image, so pathMain would be the path needed to load the main pictue for this scenario.
    //Whereas the variables without the 'path' beginning are the variables meant to hold the text of the event.
    String mainEvent, goodChoice, badChoice, uglyChoice, goodChoiceConsequence,
            badChoiceConsequence, uglyChoiceConsequence, picPathMain, picPathGood, picPathBad, picPathUgly,
            goodChoiceSub, badChoiceSub, uglyChoiceSub;
    //These might not be used, but some scenarios require more path options
    String altMain, altGoodChoiceConsequence, altBadChoiceConsequence, altUglyChoiceConsequence,
           altPicPathMain, altPicPathBad, altPicPathGood, altPicPathUgly, altGoodChoiceSub, altBadChoiceSub, altUglyChoiceSub; 
    //
        JButton jMainButton, subButtonW, clickMe, goodChoiceButton, badChoiceButton, uglyChoiceButton, subButtonG, subButtonB, subButtonU;
    //
        Boolean apGood = false, apBad = false, apUgly = false;
      //Adds the panel which holds all components
    JPanel panel = new JPanel();
     JLabel jMainPic; 
 JTextArea textArea, textArea1;
 JScrollPane areaScrollPane, areaScrollPane1;


//Constructor
    public Scenario(String title)
            
    { super(title);
    
    }
    
     public void init()
     {
         
    //Sets layout to nothing so it can be custom
    panel.setLayout(null);
    //Sets background color
    panel.setBackground(Color.WHITE);
    //Add the panel to the contents(content is the container for everything and is created in the super class State                                   )
    contents.add(panel);
    setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);//Causes window to exit when red 'x' pushed
     //instantiate a button event handler
    ButtonHandler bhs = new ButtonHandler();
    //Adds the main picture for main event
    
    //Add the main event picture space 
     jMainPic = new JLabel(new ImageIcon((this.picPathMain)));
    jMainPic.setBounds(200, 0, 400, 400);
    panel.add(jMainPic);
    
    
   //Add the main event story space
 
textArea = new JTextArea(this.mainEvent); 
textArea.setFont(new Font("Kristen ITC", Font.PLAIN , 22));
textArea.setLineWrap(true);
textArea.setWrapStyleWord(true);
 
//Adds it to scrollbaer
areaScrollPane = new JScrollPane(this.textArea);


areaScrollPane.setBounds(100, 405, 600, 225);
panel.add(areaScrollPane);
//JLabel jMain = new JLabel(this.mainEvent);
   // jMain.setBounds(0, 200, 844, 191);
    //panel.add(jMain);
    
    
    
    //Prepares the buttons, but starts them as invisible and unusable the buttons displaying your options
    goodChoiceButton = new JButton(this.goodChoice);
    goodChoiceButton.setBounds(100, 650, 150, 50);
    goodChoiceButton.setEnabled(true);
   goodChoiceButton.setVisible(true);
   goodChoiceButton.setToolTipText(this.goodChoice);
    panel.add(goodChoiceButton);
    //If the goodchoice field is null there is no button
    if(this.goodChoice == null)
    {goodChoiceButton.setVisible(false);
    goodChoiceButton.setEnabled(false);
    }
    
     //Ads the buttons displaying your options
      badChoiceButton = new JButton(this.badChoice);
    badChoiceButton.setBounds(300, 650, 150, 50);
    badChoiceButton.setEnabled(true);
   badChoiceButton.setVisible(true);
   badChoiceButton.setToolTipText(this.badChoice);
    panel.add(badChoiceButton);
    
      //If the goodchoice field is null there is no button
    if(this.badChoice == null)
    {badChoiceButton.setVisible(false);
      badChoiceButton.setEnabled(false);
    }
     //Ads the buttons displaying your options
      uglyChoiceButton = new JButton(this.uglyChoice);
    uglyChoiceButton.setBounds(500, 650, 150, 50);
    uglyChoiceButton.setEnabled(true);
   uglyChoiceButton.setVisible(true);
   uglyChoiceButton.setToolTipText(this.uglyChoice);
    panel.add(uglyChoiceButton);
      //If the goodchoice field is null there is no button
    if(this.uglyChoice == null)
    {uglyChoiceButton.setVisible(false);
    uglyChoiceButton.setEnabled(false);
    }
    
     setVisible(true);//Makes visible
    
    
  goodChoiceButton.addActionListener(bhs);
  badChoiceButton.addActionListener(bhs);
  uglyChoiceButton.addActionListener(bhs);
     
     
     }
     //A special init variable, for the lab entrance
      public void initS()
     {
         
    //Sets layout to nothing so it can be custom
    panel.setLayout(null);
    //Sets background color
    panel.setBackground(Color.WHITE);
    //Add the panel to the contents(content is the container for everything and is created in the super class State                                   )
    contents.add(panel);
    setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);//Causes window to exit when red 'x' pushed
     //instantiate a button event handler
    ButtonHandler bhs = new ButtonHandler();
    //Adds the main picture for main event
    
    //Add the main event picture space 
     jMainPic = new JLabel(new ImageIcon((this.picPathMain)));
    jMainPic.setBounds(200, 0, 400, 400);
    panel.add(jMainPic);
    
    
   //Add the main event story space
 
textArea = new JTextArea(this.mainEvent); 
textArea.setFont(new Font("Kristen ITC", Font.PLAIN , 22));
textArea.setLineWrap(true);
textArea.setWrapStyleWord(true);
 
//Adds it to scrollbaer
areaScrollPane = new JScrollPane(this.textArea);
//reaScrollPane.setVerticalScrollBarPolicy(
  //              JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//areaScrollPane.setVerticalScrollBarPolicy(
    //            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//areaScrollPane.setPreferredSize(new Dimension(250, 250));

areaScrollPane.setBounds(100, 405, 600, 225);
panel.add(areaScrollPane);
//JLabel jMain = new JLabel(this.mainEvent);
   // jMain.setBounds(0, 200, 844, 191);
    //panel.add(jMain);
    
    
    
    //Prepares the buttons, but starts them as invisible and unusable the buttons displaying your options
    goodChoiceButton = new JButton(this.goodChoice);
    goodChoiceButton.setBounds(100, 650, 150, 50);
    goodChoiceButton.setEnabled(true);
   goodChoiceButton.setVisible(true);
   goodChoiceButton.setToolTipText(this.goodChoice);
    panel.add(goodChoiceButton);
    //If the goodchoice field is null there is no button
    if(this.goodChoice == null)
    {goodChoiceButton.setVisible(false);
    goodChoiceButton.setEnabled(false);
    }
    
     //Ads the buttons displaying your options
      badChoiceButton = new JButton(this.badChoice);
    badChoiceButton.setBounds(300, 650, 150, 50);
    badChoiceButton.setEnabled(true);
   badChoiceButton.setVisible(true);
   badChoiceButton.setToolTipText(this.badChoice);
    panel.add(badChoiceButton);
    
      //If the goodchoice field is null there is no button
    if(this.badChoice == null)
    {badChoiceButton.setVisible(false);
      badChoiceButton.setEnabled(false);
    }
     //Ads the buttons displaying your options
      uglyChoiceButton = new JButton(this.uglyChoice);
    uglyChoiceButton.setBounds(500, 650, 150, 50);
    uglyChoiceButton.setEnabled(true);
   uglyChoiceButton.setVisible(true);
   uglyChoiceButton.setToolTipText(this.uglyChoice);
    panel.add(uglyChoiceButton);
      //If the goodchoice field is null there is no button
    if(this.uglyChoice == null)
    {uglyChoiceButton.setVisible(false);
    uglyChoiceButton.setEnabled(false);
    }
    
     setVisible(true);//Makes visible
    
    
  goodChoiceButton.addActionListener(bhs);
  badChoiceButton.addActionListener(bhs);
  uglyChoiceButton.addActionListener(bhs);
     
     
     }
     ////Sheik!!! These are not EVENTS they are popup consequences!! Anything with a decision will
     //Be a LEVEL! So you don't have to figure out how this consequence
     //reacts to this, and all these freaking buttons! Each level has buttons 
     //You prepe each level by saying what EVERYTHING is an advnace
     public void initGood()
     {  
    //I,lem,ent the sub button handler     
    ButtonHandlerSub bhss = new ButtonHandlerSub();
    //Change the main event picture space to reflect consequence
    jMainPic.setIcon(new ImageIcon((this.picPathGood)));
    //Set the old ScrollPane invisible
    areaScrollPane.setVisible(false);
   //Add a new text area with the new consequence text
  textArea = new JTextArea(this.goodChoiceConsequence);
  textArea.setFont(new Font("Kristen ITC", Font.PLAIN , 22));
  textArea.setLineWrap(true);
  textArea.setWrapStyleWord(true);
  //Adds it to a new scrollPane 
  areaScrollPane1 = new JScrollPane(textArea);
 
  //Place the new scroll pane
  areaScrollPane1.setBounds(100, 405, 600, 225);
  panel.add(areaScrollPane1);
    
  //Add the new button for the sub event
    subButtonG = new JButton(goodChoiceSub);
    //Set its bounds
    subButtonG.setBounds(250, 650, 300, 50);
    //Enable and make it visible
    subButtonG.setEnabled(true);
   subButtonG.setVisible(true);
   //Add it to ther panel 
   panel.add(subButtonG);
   //Give it an action listener to the SUB button handler 
   subButtonG.addActionListener(bhss);
   
   //Make the original buttons invisible and unusable
   uglyChoiceButton.setEnabled(false);
   uglyChoiceButton.setVisible(false);
   goodChoiceButton.setEnabled(false);
   goodChoiceButton.setVisible(false);
   badChoiceButton.setEnabled(false);
   badChoiceButton.setVisible(false);
   
   this.setAPGood(true);
   //Make all the additions visible
    setVisible(true);//Makes visible
  }
     
      ////Sheik!!! These are not EVENTS they are popup consequences!! Anything with a decision will
     //Be a LEVEL! So you don't have to figure out how this consequence
     //reacts to this, and all these freaking buttons! Each level has buttons 
     //You prepe each level by saying what EVERYTHING is an advnace
     public void initBad()
     {  this.setAlwaysOnTop (true);
    //I,lem,ent the sub button handler     
    ButtonHandlerSub bhss = new ButtonHandlerSub();
    //Change the main event picture space to reflect consequence
    jMainPic.setIcon(new ImageIcon((this.picPathBad)));
    //Set the old ScrollPane invisible
    areaScrollPane.setVisible(false);
   //Add a new text area with the new consequence text
  textArea = new JTextArea(this.badChoiceConsequence);
  textArea.setFont(new Font("Kristen ITC", Font.PLAIN , 22));
  textArea.setLineWrap(true);
  textArea.setWrapStyleWord(true);
  //Adds it to a new scrollPane 
  areaScrollPane1 = new JScrollPane(textArea);
  //reaScrollPane.setVerticalScrollBarPolicy(
  //              JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
  //areaScrollPane.setVerticalScrollBarPolicy(
    //            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
  //areaScrollPane.setPreferredSize(new Dimension(250, 250));
  //Place the new scroll pane
  areaScrollPane1.setBounds(100, 405, 600, 225);
  panel.add(areaScrollPane1);
    
  //Add the new button for the sub event
    subButtonB = new JButton(badChoiceSub);
    //Set its bounds
    subButtonB.setBounds(250, 650, 300, 50);
    //Enable and make it visible
    subButtonB.setEnabled(true);
   subButtonB.setVisible(true);
   //Add it to ther panel 
   panel.add(subButtonB);
   //Give it an action listener to the SUB button handler 
   subButtonB.addActionListener(bhss);
   
   //Make the original buttons invisible and unusable
   uglyChoiceButton.setEnabled(false);
   uglyChoiceButton.setVisible(false);
   goodChoiceButton.setEnabled(false);
   goodChoiceButton.setVisible(false);
   badChoiceButton.setEnabled(false);
   badChoiceButton.setVisible(false);
   this.setAPBad(true);
   //Make all the additions visible
    setVisible(true);//Makes visible
  // this.dispose();
  // MainMenu menu = new MainMenu();
//    Space menu = new Space();
   //this.adventurer.setLifeStatus() == false;
    
  }
     
 ////Sheik!!! These are not EVENTS they are popup consequences!! Anything with a decision will
     //Be a LEVEL! So you don't have to figure out how this consequence
     //reacts to this, and all these freaking buttons! Each level has buttons 
     //You prepe each level by saying what EVERYTHING is an advnace
     public void initUgly()
     {  
    //I,lem,ent the sub button handler     
    ButtonHandlerSub bhss = new ButtonHandlerSub();
    //Change the main event picture space to reflect consequence
    jMainPic.setIcon(new ImageIcon((this.picPathUgly)));
  
    //Set the old ScrollPane invisible
    areaScrollPane.setVisible(false);
   //Add a new text area with the new consequence text
  textArea = new JTextArea(this.uglyChoiceConsequence);
  textArea.setFont(new Font("Kristen ITC", Font.PLAIN , 22));
  textArea.setLineWrap(true);
  textArea.setWrapStyleWord(true);
  //Adds it to a new scrollPane 
  areaScrollPane1 = new JScrollPane(textArea);
  //reaScrollPane.setVerticalScrollBarPolicy(
  //              JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
  //areaScrollPane.setVerticalScrollBarPolicy(
    //            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
  //areaScrollPane.setPreferredSize(new Dimension(250, 250));
  //Place the new scroll pane
  areaScrollPane1.setBounds(100, 405, 600, 225);
  panel.add(areaScrollPane1);
    
   
    
           
    
  //Add the new button for the sub event
    subButtonU = new JButton(uglyChoiceSub);
    //Set its bounds
   subButtonU.setBounds(250, 650, 300, 50);
    
    //Enable and make it visible
    subButtonU.setEnabled(true);
   subButtonU.setVisible(true);
   //Add it to ther panel 
   panel.add(subButtonU);
   //Give it an action listener to the SUB button handler 
   subButtonU.addActionListener(bhss);
   
   //Make the original buttons invisible and unusable
   uglyChoiceButton.setEnabled(false);
   uglyChoiceButton.setVisible(false);
   goodChoiceButton.setEnabled(false);
   goodChoiceButton.setVisible(false);
   badChoiceButton.setEnabled(false);
   badChoiceButton.setVisible(false);
   
      this.setAPUgly(true);
   
   //Make all the additions visible
    setVisible(true);//Makes visible
  }  
  
  
  
 
     
     
        
              
 


      
      
       private class ButtonHandler implements ActionListener
       {

        @Override
        public void actionPerformed(ActionEvent e) {
             if (e.getSource() == goodChoiceButton )
             {
                
                
                 Scenario.this.initGood();
                 Scenario.this.setAPGood(true);
               
            
            }
            else if (e.getSource() == badChoiceButton)
            { Scenario.this.initBad();
        Scenario.this.setAPBad(true);
            //the player has died, open main menu
             MainMenu menu = new MainMenu();
            }
             else if (e.getSource() == uglyChoiceButton)
            { Scenario.this.initUgly();
             Scenario.this.setAPUgly(true);

        }
               
       }   
       }
        private class ButtonHandlerSub implements ActionListener
       {

       
        @Override
        public void actionPerformed(ActionEvent e) {
             if (e.getSource() == subButtonG  )
             {Scenario.this.setVisible(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              }
             else if (e.getSource() == subButtonB)
                    {
                         Scenario.this.setVisible(false);
                         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
             else if (e.getSource() == subButtonU)
                     { {Scenario.this.setVisible(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
                     
            }
           if (e.getSource() == subButtonW  )
             {Scenario.this.setVisible(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              }
        }
        }
       
    ///Mutator methods, this is how I will set up each level for each adventure

 public void setMainEvent(String mainEvent)
{//Allow me to set main event for each scenario
    this.mainEvent = mainEvent;
}        
  
 
  public void setGoodChoice(String goodChoice)
{//Allow me to set the text for the "good choice" button for each scenario
    this.goodChoice = goodChoice;
}

 
    public void setGoodChoiceSub(String goodChoiceSub)
{//Allow me to set the text for the button created by initGood for each scenario
    this.goodChoiceSub = goodChoiceSub;
}
    
    public void setBadChoice(String badChoice)
{//Allow me to set the text for the "bad choice" button for each scenario
    this.badChoice = badChoice;
}
    
    
    public void setBadChoiceSub(String badChoiceSub)
{//Allow me to set the text for the button created by initBad for each scenario
    this.badChoiceSub = badChoiceSub;
}
        
        
  public void setUglyChoice(String uglyChoice)
{//Allow me to set the text for the "ugly choice" button for each scenario
    this.uglyChoice = uglyChoice;
}
   

  
  public void setUglyChoiceSub(String uglyChoiceSub)
{//Allow me to set the text for the button created by subInitGood for each scenario
    this.uglyChoiceSub = uglyChoiceSub;
}
    public void setGoodChoiceConsequence(String goodChoiceConsequence)
{//Allow me to set the event for the ood choice storyline
 //after the "good choice" button is pressed, for each scenario
    this.goodChoiceConsequence = goodChoiceConsequence;
}

    public void setBadChoiceConsequence(String badChoiceConsequence)
{//Allow me to set the event for the bad choice storyline
 //after the "bad choice" button is pressed, for each scenario
    this.badChoiceConsequence = badChoiceConsequence;
}

    public void setUglyChoiceConsequence(String uglyChoiceConsequence)
{//Allow me to set the event for the ood choice storyline
 //after the "ugly choice" button is pressed, for each scenario
    this.uglyChoiceConsequence = uglyChoiceConsequence;
}

    public void setPicPathMain(String picPathMain)
{//Allow me to set the path to the main picture for the main even in each scenario
    this.picPathMain = picPathMain;
    
}
        
     public void setPicPathGood(String picPathGood)
{//Allow me to set the path to the picture for the "good" path even in each scenario
    this.picPathGood = picPathGood;
}       

    public void setPicPathBad(String picPathBad)
{//Allow me to set the path to the picture for the "bad" path event in each scenario
    this.picPathBad = picPathBad;
}     

    public void setPicPathUgly(String picPathUgly)
{//Allow me to set the path to the picture for the "ugly" event path in each scenario
    this.picPathUgly = picPathUgly;
}
        public void setAltMain(String altMain)
{//Allow me to set the main event in an alternate scenario
    this.altMain = altMain;
}
        public void setAltGoodChoiceConsequence(String altGoodChoiceConsequence)
{//Allow me to set the "good" choice event in an alternate scenario
    this.altGoodChoiceConsequence = altGoodChoiceConsequence;
}
        
        public void setAltBadChoiceConsequence(String altBadChoiceConsequence)
{//Allow me to set the "bad" choice event in an alternate scenario
    this.altBadChoiceConsequence = altBadChoiceConsequence;
}
        
        public void setAltUglyChoiceConsequence(String altUglyChoiceConsequence)
{//Allow me to set the "ugly" choice event in an alternate scenario
    this.altUglyChoiceConsequence = altUglyChoiceConsequence;
}      
       public void setAltPicPathMain(String altPicPathMain)
{//Allow me to set the path to the main picture in an alternate scenario
    this.altPicPathMain = altPicPathMain;
}    

       public void setAltPicPathGood(String altPicPathGood)
{//Allow me to set the path to the picture for the "good" consequence in an alternate scenario
    this.altPicPathGood = altPicPathGood;
}    
       
       public void setAltPicPathBad(String altPicPathBad)
{//Allow me to set the path to the picture for the "bad" consequence in an alternate scenario
    this.altPicPathBad = altPicPathBad;
}
       
       public void setAltPicPathUgly(String altPicPathUgly)
{//Allow me to set the path to the picture for the "ugly" consequence in an alternate scenario
    this.altPicPathUgly = altPicPathUgly;
}   
       
      public void setAltGoodChoiceSub(String altGoodChoiceSub)
{//Allow me to set the text for the buttons"good" consequence in an alternate sub-scenario
    this.altGoodChoiceSub = altGoodChoiceSub;
}   
  
    public void setAltBadChoiceSub(String altBadChoiceSub)
{//Allow me to set the text for the buttons "bad" consequence in an alternate sub-scenario
    this.altBadChoiceSub = altBadChoiceSub;
}
      
     public void setAltUglyChoiceSub(String altUglyChoiceSub)
{//Allow me to set the text for the buttons "ugly" consequence in an alternate sub-scenario
    this.altUglyChoiceSub = altUglyChoiceSub;
}
         
         
    public void setAPGood(Boolean value)
    {//Allows me to set the value to true or false for this boolean variable, depending on if the user's
        //choice takes them down an alternate path
        this.apGood = value;}
    
    public Boolean getAPGood()
    {//Allows me to retrieve the value of this boolean variable, depending on if the user's
        //choice takes them down an alternate path
        return this.apGood;
    }
    
     public void setAPBad(Boolean value)
    {//Allows me to set the value to true or false for this boolean variable, depending on if the user's
        //choice takes them down an alternate path
        this.apBad = value;}
    
    public Boolean getAPBad()
    {//Allows me to retrieve the value of this boolean variable, depending on if the user's
        //choice takes them down an alternate path
        return this.apBad;
    }
    
     public void setAPUgly(Boolean value)
    {//Allows me to set the value to true or false for this boolean variable, depending on if the user's
        //choice takes them down an alternate path
        this.apUgly = value;}
    
    public Boolean getAPUgly()
    {//Allows me to retrieve the value of this boolean variable, depending on if the user's
        //choice takes them down an alternate path
        return this.apUgly;
    }
    
}
            


        
        
   

