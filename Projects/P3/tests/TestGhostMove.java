import java.io.*;
import junit.framework.*;
import java.util.ArrayList;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    Mainframe frame = new MainFrame();

    Ghost ghost = frame.addGhost(new Location(9, 11), "testGhost", Color.red);
    ArrayList<Location> valid_moves = ghost.get_valid_moves();
    if (valid_moves.size() == 0) {
      assertFalse(ghost.move());
    } else {
      ghost.move();
      assertTrue(valid_moves.contains(ghost.myLoc));
    }
  }
}
