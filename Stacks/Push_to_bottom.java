import java.util.Stack;

public class Push_to_bottom {
    // iteratively
    public static void bottom(Stack<Integer> st) {
        if (st.isEmpty())
            return;
        Stack<Integer> gt = new Stack<>();
        int top = st.pop();

        while (!st.isEmpty())
            gt.push(st.pop());
        st.push(top);
        while (!gt.isEmpty())
            st.push(gt.pop());

    }

    // recursively
    private static void bottom_r_helper(Stack<Integer> st, int top) {
        if (st.isEmpty()) {
            st.push(top);
            return;
        }
        int x = st.pop();
        bottom_r_helper(st, top);
        st.push(x);

    }

    public static void bottom_r(Stack<Integer> st) {
        if (!st.isEmpty() && st.size() != 1)
        {
            int top = st.pop();
            bottom_r_helper(st, top);
        }

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        System.out.println(st); // 1 2 3 4 5
        // bottom(st);
        bottom_r(st);
        System.out.println(st); // 5 1 2 3 4
        bottom(st);
        System.out.println(st); // 4 5 1 2 3
    }
}
