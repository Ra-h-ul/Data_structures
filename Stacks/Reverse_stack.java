import java.util.Stack;

public class Reverse_stack {

    public static  Stack<Integer> reverse(Stack<Integer> st)
    {
        Stack<Integer> gt = new Stack<>();
        while(!st.isEmpty())
        {
            gt.push(st.pop());
        }
        return gt;
    } 

    public static void bottom(Stack<Integer> st , int top)
    {
        if(st.isEmpty()){
         st.push(top) ;
          return ;
        }

        int x = st.pop();
        bottom(st, top);
        st.push(x);
    }

    public static void reverse_r(Stack<Integer> st)
    {
        if(st.size()==1)
        {
            return;
        }
        int top = st.pop();
        reverse_r(st);
        bottom(st,top);
        
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(7);
        System.out.println(st);
        reverse_r(st);
        System.out.println(st);
        st=reverse(st);
        System.out.println(st);
    }
}
