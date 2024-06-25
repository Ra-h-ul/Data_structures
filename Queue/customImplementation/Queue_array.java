public class Queue_array {

    public static class Queue_A {
        private final int[] arr = new int[5];
        private int front = -1, rear = -1, size = 0;

        // push
        void push(int data) throws Exception {
            if (size == arr.length)
                throw new Exception("Queue is full");

            if (front == -1) {
                front = rear = 0;
                arr[rear] = data;
            } else {
                arr[++rear] = data;
            }
            size++;

        }

        // pop
        int pop() throws Exception {

            if (size == 0 || front == -1)
                throw new Exception("Queue is empty");
            int x = arr[front++];
            size--;
            return x;
        }

        // peek
        int peek() throws Exception {
            if (size == 0 || front == -1)
                throw new Exception("Queue is empty");
            return arr[front];

        }

        // display
        void display() {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // display rev
        void display_reverse() {
            for (int i = rear; i >= front; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // size
        int size() {
            return size;
        }

        // is empty
        boolean is_Empty() {
            return size == 0;
        }
    }

    public static void main(String[] args) throws Exception {
        Queue_A qu = new Queue_A();
        qu.pop();
        System.out.println(qu.size()); // 0 
        qu.push(1);
        qu.push(2);
        qu.push(3);
        qu.push(4);
        qu.push(5);
        System.out.println(qu.size()); // 5
        qu.display(); // 1 2 3 4 5
        qu.display_reverse(); // 5 4 3 2 1
        System.out.println(qu.peek()); // 1 
        qu.pop(); // 1
        qu.pop(); // 2
        System.out.println(qu.size()); // 3
        qu.display(); // 3 4 5
        qu.display_reverse(); // 5 4 3 
        qu.is_Empty();
  
    }
}