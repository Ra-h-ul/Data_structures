// balanced parenthesis

import java.util.Stack;
public class ST5 {
    
    public static boolean  check(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i)=='('){
                st.push('(');
            }else{
                if(st.isEmpty()) return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
    
    public static void main(String[] args) {
        String str = "(())";
        System.out.println(check(str));
    }
}
