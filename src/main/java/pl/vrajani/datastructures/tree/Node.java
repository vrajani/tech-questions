package pl.vrajani.datastructures.tree;

import java.util.ArrayList;

public class Node<T> {

    T value;
    ArrayList<Node> children;

    public Node(T value){
        this.value = value;
        this.children = new ArrayList<>();
    }

    public Node(T value, ArrayList<Node> children){
        this.value = value;
        this.children = children;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void addChild(T childValue){
        this.children.add(new Node(childValue));
    }

    public void addChildren(ArrayList<Node> newChildren){
        this.children.addAll(newChildren);
    }
}
