/**
 * Description: This class provides a simplified interface for interacting with different shapes.
 * @author Yihan *
 * @version 1.1.1 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    /**
     * Constructor for ShapeMaker class.
     * Initializes the shapes required for drawing.
     */
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    /**
     * Draws a circle shape.
     */
    public void drawCircle() {
        circle.draw();
    }
    /**
     * Draws a rectangle shape.
     */
    public void drawRectangle() {
        rectangle.draw();
    }
    /**
     * Draws a square shape.
     */
    public void drawSquare() {
        square.draw();
    }
}
