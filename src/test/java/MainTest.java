import org.junit.Test;
import portfolio.Main;
public class MainTest {

    @Test
    public void testMain() {
        Main.main(new String[]{});
    }


        @Test
        public void testRunTests () {
            Main main = new Main();
            main.runTests();
        }
    }