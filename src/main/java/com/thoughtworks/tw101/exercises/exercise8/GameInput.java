package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

public class GameInput {

    private Scanner sc;

    GameInput(){
        sc = new Scanner(System.in);
    }

    public int getNextInteger(){

        String terminalInput;

        while(true) {
            terminalInput = sc.next();

            try {
                int parsedInt = Integer.parseInt(terminalInput);
                return parsedInt;
            } catch (NumberFormatException e) {
                System.out.println("Sorry! Please only enter integers!");
            }
        }
    }

    public void close(){
        sc.close();
    }

}