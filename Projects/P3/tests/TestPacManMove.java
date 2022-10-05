import java.io.*;
import junit.framework.*;
import java.util.ArrayList;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
    MainFrame frame = new MainFrame();

    PacMan pacman = frame.addPacMan(new Location(9, 11)); //Creates PacMan at location x, y
    ArrayList<Location> valid_moves = pacman.get_valid_moves();
    if (valid_moves.size() == 0) {
      assertFalse(pacman.move());
    } else {
      pacman.move();
      assertTrue(valid_moves.contains(pacman.myLoc));
    }
  }
}
