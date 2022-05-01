package com.piotr;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharacterCounter {

    public Map<Character, Integer> countCharacters(String argument){

        // HashMap with Character as key and Integer as value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        // Convert argument into array of char in lower case
        char[] charArray = argument.toLowerCase().toCharArray();

        // Loop through the array and count each character occurrence
        for (Character c : charArray) {
            c = Character.toLowerCase(c);
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        // Sort alphabetically in TreeMap and return it
        TreeMap<Character, Integer> sortedMap = new TreeMap<>();
        sortedMap.putAll(charCountMap);
        return sortedMap;
    }
}
