public class LL6 {
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

        public Node get_head(Custom_ll list) {
            return list.head;
        }

        public void get_tail() {
            System.out.println(tail.data);
        }
        
    }

        public static void merge_list(Custom_ll list , Node Head1 , Node Head2){
            int data=0;
            while(Head1!=null && Head2!=null){
                if(Head1.data<Head2.data){
                    data=Head1.data;
                    Head1=Head1.next;
                }else{
                    data=Head2.data;
                    Head2=Head2.next;
                }
                list.insert_at_end(data);
            }

            while(Head1!=null ){
                data=Head1.data;
                Head1=Head1.next;
                list.insert_at_end(data);
            }

            while(Head2!=null ){
                data=Head2.data;
                Head2=Head2.next;
                list.insert_at_end(data);
            }

        }

      public static void main(String[] args) {
        Custom_ll list = new Custom_ll();
        Custom_ll list2 = new Custom_ll();
        Custom_ll list3 = new Custom_ll();
        
        list.insert_at_end(0);
        

        list2.insert_at_end(1);
        list2.insert_at_end(2);
        list2.insert_at_end(4);
        list2.insert_at_end(6);
        list2.insert_at_end(10);

        Node Head1 = list.get_head(list);
        Node Head2 = list2.get_head(list2);

        merge_list(list3, Head1, Head2);
        list3.display();

        }

}
