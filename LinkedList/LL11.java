public class LL11 {
   /*
   class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode after = head.next;

        while(after!=null){
            curr.next = prev ; 
            prev = curr ;
            curr = after;
            after = after.next;
        }
        curr.next=prev;
        return curr;
    }
}
   */ 
}
