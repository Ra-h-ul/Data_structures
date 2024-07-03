// first -ve number in k sized window
import java.util.*;
public class FIrst_negative {
    
    public static void First_neg(int[] arr , int k)
    {
        Queue<Integer> q = new LinkedList<>();
        int[] ans = new int[arr.length-k+1];
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]<0) q.add(i);
        }

        for(int i=0 ; i<ans.length ; i++)
        {
            if(!q.isEmpty() && q.peek()<i) q.poll();

            if(!q.isEmpty() && i+k-1>=q.peek()) ans[i]=arr[q.peek()];
            else
            {
                ans[i]=0;
            }
        }

        for(int i=0 ; i<ans.length ; i++)
        {
            System.out.print(ans[i] +" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr={2,3,-1,0,0,5,-4,-5,7,7,3};
        int k =3;
        First_neg(arr,k);
    }
}
