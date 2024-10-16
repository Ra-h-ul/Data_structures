// implement stack using linkedlist
public class ST1 {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    public static class custom_stack1{
        Node head = null ;
        int size=0;

        public void push(int data){
            Node temp = new Node(data);
            if(head!=null){
                temp.next=head;
            }
            head=temp;
            size++;
        }
        public void pop(){
            if(head==null){
                System.out.println("Stack is empty");
            }else{
                head=head.next;
                size--;
            }
            
        }

        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }System.out.println();
        }
    }
    
    public static void main(String[] args) {
         custom_stack1 st = new custom_stack1();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.display();
         st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
    }   
}
