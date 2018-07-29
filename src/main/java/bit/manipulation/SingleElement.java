package bit.manipulation;

import framework.Solution;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class SingleElement extends Solution {
    private int singleNumber(int A[]) {
        for (int i = 1; i < A.length ; i++)
        {
            A[0] ^=A[i];
        }
        return A[0];
    }

    @Override
    protected void execute() {
        int[] data = new int[] {6,7,6,5,7};
        System.out.println(singleNumber(data));
    }
}
