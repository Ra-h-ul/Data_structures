// min stack from scratch
public class ST7 {
    public static class Node{
        int data;
        int min;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    public static class min_stack{
        Node head=null;
        
        int size=0;

        public void push(int data){
            Node temp = new Node(data);
            if(head==null){
                temp.min=data;
                head=temp;
            }else{
                if(head.min>data){
                    temp.min=data;
                }else{
                    temp.min=head.min;
                }
                temp.next=head;
                head=temp;
            }
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

        public void top(){
            if(head!=null){
                System.out.println(head.data);
            }
        }

        public void min(){
            if(head!=null){
                System.out.println(head.min);
            }
        }

        public static void main(String[] args) {
            min_stack ms = new min_stack();
            ms.push(10); // 10,10
            ms.push(11); // 10,11   
            ms.push(15); // 10,15
            ms.push(9);  // 9,9 
            ms.push(17); // 17,9
            ms.push(8);  //8,8
            ms.push(15); //15,8
            
            
            ms.min();
            ms.top();

            ms.pop();
            ms.min();
            ms.top();

            ms.pop();
            ms.min();
            ms.top();

            ms.pop();
            ms.min();
            ms.top();

            ms.pop();
            ms.min();
            ms.top();

            ms.pop();
            ms.min();
            ms.top();

            ms.pop();
            ms.min();
            ms.top();
        }
    }

    
}
