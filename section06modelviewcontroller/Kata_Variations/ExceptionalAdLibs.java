package org.teachingkidsprogramming.section06modelviewcontroller.Kata_Variations;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibs
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    MessageBox.showMessage("The adverb is" + adverb);
  }
  public static askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What i sthe adverb");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Please enter an adverb");
      adverb = askAdverb();
    }
  }
}
