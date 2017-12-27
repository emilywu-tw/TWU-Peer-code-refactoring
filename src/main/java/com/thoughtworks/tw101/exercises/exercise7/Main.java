package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

public class Main {

    private GameInput gi;
    private GuessNumber gn;

    Main(){
        gi = new GameInput();
        gn = new GuessNumber();
    }

    public void startGame(){

        boolean retVal = false;

        System.out.println("Take a guess! Enter a number between 1 and 100!");

        while(retVal == false){
            retVal = gn.makeGuess(gi.getNextInteger());
        }
        gi.close();
    }

    public static void main(String[] args) {

        Main game = new Main();

        game.startGame();
    }
}
