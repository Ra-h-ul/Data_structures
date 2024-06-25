import java.util.*;

public class Reverse_queue_K {

    public static void Reverse_queue(Queue<Integer> q, int k) {
        if(k>q.size()) return;
        Stack<Integer> st = new Stack<>();
        
        int size = q.size();
        for (int i = 0; i < k; i++)
            st.push(q.poll());
        while (!st.isEmpty())
            q.add(st.pop());
        for (int i = 0; i < (size - k); i++)
            q.add(q.poll());
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int k = 5;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Reverse_queue(q, k);
        System.out.println(q);

    }
}
