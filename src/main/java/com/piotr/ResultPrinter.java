package com.piotr;

import java.util.Map;

public class ResultPrinter {

    // print received Map to console
    public void printResults(Map<Character, Integer> mapToPrint) {
        for (Map.Entry<Character, Integer> entry : mapToPrint.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

}
