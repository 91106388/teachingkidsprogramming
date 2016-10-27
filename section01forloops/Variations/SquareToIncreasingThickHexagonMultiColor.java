package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToIncreasingThickHexagonMultiColor
{
  //--------Kata Question------
  // How would you make an equilateral triangle
  // with 20 pixel thick sides?
  // with multi-color line
  // and with with side lengths of 25 that increase by 2
  // Write out the steps in English 
  // Then translate the steps into code
  // Make sure to run after each line
  // Make pen width 20 pixel
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Martin and Aaron");
    Tortoise.show();
    Tortoise.setSpeed(10);
    // make a variable named Length
    //initialize length to 25
    int length = 25;
    // Make 6 number of sides to 6
    int sides = 6;
    for (int i = 0; i < 6; i++)
    {
      // Change the color of the line to multicolor
      Tortoise.setPenWidth(20);
      Tortoise.setPenColor(PenColors.getRandomColor());
      // Start side length at 25 pixels
      // every time through the loop double length
      length = length * 2;
      Tortoise.move(length);
      Tortoise.turn(360 / sides);
    }
  }
}
