package variables.target;

import processing.core.PApplet;

public class TargetLogoAnswer extends PApplet {
  // Declare any variables you need up here...
  int size = 200;

  public void settings() {
    // you may change the width and height if you'd like, but I recommend keeping it a square!
    size(500, 500);
  }

  public void draw() {
    // Challenge: draw the Target logo, so 3+ concentric circles alternating red and white, in
    // the center of the screen.

    fill(255, 0, 0);
    ellipse(width / 2, height / 2, size, size);
    fill(255, 255, 255);
    ellipse(width / 2, height / 2, size - 50, size - 50);
    fill(255, 0, 0);
    ellipse(width / 2, height / 2, size - 100, size - 100);
    fill(255, 255, 255);
    ellipse(width / 2, height / 2, size - 150, size - 150);
    fill(255, 0, 0);
    ellipse(width / 2, height / 2, size - 200, size - 200);
  }

  public static void main(String[] args) {
    PApplet.main("variables.target.TargetLogoAnswer");
  }
}
