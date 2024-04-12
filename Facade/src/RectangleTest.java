import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RectangleTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testDraw() {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        // 检查 draw 方法是否输出了正确的信息
        assertEquals("Rectangle::draw()", getSysOut());
    }

    // 辅助方法，用于捕获 System.out.println 的输出
    private String getSysOut() {
        return outContent.toString().trim();
    }
}
