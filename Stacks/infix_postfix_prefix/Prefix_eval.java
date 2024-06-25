
//-+8/632

import java.util.*;

/**
 * Prefix_eval
 */
public class Prefix_eval {

    public static void Evaluate_prefix(String s)
    {
        Stack<Integer> st = new Stack<>();
        for(int i =s.length()-1 ; i>=0 ;i--)
        {
            char c = s.charAt(i);
           
            if(c=='/' || c=='-' || c=='+' || c=='*')
            {
                int val1=st.pop();
                int val2=st.pop();

                switch (c) {
                    case '+' -> st.push(val1+val2);
                    case '-' -> st.push(val1-val2);
                    case '*' -> st.push(val1*val2);
                    case '/' -> st.push(val1/val2);
                    default -> {
                    }
                }
            }
            else
            {
               st.push(c-'0');
                
            }
            
        }
        System.out.println(st.peek());
       
    }

    public static void main(String[] args) {
        String prefix = "+9*26";
        Evaluate_prefix(prefix);

    }
}