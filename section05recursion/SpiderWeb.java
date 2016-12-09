package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    //    Change the Tortoise to a Spider --#14
    Tortoise.setPenColor(color);
    //    Set the color of the background window to black (HINT: use the Tortoise to get the background window) --#13.2
    Tortoise.setBackgroundWindow(Color.black);
    double lengthOfLine = 10.5;
    double zoom = 1.1;
    for (int i = 0; i < 10; i++)
    {
      lengthOfLine = weaveOneLayer(lengthOfLine, zoom);
      //
      zoom = zoom * 1.3;
    }
  }
  private static double weaveOneLayer(double lengthOfLine, double zoom)
  {
    for (int i = 0; i < 6; i++)
    {
      drawTriangle(lengthOfLine);
      //
      Tortoise.turn(360 / 6);
      lengthOfLine = lengthOfLine * zoom;
    }
    return lengthOfLine;
  }
  private static void drawTriangle(double lengthOfLine)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(lengthOfLine);
      Tortoise.turn(360 / 3);
    }
    //            ------------- End of drawTriangle recipe --#4.3
  }
}