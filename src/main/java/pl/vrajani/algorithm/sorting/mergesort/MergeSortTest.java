package pl.vrajani.algorithm.sorting.mergesort;

import pl.vrajani.Utility;
import pl.vrajani.framework.Solution;

public class MergeSortTest extends Solution {
    int[] array = new int[]{4,2,6,12,67,23,21,1,7,54};

    @Override
    protected void execute() {
        Utility.printIntArray(array);
        MergeSort mergeSort = new MergeSort();
        mergeSort.run(array, array.length);
        System.out.println("Sorted Array");
        Utility.printIntArray(array);
    }
}
