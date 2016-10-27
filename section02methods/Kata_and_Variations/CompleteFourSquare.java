package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
//------------FourSquare Kata---------------//

//  Use the Tortoise to draw four squares, each with a width and height of 50 pixels
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line
public class CompleteFourSquare implements fourSquare
{
  public static void main(String[] args)
  {
    System.out.println("be sure to complete the main method to start");
    // show tortoise --#1
    Tortoise.show();
    // set tortoise speed to 10 --#2
    Tortoise.setSpeed(10);
    
    // repeat method 4 times -- #7
    for (int i = 0; i < 4; i++)
    {
      //put method inside for loop -- #8
      drawSquare();
      //turn tortoise 90 degrees to the right --#9
      Tortoise.turn(90);
    }
    //TODO: write comments and then code here
    // make 1-4.2 a method --#6
    private static void drawSquare() 
    {
      // repeat 4 times --#5.1
    for (int i = 0; i < 4; i++)
     {
      // move tortoise 50 pixels --#3
      Tortoise.move(50);
      // turn tortoise 90 degrees to the right --#4
      Tortoise.turn(90);
      // repeat --#5.2
     }
    }
  }
  private static void drawSquare()
  {
    // TODO Auto-generated method stub
  }
}
