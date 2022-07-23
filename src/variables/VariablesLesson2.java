package variables;

import processing.core.PApplet;

/**
 * Introduces how to use math on variables
 */
public class VariablesLesson2 extends PApplet {
  // Declaring our size variable
  int size = 50;

  public void settings() {
    size(500, 500);
  }

  public void draw() {
    // Let's consider a similar but different problem - we want 3 circles that are different
    // sizes, but are always 10 apart. So for example, a circle of size n - 10, n, and n + 10
    // where n is an integer. We can use math combined with our size variable to observe this:

    ellipse(50, 50, size - 10, size - 10);
    ellipse(50, 150, size, size);
    ellipse(150, 125, size + 10, size + 10);

    // If you change size, you'll see all the ellipses grow, but remain the same amount apart.
    // This is because their sizes are dependent on the size variable but using math, we can make
    // them slightly different

    // The different mathematical operators in Java:
    // + addition
    // - subtraction
    // * multiplication
    // / division
    // % modulus (remainder after division)
  }

  // DO NOT REMOVE THIS CODE! THIS CODE MAKES YOUR PROJECT RUN PROPERLY!
  public static void main(String[] args) {
    // change "ProcessingStarter" to the name of your class (remember to keep the quotes!)
    PApplet.main("variables.VariablesLesson2");
  }
}
