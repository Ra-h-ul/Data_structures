
import java.util.Stack;

public class postfix_eval {

    public static void Evaluate_postfix(String s) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '*' || c == '/' || c == '+' || c == '-') {
                int val2 = st.pop();
                int val1 = st.pop();

                switch (c) {
                    case '+' -> st.push(val1 + val2);
                    case '-' -> st.push(val1 - val2);
                    case '*' -> st.push(val1 * val2);
                    case '/' -> st.push(val1 / val2);
                    default -> {
                    }
                }
            } else
                st.push(c - '0');

        }
        System.out.println(st.peek());
    }


    public static void main(String[] args) {
        String s = "6324+-*";
        Evaluate_postfix(s);
    }
}
