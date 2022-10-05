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

### getLoc

### attack

### eatCookie

