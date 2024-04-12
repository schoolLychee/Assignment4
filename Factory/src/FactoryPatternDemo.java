/**
 * Description: This class demonstrates the usage of the Factory Pattern by creating objects of different shapes
 * without exposing the creation logic to the client.
 * @author Yihan
 * @version 1.0
 */
public class FactoryPatternDemo {
    /**
     * Main method to demonstrate the Factory Pattern.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
//get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
//call draw method of Circle
        shape1.draw();
//get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
//call draw method of Rectangle
        shape2.draw();
//get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");
//call draw method of circle
        shape3.draw();
    }
}
