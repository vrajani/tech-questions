package pl.vrajani.datastructures.queue;

public interface Queue<T> {
    boolean isEmpty();
    T dequeue();
    void enqueue(T e);
    void clear();
    boolean search(T e);
}
