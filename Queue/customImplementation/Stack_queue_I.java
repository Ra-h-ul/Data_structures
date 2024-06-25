//push efficient stack
import java.util.LinkedList;
import java.util.Queue;

public class Stack_queue_I {

    public static class Stack_q {
        Queue<Integer> q = new LinkedList<>();

        // push
        void push(int data) {
            q.add(data);
        }

        // pop
        int pop() {
            for (int i = 0; i < q.size() - 1; i++) {
                q.add(q.remove());
            }
            int x = q.remove();
            return x;

        }

        // peek
        int peek() {
            for (int i = 0; i < q.size() - 1; i++) {
                q.add(q.remove());
            }
            int x = q.peek();
            q.add(q.remove());
            return x;
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
        void display() {
            for (int i = 0; i < size(); i++) {
                System.out.print(q.peek()+ " ");
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

        st.display();
        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());

        System.out.println(st.pop());
        System.out.println(st.pop());

        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.is_Empty());

    }
}
