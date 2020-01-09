package com.example.anagramtest;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {

    @Test
    public void anagramValidator_CorrectAnagramReturnTrue() {
        assertTrue(AnagramChecker.isValidAnagram("table", "bleaT"));
    }

    @Test
    public void anagramValidator_InCorrectAnagramReturnFalse() {
        assertFalse(AnagramChecker.isValidAnagram("table", "baeaT"));
    }
}
