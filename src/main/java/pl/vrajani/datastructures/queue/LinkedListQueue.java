package pl.vrajani.datastructures.queue;

import pl.vrajani.datastructures.linkedlist.LinkedListNode;

public class LinkedListQueue<T> implements Queue<T> {

    private LinkedListNode<T> first;
    private LinkedListNode last;

    @Override
    public boolean isEmpty() {
        return this.first == null;
    }

    @Override
    public T dequeue() {
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        LinkedListNode<T> element = first;
        first = first.next;
        return element.value;
    }

    @Override
    public void enqueue(T e) {
        LinkedListNode<T> node = new LinkedListNode<>(e);
        if(isEmpty()){
            this.first = node;
            this.last = node;
        } else {
            this.last.next = node;
            this.last = node;
        }
    }

    @Override
    public void clear() {
        this.first = null;
        this.last = null;
    }

    @Override
    public boolean search(T e) {
        if (!isEmpty()){
            LinkedListNode<T> current = first;
            while(current != null){
                if(current.value.equals(e)){
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }
}
