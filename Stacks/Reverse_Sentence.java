import java.util.*;

public class Reverse_Sentence {
    
    public static StringBuilder reverse_sentence(StringBuilder str)
    {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>(); 
        if(str.length()==0)
        {
            return str;
        }

        for(int i=0 ; i<str.length() ; i++)
        {
            char c =str.charAt(i);
            if(c==' ')
            {
                while(!st.isEmpty())
                {
                    ans.append(st.pop());
                }
                ans.append(' ');
                
            }
            else
            {
                st.push(c);
            }
        }
        while(!st.isEmpty())
                {
                    ans.append(st.pop());
                }
                
        return ans;
    }
    
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hi my name is rahul ");
        str=reverse_sentence(str);
        System.out.println(str);
        str=reverse_sentence(str);
        System.out.println(str);
       
    }
}
