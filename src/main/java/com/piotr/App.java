package com.piotr;

public class App {

    public static void main( String[] args ) {
        CharacterCounter characterCounter = new CharacterCounter();
        ResultPrinter resultPrinter = new ResultPrinter();
        String s = "Java Academy Is Awesome and I will get there";
        String[] sArr = s.split("\\W+");
        for (String word : sArr) {
            System.out.println("Next word in array");
            resultPrinter.printResults(characterCounter.countCharacters(word));
        }

    }
}