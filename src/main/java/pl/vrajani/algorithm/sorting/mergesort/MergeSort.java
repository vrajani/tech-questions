package pl.vrajani.algorithm.sorting.mergesort;

import pl.vrajani.framework.Solution;

public class MergeSort extends Solution {
    int[] array = new int[]{4,2,6,12,67,23,21,1,7,54};

    @Override
    protected void execute() {
        mergeSort(array, array.length);
        for(int i : array){
            System.out.println(i);
        }
    }

    private void mergeSort(int[] array, int size) {
        if (size < 2) {
            return;
        }

        int mid = size/2;
        int[] left = new int[mid];
        int[] right = new int[size-mid];

        for( int i =0; i < mid; i++){
            left[i] = array[i];
        }

        for( int i = mid; i < size; i++){
            right[i-mid] = array[i];
        }

        mergeSort(left, mid);
        mergeSort(right, size-mid);

        merge(array, left, right, mid, size-mid);
    }

    private void merge(int[] array, int[] left, int[] right, int leftSize, int rightSize) {
        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize){
            if(left[i] < right[j]){
                array[k] = left[i];
                k++;
                i++;
            } else {
                array[k] = right[j];
                k++;
                j++;
            }
        }

        while(i < leftSize){
            array[k] = left[i];
            k++;
            i++;
        }

        while (j < rightSize){
            array[k] = right[j];
            k++;
            j++;
        }
    }
}
