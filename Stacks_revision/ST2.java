// reverse each word in a sentence
import java.util.*;
public class ST2 {

    public static void reverse(String str) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                st.push(str.charAt(i));
            } else {
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
                sb.append(' ');
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        System.out.println(sb);

    }

    public static void main(String[] args) {
        String str = "STACK IS EMPTY";
        reverse(str);
    }
}
