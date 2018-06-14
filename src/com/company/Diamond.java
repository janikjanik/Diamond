package com.company;

import java.io.IOException;

public class Diamond {
    private char letterFromInput;
    private int firstSpace;
    private char currentLetter = 'A';
    private int secondSpace = 1;

    public Diamond(char letterFromInput) {
        this.letterFromInput = letterFromInput;
        this.firstSpace = letterFromInput - currentLetter;
    }

    public static void main(String[] args) throws IOException {
         char inputLetter = (char) System.in.read();
         inputLetter = Character.toUpperCase(inputLetter);
         if(!(inputLetter >= 65 && inputLetter <= 90)){
             throw new IllegalArgumentException();
         }
         Diamond diamond = new Diamond(inputLetter);
         diamond.makeDiamond();
    }

    public void makeDiamond(){
        if(letterFromInput == 'A') {
            System.out.println("A");
        }
        else {
            printSingleLetter(firstSpace, currentLetter);
            firstSpace -= 1;
            System.out.println();
            printFirstHalfOfDiamond();
            firstSpace += 2;
            secondSpace -= 4;
            printSecondHalfOfDiamond();
            printSingleLetter(firstSpace, 'A');
        }
    }

    public void printFirstHalfOfDiamond(){
        while (currentLetter != letterFromInput) {
            currentLetter += 1;
            printSingleLetter(firstSpace, currentLetter);
            printSingleLetter(secondSpace, currentLetter);
            System.out.println();
            secondSpace += 2;
            firstSpace -= 1;
        }
    }

    public void printSecondHalfOfDiamond(){
        while (currentLetter != 'B') {
            currentLetter -= 1;
            printSingleLetter(firstSpace, currentLetter);
            printSingleLetter(secondSpace, currentLetter);
            System.out.println();
            secondSpace -= 2;
            firstSpace += 1;
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
