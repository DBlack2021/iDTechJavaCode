package conditionals.buttonchallenge;

import processing.core.PApplet;

/**
 * Purpose: Have students practice using an if statement and the "&&" operator
 */
public class ButtonChallenge extends PApplet {

  public void settings() {
    size(500, 500);
  }

  public void draw() {
    background(255);

    // Challenge: the provided code (when run) draws a button on the screen. Using an
    // if-statement, write a program that colors the button red when pressed, and green when not
    // pressed

    // Hint: Look up the mousePressed variable on the Processing documentation

    // Hint 2: this line below controls what color the button is
    fill(0, 255, 0);
    rect(200, 300, 60, 40);
    fill(0);
    text("Click me!", 205, 320); // the text() method draws text on the screen
  }

  public static void main(String[] args) {
    PApplet.main("conditionals.buttonchallenge.ButtonChallenge");
  }
}
