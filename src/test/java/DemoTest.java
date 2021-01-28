import org.junit.Before;
import org.junit.Test;

public class DemoTest {
    private Demo demo = new Demo();

    @Before
    public void before() {
        if (demo != null) {
            return;
        }
        demo = new Demo();
    }

    @Test
    public void show() {
        demo.show();
    }
}
