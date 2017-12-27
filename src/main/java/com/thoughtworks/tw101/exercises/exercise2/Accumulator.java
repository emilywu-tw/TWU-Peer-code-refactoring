package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private static int count;

    //ExerciseTwo() {
    //    count = 0;
    //}

    int increment() {
        count++;
        return count;
    }

    void total() {
        System.out.println("total = " + count);
    }

}
