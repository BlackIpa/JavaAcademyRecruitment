package com.piotr;

public class App {

    public static void main( String[] args ) {
        CharacterCounter characterCounter = new CharacterCounter();
        ResultPrinter resultPrinter = new ResultPrinter();
        resultPrinter.printResults(characterCounter.countCharacters("JavaAcademy"));
    }
}