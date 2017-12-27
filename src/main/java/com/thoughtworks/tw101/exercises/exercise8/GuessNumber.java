package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Random;

public class GuessNumber {

    private int randNum;
    private ArrayList al;

    GuessNumber(){
        randNum = getRandomNumber();
        al = new ArrayList();
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
        al.add(guess);
        System.out.println("Guesses so far: " + al);
        return false;


    }
}