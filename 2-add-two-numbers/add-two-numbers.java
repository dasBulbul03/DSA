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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // dummy head node to simplify logic
        ListNode curr = dummy;
        int carry = 0;

        // run until both lists are finished
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0; // value from l1, or 0 if null
            int y = (l2 != null) ? l2.val : 0; // value from l2, or 0 if null
            int sum = x + y + carry;           // total for this digit

            carry = sum / 10;                  // carry for next digit
            int digit = sum % 10;              // single-digit result

            curr.next = new ListNode(digit);   // create new node
            curr = curr.next;                  // move pointer

            if (l1 != null) l1 = l1.next;      // move forward in l1
            if (l2 != null) l2 = l2.next;      // move forward in l2
        }

        return dummy.next; // return the real head
    }
    }
