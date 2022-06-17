package com.piotr;

import java.util.Map;
import java.util.TreeMap;

public class CharacterCounter {

    public Map<Character, Integer> countCharacters(String argument){

        // HashMap with Character as key and Integer as value
        TreeMap<Character, Integer> charCountMap = new TreeMap<Character, Integer>();

        // Loop through the array, get only lower case and count each character occurrence
        for (Character c : argument.toCharArray()) {
            c = Character.toLowerCase(c);
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        return charCountMap;
    }
}
