import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    Ghost ghost = frame.addGhost(new Location(1, 2), "Pinky", Color.PINK);
    Map myMap = frame.getMap();

    assertTrue(pacman.is_ghost_in_range() == true);
  }

  public void testGhostOutRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    Ghost ghost = frame.addGhost(new Location(4, 6), "Pinky", Color.PINK);
    Map myMap = frame.getMap();

    assertTrue(pacman.is_ghost_in_range() == false);
  }
}
