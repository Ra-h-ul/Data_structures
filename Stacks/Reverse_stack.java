
import java.util.Stack;

public class Reverse_stack {
    // recursively 
    private static void reverse_r_helper(Stack<Integer> st , int top  )
    {
         if (st.isEmpty()) {
            st.push(top);
            return;
        }
        int x = st.pop();
        reverse_r_helper(st, top);
        st.push(x);
    }
    public static Stack<Integer> reverse_r(Stack<Integer> st)
    {
        if(st.size()==1)
        {
            return st ;
        }
        int top = st.pop();
        reverse_r(st);
        reverse_r_helper(st, top);
        return st;
    }

    // iteratively
    public static Stack<Integer> reverse_i(Stack<Integer> st)
    {
        Stack<Integer> gt = new Stack<>();
        while(!st.isEmpty()) gt.push(st.pop());
        return gt ; 
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        System.out.println(st); // 1 2 3 4 5 
        st=reverse_r(st);
        System.out.println(st); // 5 4 3 2 1
        st=reverse_i(st);
        System.out.println(st); // 1 2 3 4 5

    }
}
