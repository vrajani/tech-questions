package pl.vrajani.datastructures.tree;

public class BinaryNode<T extends Comparable> {
    T value;
    BinaryNode<T> left;
    BinaryNode<T> right;

    public BinaryNode(T value){
        this.value = value;
    }

    public BinaryNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
