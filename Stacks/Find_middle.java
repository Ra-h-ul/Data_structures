
import java.util.Stack;

public class Find_middle {

    public static Integer get_middle(Stack<Integer> st)
    {
        if(st.isEmpty()){System.out.println("Stack is empty"); return -1;}
        Stack<Integer> gt = new Stack<>();
        int ans;
        while(st.size()>gt.size())
        {
            gt.push(st.pop());
        }
        ans=gt.peek();

        while(!gt.isEmpty())
        {
            st.push(gt.pop());
        }

        return ans;
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

        System.out.println(get_middle(st));


    }
}
