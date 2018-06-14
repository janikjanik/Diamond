package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        char letterFromInput = (char) System.in.read();
        if(letterFromInput == 'A') {
            System.out.println("A");
        }
        else {
            letterFromInput = Character.toUpperCase(letterFromInput);
            Character currentLetter = 'A';
            int firstSpace = (int) letterFromInput - (int) currentLetter;
            int secondSpace = 1;
            printSingleLetter(firstSpace--, currentLetter);
            System.out.println();
            while ((int) currentLetter != (int) letterFromInput) {
                currentLetter = (char) ((int) currentLetter + 1);
                printSingleLetter(firstSpace, currentLetter);
                printSingleLetter(secondSpace, currentLetter);
                System.out.println();
                secondSpace += 2;
                firstSpace -= 1;
            }

            firstSpace += 2;
            secondSpace -= 4;
            while ((int) currentLetter != 66) {
                currentLetter = (char) ((int) currentLetter - 1);
                printSingleLetter(firstSpace, currentLetter);
                printSingleLetter(secondSpace, currentLetter);
                System.out.println();
                secondSpace -= 2;
                firstSpace += 1;
            }
            printSingleLetter(firstSpace, 'A');
        }
    }


    public static void printSingleLetter(int spaces, char letter){
        int i = 0;
        while (i++ < spaces){
            System.out.print(" ");
        }
        System.out.print(letter);
    }

}
