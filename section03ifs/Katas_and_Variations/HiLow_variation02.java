package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_variation02
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    int numGuesses = MessageBox.askForNumericalInput("How many Guess do you think you need?");;
    for (int i = 0; i < numGuesses; i++)
    {
      MessageBox.askForNumericalInput("How many Guess do you think you need?");
      int guess = MessageBox.askForNumericalInput("Guess a number between 1 and 100");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high!");
      }
      else
      {
        MessageBox.showMessage("Too low!");
      }
    }
    MessageBox.showMessage("You lost!");
  }
}
