public class Stack_custom_ll {
    
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static  class Stackll{
        Node head = null ; 
        int size =0 ;
        
        //push
        void push(int data)
        {   
            Node temp =new Node(data);
            temp.next=head;
            head=temp;
            size++;
        }

        //pop
        int  pop()
        {
            if(head==null)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.data;
            head=head.next;
            size--;

            return x ; 
        }

        //peek
        int peek()
        {
            if(head==null)
            {
                System.out.println("stack is empty");
                return -1;
            }

            int x = head.data;
            return x ; 

        }

        //size
        int size()
        {
           return size;
        }

        //display_reverse

        void display_reverse()
        {
            if(head==null)
            {
                System.out.println("Stack is empty");
            }
            Node temp = head ; 
            while(temp!=null)
            {
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }

        //display

        private void helper(Node t)
        {
            if(t==null) return ;
            Node next = t.next;            
            helper(next);
            System.out.print(t.data + " ");

        }

        void display()
        {
            if(head==null)
            {
                System.out.println("stack is empty");
                return ;
            }

            Node temp = head; 
            helper(temp);
            System.out.println();
        }


    }
    
    public static void main(String[] args) {
            Stackll st = new Stackll();

            st.push(1);
           
            st.pop();
            st.pop();

            System.out.println(st.pop()); // 6 
            System.out.println(st.peek()); // 5 
            
            st.display(); // 1 2 3 4 5 
            st.display_reverse(); // 5 4 3 2 1 
           System.out.println(st.size()); // 5 
    }
}
