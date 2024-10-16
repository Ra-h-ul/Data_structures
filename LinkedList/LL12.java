public class LL12 {
   
    /*
     
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0) ;
        ListNode curr = dummy;
        
        int carry = 0 ;
        int sum =0 ;
        
        while(l1!=null || l2!=null || carry==1){
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry=0;
            if(sum>9){
                sum=sum%10;
                carry=1;
            }
            
            ListNode temp = new ListNode(sum);
            sum=0;
            curr.next=temp;
            curr=curr.next;
        }
        return dummy.next;
        
    }
}
*/
}
