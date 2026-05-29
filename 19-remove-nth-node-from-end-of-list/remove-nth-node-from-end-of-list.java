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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode main = dummy;
        ListNode ref = dummy;
        int c = 0;
        while(c <= n) {
            ref = ref.next;
            c++;
        }     
        while(ref != null) {
            ref = ref.next;
            main = main.next;
        }
        main.next = main.next.next;
        return dummy.next;
    }
}