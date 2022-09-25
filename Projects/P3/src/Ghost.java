import java.util.ArrayList;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
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
    return this.myMap.move(this.myName, this.myLoc, Map.Type.GHOST);
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return false;
  }
}
