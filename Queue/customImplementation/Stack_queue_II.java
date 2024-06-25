import java.util.LinkedList;
import java.util.Queue;

public class Stack_queue_II {
    public static class Stack_q {
        Queue<Integer> q = new LinkedList<>();

        // push
        void push(int data) {
            if (q.isEmpty()) {
                q.add(data);
            } else {
                int len = q.size();
                q.add(data);
                for (int i = 0; i < len; i++) {
                    q.add(q.poll());
                }

            }
        }

        // pop
        int pop() {
            if (!q.isEmpty()) {
                int x = q.poll();
                return x;
            }
            return -1;

        }

        // peek
        int peek() {
            if (!q.isEmpty()) {
                int x = q.peek();
                return x;
            }
            return -1;
        }

        // is empty
        boolean is_Empty() {
            return q.isEmpty();
        }

        // size
        int size() {
            return q.size();
        }

        // display
        void display_reverse() {
            for (int i = 0; i < q.size(); i++) {
                System.out.print(q.peek() + " ");
                q.add(q.remove());
            }
            System.out.println();
        }

        
      

    }

    public static void main(String[] args) {
        Stack_q st = new Stack_q();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.q); // 5 4 3 2 1
        System.out.println(st.size()); // 5 
        System.out.println(st.peek()); // 5

        System.out.println(st.pop()); // 5 
        System.out.println(st.pop()); // 4 

        System.out.println(st.peek());
    
        st.display_reverse();
        st.display_reverse();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.is_Empty());
        

    }
}
