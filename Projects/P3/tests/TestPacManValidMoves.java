import java.io.*;
import junit.framework.*;

public class TestPacManValidMoves extends TestCase {

  // checks for correct size of array 
  public void testPacManValidMovesSize() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    assertTrue(pacman.get_valid_moves().size() == 2);
  }

  // tests if location is present in get_valid_moves()
  public void testPacManValidMovesLocation() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    boolean found = true;
    for(Location loc : pacman.get_valid_moves()) {
      if(!loc.equals(new Location(1, 2)) || !loc.equals(new Location(2, 1))) {
        found = false;
      }
    }
    assertTrue(found);
  }
}
