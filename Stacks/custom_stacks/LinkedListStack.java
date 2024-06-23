public class LinkedListStack {
   
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
          this.data=data;  
        }
    }

    public static class Stack_L{
        Node Head = null;
        int size=0;

        //push
        void push(int data)
        {
            Node temp = new Node(data);
            temp.next=Head;
            Head=temp;
            size++;
        }

        //pop
         int pop()
        {
            if(Head!=null)
            {
                int data = Head.data;
                Head=Head.next;
                size--;
                return data;

            }else{
                System.out.println("Stack is empty");
                return -1;
            }

        }


        //peek
        int peek()
        {
            if(Head!=null)
            {
                return Head.data;

            }else{
                System.out.println("Stack is empty");
                return -1;
            }

        }

        //size
        int size()
        {
            return size;
        }

        //display
        void display()
        {
            if(Head==null) return;

            Node temp = Head;
            while(temp!=null)
            {
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }

        // display_reverse

        private  void display_reverse_helper(Node h)
        {
            if(h==null) return;
            display_reverse_helper(h.next);
            System.out.print(h.data + " ");
        }

        void display_reverse()
        {
            if(Head==null) return;
            Node temp = Head;
            display_reverse_helper(temp);
            System.out.println();
        }


    }
   
    public static void main(String[] args) {
        Stack_L st = new Stack_L();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st.size()); // 4
        System.out.println(st.peek()); // 4 
        System.out.println(st.pop()); // 4 
        System.out.println(st.peek()); // 3 
        System.out.println(st.size());  //3 

        st.display(); // 3 2 1 
        st.display_reverse(); // 1 2 3  
    }
}
