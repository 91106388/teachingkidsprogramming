package org.teachingkidsprogramming.section07objects;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;

public class SuperTurtles
{
  public MultiTurtleWindow mtw = new MultiTurtleWindow();
  public SuperTurtles()
  {
    showSomeTurtles();
  }
  public static void main(String[] args)
  {
    new SuperTurtles();
  }
  private void showSomeTurtles()
  {
    makeSpeedyTurtle();
    makeSlowTurtle();
    makeCrazyTurtle();
  }
  private void makeCrazyTurtle()
  {
    //  ------------- Recipe for makeCrazyTurtle --#5.1
    Turtle crazyTurtle = new Turtle();
    mtw.addAndShowTurtle(crazyTurtle);
    crazyTurtle.drawLightning(55);
    //  ------------- End of makeCrazyTurtle --#5.2
  }
  private void makeSlowTurtle()
  {
    //  ------------- Recipe for makeSlowTurtle --#3.0
    Turtle slowTurtle = new Turtle();
    mtw.addAndShowTurtle(slowTurtle);
    slowTurtle.drawTriangle(-50);
    //  ------------- End of makeSlowTurtle --#3.1
  }
  private void makeSpeedyTurtle()
  {
    //  ------------- Recipe for makeSpeedyTurtle --#1.0
    Turtle speedyTurtle = new Turtle();
    mtw.addAndShowTurtle(speedyTurtle);
    speedyTurtle.setSpeed(10);
    speedyTurtle.drawTriangle(100);
    //  ------------- End of makeSpeedyTurtle --#1.1 
  }
}
