
public class LL3 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }
    }

    public static class Custom_ll {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void insert_at_head(int data) {
            Node temp = new Node(data);
            if (head == null) {
                temp.next = head;
                head = temp;
                tail = head;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;

        }

        public void insert_at_end(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        public void insert_at_index(int data, int idx) {
            Node temp = new Node(data);
            if (idx == 0) {
                insert_at_head(data);
            } else if (idx == size || idx > size) {
                insert_at_end(data);
            } else {
                Node temphead = head;

                for (int i = 1; i < idx; i++) {
                    temphead = temphead.next;
                }
                temp.next = temphead.next;
                temphead.next = temp;
                size++;
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public int delete(int idx) {

            int data = 0;
            Node temphead = head;

            if (head == null || idx >= size) {
                System.out.println("unable to delete");
                return -1;
            } else if (idx == 0) {
                data = head.data;
                head = head.next;

            } else {
                for (int i = 1; i < idx; i++) {
                    temphead = temphead.next;
                }
                data = temphead.next.data;
                if (temphead.next.next == null) {
                    tail = temphead;
                }
                temphead.next = temphead.next.next;
            }
            size--;
            return data;

        }

        public void size() {
            System.out.println(size);
        }

        public void get_head() {
            System.out.println(head.data);
        }

        public void get_tail() {
            System.out.println(tail.data);
        }

        public int find_middle(){
            Node slow = head;
            Node fast = head;

            while(fast.next!=null){
                fast=fast.next;
                if(fast.next!=null){
                    fast=fast.next;
                    slow=slow.next;
                }
            }

            return slow.data;
        }

        public int find_middle2(){
            Node slow = head;
            Node fast = head;

            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }

            return slow.data;
        }
    }
        public static void main(String[] args) {
            Custom_ll list = new Custom_ll();

        list.insert_at_end(0);
        list.insert_at_end(1);
        list.insert_at_end(2);
        list.insert_at_end(3);
        list.insert_at_end(4);
        list.insert_at_end(5);
        
    
        list.display();
        System.out.println(list.find_middle2());

    }
}
