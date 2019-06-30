package pl.vrajani.solution.binarytree.serialization;

import pl.vrajani.solution.binarytree.common.LinkedTreeNode;
import pl.vrajani.framework.Solution;

/**
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 *
 * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a solution.string and this solution.string can be deserialized to the original tree structure.
 *
 * Example:
 *
 * You may serialize the following tree:
 *
 *     1
 *    / \
 *   2   3
 *      / \
 *     4   5
 *
 * as "[1,2,3,null,null,4,5]"
 */
public class Serializer extends Solution {


    private static final String SPLITTER = ",";
    private static final String NULL = "N";
    // Encodes a tree to a single solution.string.
    public String serialize(LinkedTreeNode root) {
        if (root == null) return null;

        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    private void buildString(LinkedTreeNode root, StringBuilder sb) {
        if (root == null){
            sb.append(NULL).append(SPLITTER);
        } else {
            sb.append(root.val).append(SPLITTER);
            buildString(root.left,sb);
            buildString(root.right,sb);
        }

    }

    private int index = 0;
    // Decodes your encoded data to tree.
    public LinkedTreeNode deserialize(String str) {
        if(str.isEmpty()) return null;

        String[] chars = str.split(SPLITTER);
        index = 0;
        return buildTree(chars);
    }

    private LinkedTreeNode buildTree(String[] chars) {
        String current = chars[index];
        index++;
        if (current.equals(NULL)) {
            return null;
        } else {
            LinkedTreeNode currentNode = new LinkedTreeNode(Integer.parseInt(current));
            currentNode.left = buildTree(chars);
            currentNode.right = buildTree(chars);
            return currentNode;
        }

    }

    @Override
    protected void execute() {
        LinkedTreeNode root = deserialize("1,2,N,N,3,4,N,N,5,N,N");
        System.out.println(root.val);
        String str = serialize(root);
        System.out.println(str);

        if (root.left.val == deserialize(str).left.val){
            System.out.println("equals");
        }
    }
}

