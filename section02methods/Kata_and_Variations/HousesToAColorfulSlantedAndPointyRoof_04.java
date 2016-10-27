package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Purples;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class HousesToAColorfulSlantedAndPointyRoof_04
{
  // ------------Kata Question--------------
  // How would you make a house with a slanted roof
  //    and a house with a pointy roof
  //    and change the color of the houses?
  // Write out the steps in English 
  // Then translate the steps into code
  // Make sure to run after each line
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Mr Coopersmith");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    ColorWheel.addColor(Purples.Fuchsia);
    int height = 40;
    // Make a skyline with pointy roof houses and slanted roof houses 
    // make a house with a pointy roof and current height --#1
    drawHousePointyRoof(height);
    // make a house with a slanted roof and height of 120 pixels--#2
    drawHouseSlantedRoof(120);
    //make a house with a pointy roof and height of 90 pixels--#3
    drawHousePointyRoof(90);
    //make a house with a slanted roof and height of 20 pixels--#4
    drawHouseSlantedRoof(20);
    // make the houses different colors --#5
  }
  private static void drawHouseSlantedRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawSlantedRoof()
  {
    // make a slanted roof
    // turn the tortoise 45 degrees to the right --#1
    Tortoise.turn(45);
    // move the tortoise 30 pixels --#2
    Tortoise.move(30);
    // turn the tortoise 135 degrees to the right --#3
    Tortoise.turn(135);
    // move the tortoise 20 pixels --#4
    Tortoise.move(20);
  }
  private static void drawPointyRoof()
  {
    //make a pointy roof 
    // turn the tortoise 45 degrees to the right --#1
    Tortoise.turn(45);
    // move the tortoise A pixels --#2
    Tortoise.move(30);
    // turn 90 degrees to the right --#3
    Tortoise.turn(90);
    // move the tortoise A pixels --#4
    Tortoise.move(30);
    // turn the tortoise 45 degrees to the right --#5
    Tortoise.turn(45);
  }
  private static void drawFlatRoof()
  {
    // make flat roof
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
