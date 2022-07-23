import processing.core.PApplet;

/**
 * A solution to the problem in SmileChallenge.java
 * Students: make sure you've given the problem a solid try before looking here!
 * This code should NOT be copy-pasted - if anything, type out the code yourself side by side and make sure you
 * understand EACH line!
 *
 * Note: This is not a DEFINITIVE answer, just code that solves the challenge. If your code looks different and solves
 * the challenge, it is correct! Feel free to compare and contrast your code with mine.
 */
public class SmileChallengeAnswer extends PApplet {
    public void settings() {
        size(500, 500);
    }

    public void draw() {
        ellipse(250, 250, 500, 500);

        ellipse(150, 150, 50, 50);

        ellipse(350, 150, 50, 50);

        // PI is a reserved word in Processing - it is set for us to 3.1415927
        // Similar constants are HALF_PI (~PI / 2) and QUARTER_PI (~PI / 4)
        // Further challenge: experiment with the arc function and see if you can figure out
        // how to create different shapes of smiles!
        arc(250, 250, 400, 400, 0, PI);
    }

    public static void main(String[] args) {
        PApplet.main("SmileChallengeAnswer");
    }
}
