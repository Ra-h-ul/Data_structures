// balanced brackets
import java.util.*;
public class ST6 {

    public static boolean  check(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['  ){
                st.push(str.charAt(i));
            }else{
                if(str.charAt(i)==')' && st.peek()=='('  ){
                    st.pop();
                }else if(str.charAt(i)==']' && st.peek()=='['  ){
                    st.pop();
                }else if(str.charAt(i)=='}' && st.peek()=='{'  ){
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{({[()[]]})}";
        System.out.println(check(str));
    }
}
