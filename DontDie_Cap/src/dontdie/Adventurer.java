/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dontdie;

/**
 *
 * @author Strawhatsheik
 */
public class Adventurer {
    
    //Variables,
//The players name, determined by them at start of game????
public String name = "";
//These re values to keep track of the players status. They start as true because the player starts
//whole and healthy
//Also try adding life variable to signal game over? 
public Boolean arm = true, leg = true, eye = true, compass = false, rope = false, alive = true;
//The players x and y co-ordinates for moving him on board
public int xCo, yCo; //For x co-ordinate and y co-ordinate.


//Constructor
public Adventurer(String name)
{//sets the players names
  this.name = name;
  //Sets their x, and y co=ordiantes to starting postion
  xCo = 0;
  yCo = 0;
  
}

//The class will need getter and acessor methods:

//For x co-ordiante
public void setxCo(int xCo)
{this.xCo = xCo;}

public int getxCo()
{return this.xCo;}

//For y co-ordiante
public void setyCo(int yCo)
{this.yCo = yCo;}

public int getyCo()
{return this.yCo;}

//For name, setter method
public void setName (String name)
{this.name = name;}

//For name, getter method
public String getName()
{return this.name;}

//For eye, setter method
public void setEyeFalse()
{this.eye = false;}

//For eye, getter method
public Boolean getEyeStatus()
{return eye;} 

//For leg, setter method
public void setLegFalse()
{this.leg = false;}

//For leg, getter method
public Boolean getLegStatus()
{return leg;}

//For arm, setter method
public void setArmFalse()
{this.arm = false;}

//For eye, getter method
public Boolean getArmStatus()
{return arm;} 

//For compass, setter method
public void setCompassFalse()
{this.compass = false;}

//For compass, getter method
public Boolean getCompassStatus()
{return compass;} 

//For compass, setter method
public void setRopeFalse()
{this.rope = false;}

//For compass, getter method
public Boolean getRopeStatus()
{return rope;}

//Life variables
//For life, setter method
public void setLifeFalse()
{this.alive = false;}

//For life, getter method
public Boolean getLifeStatus()
{return alive;}
}
