
import java.util.Stack;

// push efficient

public class Queue_stack_I {

    public static class Queue_push_efficient {
        Stack<Integer> main = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        // push
        void push(int data) {
            main.push(data);
        }

        // pop
        int pop() {
            if (main.isEmpty())
                return -1;

            while (main.size() > 1) {
                helper.push(main.pop());
            }
            int top = main.pop();
            while (!helper.isEmpty()) {
                main.push(helper.pop());
            }
            return top;
        }

        // peek
        int peek() {
            if (main.isEmpty())
                return -1;

            while (main.size() > 1) {
                helper.push(main.pop());
            }
            int top = main.peek();

            while (!helper.isEmpty()) {
                main.push(helper.pop());
            }
            return top;

        }

        // display reverse
        void display_reverse() {
            while (!main.isEmpty()) {
                System.out.print(main.peek() + " ");
                helper.push(main.pop());
            }

            while (!helper.isEmpty()) {
                main.push(helper.pop());
            }
            System.out.println();
        }

        // display

        void display() {
            while (!main.isEmpty()) {
                helper.push(main.pop());
            }

            while (!helper.isEmpty()) {
                System.out.print(helper.peek() + " ");
                main.push(helper.pop());
            }
            System.out.println();
        }

        // is empty
        boolean is_Empty() {
            return main.isEmpty();
        }

        // size
        int size() {
            return main.size();
        }
    }

    public static void main(String[] args) {
        Queue_push_efficient q = new Queue_push_efficient();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);

        q.display();
        q.display_reverse();
        System.out.println(q.peek());

        System.out.println(q.pop());
        System.out.println(q.pop());

         q.display();
        q.display_reverse();
        System.out.println(q.peek());

        System.out.println(q.size());
        System.out.println(q.is_Empty());


    }
}
