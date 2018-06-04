package binarytree.search.heapify;

import binarytree.common.TreeNode;
import binarytree.common.Util;
import binarytree.serialization.Serializer;

import java.util.Stack;

/**
 * * Write program to convert a BST to heap
 * (such as the largest number is root, the second largest is to the left of root,
 * the third largest to right of root and so on)
 *
 * Input:
 *     4
 *   /  \
 *  2    6
 * / \  / \
 *1  3 5  7
 *
 * Output:
 *     7
 *   /  \
 *  6    5
 * / \  / \
 *4  3 2  1
 *  */
public class BSTToHEAP {

    public static void main (String[] args){
        BSTToHEAP bstToHeap = new BSTToHEAP();
        TreeNode root = Util.formTreeFrom("4,2,1,N,N,3,N,N,5,6,N,N,7,N,N");

        Stack<TreeNode> nodeStack = new Stack<>();
        TreeNode heapRoot = null;
        bstToHeap.convert(root, heapRoot, nodeStack);
    }

    private TreeNode convert(TreeNode root, TreeNode heapNode, Stack<TreeNode> nodeStack) {
        TreeNode current = root;
        while(current.right != null){
            nodeStack.push(current);
            current = current.right;
        }
        heapNode = nodeStack.pop();
        if ( !nodeStack.isEmpty()) {
            //heapNode.left = nodeStack.pop();
            //heapNode.right =
        }
        return heapNode;
    }
}
