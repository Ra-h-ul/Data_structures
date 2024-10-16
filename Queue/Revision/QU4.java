// implement dequeue using linkedlist
public class QU4 {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class custom_queue5 {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void push_front(int data) {
            Node temp = new Node(data);
            if (head == null) {
                tail = temp;
            } else {
                head.prev = temp;
                temp.next = head;
            }
            head = temp;
            size++;
        }

        public void push_back(int data) {
            Node temp = new Node(data);
            if (tail == null) {
                head = temp;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
            tail = temp;
            size++;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void pop_front() {
            if (head == null) {
                System.out.println("Queue is empty");
            } else {
                if (head.next == null) {
                    head = null;
                    tail = null;
                } else {
                    head = head.next;
                    head.prev.next = null;
                    head.prev = null;
                }
                size--;
            }
        }

        public void pop_back() {
            if (tail == null) {
                System.out.println("Queue is Empty");
            } else {
                if (head == tail) {
                    head = null;
                    tail = null;
                } else {
                    tail = tail.prev;
                    tail.next.prev = null;
                    tail.next = null;
                }
                size--;
            }

        }
    }

    public static void main(String[] args) {
        custom_queue5 qu = new custom_queue5();
        qu.push_front(1);
        qu.push_front(0);

        qu.push_back(2);
        qu.push_back(3);
        qu.push_front(-1);

        qu.display();

        qu.pop_front();
        qu.pop_front();

        qu.display();
        qu.pop_back();
        qu.display();
        qu.pop_back();
        qu.pop_back();
        qu.pop_back();

        qu.push_front(1);
        qu.push_front(0);

        qu.push_back(2);
        qu.push_back(3);
        qu.push_front(-1);

        qu.display();
    }
}
