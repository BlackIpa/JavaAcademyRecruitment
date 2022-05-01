package com.piotr;

import junit.framework.TestCase;
import org.junit.Test;


import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CharacterCounterTest extends TestCase {

    private CharacterCounter objectUnderTest = new CharacterCounter();

    @Test
    public void testCountCharacters() {
        String input = "AaBCCcdEEee";
        Map<Character, Integer> result = objectUnderTest.countCharacters(input);
        assertThat(result.get('a'), is(2));
        assertThat(result.get('b'), is(1));
        assertThat(result.get('c'), is(3));
        assertThat(result.get('d'), is(1));
        assertThat(result.get('e'), is(4));
    }
}