package pl.vrajani.datastructures.stack;

import pl.vrajani.framework.Solution;

public class ArrayStackTest extends Solution {


    @Override
    protected void execute() {
        ArrayStack<Integer> stack = new ArrayStack<>(Integer.class, 3);

        System.out.println("Stack is empty? "+ stack.isEmpty());
        System.out.println("Stack is Full? " + stack.isFull());

        stack.push(3);
        System.out.println("Added Element - 3");
        stack.push(4);
        System.out.println("Added Element - 4");
        stack.push(5);
        System.out.println("Added Element - 5");

        System.out.println("Stack is empty? "+ stack.isEmpty());
        System.out.println("Stack is Full? " + stack.isFull());
        System.out.println("Search Element '4', result = " + stack.search(4));
        System.out.println("Search Element '1', result = " + stack.search(1));

        System.out.println("Stack Peek: " + stack.peek());
        System.out.println("Stack POP: " + stack.pop());
        System.out.println("Stack POP: " + stack.pop());
        System.out.println("Stack POP: " + stack.pop());

        System.out.println("Stack is empty? "+ stack.isEmpty());
        System.out.println("Stack is Full? " + stack.isFull());

        try{
            System.out.println("Pop on empty stack: " + stack.pop());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Pop on empty stack, throws exception with message: " +ex.getMessage());
        }
    }
}