import java.awt.Color;
import java.io.*;
import junit.framework.*;

public class TestGhostValidMoves extends TestCase {

  // checks for correct size of array 
  public void testGhostValidMovesSize() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(1, 1), "Inky", Color.BLUE);
    assertTrue(ghost.get_valid_moves().size() == 2);
  }

  // tests if location is present in get_valid_moves()
  public void testGhostValidMovesLocation() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(1, 1), "Inky", Color.BLUE);
    boolean found = true;
    for(Location loc : ghost.get_valid_moves()) {
      if(!(loc.equals(new Location(1, 2)) || loc.equals(new Location(2, 1)))) {
        found = false;
      }
    }
    assertTrue(found);
  }
}
