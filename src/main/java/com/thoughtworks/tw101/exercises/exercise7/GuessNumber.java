package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

public class GuessNumber {

    private int randNum;

    GuessNumber(){
        randNum = getRandomNumber();
    }

    private int getRandomNumber() {

        Random r = new Random();
        return (r.nextInt(100) + 1);
    }




    public boolean makeGuess(int guess){

        if(guess == randNum){
            System.out.println("Correct!");
            return true;
        }
        else if(guess > randNum){
            System.out.println("Too high! Try again!");
        }
        else {
            System.out.println("Too low! Try again!");
        }
        return false;


    }
}

// Citations:
// https://www.mkyong.com/java/java-generate-random-integers-in-a-range/