# Flappy Bird Game - Java Implementation
This is a simple Flappy Bird clone built using Java and the Swing framework. The game involves controlling a bird through a series of pipes, aiming to navigate through gaps in the pipes without colliding. The bird is controlled by pressing the Spacebar to make it fly upwards, while gravity pulls it downwards.

## Features
Bird Control: The bird is controlled using the Spacebar. Pressing it will make the bird move upward, and it will fall due to gravity when not pressing.
Pipes: The pipes are dynamically generated and move towards the bird from the right side of the screen. The player must navigate through the gaps in the pipes.
Scoring: The player earns a point for each set of pipes successfully passed (i.e., when the bird moves past both the top and bottom pipes).
Game Over: The game ends if the bird collides with any pipe or goes out of bounds at the bottom of the screen.
Restarting: After the game ends, pressing Spacebar will reset the game and start a new session with a fresh score.

## How to Play
Press the Spacebar to make the bird fly upwards.
Avoid colliding with the pipes and navigate through the gaps.
Each successful pass through a set of pipes increases your score by 1.
The game ends if the bird collides with a pipe or falls to the bottom.
Press Spacebar again to restart the game once it’s over.

### Game Controls
Spacebar: Makes the bird fly upwards.
### Technologies Used
* Java
* Swing for GUI and game rendering
* AWT for event handling and image loading
