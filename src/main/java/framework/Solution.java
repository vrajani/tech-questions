package framework;

import array.MatrixZeros;
import array.ThreeSum;
import binarytree.linklevelnodes.LinkLevelNodes;
import binarytree.search.heapify.BSTToHEAP;
import binarytree.serialization.Serializer;
import bit.manipulation.SingleElement;
import dynamic.programming.BalancedParantheses;
import string.Anagrams;
import string.BSTValidation;
import string.ReverseString2;
import string.palindrome.Palindromes;

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

            default:
                return null;
        }
    }
}
