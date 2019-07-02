package pl.vrajani.solution.sorting.quicksort;

import pl.vrajani.framework.Solution;

public class QuickSort extends Solution {
    int[] array = new int[]{4,2,6,12,67,23,21,1,7,54};

    @Override
    protected void execute() {
        quickSort(array, 0, array.length-1);
        for(int i : array){
            System.out.println(i);
        }
    }

    private void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
