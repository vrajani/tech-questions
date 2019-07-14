package pl.vrajani.datastructures.stack;

import static java.lang.reflect.Array.newInstance;

public class ArrayStack<T> implements Stack<T> {

    private T arr[];
    private int top;
    private int capacity;
    private Class<T> type;

    @SuppressWarnings({"unchecked"})
    public ArrayStack(Class<T> type,int capacity) {
        arr = (T[]) newInstance(type, capacity);
        this.capacity = capacity;
        this.top = -1;
        this.type = type;
    }


    @Override
    public void push(T e) {
        if(isFull()) {
            copyToBiggerArray();// copy to new array
        }
        top++;
        arr[top] = e;
    }

    @SuppressWarnings({"unchecked"})
    private void copyToBiggerArray() {
        // TODO Check the integer size.
        int newCapacity = capacity * 2;
        T array[] = (T[]) newInstance(type, newCapacity);
        for(int i = 0; i < capacity; i++){
            array[i] = arr[i];
        }
        this.arr = array;
    }

    @Override
    public T pop() {
        if(!isEmpty()){
            return arr[top--];
        } else {
            throw new IndexOutOfBoundsException("Empty Stack!!");
        }
    }

    @Override
    public T peek() {
        if(!isEmpty()) {
            return arr[top];
        } else {
            throw new IndexOutOfBoundsException("Empty Stack!!");
        }
    }

    @Override
    public boolean isEmpty() {
        return this.top < 0;
    }

    @Override
    public boolean isFull() {
        return this.top == arr.length-1;
    }

    @Override
    public boolean search(T e) {
        if(!isEmpty()){
            for(int i = 0; i <= top; i++){
                if(arr[i].equals(e)){
                    return true;
                }
            }
        }
        return false;
    }
}
