import java.io.*;
import junit.framework.*;
import java.util.ArrayList;
import java.awt.Color;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {

    // No valid move
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(7, 10));
    Ghost ghost1 = frame.addGhost(new Location(7, 9), "testGhost1", Color.red);
    Ghost ghost2 = frame.addGhost(new Location(7, 11), "testGhost1", Color.pink);
    assertFalse(pacman.move());

    // Valid moves
    NoFrame frame2 = new NoFrame();
    PacMan pacman2 = frame2.addPacMan(new Location(7, 10));
    ArrayList<Location> valid_moves = pacman2.get_valid_moves();
    pacman2.move();
    assertTrue(valid_moves.contains(pacman2.myLoc));
    
  }
}
