// Drill state
class DrillState implements RoverState {
    @Override
    public void button1Pressed(int durationInSeconds) {
        System.out.println("Drill toggled off.");
    }

    @Override
    public void button2Pressed() {
        System.out.println("Entered IDLE state.");
        // Transition to IDLE state
        LunarRoverController.currentState = LunarRoverController.idleState;
    }
}