
// min stack using O(N) space
import java.util.*;

public class ST8 {

    public static class min_stack1 {
        Stack<Integer> st = new Stack<>();
        int min = Integer.MAX_VALUE;

        public void add(int data) {
            if (st.isEmpty()) {
                min = data;
                st.push(data);
            } else {
                if (min < data) {
                    st.push(data);
                } else {
                    int new_value = (2 * data) - min;
                    min = data;
                    st.push(new_value);
                }
            }

        }

        public void pop() {
            if (!st.isEmpty()) {
                if (st.peek() < min) {
                    min = 2 * min - st.peek();
                }
                st.pop();
            }
        }

        public void top() {
            if (!st.isEmpty()) {
                if (st.peek() >= min) {
                    System.out.println(st.peek());
                } else {
                    System.out.println(min);
                }
            }
        }

        public void min() {
            System.out.println(min);
        }

    }

    public static void main(String[] args) {
        min_stack1 ms = new min_stack1();
        ms.add(15);
        ms.add(12);
        ms.add(16);
        ms.add(8);
        ms.add(19);

        ms.top();
        ms.min();

        ms.pop();
        ms.top();
        ms.min();

         ms.pop();
        ms.top();
        ms.min();

         ms.pop();
        ms.top();
        ms.min();

         ms.pop();
        ms.top();
        ms.min();
    }
}
