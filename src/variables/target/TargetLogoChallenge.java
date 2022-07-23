package variables.target;

import processing.core.PApplet;

/**
 * Purpose: Students practice defining variables and using math. Also practices using the built-in
 * width and height variables. Further practices reading documentation
 */
public class TargetLogoChallenge extends PApplet {
  // Declare any variables you need up here...

  public void settings() {
    // you may change the width and height if you'd like, but I recommend keeping it a square!
    size(500, 500);
  }

  public void draw() {
    // Challenge: draw the Target logo, so 3+ concentric circles alternating red and white, in
    // the center of the screen

    // It's ok if it isn't PERFECT when you change the size, we'll learn a way to make it PERFECT
    // tomorrow. As long as it looks relatively ok, you're good.

    // You may use any Processing functions we have learned so far,
    // plus any you can find by doing your own research
    // HINT: for color, look up the fill() function
    // HINT 2: Look up the built-in width and height variables in Processing
  }

  public static void main(String[] args) {
    PApplet.main("variables.target.TargetLogoChallenge");
  }
}
