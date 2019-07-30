package pl.vrajani.algorithm.sorting.bubblesort;

import pl.vrajani.Utility;
import pl.vrajani.framework.Solution;

public class BubbleSortTest extends Solution {
    int[] array = new int[]{4,2,6,12,67,23,21,1,7,54};

    @Override
    protected void execute() {
        Utility.printIntArray(array);
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        System.out.println("Sorted Array");
        Utility.printIntArray(array);
    }
}
