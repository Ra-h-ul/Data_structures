// implement queue using array

/**
 * QU0
 */
public class QU0 {

    public static class custom_queue1 {
        private final int[] arr = new int[5];
        int front = -1;
        int rear = -1;
        int size = 0;

        public void add(int data) {
            if (size == arr.length) {
                System.out.println("queue is full");
            } else {
                if (rear == -1) {
                    ++rear;
                    arr[rear] = data;
                    front = 0;
                } else {
                    rear = (rear + 1) % arr.length;
                    arr[rear % arr.length] = data;
                }
                size++;
            }
        }

        public void display() {
            if (front == -1) {
                System.out.println("queue is empty");
            } else {
                for (int i = 0 , j=front; i < size; i++ , j++) {
                    System.out.print(arr[j % arr.length] + " ");
                }
                System.out.println();

              
            }
        }

        public void pop() {
            if (size == 0) {
                System.out.println("queue is empty");
            } else {
                if (front == rear) {
                    arr[front] = -1;
                    front = -1;
                    rear = -1;
                } else {
                    arr[front] = -1;
                    front = (front + 1) % arr.length;
                }
                size--;
            }

        }
    }

    public static void main(String[] args) {
        custom_queue1 qu = new custom_queue1();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        qu.display();
        qu.pop();
        qu.pop();
        qu.pop();
        qu.pop();
        qu.display();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.display();
    }
}