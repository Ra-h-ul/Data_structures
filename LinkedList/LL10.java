public class LL10 {
    /*
    public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=0;
        int size2=0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA!=null || tempB!=null){
            if(tempA==tempB)return tempA;

            if(tempA!=null){
                tempA=tempA.next;
                size1++; // 1
            }

            if(tempB!=null){
                tempB=tempB.next;
                size2++; // 2
            }
        }

        tempA=headA;
        tempB=headB;

        if(size1>size2){
            for(int i=0 ; i<size1-size2 ; i++){
                tempA=tempA.next;
            }
        }else{
            for(int i=0 ; i<size2-size1 ; i++){
                tempB=tempB.next;
            }
        }

        while(tempA!=null && tempB!=null){
            if(tempA==tempB) return tempA;
            tempA=tempA.next;
            tempB=tempB.next;
           
        }
        return null;
    }
}
    */   
}
