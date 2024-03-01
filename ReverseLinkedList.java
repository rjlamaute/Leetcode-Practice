class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null) {
            return null;
        }

        if(head.next == null) {
            return null;
        }

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}

