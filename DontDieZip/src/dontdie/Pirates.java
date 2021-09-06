package dontdie;


import dontdie.Adventurer;
import dontdie.Button;

import dontdie.Scenario;
import dontdie.State;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
public class Pirates extends State implements ActionListener {
    
     //Variables
    public String boardTitlePA, boardTitleSA, boardTitleJA; //These will depend on  users choice?
   Button pb1 = new Button((new ImageIcon(("/flagsm.png"))));
   Button pb2 = new Button((new ImageIcon(("/flagsm.png"))));
   Button pb3 = new Button((new ImageIcon(("/flagsm.png"))));
   Button pb3half = new Button((new ImageIcon(("/flagsm.png"))));
   Button pb4 = new Button((new ImageIcon(("/flagsm.png"))));
   Button pb5 = new Button((new ImageIcon(("/flagsm.png"))));
   Button pb6 = new Button((new ImageIcon(("/flagsm.png"))));
   Button pb7 = new Button((new ImageIcon(("/flagsm.png"))));
   Button pb8 = new Button((new ImageIcon(("/flagsm.png"))));
   Button giantWin = new Button((new ImageIcon(("/Happy.jpg"))));
   JLabel playerPic = new JLabel(new ImageIcon(("/fig1.png")));
    //TEST
    //Initialize a timer
    //Start timer below in constructor
    //This is the method to run when the timer runs
   Timer tm;
    
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
 
  Scenario level6 = new Scenario("Level Six"); 
  Scenario level7 = new Scenario("Level Seven");

  Scenario level8 = new Scenario("Level Eight");
  Scenario level9 = new Scenario("Level Nine");
  Scenario level10 = new Scenario("Level Ten");
  Scenario level11 = new Scenario("Level 11"); 

      //Construct the board
    public Pirates() {
        
        super("A Space Adventure!");
       
        this.tm = new Timer(1, this);
       
//
      tm.start();
       //Prepares the starting scenario for use on this board  
     level1.setMainEvent("You are __________, a young citizen of Woodworm, a port town off of the great ocean. An orphan of modest means and little consequence you know of the pirates that frequent Woodworm’s ports, and hear many tales of their exploits and their raucous nights in the tavern…. but you pay them little mind. After all, you are an utterly unexceptional person surviving day to day by delivery fish from the wharfs.\n" +
"What interest would swashbuckling adventurers have in you?\n" +
"	Well…..turns out you make good loot. Not make, as in the act of creating. No, no you can’t make anything useful. No it’s you, yourself, your body, that they’ve decided is loot. Woodworm is attacked, besieged by pirates on this hot summer night, and it seems that they intend to take some wealth in flesh. While your city is burning and being rocked by canon fire, you are grabbed by a surly, unwashed man and hauled away from your boarding home. They strike the back of your head, and when you come to everything is dark, and your being roughly manhandled and pushed forward.  \n" +
"	Your knees hit something hard, and all around you can hear loud shouts and jeering. Whatever is covering your face is ripped away and you find yourself kneeling on the rocking wooden deck of a huge ship. The smell of the ocean is your only comfort as you take in your surroundings. You and several other terrified people are surrounded by the rowdy crew, while an imposing figure in a grand red coat with a gentleman’s cane is slowly looking you all over.\n" +
"	 You watch as this man assesses each newcomer, shouting decisions and waving. The crew jump at his command, taking their human cargo and shuttling them to their fates….for better or for worse. Your heart sinks as you are pushed roughly forward, and that imposing man considers you.\n" +
"	“And this one?” Bellows the hairy vagrant behind you.\n" +
"	The captain cocks his head and looks you up and down. He drums his fingers over his cane.\n" +
"	“Put it to work.” He barks.\n" +
"\n" +
"	The next thing you know….you’re down below deck and a surly, sweat slicked pirate in white, grease stained garments is thrusting a mop into your arms. Now what?");
    //The text for the buttons in level 1
    level1.setGoodChoice("What do you mean? Clean you idiot, they have swords!");
    level1.setUglyChoice("Throw the mop aside and resist!! You have rights!!");
    level1.setBadChoice("Make a mad break for it");
    //The text for the consequences that will be displayed:
    level1.setGoodChoiceConsequence("You want to escape, you want to get away….but you really need to be alive to do those things, don’t you? You take up your mop, and your new identity as ship chore minion, and prepare yourself for a long day of labor. You spend the day being ordered about.") ;
    level1.setBadChoiceConsequence("Ok….well that is certainly a unique choice to have made. I mean, you are surrounded by a heavily armed and morally ambiguous group of seafarers, trapped at sea with virtually no means of escape….but you go for it, flinging the mop at the man before you and turning sharply on your heels. He’s startled and you bolt, running as fast and as hard as you can. You make it to the stairs that will bring you back on deck and you run up them, pushing past a confused sailor. It really doesn’t take long of course, the pirates have you back in their custody and are none-to-pleased with your gumption….or your intelligence. Worst of all it seems that your display, being timed as it was and in front of some of the other captives, has earned you the important task of example.\n" +
"As you’re walking the plank you have time to consider the possibility that your escape plan might have served from a little tweaking….but not too much time. It’s a short plank. ");
    level1.setUglyChoiceConsequence("You get mad, you get angry, you get fiery. These people came to your home, burnt your village, stole you away, and are now forcing you into a life as a scullery maid. Oh no my friend, oh no. You toss that mop to the ground angrily then turn your fury to the man before you. \n" +
"	“No!” You shout angrily. “No!!! Take me back to shore, TAKE ME BACK TO SHORE!!!” \n" +
"	The pirate at first seems a little startled, now he’s just confused. He watched you rant a moment more, angry and tearful, then he calmly draws a sword from his side and severs your hand from your body.\n" +
"	…..it would seem the pirates are unconcerned about your rights.");
    //The paths to the pictures for level 1
    level1.setPicPathMain("/tied.jpg");
    level1.setPicPathGood("/clean.jpg");
    level1.setPicPathBad("/plank.jpg");
    level1.setPicPathUgly("/mad.jpg");
    //The text that will be displayed on the buttons in the subscenarios
    level1.setGoodChoiceSub("Scrub that deck as if your life depended on it! It does!");
    level1.setBadChoiceSub("You:'Give me liberty or give me death! \nPirates:'Ok.' ");
    level1.setUglyChoiceSub("Ouch.");
    //
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
   pb1.setBounds(50,275, 40, 40);
   pb2.setBounds(125,300, 40, 40);
   pb3.setBounds(200,325, 40, 40);
   pb3half.setBounds(240, 350, 40, 40);
   pb4.setBounds(275, 325, 40, 40);
   pb5.setBounds(350,350, 40, 40);
   pb6.setBounds(450,350, 40, 40);
   pb7.setBounds(530,350, 40, 40);

   pb8.setBounds(530,425, 40, 40);
   
   giantWin.setBounds(0, 0, 800, 800);
  
          
   panel.add(pb1);
   pb1.setEnabled(true);
   panel.add(pb2);
   pb2.setEnabled(false);
   panel.add(pb3);
   pb3.setEnabled(false);
   panel.add(pb3half);
   pb3half.setEnabled(false);
   panel.add(pb4);
   pb4.setEnabled(false);
   panel.add(pb5);
   pb5.setEnabled(false);
  
   panel.add(pb6);
   pb6.setEnabled(false);
   panel.add(pb7);
   pb7.setEnabled(false);
   
   panel.add(pb8);
   pb8.setEnabled(false);
   
   panel.add(giantWin);

   
   giantWin.setEnabled(false);
   giantWin.setVisible(false);
    
   pb1.addActionListener(bh);
   pb2.addActionListener(bh);
   pb3.addActionListener(bh);
   pb3half.addActionListener(bh);
   pb4.addActionListener(bh);
   pb5  .addActionListener(bh);
   
   
    panel.add(playerPic);  
    
     //background picture
    JLabel picturePirateBackground = new JLabel(new ImageIcon(("/Pirates800.png")));
    picturePirateBackground.setBounds(0, 0, 800, 800);
    panel.add(picturePirateBackground);
   
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
   if(adventurer.getArmStatus() == false)
   {playerPic.setIcon(new ImageIcon(("/fig2.png")));
   }
   
   else //Player is whole
   {playerPic.setIcon(new ImageIcon(("/fig1.png")));
   }
   
   
   //Finds which button is enabled and sets player icon above it
   if (pb1.isEnabled())
   {adventurer.setyCo(30);
    adventurer.setxCo(212);
   }
   if (pb2.isEnabled())
   {adventurer.setyCo(105);
    adventurer.setxCo(237);
   }
   if (pb3.isEnabled())
   {adventurer.setyCo(180);
    adventurer.setxCo(262);
   }
   if (pb3half.isEnabled())
   {adventurer.setyCo(220);
    adventurer.setxCo(287);
   }
   if (pb4.isEnabled())
   {adventurer.setyCo(255);
    adventurer.setxCo(262);
   }
   if (pb5.isEnabled())
   {adventurer.setyCo(330);
    adventurer.setxCo(287);
   }
  
   if (pb6.isEnabled())
   {adventurer.setyCo(430);
    adventurer.setxCo(312);
   }
    if (pb7.isEnabled())
   {adventurer.setyCo(510);
    adventurer.setxCo(287);
   }
   
      if (pb8.isEnabled())
   {adventurer.setyCo(510);
    adventurer.setxCo(362);
   }
    
  
      //Checks status of players choices in level 2 and enables the 
      //nextlevel accordingly
      if (pb2.isEnabled() == true)
      {if (level2.getAPUgly() == true)
      {pb4.setEnabled(true);}
      else if (level2.getAPGood() == true)
      {pb3.setEnabled(true);}
      }
       }
    }
    
    
      
    private class ButtonHandler implements ActionListener{

        

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == pb1 )
            {   //Initialize and start the first level
                level1.init();
             //Make this level no longer accessable   
             pb1.setEnabled(false);
             //ake the next level accessable
             pb2.setEnabled(true);
            }//End level one
            
            //Level 2
            //You canbe an adventurer who resisted and lost a hand
            //Or agreed and has both hands
            else if (e.getSource() == pb2 )
            {//Checks what path was picked and removes hand if the ugly path was picked
             if (level1.getAPUgly() == true)
                {   //Sets the characters arm to false
                    adventurer.setArmFalse();}   
             //The buttons will be the same //The text for the buttons in level
    level2.setGoodChoice("Sneak into the captain’s quarters");
    level2.setUglyChoice("Keep mopping!!! What part of “stay alive” do you not get?");
    level2.setBadChoice("Steal a longboat and try to escape");
     //The text to be displayed on the buttons called by subInits
    level2.setGoodChoiceSub("You braved it! What will you find!");
    level2.setBadChoiceSub("Well you know what they say, 'it's better to have tried and ended up stripped naked in the sea, then to have never tried at all.' What? They DON'T say that???");
    level2.setUglyChoiceSub("Play it safe, I respect that. But what could you have missed?");        
    
            //The level if the adventurer lost a hand
            if (adventurer.getArmStatus() == false)
            {  //The text for the main event
    level2.setMainEvent("You want to escape, you want to get away….but you really need to be alive to do those things, don’t you? Having already lost a hand you suspect that your whole “staying alive” thing is not going to be well served by more acts of insubordination. So, once you heal, you take up your mop, and your new identity as ship chore minion, and prepare yourself for long days of labor. \n" +
"	It’s a hard week, slaving for the pirates. You scour pots, swab the deck, attempt to peel potatoes while they mock your stub, anything and everything your pirate overlords desire. Through it all you think of your escape, and bide your time. Unfortunately you don’t know how much time you have. It seems that a one-handed chore minion is not maybe so useful….in fact you even overheard the pirate who mutilated you being heavily berated by the ship’s quarter master for hurting you….not because they have any feelings for you but because your usefulness on the ship is significantly decreased by your handicap.\n" +
"	“You coulda at least chopped off a foot!” You heard them say. You feel very sick.\n" +
"	Point is, you have got to think of something to get off this ship, and one afternoon, and interesting opportunity arises. The crew is buzzing, and the captain and quarter master are acting strangely. They’re very intense, and have been inside the captain’s cabin for a long while. Some men come in and out, all seeming in on whatever strange even has them so excited. You are kneeling on the deck, a huge pail of water at your side and a rag, scrubbing at the boards. You have given up with the mop, it’s quite cumbersome with just the one hand. You watch the goings-on discretely, always making sure to keep busy. Then, the doors are thrown open with gusto and you are startled into looking up as the imposing captain and the ship quarter master come out to the deck. They cross the ship, paying no attention at all to you….and leaving the captains’ cabin abandoned….\n" +
"	What’s more is they’ve summoned the crew!! The men are all hurrying to gather around them, listening in earnest to whatever they are preparing to announce. It’s something big….They’re not paying any attention to you, they’re focused on the two men addressing them, this could be your chance to steal a longboat and escape!!! This is a great opportunity…..a very high risk opportunity! What do you do?");  
     //The text for the consequences that will be displayed:
    level2.setGoodChoiceConsequence("You take a deep breath, eyes fixed on the pirates as you slowly, slowly, lower your mop to the deck, then silently rise back up to your feet. You stare at them long and hard, checking carefully that no one is looking at you, then turn, and hurry to the captain’s cabin. You twist the handle, but then with a gentle push let the door swing open. No going back. You run inside and quickly close the door behind you, carefully, quietly. You whirl around, heart pounding and take in everything you can see. You see his desk, his hammock, a book case…a map! ") ;
    level2.setBadChoiceConsequence("You see them, all congregated around, and your heart skips a beat. This is it! Earnestly you drop your mop and run for the stairs. In all honesty, it wasn’t your competency that killed you. You are, to your credit, able to sneak to the boats, you even get one cut free and you are even smart enough to swipe a loaf of bread from the kitchen as even the cook is listening to the captain’s plans….but well at the end of the day the odds of you getting this boat in the water and rowing completely out of their sight or firing range before the crew finished their discussion and voting were non-existent. And here’s a better question for you….with one hand….how were you planning to row that boat? You’re discovered, shot in the back, stripped naked, and thrown into the sea….so….well….your escape was unsuccessful. Better luck next time!!!");  
    level2.setUglyChoiceConsequence("You look around, see how completely forgotten you are, and you’re tempted, you are. But you’re also cautious. You’d never get away in a longboat alone, how could you even get it into the water before they were done talking? And sneaking into the captain’s cabin seems such an unnecessary risk….You don’t even know if you’d have found anything useful, and even if you had, it isn’t worth your life. You’ve seen what these people can do, and you don’t want to get keel-hauled, or lose another limb….Just the thought sends a shiver up your spine and you hurriedly return to your work, hearing the men as they shout and cheer. When the cook calls you down to help with dinner later you notice he is in a fine mood.");
    

//The paths to the pictures
    level2.setPicPathMain("/meeting.jpg");
     level2.setPicPathGood("/desk1.jpg");
     level2.setPicPathBad("/naked.jpg");
     level2.setPicPathUgly("/scrub.jpg");
    
    //Initialize the level
    level2.init();
    //Enable button for next level
    pb2.setEnabled(true);
//Make this level no longer accessable   
   // pb3.setEnabled(false);
            
            }
            else //Adventurer has both hands
            {
    //The text for the main event
    level2.setMainEvent("It’s a hard week, slaving for the pirates. You scour pots, swab the deck, peel potatoes, anything and everything your pirate overlords desire. Through it all you think of your escape, and bide your time. You have got to think of something to get off this ship, and one afternoon, and interesting opportunity arises. The crew is buzzing, and the captain and quarter master are acting strangely. They’re very intense, and have been inside the captain’s cabin for a long while. Some men come in and out, all seeming in on whatever strange even has them so excited. You are standing on the deck, a huge pail of water at your side, mopping at the boards.  You watch the goings-on discretely, always making sure to keep busy. Then, the doors are thrown open with gusto and you are startled into looking up as the imposing captain and the ship quarter master come out to the deck. They cross the ship, paying no attention at all to you….and leaving the captains’ cabin abandoned….maybe you could find out some information about them….about your location, about anything….\n" +
"	What’s more is they’ve summoned the crew!! The men are all hurrying to gather around them, listening in earnest to whatever they are preparing to announce. It’s something big….They’re not paying any attention to you, they’re focused on the two men addressing them, this could be your chance to steal a longboat and escape!!! This is a great opportunity…..a very high risk opportunity! What do you do?");  
    
    //The text for the consequences that will be displayed:
    level2.setGoodChoiceConsequence("You take a deep breath, eyes fixed on the pirates as you slowly, slowly, lower your mop to the deck, then silently rise back up to your feet. You stare at them long and hard, checking carefully that no one is looking at you, then turn, and hurry to the captain’s cabin. You twist the handle, but then with a gentle push let the door swing open. No going back. You run inside and quickly close the door behind you, carefully, quietly. You whirl around, heart pounding and take in everything you can see. You see his desk, his hammock, a book case…a map! ") ;
    level2.setBadChoiceConsequence("You see them, all congregated around, and your heart skips a beat. This is it! Earnestly you drop your mop and run for the stairs. In all honesty, it wasn’t your competency that killed you. You are, to your credit, able to sneak to the boats, you even get one cut free and you are even smart enough to swipe a loaf of bread from the kitchen as even the cook is listening to the captain’s plans….but well at the end of the day the odds of you getting this boat in the water and rowing completely out of their sight or firing range before the crew finished their discussion and voting were non-existent. You’re discovered, shot in the back, stripped naked, and thrown into the sea….so….well….your escape was unsuccessful. Better luck next time!!! ");  
    level2.setUglyChoiceConsequence("You look around, see how completely forgotten you are, and you’re tempted, you are. But you’re also cautious. You’d never get away in a longboat alone, how could you even get it into the water before they were done talking? And sneaking into the captain’s cabin seems such an unnecessary risk….You don’t even know if you’d have found anything useful, and even if you had, it isn’t worth your life. You’ve seen what these people can do, and you don’t want to get keel-hauled….Just the thought sends a shiver up your spine and you hurriedly return to your work, hearing the men as they shout and cheer. When the cook calls you down to help with dinner later you notice he is in a fine mood.");
    //The paths to the pictures
    level2.setPicPathMain("/meeting.jpg");
     level2.setPicPathGood("/desk1.jpg");
     level2.setPicPathBad("/naked.jpg");
     level2.setPicPathUgly("/clean.jpg");
    
    //Initialize the level
    level2.init();
    //Enable button for next level
  //  pb3.setEnabled(true);
//Make this level no longer accessable   
    pb2.setEnabled(false);
            
            }
            
            }//end level 2
        
            //LEvel thre.
            //This level is optional, either adventuerer, missing hand or not, 
            //can access. It leads to level 3half
        else if (e.getSource() == pb3 )
            
        {//Everything is the same for both 
    //The text for the main event
    level3.setMainEvent("You run forward and look at the map spread out on his desk, but the charts and numbers make much less sense to you than to the expert seaman to which they belong. You hear loud cheering and a clamor of noise from the deck. Oh no, you really need to hurry. You look around again. On the desk you see the ship’s log book….the Captain’s personal notes of the voyages. There would be tons of information in there, probably even a way to get back home. There is a pistol and an old compass on his book case, and a rope hanging with a wild assortment of other things on the wall. Surely he’d miss his pistol, and how would you smuggle it out? You probably couldn’t swipe the whole book either, your clothes will only conceal so much, you’ll need to read it in here. What should you do?\n" );  
    //The text for the buttons in level
    level3.setGoodChoice("Grab the comapss.");
    level3.setUglyChoice("Grab the rope");
    level3.setBadChoice("Dig through the book for information on Wormwood");
    //The text for consequences
      level3.setGoodChoiceConsequence("A sense of direction never hurt a shanghaied slave, and with all his other marine tools, you doubt he’ll miss it, probably has quite a few. You snatch the compass and bury it in your baggy trousers, puffing up your shirt a bit to cover any bulge. There, no one would know a thing looking at you. Now what? ") ;
         level3.setUglyChoiceConsequence("Who knows when a rope will come in handy? You run for the rope, coiling it tightly enough around your thigh to allow you to roll your baggy trousers down over it. There! No one would know a thing looking at you. Now what?");
      level3.setBadChoiceConsequence("You sit down on the edge of the captain’s seat and quickly open the book before you. You hurriedly open the captain’s log and begin flipping. It can’t be too far back, you’ve only been on board a week or two. You flip the pages, scanning the captain’s neat, trim writing for mention of your town. If you can back track the ship’s journey you can find your way back! You flip two more pages when you see it! An entry about the sacking of Wormwood Wharf. You lean in, and begin reading earnestly.  \n" +
"		\n" +
"The Thirteenth Day of July\n" +
"	Our hunt for L a Santa has grown long, and the men are restless. Thankfully I at last have a lead I believe to be sincere. There is a port town, friendly to pirates, known on the seas as Woodworm Wharf.  I have it on good information that Captain Nesbitt and his men have been docked there for many months, seem to have made base within the town. I know that we can overcome them, and take\n" +
"\n" +
"	That’s why they attacked your town! They were after this Nesbitt pirate, and whatever it was he possessed that they’d been hunting.  \n" +
"\n" +
"	Cummings and I mean to---\n" +
"\n" +
"	You are startled by the sound of the door and look up from the desk in shock….although not nearly the shock as what you see on the quarter master’s face. The captain stands behind him, considering you. ….it would appear you became too engrossed in your search and spent too long on your attempted sleuthing. If it is any consolation to you, as you are being roughly bound and forced up onto the plank, you hear the captain making a kindly comment about your ability to read….it seems that you are going to die at least considered an intelligent person. Yaaaaaaay…..?");  
        //The text to be displayed on the buttons called by subInits
        level3.setBadChoiceSub("Hey, reading is an accomplishment! Most of them can't!");
 level3.setGoodChoiceSub("Now you'll know EXACTLY where they make you slave away!!");
 level3.setUglyChoiceSub("You should NEVER go adventuring without an adventure rope! Good choice!!");
 
   
    //The paths to the pictures
    level3.setPicPathMain("/desk1.jpg");
     level3.setPicPathGood("/nocompass.jpg");
     level3.setPicPathBad("/plank.jpg");
     level3.setPicPathUgly("/norope.jpg");
   
    
    //Initialize the level
    level3.init();
    //Enable button for next level
    pb3half.setEnabled(true);
//Make this level no longer accessable   
    pb3.setEnabled(false);
        }//end level three
            
            //Level three and a half
            //The text in this level varies based on if the player stole the rope or the compass
        //And whether the player is misisng a hand or not.
            else if (e.getSource() == pb3half )
            {//The 'good' choice and it's buttons are the same regardless
               //The text for the consequences that will be displayed:
    level3half.setGoodChoiceConsequence("Your theft concealed, you run for the door and peer through the keyhole. The other side looks clear, you should be able to get out without being seen. It may have been tempting to stay, or to try and take two prizes, but a ship is a small place, not much goes unseen and you have a very small window to get in and out of this room safely! You’re not leaving empty handed, and you’re getting out alive! You hurriedly shut the door behind you and run for your mop. You try to look as calm as possible, try to return to your work as you hear a loud, triumphant shout from the men and then they, very merrily, seem to begin disbanding. \n" +
"Wheeeew….you made it out just in time. You scrub the floor, keeping your eyes down and trying not to look the least bit suspicious, but you still catch your breath when you see the captain return to his chambers. You’ve never been so relieved in your life to hear the cook when he shouts up for you to come help prepare dinner….you run below deck happily, very glad to put some distance between yourself and your act of desperation fueled bravery.\n" +
"….although you still sleep uneasily that night.   ") ;     
 //The text for the buttons in level
    level3half.setGoodChoice("Get out!");     
     //The text to be displayed on the buttons called by subInits
    level3half.setGoodChoiceSub("Nothing like the ole 'snatch and dash.' Hope they don't find out!"); 

    //If the player is missing a hand
    if (adventurer.getArmStatus() == false)
    {
        //Further, if they took the rope
        if(level3.getAPUgly() == true)
        {//The text for the main event
    level3half.setMainEvent("Who knows when a rope will come in handy? You run for the rope, coiling it tightly enough around your thigh to allow you to roll your baggy trousers down over it. It’s a little difficult with just the one hand, but…There! No one would know a thing looking at you. Now what?"); 
    //The text for the buttons in level
    level3half.setUglyChoice("Dig through the book for information on Wormwood");
    level3half.setBadChoice("Investigate some more");
    //The text for the consequences that will be displayed:
    
    level3half.setBadChoiceConsequence("Prize secured, you turn around and consider the room again. You can’t make much sense of the map not knowing where you are now, but finding Woodworm on it would certainly aid your escape…but there’s no way to steal that...then there’s the wide selection of weapons in the room. Now one of THOSE would certainly be a blessing. Especially given your handicapped state… Yes, that would be the wisest course, you decide. Something small…you need something small, that you can conceal easily, perhaps a dagger, a small knife! \n" +
"As you set to your search you hear a loud, triumphant shout from the men and some footsteps. Oh no! Are they disbanding? You’ve got to go! You leap to your feet and run for the door. You peer through the keyhole, but all you see is a blur of brown and—the creak of the door isn’t enough of a warning before it is opened right into your face. With an undignified sort of “Bleack!” sound of surprise your rammed by the door and knocked back onto your bottom with a bleeding nose….alas in their excitement it seems the captain and his entourage opened the door with quite some gusto. They are gathered around you, staring down at the floor in shock, and, to his credit, the incredulous captain even asks you what you were doing. Had it not been for the stolen rope on your person you may have been able to pass off some tale of cleaning…\n" +
"Buuuuut since the captain had not requested you clean his chambers, and you were found with pilfered goods, he instead has you stripped and flung overboard. So much for THAT plan….");  
    level3half.setUglyChoiceConsequence("Now you’ve got a resource to help you escape….but you still need information! You run back to the desk and sit down on the edge of the captain’s seat, quickly opening the book before you. You hurriedly open the captain’s log and begin flipping. It can’t be too far back, you’ve only been on board a week or two. You flip the pages, scanning the captain’s neat, trim writing for mention of your town. If you can back track the ship’s journey you can find your way back! As you set to your search you hear a loud, triumphant shout from the men and some footsteps. Oh no! Are they disbanding? You’ve got to go! You leap to your feet and run for the door. You peer through the keyhole, but it is as you fear. Men are beginning to return to their positions, and as you quickly crack open the door and make a run for your mop…you are spotted leaving the captain’s chambers. The way this particular pirate sees it…there’s no reason for the scullery worker to be in the captain’s cabin at all….and you are promptly brought before him. \n" +
"It seems the captain is not in an indulgent mood. It is put forward that your foot could be cut off as punishment, and to put a damper on your wandering, but he rules that you will be too much of a burden, missing a hand and a foot, and has you tossed into the sea instead.");
    //The paths to the pictures
    level3half.setPicPathMain("/norope.jpg");
     level3half.setPicPathGood("/scrub.jpg");
     level3half.setPicPathBad("/naked.jpg");
     level3half.setPicPathUgly("/naked.jpg");
     //The text to be displayed on the buttons called by subInits
    level3half.setGoodChoiceSub("Nothing like the ole 'snatch and dash.' Hope they don't find out!");
    level3half.setBadChoiceSub("You got greedy, should have left while you could.");
    level3half.setUglyChoiceSub("Really? Read a book? You tried to take time to read??");
        }
        else if (level3.getAPGood() == true) //Tey chose the compass
        {//The text for the main event
    level3half.setMainEvent(""); 
    //The text for the buttons in level
    level3half.setUglyChoice("Dig through the book for information on Wormwood");
    level3half.setBadChoice("Investigate some more");
    //The text for the consequences that will be displayed:
    
    level3half.setBadChoiceConsequence("");  
    level3half.setUglyChoiceConsequence("");
    //The paths to the pictures
    level3half.setPicPathMain("/nocompass.jpg");
     level3half.setPicPathGood("/scrub.jpg");
     level3half.setPicPathBad("/naked.jpg");
     level3half.setPicPathUgly("/naked.jpg");
     //The text to be displayed on the buttons called by subInits
    level3half.setGoodChoiceSub("Nothing like the ole 'snatch and dash.' Hope they don't find out!");
    level3half.setBadChoiceSub("You got greedy, should have left while you could.");
    level3half.setUglyChoiceSub("Really? Read a book? You tried to take time to read??");
   }
    


//Initialize the level
    level3half.init();
    //Enable button for next level
    pb4.setEnabled(true);
//Make this level no longer accessable   
    pb3half.setEnabled(false);
    }
    
            }
        }
        
        
        }
        
        }

