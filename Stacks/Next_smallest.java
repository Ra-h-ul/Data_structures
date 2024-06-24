
import java.util.Stack;

public class Next_smallest {
    
    public static void next_smallest(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int[]ans = new int[arr.length];
    
        for(int i = arr.length -1 ; i>=0 ; i--){
            while(!st.isEmpty() && st.peek()>=arr[i]) st.pop();
            if(st.isEmpty()) ans[i]=-1;
            else if(arr[i]>st.peek()) ans[i]=st.peek();
            st.push(arr[i]);
            
        }

        for(int i=0 ; i<ans.length ; i++)
        {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
          int[] arr = {1,5,3,2,1,6,3,4};
            next_smallest(arr);
    }   
}
