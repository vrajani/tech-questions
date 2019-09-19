package pl.vrajani.solution.string.palindrome;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings with only lowercase letters, create a function that returns an array of those same strings,
 * but each string has its letters rearranged such that it becomes a palindrome (if possible, if not, return -1).
 *
 * e.g. - {abc,aab,baba} --> {-1,aba,abba}
 */
public class GeneratePalindrome {

    public static void main(String[] args) {
        String[] input = new String[]{"abc","aab","abab"};
        String[] palindromes = new GeneratePalindrome().generate(input);

        for(String str : palindromes){
            System.out.println(str);
        }
    }

    private String[] generate(String[] input) {
        String[] ret = new String[input.length];
        for(int i=0; i< input.length; i++){
            ret[i] = generatePalindrome(input[i]);
        }

        return ret;
    }

    private String generatePalindrome(String str) {
        Map<String, Integer> chars = new HashMap<>();


        return null;
    }
}
