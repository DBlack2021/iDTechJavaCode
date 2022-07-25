package conditionals;

import processing.core.PApplet;

public class ElseIfAndElse extends PApplet {

  // Let's look at another application of if-statements
  // Let's suppose a program where the user was dragging a ball around the screen like your
  // MouseBall challenge, but the user wanted the ball to change different colors depending on
  // how far to the right they were:

  // if x is past 100, color it green
  // if x is past 200, color it yellow
  // if x is past 300, color it red
  // otherwise, color it blue

  // We cannot achieve this with just if statements, because these conditions overlap - if x is
  // past 300, it is also past 200 and 100, so we need a new tool...

  public void settings() {
    size(500, 500);
  }

  public void draw() {
    background(255);

    // This is where else-if and else statements come in: they make it so you can have multiple
    // conditions where only one (the first true one) runs. For example:

    // if x is past 300 (the most "extreme" condition)
    if (mouseX > 300) {
      // color the ball red
      fill(255, 0, 0);
    } else if (mouseX > 200) { // if it ISN'T past 300, but is past 200
      fill(255, 255, 0);
    } else if (mouseX > 100) { // if it ISN'T past 200 but is past 100
      fill(0, 255, 0);
    } else { // if none of the above conditions are true
      fill(0, 0, 255);
    }

    ellipse(mouseX, mouseY, 50, 50);
  }

  public static void main(String[] args) {
    PApplet.main("conditionals.ElseIfAndElse");
  }
}
