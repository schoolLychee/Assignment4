import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class LunarRoverControllerTest {
    private LunarRoverController roverController;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    // 在测试开始前设置 System.out
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    // 在测试结束后恢复 System.out
    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }
    @Before
    public void setUp() {
        roverController = new LunarRoverController();
    }

    @Test
    public void testButton1Pressed_TakePicture_ColorCamera() {
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_1, 5);
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_1, 1);
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_2, 0);

        assertEquals("Entered COLOR_CAMERA state.\nPicture taken.\nEntered IDLE state.", getSysOut());
    }

    @Test
    public void testButton1Pressed_TakeSelfie_ColorCamera() {
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_1, 5);
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_1, 5);
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_2, 0);

        assertEquals("Entered COLOR_CAMERA state.\nmoon selfie.\nEntered IDLE state.", getSysOut());
    }

    @Test
    public void testButton1Pressed_TakePic_16MMCamera() {
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_1, 10);
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_1, 1);
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_2, 0);

        assertEquals("Entered CAMERA_16MM state.\n" +
                "Picture taken.\nEntered IDLE state.", getSysOut());
    }

    @Test
    public void testButton1Pressed_TakeSelfie_16MMCamera() {
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_1, 10);
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_1, 5);
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_2, 0);

        assertEquals("Entered CAMERA_16MM state.\n" +
                "moon selfie with 16-mm camera.\nEntered IDLE state.", getSysOut());
    }

    @Test
    public void testButton1Pressed_Drill() {
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_1, 2);
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_1, 2);
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_1, 2);
        roverController.buttonPressed(LunarRoverController.Button.BUTTON_2, 0);
        assertEquals("Entered DRILL state.\n" +
                "Drill toggled off.\n" +
                "Entered IDLE state.", getSysOut());
    }

    // 辅助方法，用于捕获 System.out.println 的输出
    private String getSysOut() {
        return outContent.toString().trim();
    }
}
