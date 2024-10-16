package Queue;
import java.util.*;

public class Reverse_queue {

    // iterative
    public static void Reverse_queue_II(Queue<Integer> q)
    {
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()) st.push(q.poll());
        while(!st.isEmpty()) q.add(st.pop());
    }


    // recursive
    public static void Reverse_queue_I(Queue<Integer> q)
    {
        if(q.isEmpty()) return;
        int x = q.poll();
        Reverse_queue_I(q);
        q.add(x);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();    
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Reverse_queue_I(q);
        System.out.println(q);
        Reverse_queue_II(q);
        System.out.println(q);

        
    }
}
