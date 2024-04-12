// LunarRoverController class
public class LunarRoverController {
    // States
    static RoverState idleState = new IdleState();
    static RoverState colorCameraState = new ColorCameraState();
    static RoverState camera16MMState = new Camera16MMState();
    static RoverState drillState = new DrillState();
    static RoverState currentState = idleState;

    static int button1PressCount = 0;

    // Method to handle button press
    public void buttonPressed(LunarRoverController.Button button, int durationInSeconds) {
        switch (button) {
            case BUTTON_1:
                if (durationInSeconds == 5) {
                    currentState.button1Pressed(durationInSeconds);
                } else if (durationInSeconds == 10) {
                    currentState.button1Pressed(durationInSeconds);
                } else if (button1PressCount == 0 && durationInSeconds == 2) {
                    button1PressCount++;
                } else {
                    // Check if this is the second consecutive press of button 1
                    currentState.button1Pressed(durationInSeconds);
                }
                break;
            case BUTTON_2:
                currentState.button2Pressed();
                break;
        }
    }

    // Button enumeration
    enum Button {
        BUTTON_1, BUTTON_2
    }
}