// pop efficient queue
import java.util.Stack;
public class Queue_stack_II {
    public static class Queue_pop_efficient {
        Stack<Integer> main = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        // push
        void push(int data) {
            if(main.isEmpty()) main.push(data);
            else
            {
                while(!main.isEmpty())
                {
                    helper.push(main.pop());
                }
                main.push(data);

                while(!helper.isEmpty())
                {
                    main.push(helper.pop());
                }
            }

        }

        // pop
        int pop() {
            if(main.isEmpty()) return -1;
            return main.pop();
        }

        // peek
        int peek() {
            if (main.isEmpty())
                return -1;

            return main.peek();

        }

        // display reverse
        void display() {
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

        void display_reverse() {
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
        Queue_pop_efficient q = new Queue_pop_efficient();
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
