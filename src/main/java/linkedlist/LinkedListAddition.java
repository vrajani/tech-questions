package linkedlist;

import framework.Solution;
/**
 * Write a code to add/subtract two linked lists that contained a digit each to represent huge numbers.
 *     e.g. 1 -> 4 -> 4 + 1 ->9 -> 5
 *          1 -> 4 -> 4 - 1 ->9 -> 5
 */
public class LinkedListAddition extends Solution {

    @Override
    protected void execute() {
        int[] list1 = {1,4,4};
        int[] list2 = {1,9,5};

        LinkedListNode root1 = generateLinkedList(list1);
        LinkedListNode root2 = generateLinkedList(list2);

        LinkedListNode result = addLinkedLists (root1, root2);

        while (result.next != null){
            System.out.println(result.value);
            result = result.next;
        }
    }

    private LinkedListNode addLinkedLists(LinkedListNode root1, LinkedListNode root2) {
        //TODO: complete the solution here.
        return null;
    }

    private LinkedListNode generateLinkedList(int[] list) {
        LinkedListNode root = new LinkedListNode(list[0]);
        LinkedListNode current = root;
        for (int i = 1; i < list.length; i++){
            LinkedListNode node = new LinkedListNode(i);
            current.next = node;
            current = node;
        }
        return root;
    }
}
