/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dontdie;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Timer;

/**
 *
 * @author Strawhatsheik
 */
public class Space extends State implements ActionListener{
    
    
    //Variables

    /**
     *
     */
    public String boardTitlePA, boardTitleSA, boardTitleJA; //These will depend on  users choice?
     // If for statements dont work here, maybe make an array of buttons nd setup array in constructor? 
        //for(int i=1;i<=10;i++){  
       // System.out.println(i);  
       // }  
   Button sb1 = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb2 = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb3 = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb3half = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb4 = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb5 = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb5half = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb6 = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb7 = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb7win = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb8lab = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb8 = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb9lab = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb9 = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb10 = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button sb11win = new Button((new ImageIcon(("Resources/Space_Adv/Image.png"))));
   Button giantWin = new Button((new ImageIcon(("Resources/Space_Adv/Happy.jpg"))));   
   
   
   JLabel playerPic = new JLabel(new ImageIcon(("Resources/Space_Adv/player.png")));
   
   //TEST
   //Initialize a timer
   Timer tm = new Timer(1, this);
   //Start timer below in constructor
   //This is the method to run when the timer runs
   
    @Override
   public void actionPerformed(ActionEvent e)
   {
   //int x = adventurer.getxCo();
   //int y = adventurer.getyCo();
   playerPic.setBounds(adventurer.getyCo(), adventurer.getxCo(), 75,75);
   
   //Decides what the player icon should look like
   if(adventurer.getEyeStatus() == false)
   {playerPic.setIcon(new ImageIcon(("Resources/Space_Adv/playernoeye.png")));
   }
   else if(adventurer.getLegStatus() == false)
   {playerPic.setIcon(new ImageIcon(("Resources/Space_Adv/playernoleg.png")));
   }
   else //Player is whole
   {playerPic.setIcon(new ImageIcon(("Resources/Space_Adv/player.png")));
   }
   
   
   //Finds which button is enabled and sets player icon above it
   if (sb1.isEnabled())
   {adventurer.setyCo(30);
    adventurer.setxCo(212);
   }
   if (sb2.isEnabled())
   {adventurer.setyCo(105);
    adventurer.setxCo(237);
   }
   if (sb3.isEnabled())
   {adventurer.setyCo(180);
    adventurer.setxCo(262);
   }
   if (sb3half.isEnabled())
   {adventurer.setyCo(220);
    adventurer.setxCo(287);
   }
   if (sb4.isEnabled())
   {adventurer.setyCo(255);
    adventurer.setxCo(262);
   }
   if (sb5.isEnabled())
   {adventurer.setyCo(330);
    adventurer.setxCo(287);
   }
   if (sb5half.isEnabled())
   {adventurer.setyCo(330);
    adventurer.setxCo(337);
   }
   if (sb6.isEnabled())
   {adventurer.setyCo(430);
    adventurer.setxCo(312);
   }
    if (sb7.isEnabled())
   {adventurer.setyCo(510);
    adventurer.setxCo(287);
   }
     if (sb7win.isEnabled())
   {adventurer.setyCo(430);
    adventurer.setxCo(187);
   }
    if (sb8lab.isEnabled())
   {adventurer.setyCo(580);
    adventurer.setxCo(262);
   }
      if (sb8.isEnabled())
   {adventurer.setyCo(510);
    adventurer.setxCo(362);
   }
       if (sb9lab.isEnabled())
   {adventurer.setyCo(625);
    adventurer.setxCo(297);
   }
    if (sb9.isEnabled())
   {adventurer.setyCo(510);
    adventurer.setxCo(437);
   }
   
      if (sb10.isEnabled())
   {adventurer.setyCo(580);
    adventurer.setxCo(467);
   }
       if (sb11win.isEnabled())
   {adventurer.setyCo(630);
    adventurer.setxCo(467);
   } 
      //Checks status of players choices in level 7 and enables the 
      //nextlevel accordingly
      if (sb7.isEnabled() == true)
      {if (level7.getAPUgly() == true)
      {sb8lab.setEnabled(true);
      sb7.setEnabled(false);}
      else if (level7.getAPGood() == true)
      {sb8.setEnabled(true);
      sb7.setEnabled(false);}
      }
      
       //Checks status of players choices in level 8lab and enables the 
      //nextlevel accordingly
      if (sb8lab.isEnabled() == true)
      {if (level8lab.getAPUgly() == true && adventurer.getLegStatus() == true)
      {sb9lab.setEnabled(true);
       sb8lab.setEnabled(false);}
      else if (level8lab.getAPGood() == true)
      {sb8.setEnabled(true);
       sb8lab.setEnabled(false);}
      }
   
   if (level1.getAPBad() == true)
   {this.dispose();}
   
   }
   
   //Initialize the player character
   Adventurer adventurer = new Adventurer("Jim");
   
   //Initializes the scenarios for use on this board   
  //Scenario level1;
  Scenario level1 = new Scenario("Level One");
  //Level 2
  Scenario level2 = new Scenario("Level Two");
  //Level 3
  Scenario level3 = new Scenario("Level Three");
  //Level 3.5
  Scenario level3half = new Scenario("Level three and a half");
  Scenario level4= new Scenario("Level Four");
  Scenario level5 = new Scenario("Level Five");
  Scenario level5half = new Scenario("Level five and a half!");
  Scenario level6 = new Scenario("Level Six"); 
  Scenario level7win = new Scenario("Level Seven");
  Scenario level7 = new Scenario("In the labyrinth ");
  Scenario level8lab = new Scenario("In the labyrinth ");
  Scenario level9lab = new Scenario("In the labyrinth ");
  Scenario level8 = new Scenario("Level Eight");
  Scenario level9 = new Scenario("Level Nine");
  Scenario level10 = new Scenario("Level Ten");
  Scenario level11 = new Scenario("Level 11"); 

    //Construct the board
    public Space() {
        super("A Space Adventure!");
        tm.start();
       //Prepares the starting scenario for use on this board  
     level1.setMainEvent("You are _________, and you have just been abducted by aliens. You are sitting naked in your holding cell, cow tag hanging from your very sore ear. Yes, they have stolen you, a hapless college student, from your campus and are now keeping you here in their laboratories with hundreds of other creatures. Unfortunately for you, this doesn’t seem to be a friendly capture-and-release program; in fact you aren’t entirely sure these huge, many armed spacelings are scientifically inclined. You’ve seen what happens to their samples once their data is gathered…a large silver hatch that appears to reveal a long, dark chute. Your only chance is one of the small vessels you saw when they first sprayed you for germs and processed you; small crafts for the crew in the case of emergency…or for terrified kidnapped humans in case of an emergency. You have to steal an escape pod.\n" +
    "To do that though, you’ll have to escape your cell, get past the scientists, get out of their lab, get past all the crew mates, and then figure out how to pilot an alien craft back to your home planet….and, side note, you’re still naked. \n" +
    "\n" + "You won’t get much time to plan your escape either. It’s morning, or what you suppose passes as morning, because this is when their shifts start. Two large purple creatures enter covered in their normal, giant suits, and today they’re coming for you. It’s your cage they approach, you’re information they appear to be reading on their glowing pads. The larger of the two begins typing on the wall and the door to your cell is open. He reaches in and wraps a firm grip around your arm. What do you do?");
    //The text for the buttons in level 1
    level1.setGoodChoice("Stay calm, and leave your cell with them.");
    level1.setUglyChoice("Panic! Panic! Panic! Paaaniiiccc!");
    level1.setBadChoice("Pretend to comply, then make a mad break for the door!");
    //The text for the consequences that will be displayed:
    level1.setGoodChoiceConsequence("You’re terrified, but you keep it in. You step out of your cell with the aliens and let them usher you across the room to a tall white examination table......") ;
    level1.setBadChoiceConsequence("You take one step out of your cell and onto the cold linoleum floor, then whirl on the alien. With a quick jab you dart under his raised arm, and give him a good jab in the armpit (or at least….what you consider an armpit…do these guys even have armpits? No time! Escape!!) In his surprise he lets you go and you turn on your naked heels and take off. You bolt for the door, tearing across the laboratory in terror, but unfortunately your escape is ill-planned and ill fated.\n" +
    "	You hear unintelligible shouting then the frantic sounds of the scientists behind you. One is shouting into his communicator and the other is pulling something from a box of their things. You get as far as the door, with this mad, impromptu escape plan of yours…but that is it. You don’t look back, you’re busy getting the door open, so you don’t see the wave of electricity until it hits you and you fall to the ground. As you flop on the floor and shout the door you were fighting with slides open. You push yourself up to see a squadron of armed creatures. It seems the aliens are a little more coordinated than you were. \n" +
    "They shoot you about eight billion times….then, because your singed body twitched a bit, an overcautious new recruit fires another round. There’s always that new guy. ");
    level1.setUglyChoiceConsequence("Your door is closed, and though you do not understand their rapid speech, you get the feeling that maaaybe they aren’t thrilled with you. The two scientists leave your pen…but return with tranquilizer.  You see no reason to calm down now, and start running back and forth in your cell, pounding from wall to wall screaming. You hear your door open again and you’re tackled. You’re face first on the ground when you feel the prick. You’re heavily sedated, and as the world starts to swirl and go black you remember going for a root canal on earth….It was a similar experience actually.\n" +
    "\nYou wake up later. You don’t know how much later, but you are sans a foot. No, no that isn’t a cruel joke. As you look down you see only a cauterized little stub. Aw crap. Either their experiment that day required lopping off a piece of your body, or they weren’t thrilled with your resistance, either way it seems you’ve complicated your escape");
    //The paths to the pictures for level 1
    level1.setPicPathMain("Resources/Space_Adv/incell.jpg");
    level1.setPicPathGood("Resources/Space_Adv_Adv/table.jpg");
    level1.setPicPathBad("Resources/Space_Adv/roasted.jpg");
    level1.setPicPathUgly("Resources/Space_Adv/tablenoleg.jpg");
    //The text that will be displayed on the buttons in the subscenarios
    level1.setGoodChoiceSub("You lived! For now....");
    level1.setBadChoiceSub("Alas! Poor stick guy! I knew him well!");
    level1.setUglyChoiceSub("Ouch! That left you with no leg to stand on...");
    //STILL NEEDED SHEIK????
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
   //SHEIK!! Look for better way to do this, array????? and for l;oop???
   //Places the buttons  
   sb1.setBounds(50,275, 40, 40);
   sb2.setBounds(125,300, 40, 40);
   sb3.setBounds(200,325, 40, 40);
   sb3half.setBounds(240, 350, 40, 40);
   sb4.setBounds(275, 325, 40, 40);
   sb5.setBounds(350,350, 40, 40);
   sb5half.setBounds(400,400, 40, 40);
   sb6.setBounds(450,350, 40, 40);
   sb7.setBounds(530,350, 40, 40);
   sb7win.setBounds(450,250, 40, 40);
   sb8lab.setBounds(600,325, 40, 40);
   sb8.setBounds(530,425, 40, 40);
   sb9lab.setBounds(645,360, 40, 40);
   sb9.setBounds(530,500, 40, 40);
   sb10.setBounds(600,530, 40, 40);
 sb11win.setBounds(675, 530, 40, 40);
   giantWin.setBounds(0, 0, 800, 800);
  
          
   panel.add(sb1);
   sb1.setEnabled(true);
   panel.add(sb2);
   sb2.setEnabled(false);
   panel.add(sb3);
   sb3.setEnabled(false);
   panel.add(sb3half);
   sb3half.setEnabled(false);
   panel.add(sb4);
   sb4.setEnabled(false);
   panel.add(sb5);
   sb5.setEnabled(false);
   panel.add(sb5half);
   sb5half.setEnabled(false);
   panel.add(sb6);
   sb6.setEnabled(false);
   panel.add(sb7);
   sb7.setEnabled(false);
   panel.add(sb7win);
   sb7win.setEnabled(false);
   panel.add(sb8lab);
   sb8lab.setEnabled(false);
   panel.add(sb8);
   sb8.setEnabled(false);
   panel.add(sb9lab);
   sb9lab.setEnabled(false);
   panel.add(sb9);
   sb9.setEnabled(false);
   panel.add(sb10);
  sb10.setEnabled(false);
   panel.add(sb11win);
  sb11win.setEnabled(false);
   panel.add(giantWin);

   
   giantWin.setEnabled(false);
   giantWin.setVisible(false);
   
    sb1.addActionListener(bh);
   sb2.addActionListener(bh);
   sb3.addActionListener(bh);
   sb3half.addActionListener(bh);
   sb4.addActionListener(bh);
   sb5.addActionListener(bh);
   sb5half.addActionListener(bh);
   sb6.addActionListener(bh);
   sb7.addActionListener(bh);
   sb7win.addActionListener(bh);
   sb8lab.addActionListener(bh);
   sb8.addActionListener(bh);
   sb9lab.addActionListener(bh);
   sb9.addActionListener(bh);
   sb10.addActionListener(bh);
   sb11win.addActionListener(bh);
 giantWin.addActionListener(bh);
 
    panel.add(playerPic);  
    
     //background picture
    JLabel pictureSpaceBackground = new JLabel(new ImageIcon(("Resources/Space_Adv/SPACE2.jpg")));
    pictureSpaceBackground.setBounds(0, 0, 800, 800);
    panel.add(pictureSpaceBackground);
   
      //Make everything visible  
    setVisible(true);//Makes visible
    }

   
    
    private class ButtonHandler implements ActionListener{

        

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == sb1 )
            { 
                
                //Initialize and start the first level
                level1.init();
             //Make this level no longer accessable   
             sb1.setEnabled(false);
             //ake the next level accessable
             sb2.setEnabled(true);
            }//End level one
            
            //Level two
            else if (e.getSource() == sb2)
            {
                //If the adventurer chose the 'ugly' path in the last level set his leg to false
                if (level1.getAPUgly() == true)
                {   //Sets the characters leg to false
                    adventurer.setLegFalse();}
             
                //Prepare level 2
                //If the adventurer did NOT lose his leg
                if (adventurer.getLegStatus() == true)
                { //Text for main event
                    level2.setMainEvent("You’re terrified, but you keep it in. You step out of your cell with the aliens and let them usher you across the room to a tall white examination table. They scan you, poke you, scribble some things down, then together hoist you up onto the table. \n" +
                    "It’s ok, you think, they’re scientists….they just want to study me. 	Or they’re serial killers about to murder you. Either way, you are rather inclined to leave. Problem is a butt-naked human all alone in a room full of bigger, stronger, possibly insanely powerful aliens….well that naked human doesn’t have crazy good chances. So the question is, how the living daylights are you going to get yourself out of this mess? You need to do more than get out of this room; you need to get off of this ship. You need to get back to your own planet. Intergalactic space travel…no problem.  You don’t recognize any of their strange devices, or the tests they run on you, and you are really starting to panic. What are they going to do to you? You’re trying to stay calm, but they are pulling heavy clamped restraints out of their drawers….they’re planning to strap you down….\n" +
                    "The alien doctors put the straps on the tray beside you, but they don’t use them yet. Strange items are passed over you, one begins scanning you, another poking you. So far it’s all ok, nothing too abrasive, they just seem to be measuring your vital signs. Then one leans in, and it’s holding out a strange object. It’s long and silver and he is bringing it towards your face. What do you do?");
               //The text for the buttons in level 2
                level2.setGoodChoice("Stay calm and look for a moment to escape");
                level2.setUglyChoice("Slap the device away");
                level2.setBadChoice("Bite the alien’s arm. Fight!!! Fiiiiiiiiiiight!)");
                //The text for the consequences in level 2
                level2.setGoodChoiceConsequence("This is bad, this is really bad, and you are veeeeeery tempted to panic, but you don’t, you take a shaky breath and you think. ");
                level2.setBadChoiceConsequence("Oh no, this isn’t going down. You’ve seen how this crap goes. Strapped down to a gurney being heinously experimented on by alien sadists. Not you. With a loud, resounding ‘snap!’ you latch onto the aliens long, discolored arm, biting with all your might. He gasps in surprise and tries to jerk away, but you come with him. Teeth still attached with a vice grip you jerk up and leap off the table, only releasing his arm to start swinging punches. His companion runs forward. You turn around and hit him too, then reach for their tray of tools and implements. You smack that dang alien with his own stupid tray as the instruments go flying. They’re both startled….but much better prepared in the long run…..\n" +
                "One scientist (or murderer, we really haven’t crossed off murdering sociopath) runs for his communicator and begins shouting into it, while the other pulls out a long black twisted cube, which turns out to serve the same function as a human tazer. Only way stronger and more painful. You scream and fall to the ground, body convulsing as the electricity courses through you. As you are electrocuted, and your vision starts to swim, you realize that while you died on your own terms….you are dying….shoot.");
                level2.setUglyChoiceConsequence("Your survival instincts are too strong….you don’t like strange, frightening objects being waved in your face by aliens, so sorry universe. Before you can think your hand lashes out and you strike the startled alien’s weird, bulbous hand. His eyes widen and he makes a surprised noise, but your sudden movement and the way your body jerked….well he missed and shoved the wand into your eye socket instead. You both scream, and then the other alien is hurriedly preparing a sedative. \n" +
                "	You wake up on the table with a large gauze bandage over half of your head. Crap. Now you’re butt-naked and missing an eye.");
              //The text to be displayed on the buttons called by subInits
            level2.setGoodChoiceSub("Stay calm! It will be alright! Won't it! Continue on!");
            level2.setBadChoiceSub("It seems you have met a rather SHOCKING end!");
            level2.setUglyChoiceSub("EYE don't think that was the best choice...But at least you're alive! Onward!");  
             //The paths to the pictures
            level2.setPicPathMain("Resources/Space_Adv_Adv/table.jpg");
            level2.setPicPathGood("Resources/Space_Adv_Adv/table.jpg");
            level2.setPicPathBad("Resources/Space_Adv/roasted.jpg");
            level2.setPicPathUgly("Resources/Space_Adv/tablenoeye.jpg");
            
            //Initialize level two
              level2.init();
              
              //Make this level no longer accessable   
             sb2.setEnabled(false);
             //Make the next level accessable
             sb3.setEnabled(true);
            
                }
            //If the adventurer lost his leg in level 1  
           if(adventurer.getLegStatus() == false)
                {//Text for main event
                 level2.setMainEvent("It seems their sick foot experiment is not all they want with you. Time passes. You don’t know how much, but you think it may be a day or two. Either way, those crazy things come back for you. They come in for the day, and this time, they are less trusting. They approach your cell this morning with a team of four, and ropes. It hasn’t been long, and your cell is small and doesn’t allow for a lot of walking practice, so when you rise defensively it is unsteadily. You hurry away from the door and eye them warily, your back against the wall. Two step forward, and each grabs one of your arms. \n" +
                "	You’re hoisted roughly to your feet, er, foot, and forcefully removed from your cell. Your heart is pounding as you are dragged over to their workstation, and lifted onto a large table underneath a blaringly white light. You’re laid down, and as two hold your arms, a third steps forward, holding the rope. You’ve only got one foot to restrain, but that doesn’t stop them. Your foot is tied, but curiously, they leave your arms. You don’t know what’s going to happen…..but you really only see two choices.");
                //The text for the buttons in level two
                level2.setBadChoice("Give up the ghost and scream your freaking head off. Who knows what they’ll cut off next?!!)");
                level2.setGoodChoice("Stay calm!");
                //The text for the consequences in level 2
                level2.setGoodChoiceConsequence("You take a shaky breath and jerk your leg to test. The rope is tight, you’re not slipping out of it and you sure as heck aren’t breaking it. They’re eyeing you and their grips are tense, so you relax. You relax as much as you can and sag back into the table. After a few moments of this they seem to relax a little too, although they’ve still got two holding your arms down. Then the tools come out.... ");
                level2.setBadChoiceConsequence("You jerk against the rope, you madly struggle to try to free your arms, opening your mouth to let out the first of many, many, many screams. You let your deafening screech fill the air as you flail and fight. You get one arm jerked free and are able to land a good, nasty punch on the alien restraining you before the others are on you. You feel a prick and the world starts getting dark again…..You’re terrified, wondering what they’ll do to you this time when you are asleep…..except you never wake up.\n" +
                "Oh crap, they killed you!!!! ");
  
                //The text to be displayed on the buttons called by subInits
              level2.setGoodChoiceSub("Stay calm! It will be alright! Won't it! Continue on!");
              level2.setBadChoiceSub("...go play a happier game...");
         
                 //The path to the pictures 
                  level2.setPicPathMain("Resources/Space_Adv/tablenoleg.jpg");
                  level2.setPicPathGood("Resources/Space_Adv/tablenoleg.jpg");
                  level2.setPicPathBad("Resources/Space_Adv/sleep.jpg");
                // level2.setPicPathUgly("/table.jpg");
                level2.setAPGood(false);
                level2.setAPBad(false);
                level2.setAPUgly(false);
                //Initialize level two    
                level2.init();}
             //Make this level no longer accessable   
             sb2.setEnabled(false);
             //ake the next level accessable
             sb3.setEnabled(true);   
            }//End level two
            
            
            //Level three
            else if (e.getSource() == sb3)
                //The first thing the program will do is check if the user selected an 
                //'ugly' path in level 2. There is only one 'ugly' path in that level
                //It causes the adventurer to lose in eye. Eye will be set to false if path was chosen
            {if (level2.getAPUgly() == true)
                {adventurer.setEyeFalse();}
                
                //Prepare level three
                //If the adventurer has lost a leg
                 if (adventurer.getLegStatus() == false)
                {
                //Text for main event
                level3.setMainEvent("You are trembling, watching intensely as they start passing around strange, terrifying objects. They’re all utterly foreign to you, but you know what you’re looking for. You wait, breathing and trembling, staying calm as you watch long, heinous instrument being passed over you. \n" +
                "Then you see it. You have no clue what it is, or what the heck they’re planning to use it for, but it’s got a sharp edge. The monster on your right relinquishes your arm for half a second to reach for the black tool, but you’re faster. You fling a fist into the creature and it gives a startled jerk as you snatch the device from the other. Is it strong or sharp enough to cut the rope restraining you? You aren’t sure, but it’s sharp enough to cut them. Your fingers tighten around the strange tool and replace the punch with a stab. The alien cries out as you pull your weapon back with a spray of strange colored, sweet smelling blood. The other holding you shouts but you’ve dug the knife into his tentacle and pushed yourself up before he can react. He draws back in pain and gives you the precious second you need to slash the rope and free your leg. \n" +
                "You fling yourself from the table in time to hear a ‘whir!’ and there is a burning hole on the surface you had been. It seems the other scientists are armed. You gasp and dive away from another shot, then stab the alien bleeding on the ground in the neck. Now there’s only three but you’re still outnumbered. What you need is….You whirl around and leap again to dodge another shot from their lazer guns and hide behind their sensor computer. The one who’s tentacle you’ve stabbed is trying to call for help, he’s running for the communicator. \n" +
                "Before you, splattered with blood, is a blaster dropped by the dead alien. You might reach it, but it requires you leaving your modest cover. Meanwhile, you’ve got someone about to call for help. What do you do?");
                //Text for the butttons
                level3.setGoodChoice("Go after the squealer!");
                level3.setBadChoice("Get the gun!!!");
                //The text for the consequences in level 3
                level3.setGoodChoiceConsequence("Reinforcements are NOT what you want. You make a mad dash from behind the console and leap through the air, tackling the alien from behind and bringing it crashing to the floor. You stab him frantically a few times in the back of the neck, then roll off and run as the others open fire. Luckily, they shoot the other alien a few times too in their attempt to reach you, which you take as grateful confirmation that he is dead now. Unfortunately, no amount of leaping protects you this time and they also sink a wicked good blow to your arm. \n" +
                "You shout as the burning sensation cuts through your adrenaline, then you grab the newly dead alien’s pistol from his body. It’s not talent that saves you, not really, it’s more like luck. You turn and fire with your good arm, and you miss. You hit instead a large turbine behind the aliens, and it turns out it’s flammable. The explosion isn’t huge, it doesn’t blow a hole in the ship luckily, but it knocks the three of you off your feet. You’re thrown back into the wall, hitting your already hurt arm against a computer console and then you flop pathetically to the floor to the sound of shattering glass. \n" +
                "It takes you a moment, laying in pain and confusion to push yourself up, gasping as the pain starts setting in and you realize your arm, now shot with a lazer and full of glass shards, is pretty useless. You look shakily around and see only smoke and smoking computers. You don’t know what happened to the other two aliens, but you haven’t got time to find out. You roll onto your knees, wincing again as your arm throbs, the push yourself to your feet, er, foot, and shakily begin towards the exit. That was loud….you don’t have a lot of time. \n" +
                "Cradling your arm and hobbling you get to the door, then weakly push the panel, and limp through. You gather your strength and hurry out into the hallway, getting to the first shadowed corner you see and peering around it. There are two aliens walking down the corridor and they're speaking rapidly. They look a little perturbed and are heading towards the lab. They may have heard the commotion! You sigh and stay deathly still as they pass your corner, then, once they’re past you, you quietly creep out and start hurrying away. They turn the corner at the end of the hall and you turn the other way. That leads you to another corridor, and by some miracle, its empty too. It’s a long hall, and you see a turn and a closet…hmmm, perhaps a future hiding place? You gimp down the path, and then turn the corner, but with a gasp skid to a stop. You are not alone.");
                 level3.setBadChoiceConsequence("You scrabble desperately across the floor and snatch the blaster gun that the dead alien dropped. You lift it desperately, aiming for the aliens pointing guns at you but although it looks awesome….you realize you really have no clue how to use it...and they out number you. You hold it as steady as you can and pull back on the button you hope fires…..but, well, the other two aliens who DO know how the guns work have you in their sights now and open fire. \n" +
                "Hey, for what it’s worth, you probably took one out with you.");
  
                 //The text to be displayed on the buttons called by subInits
                    level3.setGoodChoiceSub("Craaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap!!!");
                 level3.setBadChoiceSub("If ONLY you hand't slept through Alien Guns 101...");
                 //The paths to the pictures
                level3.setPicPathMain("Resources/Space_Adv/tablenolegfight.jpg");
                level3.setPicPathGood("Resources/Space_Adv/hallway.jpg");
                level3.setPicPathBad("Resources/Space_Adv/shotdeadnolegRe.png");
                
                //Initialize level
                level3.init();
                
                //Make this level no longer accessable   
             sb3.setEnabled(false);
             //ake the next level accessable
             sb4.setEnabled(true);
                }
               //If the adventuerer has kept his leg AND his eye
               if (adventurer.getLegStatus() == true && adventurer.getEyeStatus() == true)
                {   //Text for main event 
                    level3.setMainEvent("You think fast. Your odds aren’t great, and your captors clearly have the advantage, but they’re distracted. They’re calm, they’re taking data, they aren’t thinking you’ll do something stupid. You are looking around quickly, assessing. You can see the door, and you’ve watched from your pen, you know there’s a keypad that opens and closes it. Further….there’s only two of them. Their underlings and fellow scientists don’t seem to be present.\n" +
                    "The strange, terrifying device is placed against your temple and you shudder, waiting for heinous pain or drilling, but it only beeps. The scientists watch you, then a small tablet they’re holding. They remove the equipment and shuffle over to their large screen and what you assume is a computer. They begin typing and talking in their strange tongue, while you take a steadying breath and your heart begins pounding.\n" +
                    "You can take them both. This is your chance, maybe your only chance! Slowly, quietly, you push yourself up and slip off the table. Their backs are both to you as you reach down and slowly, very, very slowly, your fingers wrap around a long, thin metal bar. It is long and comes to a point…a sharp point. The tall purple creature is nodding and leaning in to read something his companion is showing him, he doesn’t suspect a thing. In fact when you leap to your feet and bury the strange device in his neck, you think he may feel more shock than pain as he falls forward and orange fluid begins surging from the wound. You hear him garbling, choking, but you are already grabbing the thick, metal tray of instruments on their table and beating the other alien with it. The first blow is across the face, then you bring it down and whap him over the top of his weird knobbly head. He falls to the ground and you seize the back of his head. Unleashing some inner psychopath you didn’t know you had until you were abducted by aliens and being strapped to a table, you beat the creature’s face against the floor until he falls unconscious.\n" +
                    "You drop his limp body and stagger back. Your heart is pounding, your whole body is shaking but you don’t waste time. You seize your makeshift weapon and wrench it free from the dead alien, then haul your naked butt AWAY from the alien bodies. You run across the room and frantically open the panel on the wall. With a deep breath you think, and you remember. You’ve watched carefully, you know what they press. The door slides open with a hydraulic hiss and you gasp happily. Darting out into the hallway you run to the first shadowed corner you see and peer around it. There are two aliens walking down the corridor but their backs are to you. So far you’ve been stealthy, you might be able to keep that up…");
                    //The text for the buttons in level two
               
                     level3.setGoodChoice("So far so good!");
              
                   //the text for the consequences in level 2
                level3.setGoodChoiceConsequence("Quietly you creep out and start hustling in the wake of the aliens. They turn the corner at the end of the hall and you turn the other way. That leads you to another corridor, and by some miracle, it's empty too. It’s a long hall, and you see a turn and a closet…hmmm, perhaps a future hiding place? You run down path, and then turn the corner, but with a gasp skid to a stop. You are not alone.");
                //The text to be displayed on the buttons called by subInits
                  level3.setGoodChoiceSub("Craaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap!!!");
   
                  //The path to the pics 
                level3.setPicPathMain("Resources/Space_Adv/fightRe.png");
                 level3.setPicPathGood("Resources/Space_Adv/hallway.jpg");
                   // level3.setPicPathBad("/roasted.jpg");
    
                   //Initialize level
                    level3.init();
                    
                    //Make this level no longer accessable   
             sb3.setEnabled(false);
             //ake the next level accessable
             sb4.setEnabled(true);
                }
                   //If adventurer has lost his eye
                  if (adventurer.getEyeStatus() == false)
                {   //Text for main event 
                    level3.setMainEvent(" You look around, which is harder now, and take a few shaky breaths. The sedatives are wearing off, you’re coming to, but you still feel foggy. Your turn your head, cautiously, and squint your eye. You see a group of aliens in the corner, with Mr. Eye-stabber in the middle of them. He is speaking rapidly, while some write quickly and others nod and speak back. After a few moments the group heads for the exit and go to leave, still very intent in their conversation…..They’ve left you alone with an alien who is watching a screen near you intently. It’s one against one….and most importantly they’ve left the door open. No one stopped at the panel that closes the heavy steel doors….You take a deep, calming breath then quickly close your eye. The alien still thinks you’re unconscious, and you’ve got to move fast while the two of you are alone. As your mind is racing, as you are planning to leap up, you hear him move. You try to steady your breath, try to act as still as it approaches you. \n" +
                    "You risk a quick peak and see him bending over your lower torso, he seems to be considering your legs. ");
                    //The text for the buttons in level two
                    level3.setBadChoice("Keep faking sleep");
                    level3.setGoodChoice("Kick him and make your move!");
            
                   //the text for the consequences in level 2
                    level3.setGoodChoiceConsequence("You glare up at the creature leaning over your legs and with a shout you bring one up. You nail him right in the face and in surprise and pain he stumbles back. You leap off the table and snatch the tray of instruments off the nearby cart. With a scream you bring the tray across his face, then raise it above your head and bring it down on top of him as well. His gurgled shout, and the ringing of metal echoing fill the room, then you kick him in the stomach as hard as you can. The alien falls down onto his bottom. You grab the heaviest looking of the assorted tools and implements you’ve scattered and brain him. You hit that alien right on his fat stupid head, and he falls back unconscious. You leave him breathing, but out cold and then you hear approaching voices. Have they heard you? Is someone coming to check? Is someone just walking by? ");
                    level3.setBadChoiceConsequence("Not yet, you decide, keeping your eyes shut and your breathing steady. Stay calm, stay calm, wait for the right moment….unfortunately, it seems that WAS your right moment. The alien goes to the console and begins typing, and after a few minutes, more come. You’re now outnumbered, and worse, whatever experiment they plan for you…..it seems they’re ready to do it. Your wrists and feet are retrained, and the table they wheel up next to your gurney is equipped with a GIANT blade.\n" +
                    "….seems they want to cut you in half….that’s no good.");
  
                //The text to be displayed on the buttons called by subInits
                    level3.setGoodChoiceSub("What's going to happen!!!!???");
                    level3.setBadChoiceSub("You got the losing HALf of that deal....");
                //The path to the pics 
                level3.setPicPathMain("Resources/Space_Adv/tablenoeye.jpg");
                level3.setPicPathGood("Resources/Space_Adv/fightnoeye_1.jpg");
                level3.setPicPathBad("Resources/Space_Adv/cutinhalfnoeyeRe.png");
                    //Initialize level    
                    level3.init();
                    //Make this level no longer accessable   
             sb3.setEnabled(false);
             //ake the next level accessable
             sb3half.setEnabled(true);}
            }//End level three
        
            //Level three and a half
                 else if (e.getSource() == sb3half)
            { //Text for the main event
             level3half.setMainEvent("It doesn’t matter, you’re not going to be here. You run for the cover of the computer consoles, and peer cautiously around the room. Whatever you’re hearing…it’s coming from the hall. You need to get out of here, and it wouldn’t hurt to do it quietly….Looking around is harder now, but you see a large wire grate on the wall. The air ducts….maybe you can get through the air ducts. You haul across the cold gleaming floor and clutch the grate, pulling frantically. It’s shut tight! How are you going to get it open? The sound is getting closer. You can’t go out the main door, and you can’t be here with an unconscious scientist if that door opens. ");
                //The text for the buttons in level two
                level3half.setBadChoice("Find the computer panel and try to open it electronically");
                level3half.setGoodChoice("Find a tool and force it open!");
          
                   //the text for the consequences in level 2
                level3half.setGoodChoiceConsequence("Heart pounding you take a step back, then whirl on the pad of your foot and dash back for the alien. You hit your knees and began rifling through the instruments strewn around. One of them has to be able…There!!! A long, thin, hard….thing….you don’t know what it is but it will work as a crowbar! The voices are now close, too close. Your heart is pounding and your breathe is erratic as you wrap your grip tightly around the grate, then forcefully jam the instrument into the other side. With all your strength you push on the handle of the tool and pull back on the grate. \n" +
                "The sound it makes is loud, too loud to your panicked ears, although it probably wasn’t heard outside the room. Frantically you fling aside the broken little door and jump into the hole in the wall. The grate starts with a fairly pronounced incline, but your naked hands and knees stick well to the metal and you are able to ascend fairly quickly. You reach the top, then take a deep, steadying breath, forcing yourself to slow down. You don’t want to pound and give yourself away. Slowly, carefully, you creep across the long, twisting tunnel, until you find yourself looking down a grate….over what appears to be an empty hallway. You wait, peering through the metal slits to the stark white passage below. Nothing.\n" +
                "You lean back, kick the grate down with both your feet, then begin to slither down. Your upper body strength isn’t ideal, and you end up letting yourself down a bit roughly, but it’s been a hard day….I mean they stabbed your eye out….Once on your feet you take off, hurrying as quickly, and as quietly as you can to the end of the hall and making a sharp turn. That leads you to another corridor, and by some miracle, its empty too. It’s a long hall, and you see a turn and a closet…hmmm, perhaps a future hiding place? You gimp down path, and then turn the corner, but with a gasp skid to a stop. You are not alone.");
                level3half.setBadChoiceConsequence("Yeah, because you know how to work that. Was it a reasonable choice? Absolutely. This ship is a technological wonder, everything here is run by computer. Would it have been more discreet? For sure, no broken evidence left behind to point any pursuers to your trail….Yeah really it was a great idea, except you can’t read their language, use their devices, or even find which of these zillion buttons could control ventilation. Is that even in this room? You don’t know!\n" +
                "So, regrettably, you find that, staring before the giant, imposing technology that your captors possess that this plan was only any good in theory. The increasingly nervous button smashing quickly leads to unexpected and undesirable consequences. Lights are flickering on and off, a siren goes off, the doors to several other pens open, but then slam back shut immediately. You then by some unlucky button choice, call another alien. The screen in front of you turns into what looks like a giant face time call and someone is giving you a confused look. The confusion changes to a startled expression, but you’ve already accidently turned the call off again. \n" +
                "You don’t last long, what, five minutes? The soldiers barge in, shots are fired, you die….you know the drill.");
   
    
                //The text to be displayed on the buttons called by subInits
                 level3half.setGoodChoiceSub("Craaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap!!!");
                level3half.setBadChoiceSub("And you complained about having to set the time on a vcr....");
 
  
               //The path to the pics 
                level3half.setPicPathMain("Resources/Space_Adv/toolornotRe.png");
                level3half.setPicPathGood("Resources/Space_Adv/hallway.jpg");
                level3half.setPicPathBad("Resources/Space_Adv/shotnoeyeRe.png");
                   //Initialize the level
                    level3half.init();
                    //Make this level no longer accessable   
             sb3half.setEnabled(false);
            
                    //Enale the next level
                    sb4.setEnabled(true);
            }//End level three and a half
            
            //Level four
            else if (e.getSource() == sb4)
            {//The main event is the same no matter what the adventurer does or doesn't have
                 level4.setMainEvent("A wide eyed, startled creature is before you, his tendrils wrapped around what looks kind of like an earth mop. A…janitor? It doesn’t matter what it is, it isn’t human and you’ve only got a second to react before he does.");
              //The "bad" path is the same, no matter the shape of player
                 level4.setBadChoice("Play it cool….he looks like an understanding bloke.");
                 level4.setBadChoiceConsequence("“Oh! Oh, hi there!” You raise a trembling hand. “Don’t mind me, I’m, um, just, passing by and um-”\n" +
                "	He opens his mouth and steps forward. He begins speaking to you, the strange gibberish of these creatures. He cocks his head quizzically, and your heart starts pounding in horror.\n" +
                "	“Sorry, I, um, I had the wrong room. I’mma just turn around here and see myself to the door!!” You turn to run away but feel one of his tentacles wrap over your arm. He tries speaking to you again but you scream and make a run for it. He looks startled, then begins fumbling around his uniform. \n" +
                "	Oh no… you think. Oh no, a communicator! He’ll call the other, he’ll-\n" +
                "	And then you stop thinking, because it wasn’t a communicator he was digging for…No, no it appears it was a high tech tazer. The electricity seizes your body and you immediately hit the ground, becoming a rigid, flopping, screaming mess. The terrified elder continues pumping you full of electricity, and to be fair to him, he may not have been trying to kill you. After all, it seems most members of the crew carry these delightful little weapons, and given the significant difference in body structure and mass, they may even be meant to be non-lethal. But, well, for this particular human, this particular duration at this particular wattage is more than can be withstood, and you dear escapee, are dead. Your last comfort is knowing that at least he’ll have to clean the smoking lump of human up off the floor. Ha! Have fun mopping that up! ");  
  
               level4.setPicPathBad("Resources/Space_Adv/roastednoeye.jpg");
              level4.setBadChoiceSub("Looks like you met a rather SHOCKING end!!!");
              
              
                //Scenario if the player has lost an eye
            if (adventurer.getEyeStatus() == false)    
            {//The text for main event 

                //The text for the buttons in level
            level4.setGoodChoice("RUN!!");
            level4.setUglyChoice("Attaaaaaaaaaaaaaaaaack!!!!!!");

            //The text for the consequences that will be displayed:
            level4.setGoodChoiceConsequence("You turn so fast you fall, but your naked hands and feet give you good traction and you stagger up into a dead bolt. You tear back down the hall the way you came, flying across the alien ship as if…you’re….life…oh yeah, it totally does depend on it. \n" +
            "You hear the doors behind you slide open and the thunder of approaching others. They’re running and shouting and you are running out of options. Or so you think, until you spot the chute. There’s a small square cabinet on the wall to your left. At first you shoot by it but skidding to a halt you turn around grab the small silver handle. You hurriedly lift it and it rises on its hinge. The chute is dark but you can see a bottom. You don’t have time to think, they’re getting closer and if they turn the corner they will see you climb into your new hiding place. Is it a self-compacting trash dump? Will you get squished? Incinerated? Suffocate?\n" +
            "Ahead of you is another door. You have no clue where it goes, but it’s not a small dark hole in the wall. You can climb into the chute and risk it, or keep running for the door.") ;
            //The paths to the pictures
            level4.setUglyChoiceConsequence("With what? You run, naked, head cocked to one side so you can see out of your eye, flailing your arms and leap upon the alien screaming. You jump upon his large, wobbly frame, screeching like a banshee. You beat him with your fists, you kick him with your nub of a foot. You bite at his bulbous green skin….and then he hits you across the face with his solid bar.\n" +
            "You’re pretty sure he is more scared of you than you are of him. Eyes squeezed shut and mouth opening emiting horrible yells he beats you down with his cleaning instrument. Your handicap doesn’t help you too much, and since he is armed and you aren’t….well…beaten to the floor you lay flat and unmoving while the hysterical old alien continues wailing on you. The commotion had brought unwanted attention, and you hear hurried running and shouting as aliens converge on you. This plan might have worked a lot better if you’d had some sort of weapon. ");
            level4.setPicPathMain("Resources/Space_Adv/janitoreyepatchRe.png");
            level4.setPicPathGood("Resources/Space_Adv/doororchute.jpg");
    
              level4.setPicPathUgly("Resources/Space_Adv/squishednoeye.jpg");
             //The text to be displayed on the buttons called by subInits
            level4.setGoodChoiceSub("A dilemna! What do you choose!?");
   
            level4.setUglyChoiceSub("Well, you get an 'A' for effort...."); 
            //Initialize level
            level4.init();
            //Make this level no longer accessable   
             sb4.setEnabled(false);
            //Enable mext level
             sb5.setEnabled(true);
            }
            //If the adventurer has no leg
           if(adventurer.getLegStatus() == false)
    {//The text for the buttons in level
    level4.setGoodChoice("RUN!!");
    level4.setUglyChoice("Attaaaaaaaaaaaaaaaaack!!!!!!");
    //The text for the consequences that will be displayed:
    level4.setGoodChoiceConsequence("Well, running for your life would sure be easier with two feet wouldn’t it? Your frantic hobble doesn’t get you far. In fact you’re moving so slow you can hear the frightened alien janitor shouting into a communicator, you can hear the alarms going off, the sirens throughout the ship. You throw yourself into the next door you see, hoping and praying for safety. ") ;
    level4.setUglyChoiceConsequence("With what? You run (sort of….it’s an ugly hobble with your barely healed nub), naked, swinging your good arm, and leap upon the alien screaming. You jump upon his large, wobbly frame, screeching like a banshee. You beat him with your fists, you kick him with your nub of a foot. You bite at his bulbous green skin….and then he hits you across the face with his solid bar.\n" +
    "You’re pretty sure he is more scared of you than you are of him. Eyes squeezed shut and mouth opening emitting horrible yells he beats you down with his cleaning instrument. Your handicaps don’t help you too much, and since he is armed and you aren’t….well…beaten to the floor you lay flat and unmoving while the hysterical old alien continues wailing on you. The commotion had brought unwanted attention, and you hear hurried running and shouting as aliens converge on you. This plan might have worked a lot better if you’d had some sort of weapon. ");
    //The paths to the pictures
    level4.setPicPathMain("Resources/Space_Adv/janitorRe.png");
     level4.setPicPathGood("Resources/Space_Adv/runningnoleg.jpg");
     level4.setPicPathUgly("Resources/Space_Adv/squishednoleg.jpg");
     //The text to be displayed on the buttons called by subInits
    level4.setGoodChoiceSub("Do you find safety?!?! Run on!!!");
    
    level4.setUglyChoiceSub("Well, you get an 'A' for effort....");
     //The text to be displayed on the buttons for a scenario's alternate path
  	//Initialize level
        level4.init();
        //Make this level no longer accessable   
             sb4.setEnabled(false);
        //Enable next level
         sb5.setEnabled(true);
    }
        if (adventurer.getLegStatus() == true && adventurer.getEyeStatus() == true) //If the player is not missing an eye or a leg
            {//The text for the buttons in level
            level4.setGoodChoice("Attaaaaaaaaaaaaaaaaack!!!!!!");
            level4.setUglyChoice("RUN!!");
   
              //The text for the consequences that will be displayed:
            level4.setGoodChoiceConsequence("That half of a psychopath you’ve discovered in yourself? It’s not going anywhere. Before he can react you launch forward, stabbing him in the arm with the instrument you took from the lab and snatching his cleaning utensil from his confused hands. You beat him across the shoulder and knock him to the ground. A small black electronic slides across the floor to you. It has several buttons and a speaker, it looks like a walkie-talkie, and you are NOT taking any chances. With a grunt and a strong blow, you crush the device with the mop handle then turn back to the creature on the floor. He has raised a tentacle above his face defensively and you soften. He looks terrified. You don’t want to blow your cover…but there is something about stabbing an old person to death unnecessarily that doesn’t sit well with you. You ignore the tool and hit the old man over the head instead with his stick. He falls unconscious to the ground and you lower your weapon with a sigh of relief. You hurriedly reach down and wrap your arms around his body. With the adrenaline and terror pumping through your system you don’t notice his weight and drag him hurriedly to the closet from before. You drag him and his mop in and close the door behind you. You slide to the ground and sit a moment, taking in a deep shaking breath. So far so good! Your escape is still undetected…and you have found a shirt!!!") ;
  
               level4.setUglyChoiceConsequence("You turn so fast you fall, but your naked hands and feet give you good traction and you stagger up into a dead bolt. You tear back down the hall the way you came, flying across the alien ship as if…you’re….life…oh yeah, it totally does depend on it. \n" +
            "You hear the doors behind you slide open and the thunder of approaching others. They’re running and shouting and you are running out of options. Or so you think, until you spot the chute. There’s a small square cabinet on the wall to your left. At first you shoot by it but skidding to a halt you turn around grab the small silver handle. You hurriedly lift it and it rises on its hinge. The chute is dark but you can see a bottom. You don’t have time to think, they’re getting closer and if they turn the corner they will see you climb into your new hiding place. Is it a self-compacting trash dump? Will you get squished? Incinerated? Suffocate?\n" +
            "Ahead of you is another door. You have no clue where it goes, but it’s not a small dark hole in the wall. You can climb into the chute and risk it, or keep running for the door.");
            //The paths to the pictures
            level4.setPicPathMain("Resources/Space_Adv/janitorRe.png");
            level4.setPicPathGood("Resources/Space_Adv/shirt.jpg");
     
             level4.setPicPathUgly("Resources/Space_Adv/doororchuteeye.jpg");
            //The text to be displayed on the buttons called by subInits
          level4.setGoodChoiceSub("Now what, daring escapee?");
   
          level4.setUglyChoiceSub("A dilemna! What do you choose!?");
            //The text to be displayed on the buttons for a scenario's alternate path
            //Initialize the level
            level4.init();
            //Make this level no longer accessable   
             sb4.setEnabled(false);
         //Enable the next level
                sb5.setEnabled(true);
            }

            }//End level four
            
            //Level five
            else if (e.getSource() == sb5)
            {//Level 5 varies drastically depending on health of player
                 
                //The text in this scenario is the same if the adventurer has no eye
                //or if he fled from the janitor when he was fully healthy
                //the only thing that changes are the pictures and ugly choice consequences
                if (adventurer.getEyeStatus() == false || adventurer.getLegStatus() == true && level4.getAPUgly() == true)
                { 
                    
                    //The main events 
            level5.setMainEvent("Ahead of you is another door. You have no clue where it goes, but it’s not a small dark hole in the wall. You can climb into the chute and risk it, or keep running for the door.");
            level5.setUglyChoice("What could go wrong? Jump through the cabinet into the wall) ");
           
            level5.setBadChoice("Are you crazy? Keep running!!");
    //The text for the consequences that will be displayed:
   level5.setBadChoiceConsequence("There is no freaking way you’re going to throw yourself headfirst into this spot. It’s so small and you can’t imagine they won’t check. You run for the door and reach for the panel. The door slides open but your heart sinks. You aren’t alone. In fact there are five aliens inside and they are heavily armed. The good news is you’re dead waaaaaaaay before you’re in any pain. ");  
  
    //The paths to the pictures
    if(adventurer.getEyeStatus() == false)
    { level5.setUglyChoiceConsequence("The footsteps are getting closer and you don’t want to know what’s behind door number 1. \n" +
"You fling your torso into the small square passage and then yank your lower body in after. Luckily for you your naked skin sticks to the cold metal and you are able to slooooowly creep down the tunnel rather than noisily bump along. It is a small passage and you don’t have room to turn around, so you begin a slow, quiet slither head first down the metal passageway to get your feet out of the way of the hatch. It falls shut and you hold your breath in terror. You hear the running, the commotion, and then….after the most terrifying moment of your day thus far (which, by the way, is an achievement because it’s been a day) it subsides. \n" +
"You don’t want to make any noise, but you’re so relieved a desperate sigh escapes you. They ran past you….you made it. You steady yourself and continue inching forward. You make it to the bottom and the passage opens up just a little, allowing you to push yourself up to your knees so long as you keep your head down very low. You sigh in relief again, then hear another alarm siren that is deafening inside your small space.") ;
    
        
        level5.setPicPathMain("Resources/Space_Adv/doororchute.jpg");
     level5.setPicPathUgly("Resources/Space_Adv/chutenoeye.jpg");
     level5.setPicPathBad("Resources/Space_Adv/shotnoeye.jpg");
    }
    else
    { level5.setUglyChoiceConsequence("The footsteps are getting closer and you don’t want to know what’s behind door number 1. You look down at the makeshift knife you’ve been carrying. You’re loath to part with your only means of self defense but you need two free hands to climb through and a distraction. You fling the tool as hard as you can and it soars down the hall smacking a wall and rolling away making a very convincing clamor. You hear an excited shout from your pursuers and know it worked, they’re going to think you kept running. \n" +
"That is if they don’t see you climb into the chute!!! You fling your torso into the small square passage and then yank your lower body in after. Luckily for you your naked skin sticks to the cold metal and you are able to slooooowly creep down the tunnel rather than noisily bump along. It is a small passage and you don’t have room to turn around, so you begin a slow, quiet slither head first down the metal passageway to get your feet out of the way of the hatch. It falls shut and you hold your breath in terror. You hear the running, the commotion, and then….after the most terrifying moment of your day thus far (which, by the way, is an achievement because it’s been a day) it subsides. \n" +
"You don’t want to make any noise, but you’re so relieved a desperate sigh escapes you. They ran past you….you made it. You steady yourself and continue inching forward. You make it to the bottom and the passage opens up just a little, allowing you to push yourself up to your knees so long as you keep your head down very low. You sigh in relief again, then hear another alarm siren that is deafening inside your small space.") ;
    
        
        level5.setPicPathMain("Resources/Space_Adv/doororchuteeye.jpg");
     level5.setPicPathUgly("Resources/Space_Adv/chutenaked.jpg");
     level5.setPicPathBad("Resources/Space_Adv/shotdead.jpg");}
    
    
     //The text to be displayed on the buttons called by subInits
    level5.setUglyChoiceSub("Crawl on friend! Crawl on!");
    level5.setBadChoiceSub("Now you know what a clay pigeon feels like.");
    
    level5.init();
    //Make this level no longer accessable   
    sb5.setEnabled(false);
    //Enable next button
    sb5half.setEnabled(true);
                }
                
                //Adventurer missing a leg. Ran from janitor in previous level
                if (adventurer.getLegStatus()== false)
                {
                 //The main event 
    level5.setMainEvent("You throw yourself into the next door you see, hoping and praying for safety. You are disappointed. There are two crewmates in the room you’ve found yourself in. They had leapt to their feet at the sound of the sirens and now are staring at you with wide eyes as one reaches for a small black electronic on his belt. There is a reaaaaaaaaally good chance he’s going to call for help. Crap. Now what?");
     
    //The text for the buttons in level
    level5.setGoodChoice("Turn and run from the room");
    
    level5.setBadChoice("Make a grab for the communicator");
    //The text for the consequences that will be displayed:
    level5.setGoodChoiceConsequence("You decide to rely on your embarrassing hobble again, and haul your naked rear from the room. You have the presence of mind to slam the door panel and slide the door shut behind you, then you’re off, limping frantically through the cacophony of sirens and the blaring red warning lights all around you. \n" +
"You hear the doors behind you slide open and the thunder of approaching others. They’re running and shouting and you are running out of options. There’s a door before you, and a small square hatch on the wall. It has a handle, and you suspect it may lead somewhere, maybe somewhere safe! But you don’t have time. You just can’t get up enough speed and they’re gaining on you. You run for the door and pound on the panel. It slides open obediently, but your heart sinks. You aren’t alone. There’s five aliens inside, and they pounce on you. With a scream you’re brought to the floor and several are restraining you while the other screams out the door. ") ;
    level5.setBadChoiceConsequence("Reinforcements are NOT what you want. You lunge forward and grasp at the little black box. He shouts in surprise and begins slapping against you as the two of you wrestle for the device. This plan might have worked really well if you’d had a weapon….or he hadn’t had a friend. ");  
    
    //The paths to the pictures
    level5.setPicPathMain("Resources/Space_Adv/runningnoleg.jpg");
     level5.setPicPathGood("Resources/Space_Adv/helddownA.jpg");
     level5.setPicPathBad("Resources/Space_Adv/helddownA.jpg");
     
     //The text to be displayed on the buttons called by subInits
    level5.setGoodChoiceSub("This is terrible???!! What happens next?!?!?");
    level5.setBadChoiceSub("WOULD HAVE worked??? Oh no......");
    
    level5.init();
    //Make this level no longer accessable   
             sb5.setEnabled(false);
    //Enable button for next level
	sb5half.setEnabled(true);  
                    
                }
                if (adventurer.getEyeStatus() == true && adventurer.getLegStatus() == true && level4.getAPGood() == true) //The path where the healthy adventurere attacked and won against the 
                    //janitor and is now in a closet
                {//The main event 
                 level5.setMainEvent(" With the adrenaline and terror pumping through your system you don’t notice his weight and drag him hurriedly to the closet from before. Your drag him and his mop in and close the door behind you. You slide to the ground and sit a moment, taking in a deep shaking breath. So far so good! Your escape is still undetected…and you have found a shirt!!!\n" +
                   "Now what, daring escapee?");
                    level5.setGoodChoice("Creak open the door and venture on");
           
                   level5.setBadChoice("Stay in the closet. Closets fool serial killers!");
    
                    //The text for the consequences that will be displayed:
                   level5.setGoodChoiceConsequence("It’s not easy, it really isn’t, but you know that no matter how good you feel in that moment….you’re not safe curled up in an unlocked closet with an unconscious alien. You have got to get back to Earth. You rise up, taking your tiny weapon, and giving your makeshift new wardrobe a tug, drag yourself to your feet.  There’s no keyhole….no window, no way to tell what’s waiting outside the door. You creak the door open, peeking carefully. From what you can see from your tiny slit there’s nothing…\n" +
                    "	You push the door just a little more and see nothing but the broken pieces of the aliens communicator you smashed. With a sigh of relief you hurry out into the hall and take off. You know you don’t want to back track, there’s nothing behind you but the lab you escaped from, but other than that you have no clear where you’re going. You must find the escape pods….but how? You hear the indistinct garble of the aliens and you freeze. Oh no, you can’t get caught, not now. You look frantically about but the halls are clear and empty….to avoid the approaching creatures you turn hurriedly and bolt down the nearest passageway, tucking yourself into the corner and peering around. The aliens continue their patrol and walk casually by your hiding place and you sag against the wall in relief. ") ;
                 level5.setBadChoiceConsequence("So, you take a look around. It’s warm, you like that. It’s dark, you kinda like that too….you’re finally clothed. What’s going on in here? It’s a good thing. What’s going on out there? Oh no, it’s a terrible thing. Maybe your mistake was sitting….Now that you’re there, exhausted and relieved and clothed, sitting safely on the ground with your back against the wall, you don’t’ want to move. You just want a moment, want a moment to sit and steady yourself. Who know what will happen if you open that door! \n" +
                "The only problem is, as the hours pass your rest costs you your window of opportunity. You don’t know what’s discovered first, the scientists’ bodies or the missing janitor, but abruptly you hear the screech of alarms and a lot of rumbling. It seems the ship is mobilizing. They know you’re missing, and, well it seems a supply closet isn’t as discrete as you hoped. You are found, killed, and your body parts catalogued. It’s been a crappy week.");  
   
                //The paths to the pictures
                level5.setPicPathMain("Resources/Space_Adv/shirt.jpg");
                 level5.setPicPathGood("Resources/Space_Adv/clothed.jpg");
                 level5.setPicPathBad("Resources/Space_Adv/parts.jpg");
     
                 //The text to be displayed on the buttons called by subInits
                 level5.setGoodChoiceSub("Phew! But now what?");
                level5.setBadChoiceSub("Sorry you've head a crappy week. No good falling aPART about it though.");
                 //Initialize the level
                 level5.init();
                 //Make this level no longer accessable   
             sb5.setEnabled(false);
            //Enable button for next level
            sb5half.setEnabled(true);
                }
            }//End level five
           
            //Level five and a half
            else if (e.getSource() == sb5half)
            {//This level varies greatly, you can either
                //Be an adventurere with no leg, who ran from the janitor, ending p in a situation where they could grab a taser or ran. Having chosen taser, all roads now lead to death
                //Be an adventurere with no leg, who ran from the janitor, ending p in a situation where they could grab a taser or ran. Having chosen running, they now are in a room full of aliens
                //Be an adventuer who ran from the janitor with one eye, chose to hide in chute
                //Be an adventuerer with all limbs remaining, who ran from janitor and chose to hide in a chute
                //Or, be an adventurer who had all limbs, fought the janitor, and ventured forth from the closet, narrowly avoiding a patrol./
                
                
                ////Be an adventurere with no leg, who ran from the janitor, ending p in a situation where they could grab a taser or ran. Having chosen taser, all roads now lead to death
                if (adventurer.getLegStatus() == false && level5.getAPBad() == true)
                {
                      //The text for the main event
                     level5half.setMainEvent("As you fight the device from the one alien, the next pulls out his tazer and you’re on the ground screeching. The alien seems concerned and decides to continue frying you for good measure. As thousands and thousands of volts fry you to a crisp you have time for one last decision….");  
                    //The text for the buttons in level
                     level5half.setGoodChoice("Die with class");
                     level5half.setUglyChoice("Flip that stupid alien off and give him a piece of your mind");
                    
                     //The text for the consequences that will be displayed:
                      level5half.setGoodChoiceConsequence("As your last seconds pass you see a montage of your life, and you decide, you know what? I was awesome. ") ;
                      
                      level5half.setUglyChoiceConsequence("Where do these garbage sacks get off? They kidnapped you!!! They cut off your dang foot!!! And now they’re killing the CRAP out of you!!! You jerk your arm against the electric current and fight through the agony to lift a singular finger in the air and snarl at your attacker. \n" +
                    "“You….suck….” you gasp before falling limp. ");
                    //The paths to the pictures
                    level5half.setPicPathMain("Resources/Space_Adv/helddownA.jpg");
                    level5half.setPicPathGood("Resources/Space_Adv/roastenoleg.jpg");
                    
                    level5half.setPicPathUgly("Resources/Space_Adv/fyou.jpg");
                    //The text to be displayed on the buttons called by subInits
                    level5half.setGoodChoiceSub("Yeah! You WERE awesome!!");
                    
                    level5half.setUglyChoiceSub("Yeah. You sure showed them!");
                    //Initialize the level
                    level5half.init();
                    //Make this level no longer accessable   
                    sb5half.setEnabled(false);
                    //Enable button for next level
                  //No next level 
                }//END
                
                //Be an adventurer with no leg, who ran from the janitor, ending up in a situation where they could grab a taser or ran. Having chosen running, they now are in a room full of aliens
                if (adventurer.getLegStatus() == false && level5.getAPGood() == true)
                {
                  //The text for the main event
                    level5half.setMainEvent("The scuffle is brief and you’re on your knees, arms being held firmly by the aliens. With you, they feel, properly subdued they seem to relax slightly, but they’re still watching you warily. You look ahead as the horde closes in and you see you’ve found yourself in some sort of command room, there are computers everywhere and a large porthole that gives you a view of space. You’re thinking, but you can hear the thundering clamor of your pursuers, they are about to cross the threshold. You haven’t got many options, and no time to consider them.  There’s a control panel to your left and you could close the door if your arm was free, but your arm is being twisted in a heinous position, there’s no way you could jerk free without severe injury, and that’d still leave you the aliens in this room to deal with. The alien restraining your right is a little more slack, it’s only holding you by your biceps and forearm, and it has a gun hanging from his belt but how many could you shoot before they kill you? What do you do?");  
                 //The text for the buttons in level
                     level5half.setGoodChoice("Less aliens the better! Dislocate your shoulder to free your arm and close the door");
                   
                    level5half.setBadChoice("Go down swinging!! Get the gun!!");
                 //The text for the consequences that will be displayed:
                 level5half.setGoodChoiceConsequence("Your odds are bad, and they’re about to get worse if you don’t get that door shut!! Using the element of surprise you lunge left, head butting your captor in his leg (ish…leg-ish area. Who knows what they call their anatomy), and using all your momentum wrench your arm free with a sickening ‘pop’. Your injured, you know it, but you have to keep moving before your brain registers how injured. You swing your rapidly swelling arm and get your hand to the console. You hit the right buttons, you’re getting pretty good with these doors, and the huge circular portal before you slams shut, then to your relief, you hear the loud ‘clinging’ of the lock. From the outside they are pounding and shouting, but they are, definitively, outside. \n" +
                "Your relief doesn’t last long as the brute to your right reaches for his pistol and the angry alien on your left seizes you again. He grasps your arm and delivers a savage blow to your shoulder, completing whatever break had been started. You scream, but don’t stop. Instead you follow the force of the impact and fling yourself down onto your stomach on the floor, then using your good arm flip over onto your back. You flail a foot to kick the gun from the alien above you and dodge the second blow from the alien to your left. The gun hits the ground and skids above your head, and as your fingers desperately clasp it you feel the burning sting of a laser gun in your thigh. \n" +
                "You push yourself up with your good arm and fire rapidly, hitting two aliens even as three more shots burn through you. Your arm is shaking as you shoot again, you’re down to two aliens left…and one of them is lowering a gun to your face. At this point, you’ve lost all control. You’re missing a foot, you’ve got a severely destroyed rotator cuff, you’ve been shot four times, and you know you’re about to die. It’s pure instinct that makes you lunge forward and bite, bite the alien’s hand. Your teeth latch it and you pull back with flesh in your mouth. It screams and drops its gun and as the alien behind you leaps forward it’s instinct again which drops you to the floor to avoid your enemy’s tackle. \n" +
                    "You grab the new laser gun and fire two finishing blows, then lift your arm up to fire at the panel on the wall and fry the door. It’s locked for good….you’re safe. The gun falls from your lifeless fingers and you collapse back onto the floor. You can’t move, you can only breathe….and you do, for about three minutes you lay trembling, but you know you’ve only got so long before someone figures out how to get that door open. Slowly you roll onto your right side and push yourself up to sitting. Next you roll to your knees, shouting at the pain that causes your gun injuries. It is no easy feat, but you are not dying here, and you get to your feet. Standing in the wake of the destruction you’re panting, looking around and beholding your handiwork. You’d never been known for battle prowess on earth….it’s amazing what a person can do when they’ve been mutilated by aliens and are clinging to their survival by seconds.\n" +
                "As the pain sets in you bring a shaking hand to hold your rapidly swelling, throbbing arm, wincing as you take a few steps away from the bodies at your feet. You have got to find a way off of this ship, now you’re down a foot and an arm, and you are riddled with burning gunshot wounds. Your only saving grace is that the lazers that shot up your limbs seem to instantly cauterize. You look around at the screens and panels, you seem to be in some kind of control room, there must be something in here that can help you. Some weapon, some gadget, some….map!!! A map!!! You see on the wall is an embossed diagram of the ship, perhaps to help workers know which room they are monitoring. You limp to the wall and stare earnestly at the drawing, trying desperately to find something that you recognize, to give you your bearings. You rack your brain, straining to remember the tiny crafts you first saw. They were in a small room that was near enough to where you entered, so there must be something on this map that shows the large deck you first encountered. You scan the map for all the largest spaces, trying to find something….\n" +
                "THERE!!!! THAT’S IT, THAT’S IT!!!! The maintenance workers of this room must frequent the room, it’s marked on their diagram and it is connected to a wide open space that you suspect was your entry point on the ship. The diagram shows the air duct system and it seems there’s a ventilation shaft connected to the room, but there’s no way you could try to get through the air ducts in your state. You keep staring, looking for an alternative path, and then you find that there is another large room nearby….and you recognize the alien mark on the map. You saw that mark on the door every day since your captivity, it’s the lab! The pods aren’t terribly far from the lab, which means you aren’t terribly far from them. You take a deep breath, trying earnestly to burn the picture into your mind. \n" +
                " You can get back to them, you’re sure of it, but your cover’s blown and you’re gravely injured, this is not going to be easy. You limp across the room and retrieve some blasters off the aliens’ bodies. You also, almost as a second thought, rip some clothing off the smallest one, fashioning for yourself first  a sling for your aching arm, and then a large, shapeless covering. It’s not terribly flattering, but you’re less exposed. You remove the belt off of one, cinching it to your waist and filling it with weapons. Everything you can get your hands on and think you can remotely operate. You have the feeling going out there’s going to be a lot of decisions that end with only one of two outcomes….surviving, or not.\n" +
                " You’ve busted the door, besides you aren’t stupid. You go across the room to the small door tucked in the corner and whip one of your huge new toys forward. The blast gives you a good knock and you wince, your shoulders sure can’t catch a break today. You duck your head, walk through the new hole in the small door, and head off down the path. ") ;
                 level5half.setBadChoiceConsequence("In that split second you decide a weapon in hand is better than two in the bush.  With the element of surprise you lunge right, head butting your captor in his leg (ish….legish area. Who knows what they call their anatomy) and using all your momentum and grit to jerk your arm free. Your fingers close around his pistol and you turn it on the alien to your left. It’s a dead hit, and the creature staggers back then falls to the floor. You even get the alien who you stole it from, swinging your arm back and firing in the same motion. You whirl around, and rapidly fire, but their numbers in the end are too many, and you are slaughtered, cut to pieces, then brought back to the lab as an example to any other test subjects who are feeling brave.\n" +
                "….it could have gone better….");  
                  
                    //The paths to the pictures
                    level5half.setPicPathMain("Resources/Space_Adv/helddownA.jpg");
                     level5half.setPicPathGood("Resources/Space_Adv/facetheworldnoleg.jpg");
                     level5half.setPicPathBad("Resources/Space_Adv/parts.jpg");
                     
                     //The text to be displayed on the buttons called by subInits
                    level5half.setGoodChoiceSub("Its ON!!!");
                level5half.setBadChoiceSub("So it could have gone better, no need to go to PIECES about it!");
                 
                 //Initialize the level
                 level5half.init();
                 //Make this level no longer accessable   
                sb5half.setEnabled(false);
                 //Enable button for next level
                 sb6.setEnabled(true);  
                
                }//END
                
                 //Be an adventurer who ran from the janitor with one eye, chose to hide in chute
                if (adventurer.getEyeStatus() == false && level5.getAPUgly() == true)
                {  //The text for the main event
                 level5half.setMainEvent("Well…you’ve escaped, but your cover is blown. Additionally you need a plan. You’re thinking that you’re in some sort of ventilation system, but it’s dark, illuminated only by light that comes through grates. Now you’re not a dumb sort, and you’re beginning to think this might be an extremely clever way to get to an escape pod. The drawback being you don’t know your way through this dim maze, and finding the right grate to pop out of my prove impossible, IF there’s a grate going to your desired room at all. But, your only other option would be to go back the way you came. There’s a good chance the angry mob has moved forward, but the ship is now on alert and they’re looking for you.");  
                //The text for the buttons in level
                level5half.setGoodChoice("Crawl on");
                  
                level5half.setBadChoice("Slide back down the chute and return to the hallway");
                //The text for the consequences that will be displayed:
                level5half.setGoodChoiceConsequence("You don’t know what lies ahead, but you know what lies behind and you’ve got a better shot up here. You crawl, slowly, carefully, quietly, through the dim tunnels, pausing over each air vent to peer down into the room below. After what seems a long time, you reach what all adventurers dread….a fork in the road. . ") ;
                level5half.setBadChoiceConsequence("You decide it’s better to trust the devil you know and head back. Your wiggle backwards until you reach the slope and then slide down on your stomach until you return to where you started. You push the grate back open and crawl out into the hallway. It’s empty and you breathe a sigh of relief. Hurriedly you slip out of the grate and down to the floor. You’ve got to find the escape pods… You know it’s not behind you, all that waited there was the lab you escaped from and a maintenance closet, so you push forward. You turn left and follow the passage, nervously staring at all the large round doors around you. You don’t know where they lead, any of them could be a turn you need to make. \n" +
                "Well, you also didn’t know what was behind any of them. You hear the telling hydraulic hiss and stop in your tracks. Bravely you turn to face them, in time to see the giant laser sword impale you. Crap. You’re dead….and you made it so far….. ");  
                //The paths to the pictures
                level5half.setPicPathMain("Resources/Space_Adv/chutenoeye.jpg");
                level5half.setPicPathGood("Resources/Space_Adv/chutenoeye.jpg");
                level5half.setPicPathBad("Resources/Space_Adv/impalednoeye.jpg");
                
                //The text to be displayed on the buttons called by subInits
                level5half.setGoodChoiceSub("A fork in the road! Hopefully whichever path you choose wont leave you forked...");
                level5half.setBadChoiceSub("You should have trusted your guts and carried on. Now you have no guts to speak of...");
              
                //Initialize the level
                level5half.init();
                //Make this level no longer accessable   
             sb5half.setEnabled(false);
            //Enable button for next level
                sb6.setEnabled(true);
                }
                
                 //Be an adventuerer with all limbs remaining, who ran from janitor and chose to hide in a chute
                //Very similar to previous if but with new pics
             //Be an adventuer who ran from the janitor with one eye, chose to hide in chute
                if (adventurer.getEyeStatus() == true && adventurer.getLegStatus() == true && level5.getAPUgly() == true)
                {  //The text for the main event
                 level5half.setMainEvent("Well…you’ve escaped, but your cover is blown. Additionally you need a plan. You’re thinking that you’re in some sort of ventilation system, but it’s dark, illuminated only by light that comes through grates. Now you’re not a dumb sort, and you’re beginning to think this might be an extremely clever way to get to an escape pod. The drawback being you don’t know your way through this dim maze, and finding the right grate to pop out of my prove impossible, IF there’s a grate going to your desired room at all. But, your only other option would be to go back the way you came. There’s a good chance the angry mob has moved forward, but the ship is now on alert and they’re looking for you.");  
                //The text for the buttons in level
                level5half.setGoodChoice("Crawl on");
                  
                level5half.setBadChoice("Slide back down the chute and return to the hallway");
                //The text for the consequences that will be displayed:
                level5half.setGoodChoiceConsequence("You don’t know what lies ahead, but you know what lies behind and you’ve got a better shot up here. You crawl, slowly, carefully, quietly, through the dim tunnels, pausing over each air vent to peer down into the room below. After what seems a long time, you reach what all adventurers dread….a fork in the road. . ") ;
                level5half.setBadChoiceConsequence("You decide it’s better to trust the devil you know and head back. Your wiggle backwards until you reach the slope and then slide down on your stomach until you return to where you started. You push the grate back open and crawl out into the hallway. It’s empty and you breathe a sigh of relief. Hurriedly you slip out of the grate and down to the floor. You’ve got to find the escape pods… You know it’s not behind you, all that waited there was the lab you escaped from and a maintenance closet, so you push forward. You turn left and follow the passage, nervously staring at all the large round doors around you. You don’t know where they lead, any of them could be a turn you need to make. \n" +
                "Well, you also didn’t know what was behind any of them. You hear the telling hydraulic hiss and stop in your tracks. Bravely you turn to face them, in time to see the giant laser sword impale you. Crap. You’re dead….and you made it so far….. ");  
                //The paths to the pictures
                level5half.setPicPathMain("Resources/Space_Adv/chutenaked.jpg");
                level5half.setPicPathGood("Resources/Space_Adv/chutenaked.jpg");
                level5half.setPicPathBad("Resources/Space_Adv/impaled.jpg");
                
                //The text to be displayed on the buttons called by subInits
                level5half.setGoodChoiceSub("A fork in the road! Hopefully whichever path you choose wont leave you forked...");
                level5half.setBadChoiceSub("You should have trusted your guts and carried on. Now you have no guts to speak of...");
              
                //Initialize the level
                level5half.init();
                //Make this level no longer accessable   
             sb5half.setEnabled(false);
                 //Enable button for next level
                sb6.setEnabled(true);
                }
                
                  //Or, be an adventurer who had all limbs, fought the janitor, and ventured forth from the closet, narrowly avoiding a patrol./
               if (adventurer.getEyeStatus() == true && adventurer.getLegStatus() == true && level5.getAPGood() == true)
               {  //The text for the main event
                level5half.setMainEvent("It’s then you notice the grate. On the wall across from you is a metal chute with what looks like a hinged grate hanging over it…You glance to make sure you’re still clear then approach it cautiously. You pull at the small handle and peer inside. It’s dark, and you have no clue where it might lead….but an idea is forming in your mind. It looks like a ventilation shaft, like an AC unit back on earth, and if that is the case….it could be connected to rooms all over the ship, maybe even the room you’re looking for. If you could fit into that passage you could travel around the ship without being seen…Or you could be climbing head long into a self-compacting trash dump. Will you get squished? Incinerated? Suffocate? You don’t know how alien technology works, what if you end up in some heinous trap and slowly starve to death?\n" +
                "But what are your odds down here? You don’t know where you’re going and you want to keep your escape secret for as long as possible….but you can at least move freely.");  
                //The text for the buttons in level
                level5half.setGoodChoice("Crawl into the vent");
                level5half.setUglyChoice("Quest on through the passage");
                
                //The text for the consequences that will be displayed:
                level5half.setGoodChoiceConsequence("You look around, you’re alone in the passage. You take a deep breath, lift the grate, and crawl into the chute. It’s small and you don’t have room to turn around, so you begin a slow, quiet slither head first down the metal passageway to get your feet out of the way of the hatch. It falls shut and you wince, waiting for some unspeakable horror, but instead you find yourself on your belly in a dark hole. You make it to the bottom and the passage opens up just a little, allowing you to push yourself up to your knees so long as you keep your head down very low. \n" +
                "You must admit you’re relieved to not be in a trash compacter; rather it seems you may have been right about this being a ventilation system.  It’s dark, illuminated only by light that comes through grates, but with your bare feet and hands you are able to stick to the surface enough to start crawling up the incline. It seems you have found a way to travel around the ship without giving away your escape, the drawback being you don’t know your way through this dim maze, and finding the right grate to pop out of may prove impossible, IF there’s a grate going to your desired room at all. But, still you smile. You like your odds, and you’re feeling confident about your choice. No one even knows you're missing yet, you might snatch an escape pod and be gone before that drama hits the roof. ") ;
              
                level5half.setUglyChoiceConsequence("The risk is too great for you….you can’t even see inside that wall!! So instead you carefully, quietly, lower the grate and carry on down the hallway. There’s a huge round door before you, and a panel on the wall to open it. You approach it and stop quietly before the door. You type into the panel and the door slides open obediently, then slides shut behind you. Unfortunately, you’re not alone. There are five aliens in the room, three sitting at chairs, typing and squinting at the screens before them, one staring at a clipboard thoughtfully, and one sitting in the corner eating. It’s that one that notices you, looking up to see who had entered and freezing. You both stay frozen a moment, staring at each other, and then the alien cries out. The others turn around in their seats and the one throws his clipboard down. You pull your sharp weapon from your pockets and run forward to stab the door control panel. At least no one will come in on you.\n" +
                "	That move, while possibly saving your life, did cost you precious time. Three of them lunge for you while another is shouting into a communicator and the fifth appears to be getting guns. You yank your tool back out of the wall, turning around in time to slash one of your attackers. You’re knocked down, and then you hear a little clatter and see that something small and black has fallen from your attire. The janitor had a taser in his uniform! You make a mad swipe for it, and close your hand around the weapon. You wield their own technology at them, shocking the three trying to grapple you into unconsciousness. You scrabble to your feet and charge at the one on the com, but it’s too late, you know it’s already gotten the word out. You beat him down and shock him in the back of the neck, then turn to find the last.\n" +
                "	You feel a burning in your arm and you scream, and then it shoots again, hitting your shoulder. Suffering through the pain you take him down too with the tazer, then fall back against the wall. They’re all alive, but incapacitated, and although they called for help the door is still jammed shut. Your cover is blown, but you’re safe. You breathe a sigh of relief, and step over the first fallen body. You see you’ve found yourself in some sort of command room, there are computers everywhere and a large porthole that gives you a view of space. You look around at the screens and panels, there must be something in here that can help you. Some weapon, some gadget, some….map!!! A map!!! You see on the wall is an embossed diagram of the ship, perhaps to help workers know which room they are monitoring. \n" +
                "	Excitedly you hurry to the wall and stare earnestly at the drawing, looking for something you recognize, something to give you your bearings. You rack your brain, straining to remember the tiny crafts you first saw. You had been standing in that huge chamber, surrounded by glass that showed you the terrifying view of space. They’d been prodding you, spraying you, and you’d seen the doors slide open to a side chamber, and all the tiny ships inside….You stare intensely, searching for something on this map that shows the large deck you first encountered. You scan the map for al the largest spaces, trying to find something….\n" +
                "THERE!!!! THAT’S IT, THAT’S IT!!!! The maintenance workers of this room must frequent the room, it’s marked on their diagram and it is connected to a wide open space that you suspect was your entry point on the ship. The diagram shows the air duct system and it seems there’s a ventilation shaft connected to the room, you tuck that knowledge away, wondering if you can find the entrance. You keep staring, looking for an alternative path, and then you find that there is another large room nearby….and you recognize the alien mark on the map. You saw that mark on the door every day since your captivity, it’s the lab! The pods aren’t terribly far from the lab, which means you aren’t terribly far from them. You take a deep breath, trying earnestly to burn the picture into your mind. \n" +
                "	You can get back to them, you’re sure of it, but you’re cover’s blown and you’re going to have to be careful. You turn away from the map and your eyes fall on your unconscious friends. You smile, having half a mind to add to your small arsenal of a taser and a sharp medical tool. You pick through your selections and take the guns that you feel you can operate, tucking them into your makeshift janitors’ suit. Then you rise and look to the door. You’ve jammed it shut, and you suspect there will be unwanted company on the other side, so instead you go across the room to the small door tucked in the corner. You slide open the panel and slip from the room discretely, ducking your head under the arch you’re off down the path.");
                //The paths to the pictures
                level5half.setPicPathMain("Resources/Space_Adv/chutechoiceshirt.jpg");
                level5half.setPicPathGood("Resources/Space_Adv/chuteshirt.jpg");
                
                level5half.setPicPathUgly("Resources/Space_Adv/facetheworld.jpg");
                //The text to be displayed on the buttons called by subInits
                level5half.setGoodChoiceSub("You have got this under control!!!");
                
                level5half.setUglyChoiceSub("It's ON now!!!");
                //Initialize the level
                level5half.init();
                //Make this level no longer accessable   
             sb5half.setEnabled(false);
                //Enable button for next level
                sb6.setEnabled(true);
               }//END
           
                   }//End level 5half 
            
            
            //Level 6
            //Level 6 also has several paths, by now some have converged, and some players
            //are close to the end, others about to enter the LABRYNith
            
            //You can be an adventuerer who has no leg, found a map and is entering the labryinth
            //An adventurer whohas no eye and is in chute facinf fork
            //An adventuer who is whole and in chute facing fork
            //A healthy adventurer who found a map and is off into labryinth    
            
       
            else if (e.getSource() == sb6)    
            {//You can be an adventuerer who has no leg, found a map and is entering the labryinth
             if (adventurer.getLegStatus() == false)  
             {  //The text for the main event
                level6.setMainEvent("You’ve found yourself in a small, sparse walkway, with a gray floor and bare walls. It seems this is some sort of utilitarian hall, and according to the map it has an exit back in the lab. You take a deep breath, you aren’t thrilled to be going back THERE, but if you can get to the hall outside of the lab, you can follow the path you memorized to the escape pods. You hurry through the hall, careful of noise, and take the first left you see. Left, left, straight, right. You’re sure you remember it, the way back to the lab. Left, left, straight, right. \n" +
                "	Ok, one left down. That leaves another left, straight, and then a right. This is something far too important to forget. You’re hobbling as quickly as you can down this foreboding tunnel, watching carefully for unwanted surprises. The path seems endless, so many doors, so many shadows…..so many….oh god….did that shadow just move? Your heart stops and you freeze, jerkily pulling up a gun. You wait, but you see nothing. May just have been your imagination, but you would have sworn you saw something move over by those crates. Now what?");  
                //The text for the buttons in level
                level6.setGoodChoice("Go on");
                level6.setUglyChoice("Go investigate the crates)");
                
                //The text for the consequences that will be displayed:
                level6.setGoodChoiceConsequence("You shake your head. No….no there was nothing there. You’re just scared, and tired, and trying to escape alien torture….that would give anyone the heebie-jeebies. You shake off your panicked imagination and walk on….a bit more quickly. ") ;
                
                level6.setUglyChoiceConsequence("You take a deep breath, and, raising your blaster, you slowly walk forward. Another step….another step….you’ve reached the boxes….nothing yet. You keep your gun focused as you lean forward and then kick one of the crates over. You jump back, weapon pointed. Still nothing. With a sigh you straighten up. There was nothing there. You’re just scared, and tired, and trying to escape alien torture….that would give anyone the heebie-jeebies. You shake off your panicked imagination and return the blaster to your makeshift belt. ");
                //The paths to the pictures
                level6.setPicPathMain("Resources/Space_Adv/walkingnaked.jpg");
                level6.setPicPathGood("Resources/Space_Adv/crates.jpg");
                
                level6.setPicPathUgly("Resources/Space_Adv/crates.jpg");
                //The text to be displayed on the buttons called by subInits
                level6.setGoodChoiceSub("It was just your imagination! Right?....");
                
                level6.setUglyChoiceSub("It was just your imagination! Right?....");
                //Initialize the level
                level6.init();
                //Make this level no longer accessable   
             sb6.setEnabled(false);
                //Enable button for next level
                sb7.setEnabled(true);}//END
            
             //An adventurer who has no eye and is in chute facing fork
            if (adventurer.getEyeStatus() == false)
            { //The text for the main event
            level6.setMainEvent("To your right the path is dark, there must not be a grate for a while….to your left you can see better, but you can hear angry sounds and shouting, that way may be leading you back in to trouble….Either way you don’t know where you’re heading….which path?");  
            //The text for the buttons in level
            level6.setGoodChoice("Go right");
            level6.setUglyChoice("Go left");
            
            //The text for the consequences that will be displayed:
            level6.setGoodChoiceConsequence("You decide that you should investigate the right tunnel, and crawl into the dimness. Your crawling is slow, you can’t see and you’re hoping to keep your noise down, after all you are in the ceiling above. As you creep along you listen, but it is still quiet. You slowly crawl on into the darkness, gaining courage as you go. Nothing’s jumped out at you yet….\n" +
"	It feels like an eternity, although it may be only five minutes, and then you see some light. Coming up is a grate. You crawl a little faster and earnestly look down. Nothing of interest and you frown. You crawl on to the next, and below you see a room with several large monitors, and some aliens sitting before them. You crane your head to look the other way, and see a few more walking about the room; one looking at a clipboard, another regarding a chart. Perhaps it’s some sort of command center. Well, no escape pods. You crawl on for a while before feeling a strange tugging current. You cautiously go forward, not having any other way to go, and find there is a huge gap in the ventilation. It’s dark but after you stare a few moments your eyes make out a long chute dropping down, and it seems to be circulating a lot of air. This must lead to another wall grate, like the one you entered in. You are very careful crawling up to it, and crossing it is even trickier, but you manage, although you bang your foot roughly against the corner of the drop. \n" +
"	You crawl on, and for a while it gets dark, very dark. So dark that you start carefully feeling ahead with your hands to avoid tumbling into another one of those chutes, but then, to your relief, light floods in. You smile and pick up your pace, eager to see what room you’re over. Seems to be a room comprised of beds, the barracks perhaps? You crawl on, and it’s several more grates of unrecognized rooms and then….you see it. Not the escape pods, no, but you look down a grate to see the huge deck you were sprawled out on after being abducted. The place where the aliens first saw you, sprayed you with something, and handed you off to the scientists who would strip you, tag you, and lock you up. You shudder, but you’re still excited because it was from here you first caught sight of the pods which means they aren’t far! You look around carefully and you see a decent amount of aliens congregating in the room. With a little uncomfortable twisting you are able to look down to see the other side of the room…and you smile. To the right of the huge window that looks out into space there is a small silver door you remember well. The only difference is that when you last saw it you were on your knees being roughly handled, and you glanced some spacemen entering the room. When the doors had slid open that’s when you’ve gotten your look at them, the ships…. \n" +
"Behind that door is your escape, you’re sure of it, and you’re going to crawl right over that door. You look around your tunnel then crawl carefully over the exit you’re currently leaning over and creep over to the next one. No good, still in the same room…there! A tiny tunnel offshoot to your right, which MUST lead to the room with the pods….except the word tiny here means tiny. The vent gets significantly narrower, so small you are not sure you can get through. You bite your lip, feeling a terrifying claustrophobia as you inch towards it and consider the opening. It seems like such a narrow chute…and what if, god forbid…you get stuck? Starve to death, or suffocate trapped headfirst in this passage…\n" +
"	But there’s no going back, if you drop through one of the past grates you’ll be shot to pieces. You can’t possibly take all those guards, you’re going to have to sneak by them. You take a deep breath then drop to your stomach, stretching yours arms our first and wiggling them down the opening. Your head follows so that you are stretched out on your belly, worming your way in. You’re suddenly grateful for the days of hunger, anything that helps shrink your size as you caaaaaarefuly inch your way. With a breath of relief you realize your torso has gotten in and you just might pull this off. You set your palms flat and use them to drag your body along, then your toes join in and you’re slowly sliding through the passage. At last you reach the other side, where the space widens just a bit again. You’ve found yourself in a tiny dead end, light pouring in from the room below. You’re at least able to get your elbows under your body and push your head up enough to look down the grate you’ve found. You stare down and your heart skips a bit. This is it! You’re sure of it! You’ve found the pods!!! "); 
            level6.setUglyChoiceConsequence("Your blood pressure can’t take anymore gambles on dark places, you crawl left. Slowly, carefully….there are a lot of grates below you, and you don’t want any attention. You can hear a commotion, and sneak a look down. Below you is a stream of aliens, they appear to be mobilizing. It seems your escape has them in quite a state. You crawl on for a while, your mind spinning. You stop at each grate, peering down carefully hoping beyond hope this hair brained scheme of yours will work, and you’ll find the room with the pods. So far no luck, but you have seen an awful lot of aliens scuttling about and throwing open doors. They’re looking for you alright….and how long will it be before they look up here?\n" +
"	You creep on for a while, then see a flood of light ahead. It’s another grate….and the room you see through it is familiar! Below you is the lab where you were kept. You’re not sure if the drop in your stomach is from the horrible memories of that room or the knowledge that you’re backtracking, either way you take a steadying breathe and crawl on. It’s several more grates of unrecognized rooms and then….you see it. Not the escape pods, no, but you look down a grate to see the huge deck you were sprawled out on after being abducted. The place where the aliens first saw you, sprayed you with something, and handed you off to the scientists who would strip you, tag you, and lock you up. You shudder, but you’re still excited because it was from here you first caught sight of the pods which means they aren’t far! You look around carefully, you see a huge mass of aliens congregating in the room. With a little uncomfortable twisting you are able to look down to see the other side of the room…and you smile. To the right of the huge window that displays space there is a small silver door where a team of heavily armed aliens are standing guard. They’re waiting for you, and they don’t want you getting into that room. \n" +
"	You look up and try to peer around the dark tunnel. Behind that door is your escape, you’re sure of it, and you’re going to go right over their guards….which means you need to find a grate that will spit you out on the other side of that door. You crawl carefully over the exit you’re currently leaning over and creep over to the next one. No good, still in the same room…there! A tiny tunnel offshoots to the left, which means it MUST lead to the room with the pods….except the word tiny here means tiny. The vent gets significantly narrower, so small you are not sure you can get through. You bite your lip, feeling a terrifying claustrophobia as you inch towards it and consider the opening. It seems like such a narrow chute…and what if, god forbid…you get stuck? Starve to death, or suffocate trapped headfirst in this passage…\n" +
"	But there’s no going back, if you drop through one of the past grates you’ll be shot to pieces. You can’t possibly take all those guards, you’re going to have to sneak by them. You take a deep breath then drop to your belly, stretching yours arms our first and wiggling them down the opening. Your head follows so that you are stretched out on your belly, worming your way in. You’re suddenly grateful for the days of hunger, anything that helps shrink your size as you caaaaaarefuly inch your way. With a breath of relief you realize your torso has gotten in and you just might pull this off. You set your palms flat and use them to drag your body along, then your toes join in and you’re slowly sliding through the passage. At last you reach the other side, where the space widens just a bit again. You’ve found youself in a tiny dead end, light pouring in from the room below. You’re at least able to get your elbows under your body and push your head up enough to look down the grate you’ve found. You stare down and your heart skips a bit. This is it! You’re sure of it! You’ve found the pods!!! ");
            //The paths to the pictures
            level6.setPicPathMain("Resources/Space_Adv/chutenoeye.jpg");
            level6.setPicPathGood("Resources/Space_Adv/foundpodsnoeye.jpg");
             
            level6.setPicPathUgly("Resources/Space_Adv/foundpodsnoeye.jpg");
                //The text to be displayed on the buttons called by subInits
            level6.setGoodChoiceSub("YOU FOUND THEM!!!!");
                
            level6.setUglyChoiceSub("YOU FOUND THEM!!!!!!");
            //Initialize the level
            level6.init();
            //Make this level no longer accessable   
             sb6.setEnabled(false);
            //Enable button for next level
            sb7win.setEnabled(true);
                
            }//END
            
            //An adventuer who is whole and in chute facing fork
            if (adventurer.getEyeStatus() == true && adventurer.getLegStatus() ==true && level5half.getAPGood() == true)
            {  //The text for the main event
                level6.setMainEvent("You crawl, slowly, carefully, quietly, through the dim tunnels, pausing over each air vent to peer down into the room below. After what seems a long time, you reach what all adventurers dread….a fork in the road. To your right the path is dark, there must not be a grate for a while….to your left you can see better, and it seems as good a way to go as any. ");  
                //The text for the buttons in level
                level6.setGoodChoice("Go right");
                level6.setUglyChoice("Go left");
                
                //The text for the consequences that will be displayed:
                level6.setGoodChoiceConsequence("You decide that you should investigate the right tunnel, and crawl into the dimness. Your crawling is slow, you can’t see and you’re hoping to keep your noise down, after all you are in the ceiling above. As you creep along you listen, but it is still quiet. You slowly crawl on into the darkness, gaining courage as you go. Nothing’s jumped out at you yet….\n" +
"	It feels like an eternity, although it may be only five minutes, and then you see some light. Coming up is a grate. You crawl a little faster and earnestly look down. Nothing of interest and you frown. You crawl on to the next, and below you see a room with several large monitors, and some aliens sitting before them. You crane your head to look the other way, and see a few more walking about the room; one looking at a clipboard, another regarding a chart. Perhaps it’s some sort of command center. Well, no escape pods. You crawl on for a while before feeling a strange tugging current. You cautiously go forward, not having any other way to go, and find there is a huge gap in the ventilation. It’s dark but after you stare a few moments your eyes make out a long chute dropping down, and it seems to be circulating a lot of air. This must lead to another wall grate, like the one you entered in. You are very careful crawling up to it, and crossing it is even trickier, but you manage, although you bang your foot roughly against the corner of the drop. \n" +
"	You crawl on, and for a while it gets dark, very dark. So dark that you start carefully feeling ahead with your hands to avoid tumbling into another one of those chutes, but then, to your relief, light floods in. You smile and pick up your pace, eager to see what room you’re over. Seems to be a room comprised of beds, the barracks perhaps? You crawl on, and it’s several more grates of unrecognized rooms and then….you see it. Not the escape pods, no, but you look down a grate to see the huge deck you were sprawled out on after being abducted. The place where the aliens first saw you, sprayed you with something, and handed you off to the scientists who would strip you, tag you, and lock you up. You shudder, but you’re still excited because it was from here you first caught sight of the pods which means they aren’t far! You look around carefully and you see a decent amount of aliens congregating in the room. With a little uncomfortable twisting you are able to look down to see the other side of the room…and you smile. To the right of the huge window that looks out into space there is a small silver door you remember well. The only difference is that when you last saw it you were on your knees being roughly handled, and you glanced some spacemen entering the room. When the doors had slid open that’s when you’ve gotten your look at them, the ships…. \n" +
"Behind that door is your escape, you’re sure of it, and you’re going to crawl right over that door. You look around your tunnel then crawl carefully over the exit you’re currently leaning over and creep over to the next one. No good, still in the same room…there! A tiny tunnel offshoot to your right, which MUST lead to the room with the pods….except the word tiny here means tiny. The vent gets significantly narrower, so small you are not sure you can get through. You bite your lip, feeling a terrifying claustrophobia as you inch towards it and consider the opening. It seems like such a narrow chute…and what if, god forbid…you get stuck? Starve to death, or suffocate trapped headfirst in this passage…\n" +
"	But there’s no going back, if you drop through one of the past grates you’ll be shot to pieces. You can’t possibly take all those guards, you’re going to have to sneak by them. You take a deep breath then drop to your stomach, stretching yours arms our first and wiggling them down the opening. Your head follows so that you are stretched out on your belly, worming your way in. You’re suddenly grateful for the days of hunger, anything that helps shrink your size as you caaaaaarefuly inch your way. With a breath of relief you realize your torso has gotten in and you just might pull this off. You set your palms flat and use them to drag your body along, then your toes join in and you’re slowly sliding through the passage. At last you reach the other side, where the space widens just a bit again. You’ve found yourself in a tiny dead end, light pouring in from the room below. You’re at least able to get your elbows under your body and push your head up enough to look down the grate you’ve found. You stare down and your heart skips a bit. This is it! You’re sure of it! You’ve found the pods!!! ") ;
               
                level6.setUglyChoiceConsequence("Your blood pressure can’t take anymore gambles on dark places, you crawl left. Slowly, carefully….there are a lot of grates below you, and you don’t want any attention, so far you’ve done an excellent job of avoiding it. You crawl on for a while, stopping at each grate and peering down carefully, hoping beyond hope this hair brained scheme of yours will work, and you’ll find the room with the pods. So far no luck, but you have seen an awful lot of aliens. They’re going about their daily business calmly, and it comforts you. You are still undetected.\n" +
"	You creep on for a while, then see a flood of light ahead. It’s another grate….and the room you see through it is familiar! Below you is the lab where you were kept. You’re not sure if the drop in your stomach is from the horrible memories of that room or the knowledge that you’re backtracking, either way you take a steadying breathe and crawl on. It’s several more grates of unrecognized rooms and then….you see it. Not the escape pods, no, but you look down a grate to see the huge deck you were sprawled out on after being abducted. The place where the aliens first saw you, sprayed you with something, and handed you off to the scientists who would strip you, tag you, and lock you up. You shudder, but you’re still excited because it was from here you first caught sight of the pods which means they aren’t far! You look around carefully and you see a decent amount of aliens congregating in the room. With a little uncomfortable twisting you are able to look down to see the other side of the room…and you smile. To the right of the huge window that looks out into space there is a small silver door you remember well. The only difference is that when you last saw it you were on your knees being roughly handled, and you glanced some spacemen entering the room. When the doors had slid open that’s when you’ve gotten your look at them, the ships…. \n" +
"Behind that door is your escape, you’re sure of it, and you’re going to crawl right over that door. You look around your tunnel then crawl carefully over the exit you’re currently leaning over and creep over to the next one. No good, still in the same room…there! A tiny tunnel offshoot to your left which MUST lead to the room with the pods….except the word tiny here means tiny. The vent gets significantly narrower, so small you are not sure you can get through. You bite your lip, feeling a terrifying claustrophobia as you inch towards it and consider the opening. It seems like such a narrow chute…and what if, god forbid…you get stuck? Starve to death, or suffocate trapped headfirst in this passage…\n" +
"	But there’s no going back, if you drop through one of the past grates you’ll be shot to pieces. You can’t possibly take all those guards, you’re going to have to sneak by them. You take a deep breath then drop to your stomach, stretching yours arms our first and wiggling them down the opening. Your head follows so that you are stretched out on your belly, worming your way in. You’re suddenly grateful for the days of hunger, anything that helps shrink your size as you caaaaaarefuly inch your way. With a breath of relief you realize your torso has gotten in and you just might pull this off. You set your palms flat and use them to drag your body along, then your toes join in and you’re slowly sliding through the passage. At last you reach the other side, where the space widens just a bit again. You’ve found yourself in a tiny dead end, light pouring in from the room below. You’re at least able to get your elbows under your body and push your head up enough to look down the grate you’ve found. You stare down and your heart skips a bit. This is it! You’re sure of it! You’ve found the pods!!! ");
                //The paths to the pictures
                level6.setPicPathMain("Resources/Space_Adv/chuteshirt.jpg");
                level6.setPicPathGood("Resources/Space_Adv/foundpodsshirt.jpg");
                
                level6.setPicPathUgly("Resources/Space_Adv/foundpodsshirt.jpg");
                //The text to be displayed on the buttons called by subInits
                level6.setGoodChoiceSub("You found them!!!!");
                
                level6.setUglyChoiceSub("You found them!!!!");
                //Initialize the level
                level6.init();
                //Make this level no longer accessable   
             sb6.setEnabled(false);
                //Enable button for next level
                sb7win.setEnabled(true); 
            }//END
            
             //A healthy adventurer who found a map and is off into labryinth    
                if (adventurer.getEyeStatus() == true && adventurer.getLegStatus() ==true && level5half .getAPUgly() == true)
                {  //The text for the main event
                level6.setMainEvent("You’ve found yourself in a small, sparse walkway, with a gray floor and bare walls. It seems this is some sort of utilitarian hall, and according to the map it has an exit back in the lab. You take a deep breath, you aren’t thrilled to be going back THERE, but if you can get to the hall outside of the lab, you can follow the path you memorized to the escape pods. You hurry through the hall, careful of noise, and take the first left you see. Left, left, straight, right. You’re sure you remember it, the way back to the lab. Left, left, straight, right. \n" +
"	Ok, one left down. That leaves another left, straight, and then a right. This is something far too important to forget. Your brisk pace has picked up again, you’re now trotting down this foreboding tunnel, watching carefully for unwanted surprises. Luckily you’re mostly unharmed, still strong and ready for a fight. You’re watching the doors carefully, waiting for any unwanted surprises.  Perhaps it’s that mentality that first makes you jump.….oh god….did that shadow just move? Your heart stops and you freeze, quickly drawing a gun. You wait, but you see nothing. May just have been your imagination, but you would have sworn you saw something move over by those crates. Now what?");  
                //The text for the buttons in level
                level6.setGoodChoice("Go on");
                level6.setUglyChoice("Go investigate the crates");
                
                //The text for the consequences that will be displayed:
                level6.setGoodChoiceConsequence("You shake your head. No….no there was nothing there. You’re just scared, tired, and trying to escape from a group of crazy aliens….that would give anyone the heebie-jeebies. You shake off your panicked imagination and walk on….a bit more quickly. ") ;
                 
                level6.setUglyChoiceConsequence("You take a deep breath, and, raising your blaster, you slowly walk forward. Another step….another step….you’ve reached the boxes….nothing yet. You keep your gun focused as you lean forward and then kick one of the crates over. You jump back, weapon pointed. Still nothing. With a sigh you straighten up. There was nothing there. You’re just scared, tired, and trying to escape alien torture….that would give anyone the heebie-jeebies. You shake off your panicked imagination and return the blaster to your makeshift belt. ");
                //The paths to the pictures
                level6.setPicPathMain("Resources/Space_Adv/lab.jpg");
                level6.setPicPathGood("Resources/Space_Adv/lab.jpg");
                
                level6.setPicPathUgly("Resources/Space_Adv/lab.jpg");
                //The text to be displayed on the buttons called by subInits
                level6.setGoodChoiceSub("It was just your imagination! Right?....");
                
                level6.setUglyChoiceSub("It was just your imagination! Right?....");
                //Initialize the level
                level6.init();
                //Make this level no longer accessable   
             sb6.setEnabled(false);
                //Enable button for next level
                sb7.setEnabled(true);
                }
            }//End level 6
             

            //Level 7
            //This level is for the players who are about to enter the labriynth
            //In this level, your player is whole and entering the labrinyth
            //Or the player is missing a leg and entering a labrintyh
            else if (e.getSource() == sb7)
            {
                //This level is the same, the pictures just vary depending on leg status
                
                //The text for the main event
                level7.setMainEvent("It isn’t long after your run-in with your nerves that you reach a branching in the passage, but luckily you remember the way to go. Don’t you?");  
                //The text for the buttons in level
                level7.setGoodChoice("Go left");
                level7.setUglyChoice("Go right");
                
                //The text for the consequences that will be displayed:
                level7.setGoodChoiceConsequence("Ha! As if a scare by some boxes can distract you! Mind like a steel trap, or maybe you were smart enough to write it down…either way you are confident in your choice to turn left. You walk down a short way before you reach the next decision, but you’re sure you remember this one too! You can keep walking straight on the path before you, or take a right.") ;
                
                level7.setUglyChoiceConsequence("It was right next, you’re almost positive….you….think….was it right? Well, it’s no problem, I mean you can just retrace your steps if you’re wrong you figure. You take off down the right side of the tunnel, but in almost no time at all are at another fork in the road. Now what? You can keep going straight, you can veer off to the left, or you can turn around and head back.");
                
                //If the adventurer has no leg
                 if(adventurer.getLegStatus() == false)
                {//The paths to the pictures
                level7.setPicPathMain("Resources/Space_Adv/labnoleg.jpg");
                level7.setPicPathGood("Resources/Space_Adv/walkingnaked.jpg");
                
                level7.setPicPathUgly("Resources/Space_Adv/walkingnaked.jpg");
                }
                 //The paths to the pictures if the adventurer has both legs
                level7.setPicPathMain("Resources/Space_Adv/lab.jpg");
                level7.setPicPathGood("Resources/Space_Adv/lab.jpg");
                
                level7.setPicPathUgly("Resources/Space_Adv/lab.jpg");
                
                //The text to be displayed on the buttons called by subInits
                level7.setGoodChoiceSub("You remember the correct path, right? RIGHT?!");
               
                level7.setUglyChoiceSub("So many decisions! Which way?! WHICH WAY?!");
                //Initialize the level
                level7.init();
                //Make this level no longer accessable   
            // sb7.setEnabled(false);
                //Enable button for next level
                //Decided by their choice and timer event activates, see top of screen
            }//END level 7
            
            //Level 8 of the labrinyth, if the player went the wrong way in level 7
            //You can be the healthy or sans a leg
            else if (e.getSource() == sb8lab)
            { 
    //The text for the main event, the same no matter shape of player
    level8lab.setMainEvent("Now what? You can keep going straight, you can veer off to the left, or you can turn around and head back.");  
    //The text for the buttons in level, the same no matter shape of player
    level8lab.setGoodChoice("Turn back");
    level8lab.setUglyChoice("Veer Left");
    level8lab.setBadChoice("Go Straight");
    //The bad consequence is also the same for both players, textwise
    level8lab.setBadChoiceConsequence("Straight sounds right, so you go on. You keep walking down the path until you reach a door. At last….you sigh in relief. This must be the door that takes you back to the lab. You type on the pad to your right, and then step back. Nothing happens. You frown and wait another moment, then try to get the door to open again. A robotic voice sounds from the box, but regrettably, you don’t speak their language. Oh well, try try again? You reach to start button smashing, when a small screen opens and a light begins to scan you.\n" +
"	The sensor scans you once, twice….and then the light turns red. A high pitch siren goes off, and before you can react a sharp orange beam shoots from the panel and slices a bright, burning hole in your neck. It would appear you don’t have clearance to open that door."); 
   //If adventurer has no leg
    if(adventurer.getLegStatus() == false)
    
    {//The text for the consequences that will be displayed:
        level8lab.setGoodChoiceConsequence("Something isn’t right, and you know better than to be reckless right now. In your current state, you are not going to live through another bad decision. You turn around and start back tracking until you reach the previous intersection of tunnels. You change paths, and beginning walking what would have been a left path. Let’s see….that means you’ve gone two lefts now.\n" +
"	Alright! You know you’re going the right way now! It was two lefts, that’s right! You walk down a short way before you reach the next decision, but you’re sure you remember this one too! You can keep walking straight on the path before you, or take a right. ") ;
     
    level8lab.setUglyChoiceConsequence("You take the left, pleasantly confident in your choice. Going straight makes no sense, this left path, this left path can’t go wrong…..you hobble along, until the left path goes horribly, horribly wrong. A door a few yards before you opens and an unsuspecting worker meanders into your path. You both freeze a moment, but then you both grab for your weapons. Unfortunately, with fear in his favor, and injuries against you….this is not a shoot-out you can win. As you fall to the floor you think distantly of Earth, of your home, of spaghetti….you are so dang hungry. You’re also dead, but really when was the last time you had a decent meal?");
         //The paths to the pictures
    level8lab.setPicPathMain("Resources/Space_Adv/labnoleg.jpg");
     level8lab.setPicPathGood("Resources/Space_Adv/walkingnaked.jpg");
     level8lab.setPicPathBad("Resources/Space_Adv/headlessnoleg.jpg");
     level8lab.setPicPathUgly("Resources/Space_Adv/shotdeadnolegRe.png");
     //The text to be displayed on the buttons called by subInits
    level8lab.setGoodChoiceSub("That's right! Listen to your guts! Now can they lead you the right way again?");
    level8lab.setBadChoiceSub("Button smashing never works! You shouldn't have lost your HEAD in this situation...");
    level8lab.setUglyChoiceSub("Maybe if you'd had all your limbs...Oh well, spaghetti IS delicious....");
    }
    else //Adventurer is whole
    {level8lab.setGoodChoiceConsequence("Something isn’t right. You turn around and start back tracking until you reach the previous intersection of tunnels. You change paths, and beginning walking what would have been a left path. Let’s see….that means you’ve gone two lefts now.\n" +
"	Alright! You know you’re going the right way now! It was two lefts, that’s right! You walk down a short way before you reach the next decision, but you’re sure you remember this one too! You can keep walking straight on the path before you, or take a right. ") ;
     
    level8lab.setUglyChoiceConsequence("You take the left, pleasantly confident in your choice. Going straight makes no sense, this left path, this left path can’t go wrong…..you stride along, until the left path goes horribly, horribly wrong. A door a few yards before you opens and an unsuspecting worker meanders into your path. You both freeze a moment, but then you both grab for your weapons. Luckily you are faster, fueled with your fear and already having a weapon cocked and ready. You blast the alien and his body flies back through the tunnel he came through. ");
    //The paths to the pictures
    level8lab.setPicPathMain("Resources/Space_Adv/lab.jpg");
     level8lab.setPicPathGood("Resources/Space_Adv/walkingshirt.jpg");
     level8lab.setPicPathBad("Resources/Space_Adv/headlessshirt.jpg");
     level8lab.setPicPathUgly("Resources/Space_Adv/facetheworld.jpg");
     //The text to be displayed on the buttons called by subInits
    level8lab.setGoodChoiceSub("That's right! Listen to your guts! Now can they lead you the right way again?");
    level8lab.setBadChoiceSub("Button smashing never works! You shouldn't have lost your HEAD in this situation...");
    level8lab.setUglyChoiceSub("You're getting good at the killing your evil alien captors thing. But what now?");}
    //Initialize the level
    level8lab.init();
    //Make this level no longer accessable   
            // sb8.setEnabled(false);
    //Enable button for next level
   //Decided by their choice and timer event activates, see top of screen
            
            }//End level 8 lab
            
            //Level 9lab
            //The only adventurer here is the fully healthy one. The others either had to turn back
            //Or die in previous levels.
            else if (e.getSource() == sb9lab)
            {
    //The text for the main event
    level9lab.setMainEvent("Breathing heavily you lower your gun, then cast a look about. Where the heck are you? And where should you go now? Left must not have been right….but how to get back?");  
    //The text for the buttons in level
    level9lab.setGoodChoice("Try to retrace your steps and get back to the path");
    
    level9lab.setBadChoice("Step over the alien’s body and walk down the way he came");
    //The text for the consequences that will be displayed:
    level9lab.setGoodChoiceConsequence("Neither choice particularly appeals to you….but now is not a time for free styling, so you turn around and head back. Let’s see…how did you get here? You need to reverse all your choices if you want to get back….") ;
    level9lab.setBadChoiceConsequence("Neither of these choices are great, but you don’t think you can find your way back to where you started, so it’s time to forge a new path. This alien came from somewhere! And you’re going to find it. You step over the singed corpse and begin down his path. The tunnel leads you fairly swiftly to a door and you smile. Ha! Now you can get out of this maze-like horror and find your way to the pods. Or so you think…..actually when you hit the keypad and the door slides open you are looking at some wide eyed, and then very angry alien soldiers in various stage of dress….it seems you’ve found the barracks instead, and they aren’t happy to see you.\n" +
"		Whoops.");  
   
    //The paths to the pictures
    level9lab.setPicPathMain("Resources/Space_Adv/lab.jpeg");
     level9lab.setPicPathGood("Resources/Space_Adv/walkingshirt.jpg");
     level9lab.setPicPathBad("Resources/Space_Adv/shotshirt.jpg");
     
     //The text to be displayed on the buttons called by subInits
    level9lab.setGoodChoiceSub("So confusing!!1 Can you find the way!??");
    level9lab.setBadChoiceSub("You theory it was time to forge a new path had some HOLES in it.");
  
    //Initialize the level
    level9lab.init();
    //Enable button for next level, which in this case is a previous level as it
    //takes you back to eight
    sb8.setEnabled(true);
    //Make this level no longer accessable   
             sb9lab.setEnabled(false);
            }//ENd level 9lab
            
            //level 8 can either be gotten to straight away, or by good choices in the labrintyh
            //However it is activated doesn't matter. The adventurer will have a leg or not
            else if (e.getSource() == sb8)
            {//This level is the same for both adventurers, only pictures will change
    level8.setMainEvent("You walk down a short way before you reach the next decision, but you’re sure you remember this one too! You can keep walking straight on the path before you, or take a right.");  
    //The text for the buttons in level
    level8.setGoodChoice("Straight");
    
    level8.setBadChoice("Right");
    //The text for the consequences that will be displayed:
    level8.setGoodChoiceConsequence("It’s amazing how well you can remember a four step map when your life depends on it. Sticking to the course you walk straight ahead, and keep on your desperate march. You’ve got to make the next choice correctly, follow the path, and get out to the lab. From the lab you can find your way to the escape pods and get out of this place….You’re going home! To your planet, to your apartment….to some dang spaghetti…You’re desperately hungry.") ;
    level8.setBadChoiceConsequence("You cut off to the right and march down the path. You’re close now, just get out of these damn hallways and get to a pod….Well….at least you would have been close, if you’d chosen the right path. Instead, well, you’re going to keep wandering. This right path is a winding one, and it leads you down a long hall that all looks very familiar. What makes things worse is that after several minutes of walking you hit a dead end. Crap! Something in your plan must have been wrong! \n" +
"	You turn and go back, hoping to retrace your steps, and, in your defense, under other circumstances that might have worked. Unfortunately, you will be stuck wondering these maze like corridors for too long, and you will be found before you get out. You are stuck trying to find the start of your journey for what feels like an eternity, and then the alien forces figure out your plan, and promptly end it.\n" +
"	….well….I guess you should have gone straight….");  
  
    //The paths to the pictures
    if(adventurer.getLegStatus() == false)
    {level8.setPicPathMain("Resources/Space_Adv/labnoleg.jpg");
     level8.setPicPathGood("Resources/Space_Adv/walkingnaked.jpg");
     level8.setPicPathBad("Resources/Space_Adv/shotdeadnolegRe.png");
    }
    else
     {level8.setPicPathMain("Resources/Space_Adv/lab.jpg");
     level8.setPicPathGood("Resources/Space_Adv/walkingshirt.jpg");
     level8.setPicPathBad("Resources/Space_Adv/shotdead.jpg");
    }   
     //The text to be displayed on the buttons called by subInits
    level8.setGoodChoiceSub("Perhaps food awaits? You should BE so lucky!!!");
    level8.setBadChoiceSub("Well, at least you're not hungry anymore....");
    
    //Initialize the level
    level8.init();
    //Make this level no longer accessable   
             sb8.setEnabled(false);
    //Enable button for next level
    sb9.setEnabled(true);
    
            } //end level 8
            
            //Begin level nine
            //In this level you are either an adventurer who has lost a leg, or a whole adventurer
            //The level is the same for both except pictures and the good choice consequences text
            else if (e.getSource() == sb9)
            {
    //The text for the main event
    level9.setMainEvent("Your ruminating on the culinary wonders of your home brings you to the next choice. It’s the last step, is it a left, or a right?");  
    //The text for the buttons in level
    level9.setGoodChoice("Right");
    
    level9.setBadChoice("Left");
    //The text for the consequences that will be displayed:
   
    level9.setBadChoiceConsequence("You turn left, and hurry down the pass. It leads to a door and you smile. This must be it! You’ve found the lab! Or so you think…..actually when you hit the keypad and the door slides open you are looking at some wide eyed, and then very angry alien soldiers in various stage of dress….it seems you’ve found the barracks instead, and they aren’t happy to see you.\n" +
    "		Whoops.");  
    
     //The paths to the pictures
    if(adventurer.getLegStatus() == false)
    {level9.setPicPathMain("Resources/Space_Adv/labnoleg.jpg");
     level9.setPicPathGood("Resources/Space_Adv/facetheworldnoleg.jpg");
     level9.setPicPathBad("Resources/Space_Adv/shotdeadnolegRe.png");
     level9.setGoodChoiceConsequence("You turn right, having remembered the path and correctly navigated yourself through it. You are determined, you are fierce, you are going home. The right leads you immediately to a door and you pull open the wall panel. You hit the large button that usually opens the door, but it blinks once and makes an error noise. The door remains shut. You try again, but the keypad just blinks at you expectantly. It seems this door wants a code. \n" +
"	Instead, the door gets a crazy alien bazooka blaster. Its kickback hurts your arm, but you don’t even hesitate, you just wriggle the giant thing back into your makeshift holster and stomp through the large, smoking hole in the door. You are over this crap. \n" +
"	When the smoke clears you are standing in a large, overly white room full of medical equipment and cages. You wince and your stomach turns at the memories, but you march through the room, not even stopping as you level a blaster and blow the head off the shocked scientist running towards you. You reach the opposite door, blaster in hand, and as the doors slide open for you an unafraid human steps through it. These freaks are done hurting you.");
    level9.setGoodChoiceSub("You are a badass!");}
    else
     {level9.setPicPathMain("Resources/Space_Adv/lab.jpg");
     level9.setPicPathGood("Resources/Space_Adv/walkingshirt.jpg");
     level9.setPicPathBad("Resources/Space_Adv/shotshirt.jpg");
     level9.setGoodChoiceConsequence("           You turn right, having remembered the path and correctly navigated yourself through it. The right leads you immediately to a door and you happily pull open the wall panel. You hit the large button that usually opens the door, but it blinks once and makes an error noise. The door remains shut. You try again, but the keypad just blinks at you expectantly. It seems this door wants a code. You cock your head and think. You don’t know the code….how will you get through this door? You don’t want to just guess and button smash, it might set off an alarm, or lock the door. You pull your belt out to make room for your blaster and snuggle it against your body, and that’s when you feel it. Begin level 10\n" +
"	The tiniest little hardness brushes against your hands and you pause. You bring your palms up to pat your sides and sure enough you feel it again. There’s something in your shirt. You dig around for a minute in your makeshift garb and then you find the small pocket sewn on the inside of your garment. You reach inside and pull out a hard plastic card!! It’s an id!! The old alien was maintenance staff, you remember that!!! Excitedly you flip over the card, already knowing what you’ll find and your face lights up. There’s a four digit code stamped on the back.\n" +
"	You hurriedly type it into the panel and then bite your lip.\n" +
"	Please, please, please… You think, watching as the numbers start blinking.\n" +
"	Then you hear the telling hydraulics and the door slides open before you.\n" +
"	“Yes!!!” You can’t contain your squeak as you throw boy your arms up triumphantly and dart through the passage. You’ve done your best to remain silent through all this, and you remember why as you step into the overly white room full of medical equipment. Your stomach turns at the sight and the memories it brings, and then drops again as you see a scientist coming from around some of the cages. Crap…looks like he heard you. Thinking fast you leap, literally fling, yourself across the room, sliding across the gleaming floors to get behind one of the consoles. \n" +
"	The alien comes around the corner, head cocked quizzically, but sees only the open door. He pauses a moment, stares….but then walks over and closes the door. Moving fast you dart while his back is turned and run for another vantage point further in the room. The evidence of your scuffle has been cleaned up….and you know they’re looking for you. You look over your shoulder, he’s over there….this may be your only chance. You take a deep breath and make a bolt for it, running as fast and as hard as you can before darting behind a huge container of used needles….ew….how can they just leave those out—not now!!! Focus! You want to live don’t you?\n" +
"	You watch as the scientist lumbers by, then your eyes go to the door. He’s leaning over his work…his back is turned….You close your eyes, take a deep breath, then begin crawling out into the open. If he turns your dead, but if you can just get to…There’s a loud clamor and you’re pretty sure your heart literally stops. You freeze, but then, after the most terrifying second of your life, you hear him cursing and see that he was the one making the noise, not you. He bends over to pick up his fallen utensil and you, slowly, still recovering from your near heart attack, crawl on.");
    level9.setGoodChoiceSub("You are so close! Don't blow it now!");
     }  
     //The text to be displayed on the buttons called by subInits
    
    level9.setBadChoiceSub("If only you had remmebered the right way, instead of guessing and taking a SHOT in the dark!");
    
    //Initialize the level
    level9.init();
    //Make this level no longer accessable   
    sb9.setEnabled(false);
    //Enable button for next level
    sb10.setEnabled(true);
   
            }//End level nine
            
            //Level 10
            //Varies slightly depending on status of adventurer
            else if (e.getSource() == sb10)
            { //If adventurer has no leg
                if (adventurer.getLegStatus() == false)
            {
    //The text for the main event
    level10.setMainEvent("You take a left out of the lab, smiling bitterly as you march towards the main deck and consider how very close it was to you all this time. You don’t stomp down the main path and kick open the door, because as determined as you’re feeling…that’s suicide. Instead you get to the huge sealed door, the one you know will lead you into the deck and you walk around it. You studied that map, you know what you’re looking for…and there it is! A small box sticking out from the wall…and electric fuse box. You whirl your biggest blaster, and strike the box with the butt until you hear the snap. You shudder, that blow was not appreciated by your shoulder but you haven’t got time. Using your good arm you peel the broken door away and toss the metal piece aside. Before you is a panel box full of wires and switches, a box you stick your hand right into, grab a fistful of, and yank. The reaction is immediate. The power goes out above you, the door to your escape begins opening and shutting frantically, you hear shouts and chaos from the aliens, and the emergency siren turns on, and cuts off rapidly. You grab another handful and yank again, this time hearing some shouts down the hall where they’re losing power. You turn quickly, hobbling in earnest to the other side of the door, where you nestle into a small crevice.\n" +
"	The door is still malfunctioning, opening and shutting at random, and so you watch carefully as the aliens struggling on the other side cut the wire on their end to severe its power and avoid crushing themselves. The worker hurries through, clearly intending to check the box. You stay steady, breathing carefully. You checked that diagram carefully, you saw all the boxes that were marked with symbols, and this one had only been marked with electricity. It’s created a fantastic distraction without risking the ships….but you’re still going to have to get to them alive.\n" +
"	The first alien has spotted the box…and there’s no mistaking the sabotage. It freezes as it understands, then turns and shouts through the door, gesticulating wildly. Its back is turned, it’s calling more. You’ve got two seconds, if that, and a gun in your hand.");  
    //The text for the buttons in level
    level10.setGoodChoice("Create a distraction and try to sneak into the room");
    
    level10.setBadChoice("Shoot him while his guard is down and make your move");
    //The text for the consequences that will be displayed:
    level10.setGoodChoiceConsequence("Thinking fast you don’t use your gun, you fling it. You throw it as hard and as far as you can, letting it sail down the hall with a loud ‘clunk’! and an appropriate amount of clatter. The alien in the door frame snaps his head around and shouts, tacking off down the hall after the noise, and bringing a generous amount of his squad with him. They go thundering away after, they think, their saboteur and you lean around the door frame and assess the deck. It’s a huge, room, with towering imposing class walls that afford a generous view of the galaxy. Under other circumstances, it’d be beautiful. On the far end of the room is a small silver door, and you know exactly what’s beyond it. Your heart rises in your chest, you are almost there.\n" +
"	There’s only two now, two you can handle. You whirl around the door frame and go barreling in guns raised. Your injured arm has taken too much abuse and is swinging uselessly at your side, but you’ve fired into them both before they have time to panic. They hit the ground, one rolling and wailing, clutching his new injuries. You pause over his body, but you don’t kill him….you just divest him of his weapons and kick him in the arm for good measure.\n" +
"	The panel at the door is locked, but you see a small bar on the side that looks like it’s for swiping, it looks like the credit card machines on earth. You turn, and smile at your new little alien friend.\n" +
"After an unnecessarily, and unapologetically rough search, you find a small plastic card on his person, and swipe it through the door. With two blinks on the pad, the door obediently slides open, and you walk through that door frame as the weight of the world falls off your poor broken shoulders. You’ve done it….you’re inside. You let out a huge sigh, and then hurry over to the pods. You beat every odd…and you had some bumpy patches along the way, but you’ve found the ships….now you just have to get the heck away from here. ") ;
    level10.setBadChoiceConsequence("You leap from your hiding place and open fire, and to your credit, missing a leg, missing the use of one arm, and full of burning wounds, you are a very brace, fantastic warrior. You take down no small amount of their numbers, because you start firing, and you don’t stop. You shoot down the first, and stepping over his body, cross the threshold raining destruction. Regrettably, the blaster eventually stops firing, and it’s reaching for another weapon that gives them the seconds they need to overwhelm you with sheer numbers. You made it far. Really far. But after being as beaten and mistreated as you’ve been, these turd-crunches decided to join in, and blow you into a zillion pieces across the deck. Don’t die without comfort though! Know that as your blasted across the room, as your pieces are strewn through the air…one of those dudes totally had their mouth open. Heh heh heeeeeeeeeh.");  
    
    //The paths to the pictures
    level10.setPicPathMain("Resources/Space_Adv/sabatogenoleg.jpg");
     level10.setPicPathGood("Resources/Space_Adv/foundpodsnoleg.jpg");
     level10.setPicPathBad("Resources/Space_Adv/piecesshot.jpg");
     
     //The text to be displayed on the buttons called by subInits
    level10.setGoodChoiceSub("You found them!! You did it!!!");
    level10.setBadChoiceSub("Serves that alien right! You hope you poison him!");
    
    //Initialize the level
    level10.init();
    //Make this level no longer accessable   
    sb10.setEnabled(false);
    //Enable button for next level
    sb11win.setEnabled(true);

            } //END
            
                else//Adventurer is whole
            {
              
    //The text for the main event
    level10.setMainEvent("You make it to the door and dart through it, smiling in relief as you find yourself back in this hallway. It’s hard to believe, how close you were to them all this time. You take a left out of the lab and hurry down the hall, down to the main deck. You don’t throw open the door and run in shooting, because that’d be suicide. Instead you get to the huge sealed door, the one you know will lead you into the deck and you walk around it. You studied that map, you know what you’re looking for…and there it is! A small box sticking out from the wall…and electric fuse box. You whirl your biggest blaster, and strike the box with the butt until you hear the snap. You’re strong, so you are quick and quiet about it. You peel the broken door away and toss the metal piece aside. Before you is a panel box full of wires and switches, a box you stick your hand right into, grab a fistful of, and yank. The reaction is immediate. The power goes out above you, the door to your escape begins opening and shutting frantically, you hear shouts and chaos from the aliens, and the emergency siren turns on, and cuts off rapidly. You grab another handful and yank again, this time hearing some shouts down the hall where they’re losing power. You turn quickly and dart to the other side of the door where you nestle into a small crevice.\n" +
"	The door is still malfunctioning, opening and shutting at random, and so you watch carefully as the aliens struggling on the other side cut the wire on their end to severe its power and avoid crushing themselves. The worker hurries through, clearly intending to check the box. You stay steady, breathing carefully. You checked that diagram carefully, you saw all the boxes that were marked with symbols, and this one had only been marked with electricity. It’s created a fantastic distraction without risking the ships….but you’re still going to have to get to them alive.\n" +
"	The first alien has spotted the box…and there’s no mistaking the sabotage. It freezes as it understands, then turns and shouts through the door, gesticulating wildly. Its back is turned, it’s calling more. You’ve got two seconds, if that, and a gun in your hand.");  
    //The text for the buttons in level
    level10.setGoodChoice("Create a distraction and try to sneak into the room");
   
    level10.setBadChoice("Shoot him while his guard is down and make your move");
    //The text for the consequences that will be displayed:
    level10.setGoodChoiceConsequence("Thinking fast you don’t use your gun, you fling it. You throw it as hard and as far as you can, letting it sail down the hall with a loud ‘clunk’ and an appropriate amount of clatter. The alien in the door frame snaps his head around and shouts, taking off down the hall after the noise, and bringing a generous amount of his squad with him. They go thundering away after, they think, their saboteur and you lean around the door frame and assess the deck. It’s a huge, room, with towering imposing glass walls that afford a generous view of the galaxy. Under other circumstances, it’d be beautiful. On the far end of the room is a small silver door, and you know exactly what’s beyond it. Your heart rises in your chest, you are almost there.\n" +
"	There’s only two now, two you can handle. You whirl around the door frame and go barreling in guns raised. You’ve fired into them both before they have time to panic. They hit the ground, one rolling and wailing, clutching his new injuries. You pause over its body, but you don’t kill it….you just divest it of its weapons and kick him in the arm for good measure.\n" +
"	The panel at the door is locked, but you see a small bar on the side that looks like it’s for swiping, it looks like the credit card machines on earth. You turn, and smile at your new little alien friend.\n" +
"After an unnecessarily, and unapologetically rough search, you find a small plastic card on its person, and swipe it through the door. With two blinks on the pad, the door obediently slides open, and you walk through that door frame as the weight of the world falls off your shoulders. You’ve done it….you’re inside. You let out a huge sigh, and then hurry over to the pods. You beat every odd…and you had some bumpy patches along the way, but you’ve found the ships….now you just have to get the heck away from here. ") ;
    
    level10.setUglyChoiceConsequence("You leap from your hiding place and open fire. It may have seemed crazy in the moment, and perhaps you could have chosen a safer, less violent path, but you are strong and have a gun in each hand.  You start firing, and you don’t stop. You shoot down the first, and stepping over his body, cross the threshold raining destruction. You fire from both directions, shooting your adversaries to ribbons. All the aliens before you fall to the ground, some still alive and groaning, others you’re unsure of. It’s the alien who was behind you who is able to hurt you. While you’re decimating the enemies before you, you’re shot in the back. With a scream you fall to the ground, and although you’re quick to turn around, he gets you again before you can fire, and it is a direct blow to your quads. You scream in pain as a huge burning wound settles in your leg, but, having shot down this attacker….you are now safe, at least for the moment. Reinforcements won’t be too far away, as someone will come to check the fuse box and see the bodies.\n" +
"Despite the agony you roll back to your stomach and attempt to push yourself up. Oh god…ok….putting weight on it is not an option, your leg is definitely going to need some time to recover. In the meantime, you’re now a bit handicapped, but you’ve cleared the room and the door is in front of you. With another grunt of pain you manage to stagger up, and begin hobbling over to the pods. Of the two aliens who had been standing guard, one rolling and wailing, clutching its new injuries. You pause over its body, but you don’t kill it….you just divest it of its weapons and kick it in the arm for good measure.\n" +
"	The panel at the door is locked, but you see a small bar on the side that looks like it’s for swiping, it looks like the credit card machines on earth. You turn, and smile at your new little alien friend.\n" +
"After an unnecessarily, and unapologetically rough search, you find a small plastic card on its person, and swipe it through the door. With two blinks on the pad, the door obediently slides open, and you walk through that door frame as the weight of the world falls off your shoulders. You’ve done it….you’re inside. You let out a huge sigh, and then hurry over to the pods. You beat every odd…and you had some bumpy patches along the way, but you’ve found the ships….now you just have to get the heck away from here. ");
    //The paths to the pictures
    level10.setPicPathMain("Resources/Space_Adv/sabatoge.jpg");
     level10.setPicPathGood("Resources/Space_Adv/foundpodsshirt.jpg");
     
     level10.setPicPathUgly("Resources/Space_Adv/foundpodsshirt.jpg");
     //The text to be displayed on the buttons called by subInits
    level10.setGoodChoiceSub("You did it! You found the escape pods!!!");
   
    level10.setUglyChoiceSub("You did it! You found the escape pods!!!");
    //Initialize the level
    level10.init();
    //Make this level no longer accessable   
             sb10.setEnabled(false);
    //Enable button for next level
    sb11win.setEnabled(true);
    
            }
      
            }//End level 10
            
            //Begin level11win.
            //This level has only one choice, excape and win the game!
            //The story is slightly different based on status of adventurer
            
            else if (e.getSource() == sb11win)
            { // If the adventurer has no leg
                if(adventurer.getLegStatus() == false)
                {
    //The text for the main event
    level11.setMainEvent("You hobble to a ship, and your hand starts patting the glass, the metal casings, looking for a box, a key, a door, something. You drop to your knees and look underneath, then you rise to your tiptoes on your remaining foot and look over the top. Door, door, where’s the, THERE!!! That must be the entrance, so assuming you get in…then what? You look around, how do you get from in here to out there? You earnestly take in your surroundings, but you don’t see any clues, no loading deck, no airlock…You turn back to the ship and slip in between it and the next, staring at the little hatch you assume is the door. You run your hands along the side, looking for a control panel, or…you don’t know….a handle maybe. You don’t know how a spaceship opens! For goodness sakes your biggest concern before this was passing your midterms. \n" +
"As you’re running your hand across the machine suddenly something happens! A pulse of light darts across the surface and startled you stumble back. A large rectangular screen becomes visible on the side of the machine, and slowly illuminated characters appear. You stare in wonder as this display begins rapidly scrolling alien characters, you imagine something you’re supposed to be able to read. The holographic display stops, and then a voice begins speaking to you, again incomprehensible to you. It speaks again, and pauses. ….is it waiting for you?\n" +
"“I…I’m sorry.” You irrationally say out loud. You could laugh at yourself, but you’re so tired and confused and in wonder of all you’ve seen that you just start talking to that dang ship. “I…I don’t-”\n" +
"The voice speaks again, and pauses on a high note. It was definitely a question.\n" +
"“I d-d-don’t understand you,” you stammer, closing your eyes and shaking your head a little. You absently run a hand down your neck when the holograph freezes, blinks rapidly, and suddenly begins scroll. Thousands of thousands of images and characters are flashed before you as it seems to scroll and, for half a second, you think you see some symbols you recognize. Had that been Chinese that just scrolled by-\n" +
"“Translation,” the robotic voice says and your heart all but stops. “Translation.”\n" +
"“Wha-”\n" +
"“Detected language, English.”\n" +
"A breathy gasps escapes you, and you blink, once, twice, then your hands going flying forward to the ship and you shout out earnestly.\n" +
"“Yes, yes! English, wait, don’t go! I underst-I speak English!” Your frantic garble stops the scrolling, and a soothing, female voice responds.\n" +
"“Language selected, English. \n" +
"“Yes…yes!” You half whisper, staring in wonder at the device before you. \n" +
"“Main menu?”\n" +
"“Uh…I….I need to fly! How can I, I need to use the ship! Can you fly me!?? Oh, oh the door! Open. Open…please.”\n" +
"The ship below you vibrates for a second, then stops and the screen being projected turns red and makes an all-too-familiar error sound. \n" +
"“Request denied.”\n" +
"“What?”\n" +
"“The hatch cannot be opened.”\n" +
"“Why?”\n" +
"“Pod protocol on system lock-down. All external requests cannot be fulfilled.” \n" +
"Your heart sinks, and then starts pounding. Terror begins seeping through you, a chilling sensation that starts with tingling in your scalp and ends with a growing numbness in your knees. They knew you were coming….they’ve locked down the ships, what are you going to do? You sink tiredly to your knees, eyes drifting shut as you let your forehead fall to rest against the ship. You have never felt so desperate in your life. You take a steadying breath, and lift your head up again.\n" +
"It’s not over. They knew you’d try to get here, but they don’t know you are, not yet. You don’t have a lot of time though, the bodies outside this door are none-too-discreet. How are you going to override their commands and get off this ship? \n" +
"“Request override.” You say sternly. \n" +
"“Request denied.”\n" +
"“How can I override this lock? What is override protocol?”\n" +
"“Authorization code required.”\n" +
"“Authorization…code? Ok…alright….alright.” \n" +
"	Authorization code, eh? Trembling, you rise to your feet, and turn back towards to door. You slide open the door and lean an arm through. You grab your alien friend, the one who so kindly leant you an id card, and your fingers fist in its shirt. With all the strength you have left, with every ounce of will power, you lean back on your steady leg for momentum and drag him. It half staggers up to his knees and then the two of you both tumble back into the smaller room. You quickly rise back up and close the door, then snatch that alien by the back of its neck. You pull a loaded blaster from your belt and force him to his feet. The two of you limp over to the pod and you roughly shove its body so it can see the screen. It can’t read English, but you know you can make it understand.\n" +
"	“Type. In. The. Code.” You hiss, pushing your gun into its strange, bulbous skin.\n" +
"	The alien murmers something you don’t understand. You shake your gun and kick it in the back of its leg. The alien hisses, then smack its’ own genitals and snarls at you. That you do understand. Your gun whips down and fires, blowing a burning hole in the alien’s foot. It screeches in pain then you bring the gun, still hot, up to its’ neck again.\n" +
"	“TYPE IN THE CODE!!!” \n" +
"	Wailing in terror, the alien throws out its arm and hurriedly types. The screen blinks, once, twice….and then the blinking read turns into a calm blue and your computer friend’s soothing voice is heard.\n" +
"	“Override accepted. Initiate launch sequence?”\n" +
"	Your shoulders sag, and your face softens as the intensity of relief overwhelms you. You release your hold on the alien, who falls to the ground and clutches his hurt foot. It begins screaming at you, and you slowly turn to stare down at him. Your gun is leveled at its head, you have a perfect shot. The alien is laying on its stomach, staring up at you and screeching in rage. You are safe now, you are going to escape either way…but still is stares at you and screams obscenities in its mother tongue. Calmly you pull the trigger and silence the monster. You toss your gun to the ground as you turn as if in a dream and lay your hand on the escape pod. You close your eyes and sigh.\n" +
"	“Open the hatch.” You say, every cell of your being flooding with that strange, dreamlike calm.\n" +
"	“Opening.” The ship’s entrance rises and with a duck you crawl inside and lean back into the seat. The door lets out a hydraulic whine and closes to your side. You hear the door fasten, suctioning to the side of the ship. A series of beeps sound as the console before you comes alive, buttons beginning to glow, and the screen before you lighting up with the display from outside. You grab the harness straps around you and securing yourself awkwardly with one hand.\n" +
"“I, I don’t know how to fly this, can you help me?”\n" +
"“Initiate autopilot?”\n" +
"“Yes!”\n" +
"“Destination?”\n" +
"“Earth. Please. My earth!”\n" +
"“Coordinates?”\n" +
"“I don’t know them…um….” Before you can say anything else the screen illuminates again, displaying hundreds, and hundreds, of holographic planets.\n" +
"“Please select a destination.”\n" +
"Alright, ok, you can do this. Your fingers are flying, swiping past and rejected planets. No, no, where is ours??? Your heart is beginning to pound, fear of what is on the other side of the door….There! You spot a planet, not earth, but one you can’t mistake. It’s Saturn, you’re searching in the right galaxy at least…you spread open the search and with a warm rush of triumph, joy, and unspeakable relief, you spot your home world. You poke the screen furiously, feeling the rush of tears again. \n" +
"“Destination selected, autopilot engaged. Immediate departure.” \n" +
"All around you the ship is making sounds, clicking, buzzes, and then it starts rumbling. Your hands reflexively grasp your seat as all your muscles tense. You don’t know what’s happening, what to expect. Then, with a gasp you realize it’s the floor below you. The ships are designed to be jettisoned from their exact location, the floor below you as spiraled open and you are about to be flung into the void of space. Your heart is pounding, your whole body shaking in anticipation, and slowly a panel below you slides open to reveal a large round button.\n" +
"“Commence departure?” Your kindly computer friend asks.");  
    //The text for the buttons in level
    level11.setGoodChoice("Launch your ship and scape alien captivity");
    
    //The text for the consequences that will be displayed:
    level11.setGoodChoiceConsequence("You reach forward, and push in the button, freeing yourself from this high-stakes nightmare. The ship jerks, and then…lets go. Your stomach drops as you plummet down into the emptiness, and with a lurch your ship takes off into the stars. Your ship is speeding up; the blackness of space is becoming a blur, dotted with the silver streak of stars as you begin accelerating through the darkness. What will happen next? Where on earth will you land, how on earth will you get home? How will you explain what happened? \n" +
"You don’t know, you really don’t. You don’t have all the answers, you might never, but what you do know is that you are free. You lean back in the seat and begin to cry. You’re forever scarred and gravely injured…but you’re free. You have escaped your captors and are speeding far, far away from that horrible place, and from those monstrous creatures who felt entitled to enslave you for their own sick interests. And, in a way, they were successful. You’re certainly a case for them to study. They’ve now had an experience with the human race…only one that didn’t go on their terms. If they thought they knew humans, they were wrong. They never got very far in their research, or perhaps then they’d be better prepared to anticipate your resourcefulness, your level decision making, the tenacity of your species. Perhaps they wouldn’t have underestimated you. Perhaps next time they’ll pick another subject.\n" +
"\n" +
"Congratulations! You have survived!!!!") ;
    
    //The paths to the pictures
    level11.setPicPathMain("Resources/Space_Adv/foundpodsnoleg.jpg");
     level11.setPicPathGood("Resources/Space_Adv/buttonclick.jpg");
     
     //The text to be displayed on the buttons called by subInits
    level11.setGoodChoiceSub("Congratulations!!!!");
    
    //Initialize the level
    level11.init();
    //Make this level no longer accessable   
    sb11win.setEnabled(false);
    //Enable button for next level
    giantWin.setEnabled(true);
    giantWin.setVisible(true);
                }
               
            //The text for the main event if you chose to distract guards       
                if (adventurer.getLegStatus() == true){ 
                    if (level10.getAPGood() == true)
                    {level11.setMainEvent("You run to a ship, and your hands starts patting the glass, the metal casings, looking for a box, a key, a door, something. You drop to your knees and look underneath, then you rise to your tiptoes and look over the top. Door, door, where’s the, THERE!!! That must be the entrance, so assuming you get in…then what? You look around, how do you get from in here to out there? You earnestly take in your surroundings, but you don’t see any clues, no loading deck, no airlock…You turn back to the ship and slip in between it and the next, staring at the little hatch you assume is the door. You run your hands along the side, looking for a control panel, or…you don’t know….a handle maybe. You don’t know how a spaceship opens! For goodness sakes your biggest concern before this was passing your midterms. \n" +
"As you’re running your hand across the machine suddenly something happens! A pulse of light darts across the surface and startled you stumble back. A large rectangular screen becomes visible on the side of the machine, and slowly illuminated characters appear. You stare in wonder as this display begins rapidly scrolling alien characters, you imagine something you’re supposed to be able to read. The holographic display stops, and then a voice begins speaking to you, again incomprehensible to you. It speaks again, and pauses. ….is it waiting for you?\n" +
"“I…I’m sorry.” You irrationally say out loud. You could laugh at yourself, but you’re so tired and confused and in wonder of all you’ve seen that you just start talking to that dang ship. “I…I don’t-”\n" +
"The voice speaks again, and pauses on a high note. It was definitely a question.\n" +
"“I d-d-don’t understand you,” you stammer, closing your eyes and shaking your head a little. You absently run a hand down your neck when the holograph freezes, blinks rapidly, and suddenly begins scroll. Thousands of thousands of images and characters are flashed before you as it seems to scroll and, for half a second, you think you see some symbols you recognize. Had that been Chinese that just scrolled by-\n" +
"“Translation,” the robotic voice says and your heart all but stops. “Translation.”\n" +
"“Wha-”\n" +
"“Detected language, English.”\n" +
"A breathy gasps escapes you, and you blink, once, twice, then your hands going flying forward to the ship and you shout out earnestly.\n" +
"“Yes, yes! English, wait, don’t go! I underst-I speak English!” Your frantic garble stops the scrolling, and a soothing, female voice responds.\n" +
"“Language selected, English. \n" +
"“Yes…yes!” You half whisper, staring in wonder at the device before you. \n" +
"“Main menu?”\n" +
"“Uh…I….I need to fly! How can I, I need to use the ship! Can you fly me!?? Oh, oh the door! Open. Open…please.”\n" +
"The ship below you vibrates for a second, then stops and the screen being projected turns red and makes an all-too-familiar error sound. \n" +
"“Request denied.”\n" +
"“What?”\n" +
"“The hatch cannot be opened.”\n" +
"“Why?”\n" +
"“Pod protocol on system lock-down. All external requests cannot be fulfilled.” \n" +
"Your heart sinks, and then starts pounding. Terror begins seeping through you, a chilling sensation that starts with tingling in your scalp and ends with a growing numbness in your knees. They knew you were coming….they’ve locked down the ships, what are you going to do? You sink tiredly to your knees, eyes drifting shut as you let your forehead fall to rest against the ship. You have never felt so desperate in your life. You take a steadying breath, and lift your head up again.\n" +
"It’s not over. They knew you’d try to get here, but they don’t know you are, not yet. You don’t have a lot of time though, the bodies outside this door are none-too-discreet. How are you going to override their commands and get off this ship? \n" +
"“Request override.” You say sternly. \n" +
"“Request denied.”\n" +
"“How can I override this lock? What is override protocol?”\n" +
"“Authorization code required.”\n" +
"“Authorization…code? Ok…alright….alright.” \n" +
"	Authorization code, eh? Trembling, you rise to your feet, and turn back towards to door. You slide open the door and lean an arm through. You grab your alien friend, the one who so kindly leant you an id card, and your fingers fist in its shirt. With a grunt you lean back and drag its body towards you. It half staggers up to its knees and then the two of you both tumble back into the smaller room. You quickly rise back up and close the door, then snatch that alien by the back of its neck. You pull a loaded blaster from your belt and force it to its feet. The two of you limp over to the pod and you roughly shove its body so it can see the screen. It can’t read English, but you know you can make it understand.\n" +
"	“Type. In. The. Code.” You hiss, pushing your gun into its strange, bulbous skin.\n" +
"	The alien murmurs something you don’t understand. You shake your gun and kick it in the back of its leg. The alien hisses, then smack its’ own genitals and snarls at you. That you do understand. Your gun whips down and fires, blowing a burning hole in the alien’s foot. It screeches in pain then you bring the gun, still hot, up to its’ neck again.\n" +
"	“TYPE IN THE CODE!!!” \n" +
"	Wailing in terror, the alien throws out its arm and hurriedly types. The screen blinks, once, twice….and then the blinking read turns into a calm blue and your computer friend’s soothing voice is heard.\n" +
"	“Override accepted. Initiate launch sequence?”\n" +
"	Your shoulders sag, and your face softens as the intensity of relief overwhelms you. You release your hold on the alien, who falls to the ground and clutches his hurt foot. It begins screaming at you, and you slowly turn to stare down at him. Your gun is leveled at its head, you have a perfect shot. The alien is laying on its stomach, staring up at you and screeching in rage. You are safe now, you are going to escape either way…but still is stares at you and screams obscenities in its mother tongue. You don’t need it calling for help. With a smile you turn your blaster, and strike him with the butt of your gun. He falls unconscious to the ground. You toss your weapon to the ground as you turn as if in a dream and lay your hand on the escape pod. You close your eyes and sigh.\n" +
" “Open the hatch.” You say, every cell of your being flooding with that strange, dreamlike calm.\n" +
"	“Opening.” The ship’s entrance rises and with a duck you crawl inside and lean back into the seat. The door lets out a hydraulic whine and closes to your side. You hear the door fasten, suctioning to the side of the ship. A series of beeps sound as the console before you comes alive, buttons beginning to glow, and the screen before you lighting up with the display from outside. You grab the harness straps around you and securing yourself.\n" +
"“I, I don’t know how to fly this, can you help me?”\n" +
"“Initiate autopilot?”\n" +
"“Yes!”\n" +
"“Destination?”\n" +
"“Earth. Please. My earth!”\n" +
"“Coordinates?”\n" +
"“I don’t know them…um….” Before you can say anything else the screen illuminates again, displaying hundreds, and hundreds, of holographic planets.\n" +
"“Please select a destination.”\n" +
"Alright, ok, you can do this. Your fingers are flying, swiping past and rejected planets. No, no, where is ours??? Your heart is beginning to pound, fear of what is on the other side of the door….There! You spot a planet, not earth, but one you can’t mistake. It’s Saturn, you’re searching in the right galaxy at least…you spread open the search and with a warm rush of triumph, joy, and unspeakable relief, you spot your home world. You poke the screen furiously, feeling the rush of tears again. \n" +
"“Destination selected, autopilot engaged. Immediate departure.” \n" +
"All around you the ship is making sounds, clicking, buzzes, and then it starts rumbling. Your hands reflexively grasp your seat as all your muscles tense. You don’t know what’s happening, what to expect. Then, with a gasp you realize it’s the floor below you. The ships are designed to be jettisoned from their exact location, the floor below you as spiraled open and you are about to be flung into the void of space. Your heart is pounding, your whole body shaking in anticipation, and slowly a panel below you slides open to reveal a large round button.\n" +
"“Commence departure?” Your kindly computer friend asks.");}
                    else //The text if you chose to fight gurads
                        
               {level11.setMainEvent(" You hobble to a ship, and your hands starts patting the glass, the metal casings, looking for a box, a key, a door, something. You drop to your knees and look underneath, then with a scream realize getting back up is going to be tricky….eventually you stand again and continue your search. Door, door, where’s the, THERE!!! That must be the entrance, so assuming you get in…then what? You look around, how do you get from in here to out there? You earnestly take in your surroundings, but you don’t see any clues, no loading deck, no airlock…You turn back to the ship and slip in between it and the next, staring at the little hatch you assume is the door. You run your hands along the side, looking for a control panel, or…you don’t know….a handle maybe. You don’t know how a spaceship opens! For goodness sakes your biggest concern before this was passing your midterms. \n" +
"As you’re running your hands across the machine suddenly something happens! A pulse of light darts across the surface and startled you stumble back. A large rectangular screen becomes visible on the side of the machine, and slowly illuminated characters appear. You stare in wonder as this display begins rapidly scrolling alien characters, you imagine something you’re supposed to be able to read. The holographic display stops, and then a voice begins speaking to you, again incomprehensible to you. It speaks again, and pauses. ….is it waiting for you?\n" +
"“I…I’m sorry.” You irrationally say out loud. You could laugh at yourself, but you’re so tired and confused and in wonder of all you’ve seen that you just start talking to that dang ship. “I…I don’t-”\n" +
"The voice speaks again, and pauses on a high note. It was definitely a question.\n" +
"“I d-d-don’t understand you,” you stammer, closing your eyes and shaking your head a little. You absently run a hand down your neck when the holograph freezes, blinks rapidly, and suddenly begins scroll. Thousands of thousands of images and characters are flashed before you as it seems to scroll and, for half a second, you think you see some symbols you recognize. Had that been Chinese that just scrolled by-\n" +
"“Translation,” the robotic voice says and your heart all but stops. “Translation.”\n" +
"“Wha-”\n" +
"“Detected language, English.”\n" +
"A breathy gasps escapes you, and you blink, once, twice, then your hands going flying forward to the ship and you shout out earnestly.\n" +
"“Yes, yes! English, wait, don’t go! I underst-I speak English!” Your frantic garble stops the scrolling, and a soothing, female voice responds.\n" +
"“Language selected, English. \n" +
"“Yes…yes!” You half whisper, staring in wonder at the device before you. \n" +
"“Main menu?”\n" +
"“Uh…I….I need to fly! How can I, I need to use the ship! Can you fly me!?? Oh, oh the door! Open. Open…please.”\n" +
"The ship below you vibrates for a second, then stops and the screen being projected turns red and makes an all-too-familiar error sound. \n" +
"“Request denied.”\n" +
"“What?”\n" +
"“The hatch cannot be opened.”\n" +
"“Why?”\n" +
"“Pod protocol on system lock-down. All external requests cannot be fulfilled.” \n" +
"Your heart sinks, and then starts pounding. Terror begins seeping through you, a chilling sensation that starts with tingling in your scalp and ends with a growing numbness in your knees. They knew you were coming….they’ve locked down the ships, what are you going to do? You sink tiredly to lean against the pod, eyes drifting shut as you let your forehead fall to rest against the ship. You have never felt so desperate in your life. You take a steadying breath, and lift your head up again.\n" +
"It’s not over. They knew you’d try to get here, but they don’t know you are, not yet. You don’t have a lot of time though, the bodies outside this door are none-too-discreet. How are you going to override their commands and get off this ship? \n" +
"“Request override.” You say sternly. \n" +
"“Request denied.”\n" +
"“How can I override this lock? What is override protocol?”\n" +
"“Authorization code required.”\n" +
"“Authorization…code? Ok…alright….alright.” \n" +
"	Authorization code, eh? Trembling, you push off the pod and turn back towards the door. You slide open the door and lean an arm through. You grab your alien friend, the one who so kindly leant you an id card, and your fingers fist in its shirt. With all the strength you can muster you lean back on your steady leg for momentum and drag it towards you. It half staggers up to its knees and then the two of you both tumble back into the smaller room. You quickly rise back up and close the door, then snatch that alien by the back of its neck. You pull a loaded blaster from your belt and force him to his feet. The two of you limp over to the pod and you roughly shove its body so it can see the screen. It can’t read English, but you know you can make it understand.\n" +
"	“Type. In. The. Code.” You hiss, pushing your gun into its strange, bulbous skin.\n" +
"	The alien murmurs something you don’t understand. You shake your gun and kick it in the back of its leg. The alien hisses, then smack its’ own genitals and snarls at you. That you do understand. Your gun whips down and fires, blowing a burning hole in the alien’s foot. It screeches in pain then you bring the gun, still hot, up to its’ neck again.\n" +
"	“TYPE IN THE CODE!!!” \n" +
"	Wailing in terror, the alien throws out its arm and hurriedly types. The screen blinks, once, twice….and then the blinking read turns into a calm blue and your computer friend’s soothing voice is heard.\n" +
"	“Override accepted. Initiate launch sequence?”\n" +
"	Your shoulders sag, and your face softens as the intensity of relief overwhelms you. You release your hold on the alien, who falls to the ground and clutches its hurt foot. It begins screaming at you, and you slowly turn to stare down at him. Your gun is leveled at its head, you have a perfect shot. The alien is laying on its stomach, staring up at you and screeching in rage. There’s no one it can call for help nearby that you haven’t incapacitated, so with a smile you turn your blaster, and strike him with the butt of your gun. He falls unconscious to the ground. You toss your weapom to the ground as you turn as if in a dream and lay your hand on the escape pod. You close your eyes and sigh.\n" +
"	“Open the hatch.” You say, every cell of your being flooding with that strange, dreamlike calm.\n" +
"	“Opening.” The ship’s entrance rises and with a duck you crawl inside and lean back into the seat. The door lets out a hydraulic whine and closes to your side. You hear the door fasten, suctioning to the side of the ship. A series of beeps sound as the console before you comes alive, buttons beginning to glow, and the screen before you lighting up with the display from outside. You grab the harness straps around you and secure yourself.\n" +
"“I, I don’t know how to fly this, can you help me?”\n" +
"“Initiate autopilot?”\n" +
"“Yes!”\n" +
"“Destination?”\n" +
"“Earth. Please. My earth!”\n" +
"“Coordinates?”\n" +
"“I don’t know them…um….” Before you can say anything else the screen illuminates again, displaying hundreds, and hundreds, of holographic planets.\n" +
"“Please select a destination.”\n" +
"Alright, ok, you can do this. Your fingers are flying, swiping past and rejected planets. No, no, where is ours??? Your heart is beginning to pound, fear of what is on the other side of the door….There! You spot a planet, not earth, but one you can’t mistake. It’s Saturn, you’re searching in the right galaxy at least…you spread open the search and with a warm rush of triumph, joy, and unspeakable relief, you spot your home world. You poke the screen furiously, feeling the rush of tears again. \n" +
"“Destination selected, autopilot engaged. Immediate departure.” \n" +
"All around you the ship is making sounds, clicking, buzzes, and then it starts rumbling. Your hands reflexively grasp your seat as all your muscles tense. You don’t know what’s happening, what to expect. Then, with a gasp you realize it’s the floor below you. The ships are designed to be jettisoned from their exact location, the floor below you as spiraled open and you are about to be flung into the void of space. Your heart is pounding, your whole body shaking in anticipation, and slowly a panel below you slides open to reveal a large round button.\n" +
"“Commence departure?” Your kindly computer friend asks.");
                       
                       }
    //The text for the buttons in level
    level11.setGoodChoice("Launch your ship and scape alien captivity");
    
    //The text for the consequences that will be displayed:
    level11.setGoodChoiceConsequence("You reach forward, and push in the button, freeing yourself from this high-stakes nightmare. The ship jerks, and then…lets go. Your stomach drops as you plummet down into the emptiness, and with a lurch your ship takes off into the stars. Your ship is speeding up; the blackness of space is becoming a blur, dotted with the silver streak of stars as you begin accelerating through the darkness. What will happen next? Where on earth will you land, how on earth will you get home? How will you explain what happened? \n" +
"You don’t know, you really don’t. You don’t have all the answers, you might never, but what you do know is that you are free. You have escaped your captors and are speeding far, far away from that horrible place, and from those monstrous creatures who felt entitled to enslave you for their own sick interests. And, in a way, they were successful. You’re certainly a case for them to study. They’ve now had an experience with the human race…only one that didn’t go on their terms. If they thought they knew humans, they were wrong. They never got very far in their research, or perhaps then they’d be better prepared to anticipate your resourcefulness, your level decision making, the tenacity of your species. Perhaps they wouldn’t have underestimated you. Perhaps next time they’ll pick another subject.\n" +
"\n" +
"Congratulations! You have survived!!!!") ;
    
    //The paths to the pictures
    level11.setPicPathMain("Resources/Space_Adv/foundpodsshirt.jpg");
     level11.setPicPathGood("Resources/Space_Adv/buttonclick.jpg");
     
     //The text to be displayed on the buttons called by subInits
    level11.setGoodChoiceSub("Congratulations!!!!");
    
    //Initialize the level
    level11.init();
    //Make this level no longer accessable   
    sb11win.setEnabled(false);
    //Enable button for next level
    giantWin.setEnabled(true);
    giantWin.setVisible(true);
                }
            //Make the other buttons invisible
   sb1.setVisible(false);
   sb2.setVisible(false);
   sb3.setVisible(false);
  sb3half.setVisible(false);
   sb4.setVisible(false);
   sb5.setVisible(false);
  sb5half.setVisible(false);
   sb6.setVisible(false);
   sb7.setVisible(false);
   sb7win.setVisible(false);
   sb8lab.setVisible(false);
   sb8.setVisible(false);
   sb9lab.setVisible(false);
   sb9.setVisible(false);
   sb10.setVisible(false);
   sb11win.setVisible(false);
            }//End level11win
                
            
            //This is a special level, in that there is only one way out, you win!!!
            //You can be an adventurer with noye, with the alarm having sounded
            //Or a healthy adventurer still un detected
            else if (e.getSource() == sb7win) 
            {//Adventurer with no eye
                if (adventurer.getEyeStatus() == false)
                {  //The text for the main event
                  level7win.setMainEvent("You look as carefully as you can with your limited space but you don’t see any guards, it seems they’re all on the other side of the door. They think they’ve covered the only entrance…Luckily you’re still well and limber enough to do some very uncomfortable and tight turning in that tiny space, resituating yourself so you can get your feet over the grate. You give it a good, hard kick, and it falls noisily to the floor. You wince and freeze in horror. Too loud? Did they hear? Are those doors about to be blown open to let in an angry rampage of alien soldiers?\n" +
"You wait for several more agonizing seconds but nothing comes. You have to go for it…you take a deep breath then slip down through the grate feet first. You land with a bit of a stumble, but your hands catch you and nothing is broken. You stand up and there, all around you, are the small foreign ships that will help you forge an escape from this place. Your hands come up to your mouth to keep the ecstatic gasp in…you’ve done it….you’ve done it! You’re somewhere between terrified and relieved, you’re here, you’ve found the ships….now you just have to get the heck away from here. \n" +
"You dart forward frantically to a ship, and your hands start patting the glass, the metal casings, looking for a box, a key, a door, something. You drop to your knees and look underneath, then you rise to your tiptoes and look over the top. Door, door, where’s the, THERE!!! That must be the entrance, so assuming you get in…then what? You look around, how do you get from in here to out there? You earnestly take in your surroundings, but you don’t see any clues, no loading deck, no airlock…You turn back to the ship and slip in between it and the next, staring at the little hatch you assume is the door. You run your hands along the side, looking for a control panel, or…you don’t know….a handle maybe. You don’t know how a spaceship opens! For goodness sakes your biggest concern before this was passing your midterms. \n" +
"As you’re running your hands across the machine suddenly something happens! A pulse of light darts across the surface and startled you leap back. A large rectangular screen becomes visible on the side of the machine, and slowly illuminated characters appear. You stare in wonder as this display begins rapidly scrolling alien characters, you imagine something you’re supposed to be able to read. The holographic display stops, and then a voice begins speaking to you, again incomprehensible to you. It speaks again, and pauses. ….is it waiting for you?\n" +
" “I…I’m sorry.” You irrationally say out loud. You could laugh at yourself, but you’re so tired and confused and in wonder of all you’ve seen that you just start talking to that dang ship. “I…I don’t-”\n" +
"The voice speaks again, and pauses on a high note. It was definitely a question.\n" +
"“I d-d-don’t understand you,” you stammer, closing your eyes and shaking your head a little. You absently run a hand down your neck when the holograph freezes, blinks rapidly, and suddenly begins moving. Thousands of thousands of images and characters are flashed before you as it seems to scroll and, for half a second, you think you see some symbols you recognize. Had that been Chinese that just scrolled by-\n" +
"“Translation,” the robotic voice says and your heart all but stops. “Translation.”\n" +
"“Wha-”\n" +
"“Detected language, English.”\n" +
"A breathy gasps escapes you, and you blink, once, twice, then your hands going flying forward to the ship and you shout out earnestly.\n" +
"“Yes, yes! English, wait, don’t go! I underst-I speak English!” \n" +
" “Language selected, English. \n" +
"“Yes…yes!” You half whisper, staring in wonder at the device before you. \n" +
"“Main menu?”\n" +
"“Uh…I….I need to fly! How can I, I need to use the ship! Can you fly me!?? Oh, oh the door! Open. Open…please.”\n" +
"The ship below you vibrates for a second, then stops and the screen being projected turns red and makes an all-too-familiar error sound. \n" +
"“Request denied.”\n" +
"“What?”\n" +
"“The hatch cannot be opened.”\n" +
"“Why?”\n" +
"“Pod protocol on system lock-down. All external requests cannot be fulfilled.” \n" +
"Your heart sinks, and then starts pounding. Terror begins seeping through you, a chilling sensation that starts with tingling in your scalp and ends with a growing numbness in your knees. They knew you were coming….they’ve locked down the ships, what are you going to do? You sink tiredly to lean against the pod, eyes drifting shut as you let your forehead fall to rest on the ship. You have never felt so desperate in your life. You take a steadying breath, and lift your head up again.\n" +
"It’s not over. They knew you’d try to get here, but they don’t know you are, not yet. You don’t have a lot of time though. How are you going to override their commands and get off this ship? \n" +
"“Request override.” You say sternly. \n" +
"“Request denied.”\n" +
"“How can I override this lock? What is override protocol?”\n" +
"“Authorization code required.”\n" +
"“Authorization…code? Ok…alright….alright.” \n" +
"	Authorization code, eh? Trembling, you push off the pod and turn around to face the sealed door behind you. There are aliens on the other side of that door, and one of them must….they must know a code. You’re just going to have to persuade them to give you one….You take a deep breath, but then any bravery you were building up instantly vanishes when you are startled by the very door you’re staring at. You hear the telltale beeping, someone is typing on the pad! Your heart starts pounding, and you are running. You leap behind some of the pods, hoping you’re hidden well enough as the door hisses open.\n" +
"	You’re shaking, heart pounding from your near run in as you carefully, quietly creep around the corner of the pod and peer at the new comers. There are two aliens conversing as they stroll into the room and walk over to what looks like a clipboard. Two….there’s only two! You take a breath then you are moving. You push up to a deep crouch so you can hurry behind the pods and run to the other end of the room. This is it, all or nothing….you dart out in plain sight, all they’d have to do is turn around….but they don’t. Not until they hear the ‘whirring’ of the broken key pad. Not until it’s too late. \n" +
"	The aliens turn in confusion to see you backing away from the door you’ve just broken, locking them in. You turn on them while surprise and confusion are still in your favor, seizing a large pipe from the floor and beating the first alien with all your strength. It falls unconscious to the ground and you turn on the remaining. It’s reaching into its vest for a weapon, but in your adrenaline fueled fury, you bring your weapon down on its appendage before it can retrieve anything. It screeches and clutches it’s injury and you lunge. You body slam it to the ground then crawl up and grab your pipe again. You beat him across the face, again, and again, and again. \n" +
"	Finally you stop, you need him awake. Standing up you grab the beaten thing’s vest and with all the strength you can muster drag it up to its feet. The two of you limp over to the pod and you roughly shove its body so it can see the screen. It can’t read English, but you know you can make it understand.\n" +
"	“Type. In. The. Code.” You hiss, pushing the edge of your pipe into its strange, bulbous skin.\n" +
"	The alien murmurs something you don’t understand. You draw back and give a rough push, jabbing him with the pipe. The alien hisses, then smack its own genitals and snarls at you. That you do understand. You draw back, pulling that pipe up like a baseball bat, and you return the favor. Two strong blows to its crotch, accompanied by your scream.\n" +
"	“TYPE IN THE CODE!!!” \n" +
"	Wailing in anguish, the alien throws out its arm and hurriedly types. The screen blinks, once, twice….and then the blinking red turns into a calm blue and your computer friend’s soothing voice is heard.\n" +
"	“Override accepted. Initiate launch sequence?”\n" +
"	Your shoulders sag, and your face softens as the intensity of relief overwhelms you. You release your hold on the alien, who falls to the ground and curls up. It begins screaming at you, and you slowly turn to stare down at it. The alien is laying on its stomach, staring up at you and screeching in rage. With a smile you bring back your pipe again, and strike it over the face, letting it fall unconscious to the ground. You toss your weapon aside as you turn, slowly, as if in a dream and lay your hand on the escape pod. You close your eyes and sigh.\n" +
"	“Open the hatch.” You say, every cell of your being flooding with that strange, dreamlike calm.\n" +
"	“Opening.” The ship’s entrance rises and with a duck you crawl inside and lean back into the seat. The door lets out a hydraulic whine and closes to your side. You hear the door fasten, suctioning to the side of the ship. A series of beeps sound as the console before you comes alive, buttons beginning to glow, and the screen before you lighting up with the display from outside. You grab the harness straps around you and secure yourself.\n" +
"“I, I don’t know how to fly this, can you help me?”\n" +
"“Initiate autopilot?”\n" +
"“Yes!”\n" +
"“Destination?”\n" +
"“Earth. Please. My earth!”\n" +
"“Coordinates?”\n" +
"“I don’t know them…um….” Before you can say anything else the screen illuminates again, displaying hundreds, and hundreds, of holographic planets.\n" +
"“Please select a destination.”\n" +
"Alright, ok, you can do this. Your fingers are flying, swiping past and rejecting planets. No, no, where is yours??? Your heart is beginning to pound, fear of what is on the other side of the door….There! You spot a planet, not earth, but one you can’t mistake. It’s Saturn, you’re searching in the right galaxy at least…you spread open the search and with a warm rush of triumph, joy, and unspeakable relief, you spot your home world. You poke the screen furiously, feeling the rush of tears again. \n" +
"“Destination selected, autopilot engaged. Immediate departure.” \n" +
"All around you the ship is making sounds, clicking, buzzes, and then it starts rumbling. Your hands reflexively grasp your seat as all your muscles tense. You don’t know what’s happening, what to expect. Then, with a gasp you realize it’s the floor below you. The ships are designed to be jettisoned from their exact location, the panels under you are spiraling open and you are about to be flung into the void of space. Your heart is pounding, your whole body shaking in anticipation, and slowly a panel below you slides open to reveal a large round button.\n" +
"“Commence departure?” Your kindly computer friend asks.");  
                //The text for the buttons in level
                    level7win.setGoodChoice("Launch your ship and scape alien captivity");
                   //The text for the consequences that will be displayed:
                   level7win.setGoodChoiceConsequence("You reach forward, and push in the button, freeing yourself from this high-stakes nightmare. The ship jerks, and then…lets go. Your stomach drops as you plummet down into the emptiness, and with a lurch your ship takes off into the stars. Your ship is speeding up; the blackness of space is becoming a blur, dotted with the silver streak of stars as you begin accelerating through the darkness. What will happen next? Where on earth will you land, how on earth will you get home? How will you explain what happened? \n" +
"You don’t know, you really don’t. You don’t have all the answers, you might never, but what you do know is that you are free. You have escaped your captors and are speeding far, far away from that horrible place, and from those monstrous creatures who felt entitled to enslave you for their own sick interests. And, in a way, they were successful. You’re certainly a case for them to study. They’ve now had an experience with the human race…only one that didn’t go on their terms. If they thought they knew humans, they were wrong. They never got very far in their research, or perhaps then they’d be better prepared to anticipate your resourcefulness, your level decision making, the tenacity of your species. Perhaps they wouldn’t have underestimated you. Perhaps next time they’ll pick another subject.\n" +
"\n" +
"Congratulations! You have survived!!!!") ;
                 
                //The paths to the pictures
                  level7win.setPicPathMain("Resources/Space_Adv/sat.jpg");
                 level7win.setPicPathGood("Resources/Space_Adv/buttonclick.jpg");
                 
                //The text to be displayed on the buttons called by subInits
                level7win.setGoodChoiceSub("Congratulations!");
          
                 //Initialize the level
                level7win.init();
                //Make this level no longer accessable   
                 sb7win.setEnabled(false);
                //Enable button for next level
                giantWin.setEnabled(true);
                giantWin.setVisible(true);
   //Make the other buttons invisible
   sb1.setVisible(false);
   sb2.setVisible(false);
   sb3.setVisible(false);
  sb3half.setVisible(false);
   sb4.setVisible(false);
   sb5.setVisible(false);
  sb5half.setVisible(false);
   sb6.setVisible(false);
   sb7.setVisible(false);
   sb7win.setVisible(false);
   sb8lab.setVisible(false);
   sb8.setVisible(false);
   sb9lab.setVisible(false);
   sb9.setVisible(false);
   sb10.setVisible(false);
   sb11win.setVisible(false);
                }
                
                //a healthy adventurer still undetected
             if (adventurer.getEyeStatus() == true && adventurer.getLegStatus() == true)
             {
    //The text for the main event
    level7win.setMainEvent("You look as carefully as you can with your limited space but you don’t see anyone, it seems the room is empty….this is your chance!!!  Luckily you’re still well and limber enough to do some very uncomfortable and tight turning in that tiny space, resituating yourself so you can get your feet over the grate. You give it a good, hard kick, and it falls noisily to the floor. You wince and freeze in horror. Too loud? Did they hear? Are those doors about to be blown open to let in an angry rampage of alien soldiers?\n" +
"You wait for several more agonizing seconds but nothing comes. You have to go for it…you take a deep breath then slip down through the grate feet first. You land with a bit of a stumble, but your hands catch you and nothing is broken. You stand up and there, all around you, are the small foreign ships that will help you forge an escape from this place. Your hands come up to your mouth to keep the ecstatic gasp in…you’ve done it….you’ve done it! You’re somewhere between terrified and relieved, you’re here, you’ve found the ships….now you just have to get the heck away from here.\n" +
"You dart forward frantically to a ship, and your hands start patting the glass, the metal casings, looking for a box, a key, a door, something. You drop to your knees and look underneath, then you rise to your tiptoes and look over the top. Door, door, where’s the, THERE!!! That must be the entrance, so assuming you get in…then what? You look around, how do you get from in here to out there? You earnestly take in your surroundings, but you don’t see any clues, no loading deck, no airlock…You turn back to the ship and slip in between it and the next, staring at the little hatch you assume is the door. You run your hands along the side, looking for a control panel, or…you don’t know….a handle maybe. You don’t know how a spaceship opens! For goodness sakes your biggest concern before this was passing your midterms. \n" +
"As you’re running your hands across the machine suddenly something happens! A pulse of light darts across the surface and startled you leap back. A large rectangular screen becomes visible on the side of the machine, and slowly illuminated characters appear. You stare in wonder as this display begins rapidly scrolling alien characters, you imagine something you’re supposed to be able to read. The holographic display stops, and then a voice begins speaking to you, again incomprehensible to you. It speaks again, and pauses. ….is it waiting for you?\n" +
"“I…I’m sorry.” You irrationally say out loud. You could laugh at yourself, but you’re so tired and confused and in wonder of all you’ve seen that you just start talking to that dang ship. “I…I don’t-”\n" +
"The voice speaks again, and pauses on a high note. It was definitely a question.\n" +
"“I d-d-don’t understand you,” you stammer, closing your eyes and shaking your head a little. You absently run a hand down your neck when the holograph freezes, blinks rapidly, and suddenly begins moving. Thousands of thousands of images and characters are flashed before you as it seems to scroll and, for half a second, you think you see some symbols you recognize. Had that been Chinese that just scrolled by-\n" +
"“Translation,” the robotic voice says and your heart all but stops. “Translation.”\n" +
"“Wha-”\n" +
"“Detected language, English.”\n" +
"A breathy gasps escapes you, and you blink, once, twice, then your hands go flying forward to the ship and you shout out earnestly.\n" +
"“Yes, yes! English, wait, don’t go! I underst-I speak English!” Your frantic garble stops the scrolling, and a soothing, female voice responds.\n" +
"“Language selected, English. \n" +
"“Yes…yes!” You half whisper, staring in wonder at the device before you. \n" +
"“Main menu?”\n" +
"“Uh…I….I need to fly! How can I, I need to use the ship! Can you fly me!?? Oh, oh the door! Open. Open…please.”\n" +
"“Opening the hatch.”\n" +
"The ship below you begins vibrating and you pull away as the large hatch lifts up\n" +
"“Thank you…” You whisper. You take in a deep, shaking, exuberant breath, blinking away tears as your trembling hand grabs the side of the ship. You duck your head and slip in, snuggling down into the one seat. You can barely believe this is real, that you might-\n" +
"“Closing hatch.”\n" +
"You’re snapped from your reverie as the door lets out a hydraulic whine and closes to your side. You hear the door fasten, suctioning to the side of the ship. A series of beeps sound as the console before you comes alive, buttons beginning to glow, and the screen before you lighting up with the display from outside. You stare a moment then snap to, grabbing the harness straps around you and securing yourself.\n" +
"“I, I don’t know how to fly this, can you help me? What should I do?”\n" +
"“Initiate autopilot?”\n" +
"“Yes!”\n" +
"“Destination?”\n" +
"“Earth. Please. My earth!”\n" +
"“Coordinates?”\n" +
"“I don’t know them…um….” Before you can say anything else the screen illuminates again, displaying hundreds, and hundreds, of holographic planets.\n" +
"“Please select a destination.”\n" +
"Alright, ok, you can do this. Your fingers are flying, swiping past and rejecting planets. No, no, where is ours??? Your heart is beginning to pound, fear of what is on the other side of the door….There! You spot a planet, not earth, but one you can’t mistake. It’s Saturn, you’re searching in the right galaxy at least…you spread open the search and with a warm rush of triumph, joy, and unspeakable relief, you spot your home world. You poke the screen furiously, feeling the rush of tears again. \n" +
"“Destination selected, autopilot engaged. Immediate departure.” \n" +
"All around you the ship is making sounds, clicking, buzzes, and then it starts rumbling. Your hands reflexively grasp your seat as all your muscles tense. You don’t know what’s happening, what to expect. Then, with a gasp you realize it’s the floor below you. The ships are designed to be jettisoned from their exact location, the panels under your ship are spiraling open and you are about to be flung into the void ` `of space. Your heart is pounding, your whole body shaking in anticipation, and slowly a panel below you slides open to reveal a large round button.\n" +
"“Commence departure?” Your kindly computer friend asks.");  
    //The text for the buttons in level
    level7win.setGoodChoice("Launch your ship and scape alien captivity");
    
    //The text for the consequences that will be displayed:
    level7win.setGoodChoiceConsequence(" You reach forward, and push in the button, freeing yourself from this high-stakes nightmare. The ship jerks, and then…lets go. Your stomach drops as you plummet down into the emptiness, and with a lurch your ship takes off into the stars. Your ship is speeding up; the blackness of space is becoming a blur, dotted with the silver streak of stars as you begin accelerating through the darkness. What will happen next? Where on earth will you land, how on earth will you get home? How will you explain what happened? \n" +
"You don’t know, you really don’t. You don’t have all the answers, you might never, but what you do know is that you are free. You have escaped your captors and are speeding far, far away from that horrible place, and from those horrible creatures who felt entitled to enslave you for their own sick interests. And, in a way, they were successful. You’re certainly a case for them to study. They’ve now had an experience with the human race…only one that didn’t go on their terms. If they thought they knew humans, they were wrong. They never got very far in their research, or perhaps then they’d be better prepared to anticipate your resourcefulness, your level decision making, the tenacity of your species. Perhaps they wouldn’t have underestimated you. Perhaps next time they’ll pick another subject.\n" +
"\n" +
"Congratulations! You have survived!!!!") ;
  
    //The paths to the pictures
     level7win.setPicPathMain("Resources/Space_Adv/sat.jpg");
     level7win.setPicPathGood("Resources/Space_Adv/buttonclick.jpg");
     
     
     //The text to be displayed on the buttons called by subInits
    level7win.setGoodChoiceSub("Congratulations!!");
  
    //Initialize the level
    level7win.init();
    //Make this level no longer accessable   
             sb7win.setEnabled(false);
    //Enable button for next level
    giantWin.setEnabled(true);
    giantWin.setVisible(true);
             }
 //Make the other buttons invisible
   sb1.setVisible(false);
   sb2.setVisible(false);
   sb3.setVisible(false);
  sb3half.setVisible(false);
   sb4.setVisible(false);
   sb5.setVisible(false);
  sb5half.setVisible(false);
   sb6.setVisible(false);
   sb7.setVisible(false);
   sb7win.setVisible(false);
   sb8lab.setVisible(false);
   sb8.setVisible(false);
   sb9lab.setVisible(false);
   sb9.setVisible(false);
   sb10.setVisible(false);
   sb11win.setVisible(false);
            }//End level 7win
           
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
     jMainPic = new JLabel(new ImageIcon(("Resources/Space_Adv/us.jpg")));
    jMainPic.setBounds(200, 0, 400, 400);
    panel.add(jMainPic);
    
    
   //Add the main event story space
  JTextArea textArea, textArea1;
 JScrollPane areaScrollPane, areaScrollPane1;
textArea = new JTextArea("Thank you for playing our game!\n" +
"We hope you had a fun time! If you haven’t already, try replaying it with different choices. Even the times you die should be funny! Also try our other scenarios!!!\n" +
"Thank you and see you in the future!!\n" +
"From left to right:\n" +
"Stephanie Bohland – Author of “Space Adventure” and “Pirate Adventure!”\n" +
"Devin Mize – Artist of all game art!\n" +
"Lexy Bohland – Author of “Jungle Adventure!”\n" +
"Megan Bohland-Game designer and coder!\n" +
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
    
    
    
   

    
