import java.io.*;
import junit.framework.*;

public class TestMapEatCookie extends TestCase {
  
  public void testMapEatCookie() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    int num_cookies = frame.getMap().getCookies;
    String cookie = "tok_x" + 1 + "_y" + 1;
    JComponent eaten = frame.getMap().eatCookie(cookie);
    assertTrue(frame.getMap().getCookies == num_cookies - 1);
    assertTrue(eaten != null);
    eaten = frame.getMap().eatCookie(cookie);
    assertTrue(eaten == null);
    assertTrue(frame.getMap().getCookies == num_cookies - 1);
  }
}
