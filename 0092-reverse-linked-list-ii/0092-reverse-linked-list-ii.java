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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        ListNode tempLeft = null;
        ListNode tempRight = null;
        ListNode beforeLeft = null;

        int cnt = 1;

        while (cnt <= right) {
            if (cnt == left - 1) {
                beforeLeft = temp;
            }
            if (cnt == left) {
                tempLeft = temp;
            }
            if (cnt == right) {
                tempRight = temp;
            }

            temp = temp.next;
            cnt++;
        }

        ListNode nextToRight = tempRight.next;
        ListNode prev = null;
        ListNode curr = tempLeft;

        while (curr != nextToRight) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        tempLeft.next = nextToRight;

        if (beforeLeft != null) {
            beforeLeft.next = prev;
        } else {
            head = prev;
        }

        return head;
    }
}
