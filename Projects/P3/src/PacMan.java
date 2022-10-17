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
    ArrayList<Location> moves = new ArrayList<Location>();
    // NORTH
    if(!(myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.GHOST) || myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.WALL))) {
      moves.add(myLoc.shift(0, 1));
    }
    // EAST
    if(!(myMap.getLoc(myLoc.shift(1, 0)).contains(Map.Type.GHOST) || myMap.getLoc(myLoc.shift(1, 0)).contains(Map.Type.WALL))) {
      moves.add(myLoc.shift(1, 0));
    }
    // WEST
    if(!(myMap.getLoc(myLoc.shift(-1, 0)).contains(Map.Type.GHOST) || myMap.getLoc(myLoc.shift(-1, 0)).contains(Map.Type.WALL))) {
      moves.add(myLoc.shift(-1, 0));
    }
    // SOUTH
    if(!(myMap.getLoc(myLoc.shift(0, -1)).contains(Map.Type.GHOST) || myMap.getLoc(myLoc.shift(0, -1)).contains(Map.Type.WALL))) {
      moves.add(myLoc.shift(0, -1));
    }
    ArrayList<Location> fake_list = new ArrayList<Location>();
    return fake_list;
  }

  public boolean move() {
    ArrayList<Location> valid_moves = this.get_valid_moves();

    int ran_index = (int)(Math.random() * valid_moves.size());
    this.myLoc = valid_moves.get(ran_index);
    return this.myMap.move(this.myName, this.myLoc, Map.Type.PACMAN);
  }

  public boolean is_ghost_in_range() {

    return (myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.GHOST)
        || myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.GHOST)
        || myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.GHOST)
        || myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.GHOST)) ? false : true;

  }

  public JComponent consume() {
    return myMap.eatCookie("tok_x" + myLoc.y + "_y" + myLoc.x);
  }
}
