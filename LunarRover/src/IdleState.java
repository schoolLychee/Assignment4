// Idle state
class IdleState implements RoverState {
    @Override
    public void button1Pressed(int durationInSeconds) {
        if (durationInSeconds == 5) {
            System.out.println("Entered COLOR_CAMERA state.");
            // Transition to COLOR_CAMERA state
            LunarRoverController.currentState = LunarRoverController.colorCameraState;
        } else if (durationInSeconds == 10) {
            System.out.println("Entered CAMERA_16MM state.");
            // Transition to CAMERA_16MM state
            LunarRoverController.currentState = LunarRoverController.camera16MMState;
        } else if (LunarRoverController.button1PressCount == 1) {
            System.out.println("Entered DRILL state.");
            // Transition to DRILL state
            LunarRoverController.currentState = LunarRoverController.drillState;
        }
    }

    @Override
    public void button2Pressed() {
        System.out.println("Entered IDLE state.");
        // Transition to IDLE state
        LunarRoverController.currentState = LunarRoverController.idleState;
    }
}