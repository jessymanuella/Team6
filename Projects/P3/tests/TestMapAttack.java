import java.awt.Color;
import java.security.GuardedObject;

import junit.framework.*;

public class TestMapAttack extends TestCase {

  public void testMapAttackInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    Ghost ghost = frame.addGhost(new Location(1, 2), "Pinky", Color.PINK);
    Map myMap = frame.getMap();

    assertTrue(myMap.attack("Pinky"), true);

  }

  public void testMapAttackOutRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    Ghost ghost = frame.addGhost(new Location(4, 6), "Pinky", Color.PINK);
    Map myMap = frame.getMap();

    assertTrue(myMap.attack("Pinky"), false);

  }
}
