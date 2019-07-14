package pl.vrajani.datastructures.stack;

public interface Stack<T> {

    void push(T e);
    T pop();
    T peek();
    boolean isEmpty();
    boolean isFull();
    boolean search(T e);
}