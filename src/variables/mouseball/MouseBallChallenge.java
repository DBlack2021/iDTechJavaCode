package variables.mouseball;

import processing.core.PApplet;

/**
 * Purpose: Students practice using the built-in mouseX and mouseY variables in Processing.
 */
public class MouseBallChallenge extends PApplet{
  public void settings() {
    // you may change the width and height if you'd like, but I recommend keeping it a square!
    size(500, 500);
  }

  public void draw() {
    // Challenge: write a program that draws a circle at the current position of the mouse, and
    // have the circle move when the user moves the mouse

    // You may use any Processing functions we have learned so far,
    // plus any you can find by doing your own research
    // HINT: Look up the built-in mouseX and mouseY variables in the Processing documentation
  }

  public static void main(String[] args) {
    PApplet.main("variables.mouseball.MouseBallChallenge");
  }
}
