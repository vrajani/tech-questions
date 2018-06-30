package framework;

import binarytree.linklevelnodes.LinkLevelNodes;
import binarytree.search.heapify.BSTToHEAP;
import binarytree.serialization.Serializer;
import bit.manipulation.SingleElement;
import dynamic.programming.BalancedParantheses;
import string.Anagrams;
import string.BSTValidation;
import string.ReverseString2;

public abstract class Solution {

    protected abstract void execute();

    protected static Solution getSoutionInstance(String className) {
        switch (className){

            // Strings
            case "Anagrams":
                return new Anagrams();
            case "BSTValidation":
                return new BSTValidation();
            case "ReverseString2":
                return new ReverseString2();

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
