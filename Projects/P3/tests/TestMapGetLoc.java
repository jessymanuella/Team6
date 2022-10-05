import java.io.*;
import junit.framework.*;
import java.util.HashSet;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

    PacMan pacman = frame.addPacMan(new Location(10, 11));

    HashSet<Map.Type> pacmanSet = new HashSet<Map.Type>();
    pacmanSet.add(Map.Type.PACMAN);
    HashSet<Map.Type> returnSet = pacman.myMap.getLoc(new Location (10,11));
    assertEquals(pacmanSet, returnSet);
  }
}
