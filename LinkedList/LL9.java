public class LL9 {
    /*
     * class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;

        // find middle
        ListNode fast = head;
        ListNode slow = head;
        ListNode tempHead = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        // reverse next half
        ListNode prev = null;
        ListNode curr = slow;
        ListNode after = slow.next;

        while(after!=null){
            curr.next=prev;
            prev=curr;
            curr=after;
            after=after.next;
        }
        curr.next=prev;
        
        // compare both parts
        while(tempHead!=null && curr!=null){
            if(curr.val!=tempHead.val) return false;
            curr=curr.next;
            tempHead=tempHead.next;
        }
        return true;
    }
}
     */
}
