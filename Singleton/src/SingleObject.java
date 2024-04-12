/**
 * Description: This class represents a singleton object.
 * @author Yihan
 * @version 1.0
 */
public class SingleObject {
    /**
     * Method to get the instance of SingleObject.
     * @return The instance of SingleObject.
     */
    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();
    //make the constructor private so that this class cannot be//instantiated
    private SingleObject(){}
    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
