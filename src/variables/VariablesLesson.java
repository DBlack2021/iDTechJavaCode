package variables;

import processing.core.PApplet;

/**
 * Purpose: To introduce students to variables and data types in Java
 * Introduces variables, data types, variable declaration, and variable uses
 */
public class VariablesLesson extends PApplet {
  // Variables are ways to store data in a program

  // Defining a variable
  // In Java, variables are defined as: type name = value; (remember the semicolon!)

  // A type is a category of data. These include:
  // int - an integer (negative, positive, or zero) (ex. 3, -4, 109, 33)
  // float - a decimal number (including .0, so 3.0 is a float, not an int) (ex. 3.1415, 22.3, -0.9)
  // String - text data (ex. "Hello World!", "This is a String")
  // boolean - a true or false value

  // EXAMPLE: Let's suppose we are writing a program where we want to draw three circles of the
  // same size in 3 different positions (ANY size). We could "hard-code" these numbers, but that
  // means changing the size requires changing code in 3 positions. Imagine if we had 1000 circles!

  // We can define a variable "size" of type int to store the size:
  int size = 50; // Read as: the integer size gets the value 50

  public void settings() {
    size(500, 500);
  }

  public void draw() {
    // We can use our variable in the draw method:

    // Circle 1:
    ellipse(50, 50, size, size);
    // note how we use the size variable as a parameter, not a number itself

    // Circle 2:
    ellipse(50, 150, size, size);

    // Circle 3:
    ellipse(150, 125, size, size);

    // Do now! Change the value of size above and see how ALL three circles change size - this is
    // because we used our variable, so we only have to change the size in one spot
  }

  // DO NOT REMOVE THIS CODE! THIS CODE MAKES YOUR PROJECT RUN PROPERLY!
  public static void main(String[] args) {
    // change "ProcessingStarter" to the name of your class (remember to keep the quotes!)
    PApplet.main("variables.VariablesLesson");
  }
}
