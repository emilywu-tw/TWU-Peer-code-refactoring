package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                System.out.print("-");
            }
            for(int k = 0; k < (2*i+1); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) { // CODE SMELL: bloater (long method)
        //generate top half // CODE SMELL: bloater (duplicate code)
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < (2*i+1); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //generate bottom half
        int m = 2*n-3;
        for(int i = 0; i < n-1; i++, m -= 2){

            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < m; k++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        //generate top half
        for(int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < (2*i+1); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //print name // CODE SMELL: dispensable (comment)
        System.out.println("anita");

        //generate bottom half
        int m = 2*n-3;
        for(int i = 0; i < n-1; i++, m -= 2){

            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < m; k++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
