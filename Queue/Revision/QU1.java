
import java.util.Stack;

// queue implementation using stack
//push efficient
public class QU1 {
    
    public static class custom_queue2{
        Stack<Integer> main = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        public void add(int data){
            main.push(data);
        }

        public void pop(){
            if(main.isEmpty()){
                System.out.println("Queue is empty");
            }else{

                while(!main.isEmpty()){
                    helper.push(main.pop());
                }
                helper.pop();
                while(!helper.isEmpty()){
                    main.push(helper.pop());
                }
            }
        }

        public void display(){
            if(main.isEmpty()){
                System.out.println("queue  is empty");
            }else{

                while(!main.isEmpty()){
                    helper.push(main.pop());
                }
                
                while(!helper.isEmpty()){
                    System.out.print(helper.peek()+" ");
                    main.push(helper.pop());
                }
                System.out.println();
            }
        }

    }
    
    public static void main(String[] args) {
        custom_queue2 qu = new custom_queue2();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        qu.add(6);

        qu.display();

        qu.pop();
        qu.pop();
        qu.pop();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.display();

    }
}
