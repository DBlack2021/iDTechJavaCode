package conditionals.buttonchallenge;

import processing.core.PApplet;

public class ButtonChallengeAnswer extends PApplet {

  public void settings() {
    size(500, 500);
  }

  public void draw() {
    background(255);

    // Challenge: the provided code (when run) draws a button on the screen. Using an
    // if-statement, write a program that colors the button red when pressed, and green when not
    // pressed

//    if (mousePressed && mouseX > 200 && )
    fill(0, 255, 0);
    rect(200, 300, 60, 40);
    fill(0);
    text("Click me!", 205, 320); // the text() method draws text on the screen
  }

  public static void main(String[] args) {
    PApplet.main("conditionals.buttonchallenge.ButtonChallengeAnswer");
  }
}
