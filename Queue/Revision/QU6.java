
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// reverse queue
public class QU6 {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(1);
        qu.add(2);
        qu.add(1);
        qu.add(2);
        qu.add(1);
        qu.add(2);
        qu.add(2);
        System.out.println(qu);

        // reverse
        Stack<Integer> st = new Stack<>();
        while(!qu.isEmpty()){
            st.push(qu.poll());
        }
        while(!st.isEmpty()){
            qu.add(st.pop());
        }

        System.out.println(qu);
    }
}
