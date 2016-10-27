package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("unused")
public class ourTestVariation01
{
  //  Step 1: SELECT the method name (youCanReadVariables on line 19), then click the Run Button
  //            Keyboard shortcut to run ->  PC: Ctrl+F11 or Mac: Command+fn+F11
  //  Step 2: READ the name of the method that failed
  //  Step 3: FILL IN the blank (___) to make that method pass
  //  Step 4: SAY at least one thing you just learned
  //  Step 5: GO to the next method
  //  IMPORTANT - Do NOT change anything except the blank (___)//  
  //  
  @Test
  public void youCanReadVariables() throws Exception
  {
    int numberOfPets = 3;
    Assert.assertEquals(numberOfPets, ___);
  }
  @Test
  public void youCanAddVariables() throws Exception
  {
    int numberOfPets = 3;
    Assert.assertEquals(numberOfPets, ___);
  }
  /**
   * Ignore the following, It's needed to run the test
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   */
  public String ___  = "You need to fill in the blank ___";
  public int    ____ = 10000;
  public String ___()
  {
    return ___;
  }
}
