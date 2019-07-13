package pl.vrajani.datastructures.linkedlist;

import pl.vrajani.framework.Solution;

public class LinkedListTest extends Solution {
    @Override
    protected void execute() {
        LinkedList<Integer> linkedList = new LinkedList<>(3);

        System.out.println("Is list empty? " + linkedList.isEmpty());
    }
}
