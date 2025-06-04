# Number Guessing Game 🔢🎮

A fun Java-based CLI game where players guess a random number within limited attempts. Perfect for beginners learning Java fundamentals!

## Features ✨
-  Random number generation (1-100)
-  Limited attempts (default: 5 tries)
-  Hints (higher/lower feedback)
-  Play again without restarting
-  Tracks guesses and remaining attempts
-  Handles singular/plural grammar ("1 guess" vs "2 guesses")

## How to Run ▶️
1. **Requirements**: Java JDK 11+
2. **Compile & Execute**:
   ```bash
   javac io/github/renwalker/App.java
   java io.github.renwalker.App

## Gameplay Example
Welcome to the Number Guessing Game!
Please enter a number between 1 and 100: 50
Incorrect! The number is higher.
Tries left: 4

Please enter a number between 1 and 100: 75
Incorrect! The number is lower.
Tries left: 3

Please enter a number between 1 and 100: 63
Congratulations! You guessed it in 3 guesses!

Would you like to play again? (Yes/No): no
Thank you for playing!