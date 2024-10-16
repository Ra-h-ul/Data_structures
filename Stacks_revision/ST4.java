
// reverse a stack using recursion
import java.util.Stack;

public class ST4 {

    public static void push_at_bottom(Stack<Integer> st, int element) {
        if (st.isEmpty()) {
            st.push(element);
            return;
        }
        int x = st.pop();
        push_at_bottom(st, element);
        st.push(x);
    }

    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty())
            return;
        int element = st.pop();
        reverse(st);
        push_at_bottom(st, element);
    }

    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        System.out.println(st1);
        reverse(st1);
        System.out.println(st1);
    }
}
