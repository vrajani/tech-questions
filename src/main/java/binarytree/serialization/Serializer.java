package binarytree.serialization;

import binarytree.common.TreeNode;

/**
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 *
 * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
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
public class Serializer {


    private static final String SPLITTER = ",";
    private static final String NULL = "N";
    // Encodes a tree to a single string.
    protected String serialize(TreeNode root) {
        if (root == null) return null;

        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    private void buildString(TreeNode root, StringBuilder sb) {
        if (root == null){
            sb.append(NULL).append(SPLITTER);
        } else {
            sb.append(root.val).append(SPLITTER);
            buildString(root.left,sb);
            buildString(root.right,sb);
        }

    }

    // Decodes your encoded data to tree.
    protected TreeNode deserialize(String str) {
        if(str.isEmpty()) return null;

        String[] chars = str.split(SPLITTER);

        return buildTree(chars, 0);
    }

    private TreeNode buildTree(String[] chars, int index) {
        String current = chars[index++];
        if (current.equals(NULL)) {
            return null;
        } else {
            TreeNode currentNode = new TreeNode(Integer.parseInt(current));
            currentNode.left = buildTree(chars,index);
            currentNode.right = buildTree(chars, index);
            return currentNode;
        }

    }

    public static void main (String[] args){
        Serializer serializer = new Serializer();
        TreeNode root = serializer.deserialize("1,2,3,N,N,4,5,N,N,N,N");
        System.out.println(root.val);
        String str = serializer.serialize(root);
        System.out.println(str);

        if (root.left.val == serializer.deserialize(str).left.val){
            System.out.println("equals");
        }
    }
}

