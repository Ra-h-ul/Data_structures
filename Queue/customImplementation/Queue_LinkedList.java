public class Queue_LinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class queue_L {
        Node Head = null;
        Node Tail = null;
        int size = 0;

        // push
        void push(int data) {
            Node temp = new Node(data);
            if (Head == null) {
                Head = temp;
                Tail = temp;
            } else {
                Tail.next = temp;
                Tail = temp;
            }
            size++;
        }

        // pop
        int pop() throws Exception {
            if (size == 0)
                throw new Exception("Queue is empty");
    
            int x = Head.data;
            Head = Head.next;
            size--;
            return x;
        }

        // peek
        int peek() throws Exception {
            if (size == 0)
                throw new Exception("Queue is empty");

            return Head.data;
        }

        // size
        int size() {
            return size;
        }

        // isempty
        boolean is_Empty() {
            return size == 0;
        }

        // display
        void display()
        {
            Node temp = Head;
            while(temp!=null)
            {
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }

        // display reverse
        void helper_display_reverse(Node h)
        {
            if(h==null) return;
            helper_display_reverse(h.next);
            System.out.print(h.data + " ");
        }

        void display_reverse()
        {
            Node temp = Head;
            helper_display_reverse(temp);
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception{
        queue_L qu = new queue_L();

        qu.push(1);
        qu.push(2);
        qu.push(3);
        qu.push(4);
        qu.push(5);
        qu.push(6);
        qu.push(7);
        qu.display();
        qu.display_reverse();
        System.out.println(qu.is_Empty());  //false
        System.out.println(qu.size());  // 7 
        System.out.println(qu.peek());  // 1
        System.out.println(qu.pop());   // 1
        System.out.println(qu.pop());   // 2 
        System.out.println(qu.pop());   /// 3
        qu.push(1);
        qu.push(2);         // 4 5 6 7  1 2
        qu.display();
        System.out.println(qu.is_Empty()); // false
        System.out.println(qu.size());  // 6
        System.out.println(qu.peek());  // 4

        qu.display();
        qu.display_reverse();


    }
}
