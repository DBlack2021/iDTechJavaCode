package variables;

import processing.core.PApplet;

/**
 * Introduces updating a variable's value. Also introduces the functionality of the draw loop and
 * basic animation in Processing
 */
public class VariablesLesson3 extends PApplet {
  // Let's look at a third problem: we want to draw a ball moving across the screen

  // We can use a variable to define the position of the ball, let's call it "ballX" and start
  // the ball at x = 0.
  int ballX = 0;

  // We can also use a variable to define the speed of the ball:
  int speed = 3;

  public void settings() {
    size(500, 500);
  }

  // The draw method runs 60 times per second, so any code we write in here will run over and
  // over and over.
  // This is also why we define variables outside the draw method - if we put
  // them inside, their values would keep getting reset, which could cause problems if we want
  // them to change over time, like we do here.
  public void draw() {
    // this line of code sets the background of our scene. We put this in the draw method so our
    // ball moves smoothly. Try removing this line and see what happens!
    background(255);

    // every time the draw loop is called, we want to update the value of ballX, that is, we want
    // to add to it to change its value:
    ballX = ballX + speed; // read: ballX gets the value of the current value of ballX + speed
    // This can be shorthanded as ballX += speed

    // In processing, we have built in variables as well, notably height and width
    // Note how we use math like before to start the ball at the middle of the screen (halfway down)
    ellipse(ballX, height / 2, 50, 50);
  }

  // DO NOT REMOVE THIS CODE! THIS CODE MAKES YOUR PROJECT RUN PROPERLY!
  public static void main(String[] args) {
    // change "ProcessingStarter" to the name of your class (remember to keep the quotes!)
    PApplet.main("variables.VariablesLesson3");
  }
}
