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
        drawTopHalfOfDiamond(n, false);
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawTopHalfOfDiamond(n, false);
        drawBottomHalfOfDiamond(n);
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
        drawTopHalfOfDiamond(n, true);
        System.out.println("anita");
        drawBottomHalfOfDiamond(n);
    }

    private static void drawTopHalfOfDiamond(int n, boolean omitBase) {
        int goUntilHere;

        if (omitBase) { goUntilHere = n-1; }
        else { goUntilHere = n; }
        for(int i = 0; i < goUntilHere; i++){
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (2*i+1); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private static void drawBottomHalfOfDiamond(int n) {
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
