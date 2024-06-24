import java.util.Stack;

public class Previous_smallest {

    public static void previous_smallest(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for(int i=0 ; i<arr.length ; i++)
        {
            while(!st.isEmpty() && arr[i]<=st.peek()) st.pop();
            if(st.isEmpty()) ans[i]=-1;
            else if(st.peek()<arr[i]) ans[i]=st.peek();
            st.push(arr[i]);
        }

        for(int i =0 ; i<ans.length ; i++) System.out.print(ans[i]+ " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,1,6,3,4};
        previous_smallest(arr);

    }
}
