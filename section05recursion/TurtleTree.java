package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Turn the background black  --#21
    Tortoise.getBackgroundWindow().setBackground(black)
    int branchLength = 60;
    //
    drawBranch(branchLength);
  }
  private static void drawBranch(int branchLength)
  {
    //        If the current branch length is greater than zero, do the rest of this recipe --#5
    if (branchLength > 0)
    {
      //        adjustColor (recipe below)--#15.1
      //        ------------- Recipe for adjustColor --#15.2
      HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
      //            A 10 pixel long branch is lime --#20
      //            A 20 pixel long branch is forest green --#19
      //            A 30 pixel long branch is dark green --#18
      //            A 40 pixel long branch is olive --#17
      //            A 50 pixel long branch is sienna --#14
      colors.put(50, PenColors.Browns.Sienna);
      //            A 60 pixel long branch is saddle brown (TIP: Put the values into the 'colors' HashMap)--#13 
      colors.put(60, PenColors.Browns.SaddleBrown);
      //            Get the value of the branch length from the 'colors' HashMap and use that to set the pen color --#21
      //        ------------- End of adjustColor --#15.3
      //
      Tortoise.move(branchLength);
      //        drawLowerBranches (recipe below) --#6.1
      //
      drawLowerBranches(branchLength);
      //
    }
  }
  private static void drawLowerBranches(int branchLength)
  {
    //        ------------- Recipe for drawLowerBranches --#6.2
    Tortoise.turn(30);
    //            drawShorterBranch (recipe below) --#8.1
    drawShorterBranch(branchLength);
    //
    Tortoise.turn(-60);
    drawShorterBranch(branchLength);
    Tortoise.turn(30);
    //            adjustColor --#16
    Tortoise.move(-60);
    //        ------------- End of drawLowerBranches recipe --#6.3
  }
  private static void drawShorterBranch(int branchLength)
  {
    //
    //            ------------- Recipe for drawShorterBranch --#8.2
    drawBranch(branchLength - 10);
    //            ------------- End of drawShorterBranch recipe --#8.3
  }
}