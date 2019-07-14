package pl.vrajani.framework;

import pl.vrajani.datastructures.queue.LinkedListQueueTest;
import pl.vrajani.datastructures.stack.ArrayStackTest;
import pl.vrajani.solution.array.MatrixZeros;
import pl.vrajani.solution.array.ThreeSum;
import pl.vrajani.solution.binarytree.linklevelnodes.LinkLevelNodes;
import pl.vrajani.solution.binarytree.search.heapify.BSTToHEAP;
import pl.vrajani.solution.binarytree.serialization.Serializer;
import pl.vrajani.solution.bit.manipulation.SingleElement;
import pl.vrajani.solution.common.Finally;
import pl.vrajani.solution.linkedlist.BalancedParantheses;
import pl.vrajani.algorithm.sorting.mergesort.MergeSort;
import pl.vrajani.algorithm.sorting.quicksort.QuickSort;
import pl.vrajani.solution.string.Anagrams;
import pl.vrajani.solution.string.BSTValidation;
import pl.vrajani.solution.string.ReverseString2;
import pl.vrajani.solution.string.palindrome.Palindromes;

public abstract class Solution {

    protected abstract void execute();

    protected static Solution getSoutionInstance(String className) {
        switch (className){

            // Arrays
            case "ThreeSum":
                return new ThreeSum();
            case "MatrixZeros":
                return new MatrixZeros();

            // Strings
            case "Anagrams":
                return new Anagrams();
            case "BSTValidation":
                return new BSTValidation();
            case "ReverseString2":
                return new ReverseString2();
            case "Palindromes":
                return new Palindromes();

            //Data Structures
            case "ArrayStackTest":
                return new ArrayStackTest();
            case "LinkedListQueueTest":
                return new LinkedListQueueTest();

            // Binary Tree
            case "BSTToHEAP":
                return new BSTToHEAP();
            case "LinkLevelNodes":
                return new LinkLevelNodes();
            case "Serializer":
                return new Serializer();

            // Bit Manipulation
            case "SingleElement":
                return new SingleElement();

            // Dynamic Programming
            case "BalancedParantheses":
                return new BalancedParantheses();

            // Sorting
            case "MergeSort":
                return new MergeSort();
            case "QuickSort":
                return new QuickSort();

            // common experiments
            case "Finally":
                return new Finally();

            default:
                return null;
        }
    }
}
