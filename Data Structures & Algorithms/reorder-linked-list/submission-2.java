/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        //Fast-slow
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        //reverse
        ListNode curr = second;
        ListNode prev = null;
        while(curr!= null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        //merge
        ListNode first = head;
        while(prev != null){
            ListNode temp1 = first.next;
            ListNode temp2 = prev.next;
            first.next = prev;
            prev.next = temp1;
            first = temp1;
            prev = temp2;
        }
    }
}
