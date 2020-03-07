package com.shenghail.arithmetic;

import org.junit.Assert;
import org.junit.Test;

public class LetterCombinationsTest {

    @Test
    public void letterCombinationsTest1() {
        int[] input = {2,3};
        String output = "ad ae af bd be bf cd ce cf";
        LetterCombinations letterCombinations = new LetterCombinations();
        String result = letterCombinations.letterCombinations(input);
        Assert.assertEquals(result, output);
    }

    @Test
    public void letterCombinationsTest2() {
        int[] input = {9};
        String output = "w x y z";
        LetterCombinations letterCombinations = new LetterCombinations();
        String result = letterCombinations.letterCombinations(input);
        Assert.assertEquals(result, output);
    }

    @Test
    public void letterCombinationsTest3() {
        int[] input = {};
        String output = "";
        LetterCombinations letterCombinations = new LetterCombinations();
        String result = letterCombinations.letterCombinations(input);
        Assert.assertEquals(result, output);
    }

    @Test
    public void letterCombinationsTest4() {
        int[] input = {-1};
        String output = "";
        LetterCombinations letterCombinations = new LetterCombinations();
        String result = letterCombinations.letterCombinations(input);
        Assert.assertEquals(result, output);
    }

    @Test
    public void letterCombinationsTest5() {
        int[] input = {1,1,2,3,0,0,4};
        String output = "adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh " +
                        "bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi";
        LetterCombinations letterCombinations = new LetterCombinations();
        String result = letterCombinations.letterCombinations(input);
        Assert.assertEquals(result, output);
    }

    @Test
    public void letterCombinationsTest6() {
        int[] input = {0,1,2,3,4,5,6,7,8,9};
        String output = "";
        LetterCombinations letterCombinations = new LetterCombinations();
        String result = letterCombinations.letterCombinations(input);
        Assert.assertNotNull(result);
    }
}
