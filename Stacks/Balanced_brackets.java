import java.util.Scanner;
import java.util.Stack;

public class Balanced_brackets {

    public static boolean is_balanced(String str)
    {
        Stack<Character> st= new Stack<>();
        for(int i =0 ; i<str.length() ; i++)
        {
            char c = str.charAt(i);
            if(c=='(')
            {
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                else st.pop();
            }
        }
        if(!st.isEmpty()) return false;
        else return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        System.out.println(is_balanced(str));
        sc.close();
    }
}
