import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManInRange extends TestCase {

  public void testPacManInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    Ghost ghost = frame.addGhost(new Location(1, 2), "Pinky", Color.PINK);
    Map myMap = frame.getMap();

    assertTrue(ghost.is_pacman_in_range() == true);
  }

  public void testPacManOutRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    Ghost ghost = frame.addGhost(new Location(4, 6), "Pinky", Color.PINK);
    Map myMap = frame.getMap();

    assertTrue(ghost.is_pacman_in_range() == false);
  }
}
