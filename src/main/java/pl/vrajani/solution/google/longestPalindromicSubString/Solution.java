package pl.vrajani.solution.google.longestPalindromicSubString;

public class Solution {

    public static void main(String[] args) {

        System.out.println(new Solution().longestPalindrome("babad"));

    }

    private String longestPalindrome(String s) {

        if(s == null || s.length() <= 1){
            return s;
        }
        String palindrome = "";
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length-1; i++){
            String oddPalindrome = getLongestPalindrome(s, i, i);
            if(oddPalindrome.length() > palindrome.length()){
                palindrome = oddPalindrome;
            }
            String evenPalindrome = getLongestPalindrome(s, i, i+1);
            if(evenPalindrome.length() > palindrome.length ()){
                palindrome = evenPalindrome;
            }
        }

        return palindrome;
    }

    private String getLongestPalindrome(String s, int i, int j){
        String palindrome = "";
        int k = i;
        int n = j;
        while(k >= 0 && n < s.length()){
            if(s.charAt(k) == s.charAt(n)){
                if(k == n){
                    palindrome = ""+ s.charAt(k);
                } else {
                    palindrome = s.charAt(k) + palindrome + s.charAt(n);
                }

            } else {
                break;
            }
            k--;
            n++;
        }

        return palindrome;
    }
}
