package dontdie;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Strawhatsheik
 */
public class Jungle extends State implements ActionListener {
    
     //Variables
    public String boardTitlePA, boardTitleSA, boardTitleJA, playerName, mainString; //These will depend on  users choice?
   Button jb1 = new Button((new ImageIcon(("Resources/Jungle_Adv/gem.png"))));
   Button jb2 = new Button((new ImageIcon(("Resources/Jungle_Adv/gem.png"))));
   Button jb3 = new Button((new ImageIcon(("Resources/Jungle_Adv/gem.png"))));
   Button jb2half = new Button((new ImageIcon(("Resources/Jungle_Adv/gem.png"))));
   Button jb4 = new Button((new ImageIcon(("Resources/Jungle_Adv/gem.png"))));
  Button giantWin = new Button((new ImageIcon(("Resources/Jungle_Adv/finished.jpg"))));
   JLabel playerPic = new JLabel(new ImageIcon(("Resources/Jungle_Adv/safari.png")));
    //TEST
    //Initialize a timer
    //Start timer below in constructor
    //This is the method to run when the timer runs
   Timer tm;
    
      //Initialize the player character
   Adventurer adventurer = new Adventurer("Starter");
   
   //Initializes the scenarios for use on this board   
  //Scenario level1;
  Scenario level1 = new Scenario("Level One");
  //Level 2
  Scenario level2 = new Scenario("Level Two");
  //Level 3
  Scenario level3 = new Scenario("Level Three");
  //Level 3.5
  Scenario level2half = new Scenario("Level two and a half");
  Scenario level4= new Scenario("Level Four");


      //Construct the board
    public Jungle() {
        
        super("A Jungle Adventure!");
       
        this.tm = new Timer(10, this);
       
        //retrieve player input for their adventurer's name
       adventurer.setName(JOptionPane.showInputDialog("What is your name brave adventurer? "));
          //set the entered name
      playerName = adventurer.getName();
   //prepare string for main event. Only needs to be done here to add player name
          mainString =("You are ")+ playerName +(", and it's been three long months on this expedition- you’re a bit new to the business of exploring and treasure hunting, and it hasn’t been easy. But you’ve hit it big! You just know this find will let your career as an explore take off! As you clutch the gold amulet, orange-gold light glimmers in the large piece of amber embedded in it. It almost seems magical…\"\n" +
"  + \"But there’s no time to waste just staring at it! You’ve got to get out of this temple and head home, it will do you no good if you never bring back your discovery. Though this place is awful old… You feel compelled to just run out from sheer excitement, but keeping that in mind, maybe you should be careful… \n" );
      tm.start();
       //Prepares the starting scenario for use on this board  
    //The text for the main event
   level1.setMainEvent(mainString);
   //The text for the buttons in level
   level1.setGoodChoice("Take your time.");
   level1.setBadChoice("Run ahead!");
   //The text for the consequences that will be displayed:
   level1.setGoodChoiceConsequence("Well, you’ve rushed to get here. Why not take a bit of time on the way out? Being cautious never hurt, plus, this place is kinda pretty… Creepy, but pretty. Might as well admire it while you can! And.. Yikes! Look out for that boulder! Good thing you slowed down, it might’ve just hit you.") ;
   level1.setBadChoiceConsequence("Bah, who needs to slow down? You’ve got the treasure, you might as well rush home for the big cash prize and fame! You can see things later, once you’re going all over the world, after all. But what was that noise..? As you can hear your footsteps echo, a rumbling joins the unnerving chorus- and before you can react, a rock has fallen and taken you down with it. Drat, and you almost had all that fame and fortune!");  
 
   //The paths to the pictures
   level1.setPicPathMain("Resources/Jungle_Adv/jungle1.jpg");
    level1.setPicPathGood("Resources/Jungle_Adv/phew.jpg");
    level1.setPicPathBad("Resources/Jungle_Adv/rocktemple.jpg");
    
    //The text to be displayed on the buttons called by subInits
   level1.setGoodChoiceSub("Patience is a virtue!");
   level1.setBadChoiceSub("Suppose it would’ve been better to admire the place, and watch your head.");
 
    level1.setAPGood(false);
    level1.setAPBad(false);
    level1.setAPUgly(false);
   
    //Adds the panel which holds all components
    JPanel panel = new JPanel();
   //Sets layout to nothing so it can be custom
   panel.setLayout(null);
   
   //Sets background color
   // panel.setBackground(Color.WHITE);
   //Add the panel to the contents(content is the container for everything and is created in the super class State                                   )
   contents.add(panel);
     //instantiate a button event handler
   ButtonHandler bh = new ButtonHandler();
   
   //instantiate a button event handler
//   Space.ButtonHandler bh = new Space.ButtonHandler();
   //SHEIK!! Look for better way to do this, array????? and for l;oop???
   //Places the buttons  
   jb1.setBounds(50,275, 40, 40);
   jb2.setBounds(125,300, 40, 40);
   jb3.setBounds(200,325, 40, 40);
   jb2half.setBounds(150, 350, 40, 40);
   jb4.setBounds(275, 325, 40, 40);
 
   
   giantWin.setBounds(0, 0, 800, 800);
  
          
   panel.add(jb1);
   jb1.setEnabled(true);
   panel.add(jb2);
   jb2.setEnabled(false);
   panel.add(jb3);
   jb3.setEnabled(false);
   panel.add(jb2half);
   jb2half.setEnabled(false);
   panel.add(jb4);
   jb4.setEnabled(false);
   
 
   panel.add(giantWin);

   
   giantWin.setEnabled(false);
   giantWin.setVisible(false);
    
   jb1.addActionListener(bh);
   jb2.addActionListener(bh);
   jb3.addActionListener(bh);
   jb2half.addActionListener(bh);
   jb4.addActionListener(bh);
  giantWin.addActionListener(bh);
   
   
    panel.add(playerPic);  
    
     //background picture
    JLabel pictureJungleBackground = new JLabel(new ImageIcon(("Resources/Jungle_Adv/JUNGLE2.jpg")));
    pictureJungleBackground.setBounds(0, 0, 800, 800);
    panel.add(pictureJungleBackground);
   
      //Make everything visible  
    setVisible(true);//Makes visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     {
   //int x = adventurer.getxCo();
   //int y = adventurer.getyCo();
   playerPic.setBounds(adventurer.getyCo(), adventurer.getxCo(), 75,75);
   
   //Decides what the player icon should look like
   
   
   
   //Finds which button is enabled and sets player icon above it
   if (jb1.isEnabled())
   {adventurer.setyCo(30);
    adventurer.setxCo(212);
   }
   if (jb2.isEnabled())
   {adventurer.setyCo(105);
    adventurer.setxCo(237);
   }
 
   if (jb3.isEnabled())
   {adventurer.setyCo(180);
    adventurer.setxCo(262);
   }
   if (jb2half.isEnabled())
   {adventurer.setyCo(140);
    adventurer.setxCo(287);
   }
   if (jb4.isEnabled())
   {adventurer.setyCo(255);
    adventurer.setxCo(262);
   }
   
    
  
     //Checks status of players choices in level 2 and enables the 
      //nextlevel accordingly
      if (jb2.isEnabled() == true)
      {if (level2.getAPUgly() == true)
      {jb2half.setEnabled(true);
      jb2.setEnabled(false);}
      else if (level2.getAPGood() == true)
      {jb3.setEnabled(true);}
      }// jb2.setEnabled(false);}
       }
}

  
    
      
   private class ButtonHandler implements ActionListener{

        

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jb1 )
            {   //Initialize and start the first level
                level1.init();
             //Make this level no longer accessable   
             jb1.setEnabled(false);
             //Make the next level accessable
             jb2.setEnabled(true);
            }//End level one
            
            //Level 2
            //You 
            else if (e.getSource() == jb2 )
            {
//The text for the main event
   level2.setMainEvent("Well, you made it out of the temple.. But now what? You have been in this jungle for ages, and it all looks the same… You did bring a map along, but it wasn’t like this several thousand year old temple was on said map- so you lacked a reference. But maybe if you could find a landmark of some sort the map would be useful again. For there to be life, there MUST be water- and rivers were pretty big. Maybe you could find one of those? But you swear you remember there being a large rock formation on the map too…");  
   //The text for the buttons in level
   level2.setGoodChoice("Look for the rock formation.");
   level2.setUglyChoice("Look for the river.");
   //The text for the consequences that will be displayed:
   level2.setGoodChoiceConsequence("May as well look for that rock now, that was on your map too, and anything’s worth a shot.") ;
   level2.setUglyChoiceConsequence("It’s pretty hot in the jungle.. Eh, why not go find the river? Those are easier to find, and you can cool off. So off you go, listening for water, moving through the thick underbrush…");  
 
   //The paths to the pictures
   level2.setPicPathMain("Resources/Jungle_Adv/map.jpg");
    level2.setPicPathGood("Resources/Jungle_Adv/walking.jpg");
    level2.setPicPathUgly("Resources/Jungle_Adv/walking.jpg");
    
    //The text to be displayed on the buttons called by subInits
   level2.setGoodChoiceSub("Onwards!");
   level2.setUglyChoiceSub("You seem close...");
    
    //Initialize the level
    level2.init();
    //Enable button for next level
  //jb2.setEnabled(true);
//Make this level no longer accessable   
   // jb2.setEnabled(false);
            
            }//end level 2
             //Level two and a half, only activated if the player heads for water
        else if (e.getSource() == jb2half )
        {//The text for the main event
   level2half.setMainEvent("After what feels like hours, you find the river! The lifeblood of the land! You drink and wash off your face, relieved- but as the sun sets, you see a glimmer of something under the surface of the water. It’s kinda deep, but you COULD try to grab it- maybe it’s more treasure? How great would that be, to bring back two treasures?");  
   //The text for the buttons in level
   level2half.setGoodChoice("Leave it and rest for the night.");
   level2half.setBadChoice("Try to get the object!");
   //The text for the consequences that will be displayed:
   level2half.setGoodChoiceConsequence("You feel so tired from your long hike, though… And you don’t want wet clothes to sleep in. Best to rest, and tomorrow you can try to find where you are…") ;
   level2half.setBadChoiceConsequence("It’s so shiny, and the light is fading fast! You gotta just jump in and get it! Your hands clasp around it, and you raise it out of the water… To find you have no idea what it actually is, aside from being a shiny rock- and did something just brush up against your leg..? No, it’s no animal or object that’s pulling on you! It’s an undercurrent!");  
 
   //The paths to the pictures
   level2half.setPicPathMain("Resources/Jungle_Adv/shiny.jpg");
    level2half.setPicPathGood("Resources/Jungle_Adv/sleep.jpg");
    level2half.setPicPathBad("Resources/Jungle_Adv/hatriver.jpg");
    
    //The text to be displayed on the buttons called by subInits
   level2half.setGoodChoiceSub("Sweet dreams, adventurer.");
   level2half.setBadChoiceSub("And all for a rock… WATER way to go!");
 
   //Initialize the level
   level2half.init();
   //Enable button for next level
   jb3.setEnabled(true);
//Make this level no longer accessable   
   jb2half.setEnabled(false);
            
        }
        
            //Level three
        else if (e.getSource() == jb3 )
        {  //The text for the main event
   level3.setMainEvent("So you trek through the jungle, carrying on and on in the blistering heat. You feel so tired of just seeing endless trees as far as the eye can see! … But what’s that little speck of orange and pink? A flower?");  
   //The text for the buttons in level
   level3.setGoodChoice("Ignore the flower and carry on.");
   level3.setBadChoice("Investigate the flower.");
   //The text for the consequences that will be displayed:
   level3.setGoodChoiceConsequence("It’s beautiful, but it’s not like it’s the only flower you’ve seen around here. You decide to leave it be, and keep walking. If you stay to look at flowers, who knows what sort of jungle predator may come after you… Best to get out of here and admire some flowers in the safety of your own home! So on you trek, for at least what feels like another hour- but you find the rock at last! You struggle to climb on top of it, and look out at the jungle around you…" +

"Honestly it still looks the same, but you’re higher up. At least you can better see the sky through the canopy now… And the sun is a bit further in the sky, heading slowly to the horizon. Maybe you can use that to tell your direction! You pull out your map- from the rock, you need to go north-west to get back to the main headquarters of the adventurer’s guild in this area. The sun sets in the west, so.. Just go a little to your left, but mostly straight from where you are! Simple enough, right?") ;
   level3.setBadChoiceConsequence("You have seen a lot of flowers in general over your three months here, but this one is particularly beautiful… You decide to walk right up and try to pick it, take it with you- but it’s attached to a thick vine you can’t seem to get it off of. Then the vine starts moving, pulling away from you! You look up to see what it could possibly be attached to that’s moving, and all you see is a flash of green teeth as a horrifically massive carnivorous plant decides you’d be a good lunch.");  
 
   //The paths to the pictures
   level3.setPicPathMain("Resources/Jungle_Adv/walking.jpg");
    level3.setPicPathGood("Resources/Jungle_Adv/onrock.jpg");
    level3.setPicPathBad("Resources/Jungle_Adv/planeat2.jpg");
    
    //The text to be displayed on the buttons called by subInits
   level3.setGoodChoiceSub("Carry on!");
   level3.setBadChoiceSub("Seems not all pretty things are necessarily good!");
 
   //Initialize the level
   level3.init();
   //Enable button for next level
   jb4.setEnabled(true);
//Make this level no longer accessable   
   jb3.setEnabled(false);
     
        }
        //Level four
        else if (e.getSource() == jb4 )
        {
//The text for the main event
   level4.setMainEvent("You slide off of the rock, and with a new hope found by not being so dreadfully lost, you sprint off to the north-west, trying to use the sun as reference. Eventually you have to slow to avoid over-heating, but you can just tell that you’re getting close. Though, now at the forest floor, you can’t see the sun very well… Should you keep going on the path you were before, or head more to the right to go more north..?");  
   //The text for the buttons in level
   level4.setGoodChoice("Try to go more north!");
   level4.setBadChoice("Continue on your path.");
   //The text for the consequences that will be displayed:
   level4.setGoodChoiceConsequence("Well, it was north-west, not just west. You glance at your map, and decide to go more to the right, heading north. You walk and walk, the sun begins to set… But you see lights! People walking around! You’ve done it! You get one last burst of energy, running to the guild and yelling of your discovery as you proudly hold the amulet high.") ;
   level4.setBadChoiceConsequence("You decide to follow your path still. It was just a straight line, right? So you get up and run ahead, until something catches your foot. You turn to see what it was, and the ground looks more pale and.. Sandy… As you realize you’re sinking, you question whether continuing to recklessly run without checking your map was a good idea or not.");  
 
   //The paths to the pictures
   level4.setPicPathMain("Resources/Jungle_Adv/walking.jpg");
    level4.setPicPathGood("Resources/Jungle_Adv/camp.jpg");
    level4.setPicPathBad("Resources/Jungle_Adv/quicksand.jpg");
    
    //The text to be displayed on the buttons called by subInits
   level4.setGoodChoiceSub("Well done, adventurer! You have survived!");
   level4.setBadChoiceSub("But hey, maybe you’ll be a great discovery for the next guy going down this path!");
 
   //Initialize the level
   level4.init();
   //Enable button for next level
   giantWin.setEnabled(true);
   giantWin.setVisible(true);
//Make this level no longer accessable   
   jb4.setEnabled(false);
  
   //Make all the previous buttons invisible and inactive
     
   jb1.setEnabled(false);
 jb1.setVisible(false);
   jb2.setEnabled(false);
 jb2.setVisible(false);
   jb2half.setEnabled(false);
 jb2half.setVisible(false);
   jb3.setEnabled(false);
 jb3.setVisible(false);;
   jb4.setEnabled(false);
 jb4.setVisible(false);  
        }//end level 4
            
            //The giantwin button
             //When the user reaches the end!!!!!!
            else if (e.getSource() == giantWin)
            {System.out.println("clicked");
                JFrame credits = new JFrame();
           //Adds a panel
           JPanel panel = new JPanel();
            //Sets layout to nothing so it can be custom
    credits.add(panel);
            panel.setLayout(null);
    //Sets background color
    panel.setBackground(Color.WHITE);
    credits.setSize(800,800);//sets size(in pixels)
    setVisible(true);//Makes visible
    setResizable(true);//Allows user to resize
    credits.setLocationRelativeTo(null);//Starts window in center of screen
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel jMainPic;
    //Add the main event picture space 
     jMainPic = new JLabel(new ImageIcon(("Resources/Main_Menu/us.jpg")));
    jMainPic.setBounds(200, 0, 400, 400);
    panel.add(jMainPic);
    
    
   //Add the main event story space
  JTextArea textArea;
 JScrollPane areaScrollPane ;
textArea = new JTextArea("Thank you for playing our game!\n" +
"We hope you had a fun time! If you haven’t already, try replaying it with different choices. Even the times you die should be funny! Also try our other scenarios!!!\n" +
"Thank you and see you in the future!!\n" +
"From left to right:\n" +
"Stephanie Bohland – Author of “Space Adventure” and “Pirate Adventure!”\n" +
"Devin Mize – Artist of all game art!\n" +
"Lexy Bohland – Author of “Jungle Adventure!”\n" +
"Megan Bohland - Game designer and coder!\n" +
"In Front – Ricardo the reindeer – Imaginary friend extraordinaire!! "); 
textArea.setFont(new Font("Kristen ITC", Font.PLAIN , 22));
textArea.setLineWrap(true);
textArea.setWrapStyleWord(true);
 
//Adds it to scrollbaer
areaScrollPane = new JScrollPane(textArea);

areaScrollPane.setBounds(100, 405, 600, 225);
panel.add(areaScrollPane);

     credits.setVisible(true);//Makes visible
    
  
            
            }
        
        
        }
        
        
        
        
        }
        
        
        }
        
        

