import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
    ArrayList<Location> valid_moves = this.get_valid_moves();
    if (valid_moves.size() == 0) {
      return false;
    }
    int ran_index = (int)(Math.random() * valid_moves.size());
    this.myLoc = valid_moves.get(ran_index);
    return this.myMap.move(this.myName, this.myLoc, Map.Type.PACMAN);
  }

  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    return myMap.eatCookie("tok_x" + myLoc.x + "_y" + myLoc.y);
  }
}
