
import java.util.*;

public class Largest_Area_histogram {
       
    public static int Largest_area(int[] arr)
    {
        int[] ns = new int[arr.length];
        int[] ps = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int max = Integer.MIN_VALUE;

        // next smallest
        for(int i=arr.length-1 ; i>=0 ; i-- )
        {
            while(!st.isEmpty() && arr[i]<=arr[st.peek()] ) st.pop() ;
            if(st.isEmpty()) ns[i]=arr.length;
            else if(!st.isEmpty() && arr[i]>arr[st.peek()]) ns[i]=st.peek();
            st.push(i);
        }

        // empty out stack
        while(!st.isEmpty())
        {
            st.pop();
        }

        // previous smallest
        for(int i=0 ; i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]) st.pop();
            if(st.isEmpty()) ps[i]=-1;
            else if(!st.isEmpty() && arr[i]>arr[st.peek()]) ps[i]=st.peek();
            st.push(i);
        }

        for(int i =0 ;i<arr.length ;i++)
        {
            max = Math.max(max, arr[i]*(ns[i]-ps[i] -1));
        }

        return max;
        
       
    }

    public static void main(String[] args) {
            
            int[] arr = {6,2,5,4,5,1,6};
            //int ans = Largest_area(arr); 
            System.out.println(Largest_area(arr));
        }    
}
