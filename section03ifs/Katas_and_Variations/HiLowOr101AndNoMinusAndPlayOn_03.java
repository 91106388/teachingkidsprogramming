package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
//------------------Kata Question----------------//
// How would you make sure the guess is NOT zero 
//        and end the game if the guess is zero?
// How would you make sure the guess in NOT a negative number
//       but go to the next turn if the guess is negative
// How would you make sure the guess is less than 100
//      and end game if it is greater than 100?
// Writ out the steps out in English
// Then translate the steps into code
// Make sure to run after each line

public class HiLowOr101AndNoMinusAndPlayOn_03
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
    for (int i = 0; i < 2; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      if (guess == answer)
      {
        // check if guess less than one #1
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      else if (guess == 0)
      {
        // tell user you can't guess less than one #2
        MessageBox.showMessage("0 is not valid input. program exiting");
        // than exit game #3
        System.exit(0);
      }
      // check for 101 #4
      // tell users they can not go over 100 #5
      // skip turn #6
      // check for negatives #7
      // tell the users they can not go under 0 #8
      // skip turn #9
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
    }
    MessageBox.showMessage("You lost");
  }
}