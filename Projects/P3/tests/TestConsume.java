import java.io.*;
import junit.framework.*;

public class TestConsume extends TestCase {

  public void testConsume() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1,1));
    int num_cookies = frame.getMap().getCookies;
    JComponent cookie = pacman.consume();
    assertTrue(cookie != null);
    assertTrue(frame.getMap().getCookies == num_cookies + 1);
    cookie = pacman.consume();
    assertTrue(cookie == null);
    assertTrue(frame.getMap().getCookies == num_cookies + 1);
  }
}
