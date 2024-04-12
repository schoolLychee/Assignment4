/**
 * Description: This class demonstrates the usage of the Singleton Pattern by ensuring that only one instance
 * of a class is created and providing a global point of access to that instance.
 * @author Yihan
 * @version 1.0
 */
public class SingletonPatternDemo {
    /**
     * Main method to demonstrate the Singleton Pattern.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
//illegal construct
//Compile Time Error: The constructor Single0bject() is not visible//SingleObject object = new SingleObject();
//Get the only object available
        SingleObject object = SingleObject.getInstance();
//show the message
        object.showMessage();
    }
}