import java.util.Stack;

public class Prefix_to_postfix {

    public static void prefix_to_postfi(String s)
    {
        Stack<String> st = new Stack<>();

        for(int i=s.length()-1 ; i>=0 ; i--)
        {
            char c = s.charAt(i);

            if(c=='-' || c=='+' || c=='*' || c=='/')
            {
                String v1=st.pop();
                String v2=st.pop();
                st.push(v1+v2+c);
            }
            else
            {
                st.push(""+c);
            }
        }
        System.out.println(st.peek());

    }

    public static void main(String[] args) {
        String s = "*6-3+24";
        prefix_to_postfi(s);

    }    
}
