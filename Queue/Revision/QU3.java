// implement queue using linkedlist
public class QU3 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class custom_queue4 {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void push(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        public void pop(){
            if(head!=null && head.next!=null){
                head=head.next;
                size--;
            }else{
                head=null;
                tail=null;
                size=0;
            }
        }

        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        custom_queue4 qu = new custom_queue4();
        qu.push(1);
        qu.push(2);
        qu.push(3);
        qu.push(4);
        qu.push(5);
        qu.display();

        qu.pop();
        qu.pop();
        qu.pop();

        qu.display();
        qu.pop();
        qu.pop();
        qu.pop();
         qu.push(1);
        qu.push(2);
        qu.push(3);
        qu.push(4);
        qu.push(5);
        qu.display();

        

    }
}
