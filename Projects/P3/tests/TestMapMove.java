import java.io.*;
import junit.framework.*;

public class TestMapMove extends TestCase {

  public void testPacManInvalidMove1() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    frame.initPlayers();
    Map myMap = frame.getMap();
    // try to move pacman to wall
    assertFalse(myMap.move("pacman", new Location(0, 0), Map.Type.PACMAN));
  }

  public void testPacManValidMove1() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    frame.initPlayers();
    Map myMap = frame.getMap();
    // try to move pacman to empty space
    assertTrue(myMap.move("pacman", new Location(5, 5), Map.Type.PACMAN));
  }
}
