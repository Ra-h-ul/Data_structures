public class Dequeue_Linkedlist {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Dequeue_LL {
        private  Node head = null;
        private Node tail = null;
        private int size = 0;

        // push

        void push_back(int data) {
            Node temp = new Node(data);
            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
            size++;
        }

        void push_front(int data) {
            Node temp = new Node(data);
            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                head.prev = temp;
                temp.next = head;
                head = temp;
            }
            size++;
        }

        // pop

        int pop_back() {
            if (size == 0)
                return Integer.MIN_VALUE;

            int x;
            if (size == 1) {
                x = head.data;
                head = null;
                tail = null;
            } else {
                x = tail.data;
                tail = tail.prev;
                tail.next = null;
            }
            size--;
            return x;
        }

        int pop_front() {
            if (size == 0)
                return Integer.MIN_VALUE;

            int x;
            if (size == 1) {
                x = head.data;
                head = null;
                tail = null;
            } else {
                x = head.data;
                head = head.next;
                head.prev = null;
            }
            size--;
            return x;
        }

        // display
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void display_reverse() {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println();
        }

        // size and isempty

        int size() {
            return size;
        }

        boolean is_Empty() {
            return size == 0;
        }

    }

    public static void main(String[] args) {
        Dequeue_LL da = new Dequeue_LL();
 
        da.push_back(1);
        da.push_back(2);
        da.push_back(3);
        da.display();

        da.push_front(5);
        da.push_front(4);
        
        da.display();
        da.display_reverse();
        da.display_reverse();
        da.pop_back();
        da.pop_back();
        da.display();

        da.pop_front();
        da.display();

       System.out.println(da.size());
       System.out.println(da.is_Empty());

      

    }
}
