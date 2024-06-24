import java.util.Scanner;
import java.util.Stack;

public class Balanced_parenthesis {

     public static boolean is_balanced(String str)
    {
        Stack<Character> st= new Stack<>();
        for(int i =0 ; i<str.length() ; i++)
        {
            char c = str.charAt(i);
            if(c=='(' || c=='{' || c=='[')
            {
                st.push(c);
            }
            else{
                char x = st.peek();
                if(st.isEmpty()) return false;
                
                if ( (x=='(' && c==')') || (x=='{' && c=='}') || (x=='[' && c==']') )
                {
                    st.pop();
                }
                
            }
        }
        
        return st.isEmpty();
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        System.out.println(is_balanced(str));
        sc.close();
    }
}
