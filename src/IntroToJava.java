import processing.core.PApplet;

/**
 * Purpose: Introduce students to Processing and to Java, understand function calls and different basic functions in
 * Processing. Understand basic syntax (ie. function syntax, semicolons, code blocks) and how ordering code changes output.
 */
public class IntroToJava extends PApplet {
    // sets up our project
    public void settings() {
        // use the size() function to set the size of our canvas
        size(500, 500);
    }

    //
    public void draw() {
        // draw a rectangle at 100, 100 with width 40 and height 20
        rect(100, 100, 40, 20);

        // draw a line from 0, 0 to 500, 500
        line(0, 0, 500, 500);

        // draw a circle at 50, 50 with size 10
        // note that order matters! this ellipse is OVER the line, the rect is UNDER the line
        ellipse(50, 50, 50, 50);
    }

    public static void main(String[] args) {
        PApplet.main("IntroToJava");
    }
}
