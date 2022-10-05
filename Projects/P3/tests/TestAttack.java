import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestAttack extends TestCase {

  public void testAttack() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1,1));
    Ghost g1 = frame.addGhost(new Location(1, 2), "test1", Color.RED);
    Ghost g2 = frame.addGhost(new Location(1, 3), "test2", Color.CYAN);
    assertTrue(g1.attack());
    assertFalse(g2.attack());
  }
}
