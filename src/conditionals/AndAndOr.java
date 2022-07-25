package conditionals;

import processing.core.PApplet;

public class AndAndOr extends PApplet {
  // Let's modify our previous example with our colored ball

  // The user now wants the following features:
  // - if the ball is past x = 300 or below y = 300 (remember, below for y means bigger), color it
  // green
  // - if the ball is past x = 200 and above y = 300, color it blue
  // - otherwise, color it purple

  public void settings() {
    size(500, 500);
  }

  public void draw() {
    background(255);

    // To combine conditions, we can use the and and or operators (&& for and, || for or)

    if (mouseX > 300 || mouseY > 300) { // this will be true if either the mouse is to the right
      // of 300 or below 300, only one has to be true
      fill(0, 255, 0);
    } else if (mouseX > 200 && mouseY < 300) { // this will be true only if both parts are true
      fill(0, 0, 255);
    } else {
      fill(255, 0, 255);
    }

    ellipse(mouseX, mouseY, 50, 50);
  }

  public static void main(String[] args) {
    PApplet.main("conditionals.AndAndOr");
  }
}
