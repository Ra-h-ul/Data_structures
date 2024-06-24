
import java.util.Stack;


// should return minimum element at at instance in O(1)
public class MinStack {
    
    public static class Minstack{
        Stack<Integer> st = new Stack<>();
        int min = Integer.MAX_VALUE;
        // push
        void push(int data)
        {
            if(st.isEmpty())
            {
                st.push(data);
                min =data;
            } 
            else if (data<min)
            {
             st.push(2*data - min);
             min =data;
            }
            else{
                st.push(data);
            }
        }

        //pop
        int pop()
        {
            if(st.isEmpty())
            {
                System.out.println("stack is empty");
                return Integer.MIN_VALUE;
            }

            if(st.peek()>min)
            {
                return st.pop();
            }
            else
            {
                int x = 2*min - st.pop();
                int data=min;
                min=x;
                return data;
            }
        }

        //peek
        int peek()
        {

            if(st.isEmpty())
            {
                System.out.println("stack is empty");
                return Integer.MIN_VALUE;
            }

            if(st.peek()>min) return st.peek();
            else
            {
                return min;
            }
        }

        //size
        int size()
        {
            return st.size();
        }

        int get_min()
        {
            
            return min;
        }

        // display stacks
        
    }
    
    public static void main(String[] args) {
        Minstack gt = new Minstack();
        
        gt.push(1);
        System.out.println(gt.get_min());
        gt.push(2);
        System.out.println(gt.get_min());
        gt.push(0);
        System.out.println(gt.get_min());
        gt.push(5);
        System.out.println(gt.peek());
        System.out.println(gt.get_min());
        gt.push(-2);
        System.out.println(gt.get_min());
        gt.push(-5);
        System.out.println(gt.get_min());
        gt.push(8);
        System.out.println(gt.get_min());

        System.out.println(gt.size());
        System.out.println("----------------");

        System.out.println(gt.pop());
        System.out.println(gt.pop());
        System.out.println(gt.pop());
        System.out.println(gt.pop());
        System.out.println(gt.pop());
        System.out.println(gt.pop());
        System.out.println(gt.pop());
        
        

    }
}
