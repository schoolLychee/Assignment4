import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SingleObjectTest {

    @Test
    public void testGetInstance() {
        SingleObject object1 = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();

        // 断言获取的两个对象是同一个实例
        assertSame(object1, object2);
    }

    @Test
    public void testShowMessage() {
        // 创建 SingleObject 实例
        SingleObject object = SingleObject.getInstance();

        // 捕获 System.out.println 输出
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // 调用 showMessage 方法
        object.showMessage();

        // 检查输出是否为预期值
        assertEquals("Hello World!", outContent.toString().trim());
    }
}
