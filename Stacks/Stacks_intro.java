/*

 */
import java.util.*;
public class Stacks_intro {

    public static void main(String[] args) {
        
        // initilization 
        Stack<Integer> st  = new Stack<>();

        //add elements to stack
        System.out.println(st.add(1));
        System.out.println(st.add(2));
        System.out.println(st.push(3));
        System.out.println(st.add(4));

        System.out.println(st);

        System.out.println(st.peek());

    }
    
}