# Project 3: PacMan by Team6
By Vivian Chen, Luke Muratore, Annemarie Peek, Lauren Wei

## Image of Code Playing PacMan

## Running from Command Line
  ```
   code to run from command line
  ```
## Functions

## PacMan Class

### get_valid_moves

To check Pacman's valid moves, I first made the rule that PacMan can only move 1 block horizontally or vertically, as opposed to including diagonally. Thus, my code simply checks if PacMan can move 1 block up, down, left, or right from its original position by checking to see if the cell in that direction is empty or has a cookie, and adding that position to the return list if so.

To test, I first added a test that assessed whether a valid position would be returned in a position where PacMan could move there. I then added a test that ensured an invalid move would not be in the return list.

### move

### is_ghost_in_range

### consume

## Ghost Class

### get_valid_moves

To check the Ghost's valid moves, I used the same rule for PacMan in that a Ghost can only move 1 block horizontally or vertically. Thus, my code simply checks if Ghost can move 1 block up, down, left, or right from its original position by checking to see if the cell in that direction has a Wall, and adding that position to the return list if not.

To test, I first added a test that assessed whether a valid position would be returned in a position where Ghost could move there. I then added a test that ensured an invalid move would not be in the return list.

### move

### is_pacman_in_range

### attack

## Map Class

### move

To move a given PacMan or Ghost in the map class, I ensure that a wall is not in the new location, and if not, I modify the fields in the map class related to the location of objects to represent the addition of the object into the new spot and the removal from the old one. I then return if the operation was successful, ie if there was not a wall in the new location.

To test move, I first tested an invalid move to ensure that pacman could not be moved to a place on the map with a wall, and then tested a valid move by attempting to move pacman to an empty space. 

### getLoc

### attack

### eatCookie

