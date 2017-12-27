package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

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
