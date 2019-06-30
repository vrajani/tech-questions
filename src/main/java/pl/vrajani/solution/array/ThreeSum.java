package pl.vrajani.solution.array;

import pl.vrajani.framework.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3Sum - Given an solution.array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the solution.array which gives the sum of zero.
 *
 * Given solution.array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class ThreeSum extends Solution {
    @Override
    protected void execute() {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(nums));

    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // for java 8 it sorts with O(n) = nlogn
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int lo = i+1, hi = nums.length-1, sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));

                        // The below two while loops avoids the duplicate
                        while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                        lo++; hi--;
                    } else if (nums[lo] + nums[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
}
