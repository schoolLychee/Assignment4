/**
 * The Circle class represents a circular shape that implements the Shape interface.
 *
 * @author Yihan *
 * @version 1.1.1
 */
public class Circle implements Shape {
    /**
     * Draws the circle on the screen or any other output medium.
     * This method overrides the draw method defined in the Shape interface.
     */
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
