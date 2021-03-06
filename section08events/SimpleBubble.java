package org.teachingkidsprogramming.section08events;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class SimpleBubble implements MouseLeftClickListener
{
  //field
  ProgramWindow programWindow;
  public SimpleBubble()
  {
    programWindow = new ProgramWindow("My Bubble");
    programWindow.setWindowVisible(true);
    programWindow.addMouseLeftClickListener(this);
    //    prepareColorPalette (recipe below) --#7.1
    //
    //    ------------- Recipe for prepareColorPalette --#7.2
    //         Add purple to the color wheel --#2.3
    ColorWheel.addColor(PenColors.Purples.Purple);
    //         Add light steel blue to the color wheel --#4
    ColorWheel.addColor(PenColors.Blues.SteelBlue);
    //         Add blue to the color wheel --#5
    ColorWheel.addColor(PenColors.Blues.Blue);
    //         Add dark blue to the color wheel --#6
    ColorWheel.addColor(PenColors.Blues.DarkBlue);
    //    ------------- End of prepareColorPalette recipe --#7.3
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    //     createBubble (recipe below) --#8.1
    //     ------------- Recipe for createBubble --#8.2
    //     Remove previous bubbles from your program window --#9
    programWindow.clearWindow();
    int raduis = NumberUtils.getRandomInt(10, 50);
    Circle circle = new Circle(raduis, ColorWheel.getNextColor());
    //     Move the center of the bubble to the current position of the mouse on the window --#3
    circle.setCenter(x, y);
    programWindow.add(circle);
    //    ------------- End of createBubble recipe --#8.3
  }
  public static void main(String[] args)
  {
    new SimpleBubble();
  }
}