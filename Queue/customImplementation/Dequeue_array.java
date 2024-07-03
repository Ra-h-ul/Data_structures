public class Dequeue_array {

    public static class Dequeue_A {
        int[] arr = new int[5];
        int front = -1, rear = -1, size = 0;

        // push
        void push_back(int data) {
            if (size == arr.length)
                return;

            if (size == 0) {
                front = rear = 0;
                arr[rear] = data;
            } else {
                if (rear == arr.length - 1) {
                    rear = 0;
                    arr[rear] = data;
                } else {
                    arr[++rear] = data;
                }
            }
            size++;
        }

        void push_front(int data) {
            if (size == arr.length)
                return;
            if (size == 0) {
                front = rear = 0;
                arr[rear] = data;
            } else {
                if (front == 0) {
                    front = arr.length - 1;
                    arr[front] = data;
                } else {
                    arr[--front] = data;
                }
            }
            size++;
        }

        // pop

        int pop_front() {
            if (size == 0)
                return Integer.MIN_VALUE;

            int x ;
            if (front == arr.length - 1) {
                x = arr[front];
                front = 0;
            } else {
                x = arr[front++];
            }
            size--;
            return x;
        }

        int pop_back() {
            if (size == 0)
                return Integer.MIN_VALUE;

            int x;
            if (rear == 0) {
                x = arr[rear];
                rear = arr.length - 1;
            } else {
                x = arr[rear--];
            }
            size--;
            return x;
        }

        // display
        void display() {
            int f = front;
            for (int i = 0; i < size; i++) {
                System.out.print(arr[f % arr.length] + " ");
                f++;
            }
            System.out.println();
        }

        int peek() {
            if (size == 0)
                return Integer.MIN_VALUE;
            return arr[front];

        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            return size == 0;
        }

    }

    public static void main(String[] args) {
        Dequeue_A da = new Dequeue_A();
        da.push_back(1);
        da.push_back(2);
        da.push_back(3);
        da.display();

        da.push_front(5);
        da.push_front(4);
        da.display();

        da.pop_back();
        da.pop_back();
        da.display();

        da.pop_front();
        da.display();

        System.out.println(da.isEmpty());
        System.out.println(da.size());
        System.out.println(da.peek());

    }

}
