package binarytree;

import binarytree.common.LinkedTreeNode;
import binarytree.common.Util;

/**
 * * Given a binary tree, link nodes at the same level
 *  * Input:
 *  *     4 - null
 *  *   /  \
 *  *  2 -  6 - null
 *  * / \  /  \
 *  *1 -3-5 - 7 - null
 *  *
 *
 */
public class LinkLevelNodes {

    public static void main (String[] args){
        LinkedTreeNode root = (LinkedTreeNode) Util.formTreeFrom("4,2,1,N,N,3,N,N,6,5,N,N,7,N,N");
        LinkLevelNodes linkLevelNodes = new LinkLevelNodes();
        linkLevelNodes.addLinks(root);
        System.out.println(root.left.link.val);
    }

    private void addLinks(LinkedTreeNode root) {
        LinkedTreeNode head = root;
        LinkedTreeNode curr = null;
        LinkedTreeNode prev = null;

        while (head!= null){
            curr = head;
            prev = null;
            head = null;
            while (curr!= null){
                if (curr.left != null){
                    if (prev != null) {
                        prev.link = curr.left;
                    } else {
                        head = curr.left;
                    }
                    prev = curr.left;
                }

                if ( curr.right != null) {
                    if ( prev != null){
                        prev.link = curr.right;
                    } else {
                        head = curr.right;
                    }

                    prev = curr.right;
                }

                curr = curr.link;
            }
        }

    }
}
