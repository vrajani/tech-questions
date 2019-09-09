package pl.vrajani.solution.google.twoSum;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        System.out.println(new Solution().twoSum(arr, 9).toString());
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for( int i = 0; i < nums.length ; i++){
            int current = nums[i];
            if(current < target){
                if(numbers.keySet().contains(current)){
                    int[] returnArray = new int[2];
                    returnArray[0] = numbers.get(current);
                    returnArray[1] = i;
                    return returnArray;
                }
                numbers.put(target-current, i);
            }
        }
        return null;
    }

}
