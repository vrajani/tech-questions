package dynamic.programming;

import java.util.Stack;

/**
 * Determine whether a list of parentheses "[()]{}...etc" are balanced or unbalanced.
 */
public class BalancedParantheses {

    public static void main (String[] args){
        BalancedParantheses balancedParantheses = new BalancedParantheses();
        System.out.println(balancedParantheses.check("()[()]"));
    }

    private boolean check(String str) {
        Stack<Character> characterStack = new Stack<>();
        for (char character: str.toCharArray()){
            if (character == '{'){
                characterStack.push('}');
            } else if (character == '('){
                characterStack.push(')');
            } else if (character == '['){
                characterStack.push(']');
            } else {
                if (! (character== characterStack.pop())){
                    return false;
                }
            }
        }
        return true;
    }
}
