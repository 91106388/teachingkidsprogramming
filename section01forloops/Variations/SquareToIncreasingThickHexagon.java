package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToThickHexagon
{
  //--------Kata Question------
  //How would you make an equilateral triangle
  // with 20 pixel thick sides?
  // with multi-color line
  //Write out the steps in English 
  //Then translate the steps into code
  //Make sure to run after each line
  //Make pen width 20 pixel
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Martin and Aaron");
    Tortoise.show();
    Tortoise.setSpeed(10);
    // Make 6 sides
    int sides = 6;
    for (int i = 0; i < 6; i++)
    {
      // Change the color of the line to multicolor
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(50);
      Tortoise.turn(360 / sides);
    }
  }
}
