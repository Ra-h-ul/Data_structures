
import java.util.Stack;

public class Stock_span {
    
    public static void stock_span(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        ans[0]=1;
        st.push(0);
        for(int i=1 ; i<arr.length ;i++)
        {   
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]) st.pop();
            if(st.isEmpty()) ans[i]=i+1;
            else if(arr[i]<arr[st.peek()]) ans[i]=i-st.peek();
            st.push(i); 
        }

        for(int i=0 ;i<ans.length ;i++)
        {
            System.out.print(ans[i]+ " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr  = { 100 ,80 ,60 ,70 ,60 ,75 ,85 , 100 , 101};
        stock_span(arr);
    }
}
