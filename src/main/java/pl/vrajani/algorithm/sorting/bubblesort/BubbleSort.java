package pl.vrajani.algorithm.sorting.bubblesort;

public class BubbleSort {

    int[] sort(int[] arr){
        if(arr == null) {
            return null;
        } else if(arr.length == 0){
            return arr;
        }

        for(int i = 0; i < arr.length; i ++){

            boolean swapped = false;
            for(int j = 0; j < arr.length -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr [j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
             if(!swapped){
                 break;
             }
        }
        return arr;
    }
}
