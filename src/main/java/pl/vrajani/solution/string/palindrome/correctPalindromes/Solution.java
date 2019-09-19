package pl.vrajani.solution.string.palindrome.correctPalindromes;

public class Solution {

    public boolean palindromeCheck(String s, int i, int j, int discCount) {

        if(discCount > 1) {
            return false;
        } else if(i >= j){
            return true;
        }
        if(s.charAt(i) != s.charAt(j)){
            return palindromeCheck(s, i+1, j, discCount+1) || palindromeCheck(s, i, j-1, discCount+1);
        }
        return palindromeCheck(s, i+1, j-1, discCount);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(new Solution().palindromeCheck(str, 0, str.length()-1, 0));
    }
}
