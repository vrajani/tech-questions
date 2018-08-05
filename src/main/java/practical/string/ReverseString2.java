package practical.string;

import framework.Solution;

/**
 * reverse a practical.string but keep all special characters in place
 */
public class ReverseString2 extends Solution {

    private String reverse(String s) {

        int i = 0;
        int j = s.length()-1;
        char[] chars = s.toCharArray();
        while (i < j){
            while(i < j && !Character.isLetterOrDigit(chars[i])){
                i++;
            }
            while(i < j && !Character.isLetterOrDigit(chars[j])){
                j--;
            }

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String (chars);
    }

    @Override
    protected void execute() {
        System.out.println(reverse("gh7$l"));
    }
}
