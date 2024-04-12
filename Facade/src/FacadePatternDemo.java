/**
 ** Description: This class demonstrates the usage of the Facade Pattern by providing a simplified interface for
 * interacting with complex subsystems.
 * @author Yihan *
 * @version 1.1.1
 */
public class FacadePatternDemo {
    /**
     * Main method to demonstrate the Facade Pattern.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}