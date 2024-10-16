// reverse stack without recursion

import java.util.*;

public class ST3 {
    public static void main(String[] args) {
         Stack<Integer> st1 = new Stack<>();
         Stack<Integer> st2 = new Stack<>();
         Stack<Integer> st3 = new Stack<>();

         st1.push(1);
         st1.push(2);
         st1.push(3);
         st1.push(4);
         System.out.println(st1);

         while(!st1.isEmpty()) st2.push(st1.pop());
         while(!st2.isEmpty()) st3.push(st2.pop());
         while(!st3.isEmpty()) st1.push(st3.pop());

         System.out.println(st1);
    }
}
