// doubley linkedlist custom implementation
public class LL13 {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class Custom_dll {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void insert_at_head(int data) {
            Node temp = new Node(data);
            if (head == null) {
                temp.next = null;
                tail = temp;
            } else {
                temp.next = head;
            }

            temp.prev = null;
            head = temp;
            size++;
        }

        public void insert_at_end(int data) {
            Node temp = new Node(data);
            if (head == null) {
                insert_at_head(data);
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
                size++;
            }
        }

        public void insert_at_index(int data, int idx) {

            if (idx < 1) {
                insert_at_head(data);
            } else if (idx >= size - 1) {
                insert_at_end(data);
            } else {
                Node temp = new Node(data);
                Node tempHead = head;
                for (int i = 1; i < idx; i++) {
                    tempHead = tempHead.next;
                }
                tempHead.next.prev = temp;
                temp.next = tempHead.next;

                tempHead.next = temp;
                temp.prev = tempHead;
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

        public void display_reverse() {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println();
        }

        public void size() {
            System.out.println(size);
        }

        public void delete_head(){
           if(head==tail){
                head=null;
                tail=null;
            }else if(head!=null){
                head=head.next;
            }
            size--;
        }

        public void delete_tail(){
            if(tail==head){
                head=null;
                tail=null;
            }else if(tail!=null){
                tail=tail.prev;
                tail.next=null;
            }
            size--;
        }

        public void delete_at_idx(int idx){
            if(idx==0){
                delete_head();
            }else if(idx>=size-1){
                delete_tail();
            }else{
                Node tempHead = head;
                for (int i = 1; i < idx; i++) {
                    tempHead = tempHead.next;
                }
                tempHead.next.prev=tempHead;
                tempHead.next=tempHead.next.next;
                size--;


            }

        }
    }

    public static void main(String[] args) {
        Custom_dll list = new Custom_dll();
        list.insert_at_head(1);
        list.insert_at_end(2);
        list.insert_at_head(0);
        list.insert_at_index(-1, 0);
        list.insert_at_index(3, 4);
        list.insert_at_index(100, 2);
        list.delete_head();
        list.delete_tail();
        list.display();
    }
}
