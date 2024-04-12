/** The Rectangle class represents a rectangular shape that implements the Shape interface.
 * @author Yihan *
 * @version 1.1.1 */
public class Rectangle implements Shape{
    /**
     * Draws the rectangle on the screen or any other output medium.
     * This method overrides the draw method defined in the Shape interface.
     */
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
