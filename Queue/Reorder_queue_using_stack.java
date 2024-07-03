import java.util.*;

public class Reorder_queue_using_stack {
  

    public static void Reorder(Queue<Integer> q)
    {
        Stack<Integer> st = new Stack<>();
        int size = q.size();

        // step 1
        for(int i=0 ; i<size/2 ; i++)
        {
            st.push(q.poll());
        }
        while(!st.isEmpty())
        {
            q.add(st.pop());
        }

        //step 2
        for(int i=0 ; i<size/2 ; i++)
        {
            st.push(q.poll());
        }
        while(!st.isEmpty())
        {
            q.add(st.pop());
        }

        // step 3 
        for(int i=0 ; i<size/2 ; i++)
        {
            st.push(q.poll());
        }

        //step 4
        while(!st.isEmpty())
        {
            q.add(st.pop());
            q.add(q.poll());
        }

    }
  
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        
        System.out.println(q);
        Reorder(q);
        System.out.println(q);
    
    }   
}
