/**
 * Custom_ll
 */
public class Custom_ll {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class MyLinkedList {

        Node head = null;
        Node tail = null;
        int size = 0;

        public MyLinkedList() {
        }

        public void insert_at_end(int data) {
            Node temp = new Node(data);
            if (size == 0)
                head = temp;
            else
                tail.next = temp;

            tail = temp;
            size++;
        }

        public void insert_at_head(int data) {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++;
        }

        public void insert_at_index(int idx, int data) {
            if (idx == 0 && size != 0) {
                insert_at_head(data);
                return;
            } else if (idx == size) {
                insert_at_end(data);
                return;
            }

            Node newNode = new Node(data);
            Node temp = head;

            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
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

        public void update(int idx, int data) {
            Node temp = head;

            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            temp.data = data;
        }

        private void delete_at_start() {

            if (size > 1) {
                head = head.next;

            } else if (size == 0) {
                return;
            }

            size--;
        }

        private void delete_at_index(int idx)
        {
             Node temp = head;

             for(int i =1 ; i<idx ; i++)
             {
                temp=temp.next;
             }

             temp.next=temp.next.next;
             if(idx+1==size) tail=temp;
             size--;
        }

        public void delete(int idx) {
            if(idx<0 && idx>=size)
            {
                System.out.println("invalid index");
                return;
            }
            else if(idx==0)
            {
                delete_at_start();
               
            }
            else{
                delete_at_index(idx);
            }


        }

        public int size() {
            return size;
        }

    }

    public static void main(String[] args) {

        MyLinkedList ll = new MyLinkedList();
        ll.insert_at_end(1);
        ll.insert_at_end(2);
         ll.insert_at_end(3);
        ll.insert_at_end(4);
         ll.insert_at_end(5);
        ll.insert_at_end(6);
         ll.insert_at_end(7);
        ll.insert_at_end(8);
         ll.insert_at_end(9);
        
       
    }
}