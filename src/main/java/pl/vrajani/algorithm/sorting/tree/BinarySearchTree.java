package pl.vrajani.algorithm.sorting.tree;

import pl.vrajani.datastructures.tree.BinaryNode;

public class BinarySearchTree<T extends Comparable> {

    public boolean search(BinaryNode<T> root, T object) {
        if(root == null) {
            return false;
        }
        int compare = root.getValue().compareTo(object);

        if(compare == 0) {
            return true;
        } else if(compare < 0){
            return root.getLeft() != null && search(root.getLeft(), object);
        } else {
            return root.getRight() != null && search(root.getRight(), object);
        }
    }
}
