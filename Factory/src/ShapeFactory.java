/**
 * Description: This class represents a factory for creating different shapes.
 * @author  Yihan
 * @version 1.0
 */
public class ShapeFactory {
    //use getShape method to get object of type shape
    /**
     * Returns an object of the specified shape type.
     *
     * @param shapeType The type of shape to create. Supported values: "CIRCLE", "RECTANGLE", "SQUARE".
     * @return An instance of the specified shape type, or null if the shape type is invalid.
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}