# Project 3: PacMan by Team6
By Vivian Chen, Luke Muratore, Annemarie Peek, Lauren Wei

## Image of Code Playing PacMan
![Pacman start menu](Projects/P3/src/assets/Screen%20Shot%202022-10-05%20at%208.04.55%20PM.png) ![Pacman game running](Projects/P3/src/assets/Screen%20Shot%202022-10-05%20at%206.58.11%20PM.png)

## Running from Command Line
  ```bash
  cd Projects/P3 # make sure you're in the p3 directory
  javac -cp "src/" src/*.java
  java -cp "src/" StartMenu
  ```
## Functions

## PacMan Class

### get_valid_moves

To check Pacman's valid moves, I first made the rule that PacMan can only move 1 block horizontally or vertically, as opposed to including diagonally. Thus, my code simply checks if PacMan can move 1 block up, down, left, or right from its original position by checking to see if the cell in that direction is empty or has a cookie, and adding that position to the return list if so.

To test, I first added a test that assessed whether a valid position would be returned in a position where PacMan could move there. I then added a test that ensured an invalid move would not be in the return list.

### move

### is_ghost_in_range

To check if a ghost is one move away, the method checks the location of Pacman and and checks if a ghost type is in one of the 4 moves (left, right, up, down). The method returns true when a ghost is in range and false if no ghost is in range.

To test, I added a test that tests for when a ghost is in Pacmans range, asserting the method result in true. Then I added another test where a ghost is out of Pacmans range, resulting in false. 

### consume

This method depends on the eatCookie method of the Map class by passing to that method the name of a cookie that would be in Pacman's current location. It returns the return value of eatCookie.

For the test, I set up a NoFrame object (which initializes all the cookies). I place Pacman at a known location with a cookie and have Pacman consume it. I'm checking the return value is valid and that we recorded the eaten cookie in our map. Then I have pacman consume a cookie in the same location and test to make sure that the cookie was actually consumed. 

## Ghost Class

### get_valid_moves

To check the Ghost's valid moves, I used the same rule for PacMan in that a Ghost can only move 1 block horizontally or vertically. Thus, my code simply checks if Ghost can move 1 block up, down, left, or right from its original position by checking to see if the cell in that direction has a Wall, and adding that position to the return list if not.

To test, I first added a test that assessed whether a valid position would be returned in a position where Ghost could move there. I then added a test that ensured an invalid move would not be in the return list.

### move

### is_pacman_in_range

To check if a Pacman is one move away, the method checks the location of the ghost and and checks if Pacman is in one of the 4 moves (left, right, up, down). The method returns true when Pacman is out of a ghosts range.

To test, I added a test that tests for when Pacman is in a ghosts range, asserting the method result in true. Then I added another test where Pacman is out of ghosts range, resulting in false.

### attack

This method first calls is_pacman_in_range(), and if it's true, then it returns the return value of the attack method in the Map class passing in the name of the ghost doing the attacking. Else, it returns false. 

To test this I set up a NoFrame object. I add pacman to a location and then I add two ghosts, one within attacking range and another outside of attacking range. Then I check to make sure that the first ghost can successfully attack and that the second ghost cannot make an attack. 

## Map Class

### move

To move a given PacMan or Ghost in the map class, I ensure that a wall is not in the new location, and if not, I modify the fields in the map class related to the location of objects to represent the addition of the object into the new spot and the removal from the old one. I then return if the operation was successful, ie if there was not a wall in the new location.

To test move, I first tested an invalid move to ensure that pacman could not be moved to a place on the map with a wall, and then tested a valid move by attempting to move pacman to an empty space. 

### getLoc

### attack

The attack method will check if the name parameter is valid and exist in the game and checks if the game over boolean value is false. The method will get the ghosts location associated with the parameter name and check if Pacman is one move away. If this is true, the game will move the ghost to Pacmans spot, "consuming" Pacman and the game is over, returning true. Else the method returns false and the game continues. 

To test attack, I added a test that tests for when Pacman is in a ghosts range and the ghost can attack Pacman, asserting the method result in true. Then I added another test where Pacman is out of ghosts range for an attack, resulting in false.

### eatCookie

This method takes in a string that's the name of a cookie that might be in the map. We try to remove it from the components hashmap. If the mapping exists, we remove the cookie from the locations hashmap as well as the Type COOKIE from the hashset mapped to that location on the field. Then lastly we increment the cookie count. If the mappy doesn't exist, we return null.

To test this, I create a NoFrame object which has a cookie in the location (1, 1). I then call eatCookie to eat that cookie, and check to make sure the cookie is eaten and cookie count has been incremented. Then we try to eatCookie that same cookie, which shouldn't exist now, and check to make sure it was eaten and the cookie count doesn't increase again. 