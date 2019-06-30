package pl.vrajani.solution.linkedlist.programming;

import pl.vrajani.framework.Solution;
import java.util.Stack;

/**
 * Determine whether a list of parentheses "[()]{}...etc" are balanced or unbalanced.
 */
public class BalancedParantheses extends Solution {

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

    @Override
    protected void execute() {
        System.out.println(check("()[()]"));
    }
}
