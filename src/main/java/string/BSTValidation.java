package string;

import framework.Solution;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


// TODO : Complete Solution
public class BSTValidation extends Solution {

    private boolean validateBST(List<Integer> nodes, int current, int low, int high){
        int value = nodes.get(current);
        if(value <= low || value >= high){
            return false;
        } else {
            if ( current < nodes.size()-1){
                int next = nodes.get(current+1);
                if (next < value){
                    return validateBST(nodes, current+1, low, value);
                } else if (next > value){
                    return validateBST(nodes, current+1, value, high);
                } else {
                    // this case to break when it is equal
                    return false;
                }
            }
            return true;
        }

    }

    @Override
    protected void execute() {
        Scanner s = new Scanner(System.in);
        int queryCount = s.nextInt();
        for(int i = 0 ; i < queryCount; i ++){
            int num = s.nextInt();
            List<Integer> nodes = new ArrayList<>();
            for ( int j = 0; j < num ; j++){
                nodes.add(s.nextInt());
            }
            if (validateBST(nodes, 0, Integer.MIN_VALUE, Integer.MAX_VALUE)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}