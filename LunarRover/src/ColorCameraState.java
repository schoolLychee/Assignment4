// Color camera state
class ColorCameraState implements RoverState {
    @Override
    public void button1Pressed(int durationInSeconds) {
        if (durationInSeconds == 1) {
            System.out.println("Picture taken.");
        } else if (durationInSeconds == 5) {
            System.out.println("moon selfie.");
        }
    }

    @Override
    public void button2Pressed() {
        System.out.println("Entered IDLE state.");
        // Transition to IDLE state
        LunarRoverController.currentState = LunarRoverController.idleState;
    }
}
