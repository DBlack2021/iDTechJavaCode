package variables.mouseball;

import processing.core.PApplet;

/**
 * Students: make sure you've given the problem a solid try before looking here!
 * This code should NOT be copy-pasted - if anything, type out the code yourself side by side and make sure you
 * understand EACH line!
 *
 * Note: This is not a DEFINITIVE answer, just code that solves the challenge. If your code looks different and solves
 * the challenge, it is correct! Feel free to compare and contrast your code with mine.
*/
 public class MouseBallAnswer extends PApplet {
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

    // we use the built in mouseX and mouseY variables to draw the ellipse at (mouseX, mouseY)
    ellipse(mouseX, mouseY, 50, 50);
  }

  public static void main(String[] args) {
    PApplet.main("variables.mouseball.MouseBallAnswer");
  }
}
