package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class GameInput {

    private Scanner sc;
    //= new Scanner(System.in);

    GameInput(){
        sc = new Scanner(System.in);
    }

    public int getNextInteger(){

        String terminalInput;

        while(true) {
            terminalInput = sc.next();

            int parsedInt = Integer.parseInt(terminalInput);
            return parsedInt;

        }
    }

    public void close(){
        sc.close();
    }

}