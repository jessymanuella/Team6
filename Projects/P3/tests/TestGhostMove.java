import java.io.*;
import junit.framework.*;
import java.util.ArrayList;
import java.awt.Color;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();

    Ghost ghost = frame.addGhost(new Location(9, 11), "testGhost", Color.red);
    ArrayList<Location> valid_moves = ghost.get_valid_moves();
    ghost.move();
    assertTrue(valid_moves.contains(ghost.myLoc));
  }
}
