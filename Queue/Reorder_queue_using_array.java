import java.util.LinkedList;
import java.util.Queue;

/**
 * Reorder_queue_using_array
 */
public class Reorder_queue_using_array {

     public static void Reorder(Queue<Integer> q)
    {
        int size = q.size();
        int[] arr = new int[size];
        for(int i=0 ; i<size ; i++)
        {
            arr[i]=q.poll();
        }

        int i = 0 ; 
        int j =size-1; 
        for(int k=0 ; k<size/2 ; k++)
        {
            q.add(arr[i++]);
            q.add(arr[j--]);
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