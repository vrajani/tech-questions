package pl.vrajani.algorithm.sorting.mergesort;

import pl.vrajani.framework.Solution;

public class MergeSortTest extends Solution {
    int[] array = new int[]{4,2,6,12,67,23,21,1,7,54};

    @Override
    protected void execute() {
        MergeSort mergeSort = new MergeSort();
        mergeSort.run(array, array.length);
        for(int i : array){
            System.out.println(i);
        }
    }
}
