package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        char c = (char) System.in.read();
//        c = Character.toUpperCase(c);
//        Character a = 'A';
//        while((int)a != (int)c + 1){
//            while()
//            a = (char) ((int)a + 1);
//        }
    }

    public void printSingleLetter(int spaces, char letter){
        int i = 0;
        while (i < spaces){
            System.out.println(" ");
        }
        System.out.println(letter);
    }

    public void printTwoLetters(int spacesBeforeLetter, int spacesAfterLetter, char letter){
        printSingleLetter(spacesBeforeLetter, letter);
        printSingleLetter(spacesAfterLetter, letter);
    }
}
