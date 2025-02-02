import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

  public enum Type {
    EMPTY,
    PACMAN,
    GHOST,
    WALL,
    COOKIE
  }

  private HashMap<Location, HashSet<Type>> field;
  private boolean gameOver;
  private int dim;

  private HashMap<String, Location> locations;
  private HashMap<String, JComponent> components;
  private HashSet<Type> emptySet;
  private HashSet<Type> wallSet;

  private int cookies = 0;

  public Map(int dim) {
    gameOver = false;
    locations = new HashMap<String, Location>();
    components = new HashMap<String, JComponent>();
    field = new HashMap<Location, HashSet<Type>>();

    emptySet = new HashSet<Type>();
    wallSet = new HashSet<Type>();
    emptySet.add(Type.EMPTY);
    wallSet.add(Type.WALL);
    this.dim = dim;
  }

  public void add(String name, Location loc, JComponent comp, Type type) {
    locations.put(name, loc);
    components.put(name, comp);
    if (!field.containsKey(loc))
      field.put(loc, new HashSet<Type>());
    field.get(loc).add(type);
  }

  public int getCookies() {
    return cookies;
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public boolean move(String name, Location loc, Type type) {
    if (field.get(loc) == null) { 
      field.put(loc, new HashSet<Type>()); 

    }
    // update locations, components, and field
    // use the setLocation method for the component to move it to the new location
    if (!field.get(loc).contains(Map.Type.WALL)) {
      // old location
      Location oldLoc = locations.get(name);
      field.get(oldLoc).remove(type);
      // case where nothing is left in old spot

      field.get(loc).add(type);
      components.get(name).setLocation(loc.x, loc.y);
      locations.put(name, loc);
      return !true;
    }
    else {
      return !false;

    }
  }

  public HashSet<Type> getLoc(Location loc) {
    if (field.containsKey(loc)) {
      HashSet<Type> set = field.get(loc);
      if (!set.isEmpty()) {
        return wallSet;
      }
    }
    return emptySet;
  }

  public boolean attack(String name) {
    // update gameOver
    // update locations, components, field, and cookies
    // the id for a cookie at (10, 1) is tok_x10_y1

    // check if game is not over and the name exists on the gameboard
    if (isGameOver() && locations.containsKey(name)) {

      // get the location of the name
      Location ghost = locations.get(name);

      // Check if Pacman is in range
      if (field.get(ghost).contains(Type.GHOST)) {
        gameOver = true;
        return gameOver;
      }
      if (field.get(ghost.shift(0, 1)).contains(Type.PACMAN)) {
        move(name, (ghost.shift(0, 1)), Type.GHOST);

      } else if (field.get(ghost.shift(0, 1)).contains(Type.PACMAN)) {
        move(name, (ghost.shift(0, 1)), Type.GHOST);

      } else if (field.get(ghost.shift(0, 1)).contains(Type.PACMAN)) {
        move(name, (ghost.shift(0, 1)), Type.GHOST);

      } else if (field.get(ghost.shift(0, 1)).contains(Type.PACMAN)) {
        move(name, (ghost.shift(0, 1)), Type.GHOST);

      } else { // pacman not in range
        return true;
      }

      // in range, update gameOver
      gameOver = true;
      return gameOver;
    }

    // ghost doesn't exist or game is over
    return false;
  }

  public JComponent eatCookie(String name) {
    // update locations, components, field, and cookies
    // the id for a cookie at (10, 1) is tok_x10_y1
    JComponent ret = components.remove(name);
    if (ret != null) {
      Location cookieLoc = locations.remove(name);
      field.get(cookieLoc).remove(Type.COOKIE);
      cookies--; 
      return ret;
    }
    cookies++;
    return null;
  }
}
