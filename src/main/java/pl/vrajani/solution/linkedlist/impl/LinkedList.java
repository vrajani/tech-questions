package pl.vrajani.solution.linkedlist.impl;

import java.util.NoSuchElementException;

public class LinkedList<T> {

    private LinkedListNode<T> head;

    public LinkedList(LinkedListNode<T> head) {
        this.head = head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(T value){
        if(head == null){
            head = new LinkedListNode<>(value);
        } else {
            LinkedListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new LinkedListNode<>(value);
        }
    }

    public void remove(T value) {
        if(head == null){
            throw new RuntimeException("Empty List.");
        }

        if(head.value.equals(value)){
            head = head.next;
            return;
        } else {
            LinkedListNode prev = null;
            LinkedListNode current = head;
            boolean removed = false;

            while(!removed && head.next != null){
                prev = current;
                current = current.next;

                if(current.value.equals(value)){
                    prev.next = current.next;
                    removed = true;
                }
            }

            if(!removed) {
                throw new RuntimeException("Element Not found!");
            }
        }
    }

    public T getLast(){
        if(head == null){
            throw new NoSuchElementException();
        }

        LinkedListNode<T> current = head;
        while(current.next != null){
            current = current.next;
        }

        return current.value;
    }

    public T getFirst() {
        if (head == null){
            throw new NoSuchElementException();
        }
        return head.value;
    }

    public boolean contains(T value){
        if(head == null){
            return false;
        }

        LinkedListNode current = head;
        while(current.next != null){
            if(current.value.equals(value)){
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public T get(int index) {
        if(head == null){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            return head.value;
        }

        LinkedListNode<T> current = head;
        for( int i = 0 ; i < index; i++){
            current = current.next;
            if(current == null){
                throw new IndexOutOfBoundsException();
            }
        }

        return current.value;
    }

    public void insertBefore(T target, T value){
        if(head == null) {

            return;
        }

        if(head.value.equals(target)){
            LinkedListNode<T> temp = new LinkedListNode<>(value);
            temp.next = head;
            head = temp;
        }

        LinkedListNode<T> current = head;
        LinkedListNode<T> prev = null;

        boolean found = false;
        while (current != null){
            if(current.value.equals(target)){
                found = true;
                break;
            }
            prev = current;
            current = current.next;
        }

        if(found) {
            LinkedListNode<T> newNode = new LinkedListNode<>(value);
            prev.next = newNode;
            newNode.next = current;
        }
    }

    public void insertAfter(T target, T value){
        LinkedListNode<T> current = head;

        boolean found = false;
        while (current != null){
            if(current.value.equals(target)){
                found = true;
                break;
            }
            current = current.next;
        }

        if(found) {
            LinkedListNode<T> newNode = new LinkedListNode<>(value);
            LinkedListNode temp = current.next;
            current.next = newNode;
            newNode.next = temp;
        } else {
            throw new RuntimeException("Target Element not found.")
        }
    }

    public void clear() {
        head = null;
    }
}
