package framework;

import practical.array.MatrixZeros;
import practical.array.ThreeSum;
import practical.binarytree.linklevelnodes.LinkLevelNodes;
import practical.binarytree.search.heapify.BSTToHEAP;
import practical.binarytree.serialization.Serializer;
import practical.bit.manipulation.SingleElement;
import practical.linkedlist.programming.BalancedParantheses;
import practical.string.Anagrams;
import practical.string.BSTValidation;
import practical.string.ReverseString2;
import practical.string.palindrome.Palindromes;

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
