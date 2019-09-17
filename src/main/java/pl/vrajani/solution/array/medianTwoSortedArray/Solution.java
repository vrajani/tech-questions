package pl.vrajani.solution.array.medianTwoSortedArray;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().findMedianSortedArrays(new int[]{1,3}, new int[]{}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int size = nums1.length + nums2.length;
        int target1 = size/2;
        int target2 = -1;
        if(size%2 == 0){
            target2 = target1 - 1;
        }

        int k = 0;
        double ret = 0.0;
        while(k <= target1+1 && i < nums1.length && j < nums2.length) {
            int current = 0;
            if(nums1[i] <= nums2[j]){
                current = nums1[i];
                i++;
            }else {
                current =nums2[j];
                j++;
            }
            if(target1 == k || target2 == k){
                ret += current;
            }
            k++;
        }

        while(k <= target1+1 && i < nums1.length ){
            if(target1 == k || target2 == k){
                ret += nums1[i];
            }
            k++;
            i++;
        }

        while(k <= target1+1 && j < nums2.length ){
            if(target1 == k || target2 == k){
                ret += nums2[j];
            }
            k++;
            j++;
        }

        return target2 == -1 ? ret : ret/2;
    }
}
