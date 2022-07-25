package conditionals;

import processing.core.PApplet;

public class IfStatements extends PApplet {

  // Conditionals - also called if statements - allow us to add control flow to our programs
  // Control flow is the action of doing different things under different conditions

  // For example - let's return to our ball animation

  // First we define a speed and x-position for the ball:
  int speed = 3;
  int xPosition = 0;

  public void settings() {
    size(500, 500);
  }

  public void draw() {
    // Draw the background
    background(255);

    // We want to add speed to xPosition to make the ball move:
    xPosition += speed;

    // We want to draw the ball at xPosition:
    ellipse(xPosition, height / 2, 50, 50);

    // There's a problem with this code! The ball goes off the screen
    // When the ball reaches the edge, we want to flip it around - in essence, we want to invert
    // the speed (instead of adding to xPosition, we want to subtract [or add negative!])


    // We use an if-statement to decide when to flip speed:

    // if our xPosition of our ball is greater than the width of the screen... (goes off to the
    // right)
    if (xPosition > width) {
      // Do whatever is between the curly braces
      speed *= -1; // invert the speed (flip the direction around)
    }

    // if our xPosition of our ball is less than zero... (goes off to the left)
    if (xPosition < 0) {
      speed *= -1;
    }

    // Exercise: Change the above if statements so the ball doesn't go halfway off the screen
  }

  // DO NOT REMOVE THIS CODE! THIS CODE MAKES YOUR PROJECT RUN PROPERLY!
  public static void main(String[] args) {
    // change "ProcessingStarter" to the name of your class (remember to keep the quotes!)
    PApplet.main("conditionals.IfStatements");
  }
}
