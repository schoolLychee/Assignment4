/** The Square class represents a square shape that implements the Shape interface.
 * @author Yihan *
 * @version 1.1.1 */
public class Square implements Shape{
    /**
     * Draws the square on the screen or any other output medium.
     * This method overrides the draw method defined in the Shape interface.
     */
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
