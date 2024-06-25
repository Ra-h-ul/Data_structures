
import java.util.Stack;

public class Postfix_to_prefix {

    public static void pre_to_post(String s)
    {
        Stack<String> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++)
        {
            char c = s.charAt(i);
            if(c=='*' || c =='/' || c=='+' || c=='-')
            {
                String v2 = st.pop();
                String v1 = st.pop();
                st.push(c+v1+v2); 
            }
            else
            {
                st.push(""+c);
            }

        }
        System.out.println(st.peek());
    }

    public static void main(String[] args) {
     String s = "6324+-*";
     pre_to_post(s);   
    }
}
