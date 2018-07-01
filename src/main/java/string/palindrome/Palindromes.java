package string.palindrome;

import framework.Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * find the palindromes in a string
 */
public class Palindromes extends Solution {
    @Override
    protected void execute() {
        String input = "abbdb";
        System.out.println("Input: "+ input);
        System.out.println("Palindromes: " + findPalindromes(input));
    }

    private List<String> findPalindromes(String input) {
        List<String> palindromes = new ArrayList<>();

        for (int i = 0; i < input.length() -1; i++){
            int initial = i;
            int pointer = i;
            if (initial > 0 && pointer < input.length()-1 && input.charAt(initial) == input.charAt(pointer+1)){
                pointer++;
                checkPalindromes(input, initial, pointer, palindromes);
                i++;
            } else if (initial > 0 && pointer < input.length()-1 && input.charAt(initial-1) == input.charAt(pointer)){
                initial--;
                checkPalindromes(input, initial, pointer, palindromes);
            } else if (initial > 0 && pointer < input.length()-1 && input.charAt(initial-1) == input.charAt(pointer+1)){
                initial--;
                pointer++;
                checkPalindromes(input, initial, pointer, palindromes);
            }
        }
        return palindromes;
    }

    private void checkPalindromes(String input, int initial, int pointer, List<String> palindromes) {
        boolean palindromeExist = false;
        while (initial > 0 && pointer < input.length() && input.charAt(initial) == input.charAt(pointer)){
            initial--;
            pointer++;
            palindromeExist = true;
        }
        if (palindromeExist) {
            palindromes.add(input.substring(initial+1, pointer));
        }
    }
}
