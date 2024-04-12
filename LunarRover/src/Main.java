//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LunarRoverController controller1 = new LunarRoverController();

        // Simulating button presses
        controller1.buttonPressed(LunarRoverController.Button.BUTTON_1, 5); // Interact with color camera
        controller1.buttonPressed(LunarRoverController.Button.BUTTON_1, 1); // Take picture with color camera
        controller1.buttonPressed(LunarRoverController.Button.BUTTON_2, 0); // Return to idle state
        LunarRoverController controller2 = new LunarRoverController();

        controller2.buttonPressed(LunarRoverController.Button.BUTTON_1, 5); // Interact with color camera
        controller2.buttonPressed(LunarRoverController.Button.BUTTON_1, 5); // moon selfie
        controller2.buttonPressed(LunarRoverController.Button.BUTTON_2, 0); // Return to idle state
        LunarRoverController controller3 = new LunarRoverController();

        controller3.buttonPressed(LunarRoverController.Button.BUTTON_1, 10); // Interact with 16-mm camera
        controller3.buttonPressed(LunarRoverController.Button.BUTTON_1, 1); // Take picture with 16-mm camera
        controller3.buttonPressed(LunarRoverController.Button.BUTTON_2, 0); // Return to idle state
        LunarRoverController controller4 = new LunarRoverController();

        controller4.buttonPressed(LunarRoverController.Button.BUTTON_1, 10); // Interact with 16-mm camera
        controller4.buttonPressed(LunarRoverController.Button.BUTTON_1, 5); // moon selfie with 16-mm camera
        controller4.buttonPressed(LunarRoverController.Button.BUTTON_2, 0); // Return to idle state
        LunarRoverController controller5 = new LunarRoverController();

        controller5.buttonPressed(LunarRoverController.Button.BUTTON_1, 2); // Interact with drill
        controller5.buttonPressed(LunarRoverController.Button.BUTTON_1, 2); // Interact with drill
        controller5.buttonPressed(LunarRoverController.Button.BUTTON_1, 2); // Toggle drill
        controller5.buttonPressed(LunarRoverController.Button.BUTTON_2, 0); // Return to idle state
    }
}