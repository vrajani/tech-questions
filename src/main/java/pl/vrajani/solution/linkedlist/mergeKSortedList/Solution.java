package pl.vrajani.solution.linkedlist.mergeKSortedList;

import pl.vrajani.datastructures.linkedlist.LinkedListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode head = new ListNode(0);

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for (ListNode node : lists) {
            while (node != null) {
                pq.add(node.val);
                node = node.next;
            }
        }
        ListNode curr = head;
        while (!pq.isEmpty()) {
            curr.next = new ListNode(pq.poll());
            curr = curr.next;
        }

        return head.next;
    }
//    private boolean isAllNodeNull(ListNode[] lists) {
//        for (ListNode list : lists) {
//            if (list != null) {
//                return false;
//            }
//        }
//        return true;
//    }


    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}