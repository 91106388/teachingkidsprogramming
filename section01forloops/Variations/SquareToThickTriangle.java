package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToThickTriangle
{
  //--------Kata Question------
  //How would you make an equilateral triangle
  // with 20 pixal thcik sides?
  //Write out the steps in English 
  //Then translate the steps into code
  //Make sure to run after each line
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Martin and Aaron");
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 0; i < 3; i++)
    {
      Tortoise.setPenColor(PenColors.Blues.Blue);
      Tortoise.move(50);
      Tortoise.turn(120);
    }
  }
}
