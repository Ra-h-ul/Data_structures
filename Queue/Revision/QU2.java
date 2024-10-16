
import java.util.Stack;

// implement queue using stack
// pop efficient
public class QU2 {

    public static class custom_queue3{
        Stack<Integer> main = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        public void add(int data){
            
                while(!main.isEmpty()){
                    helper.push(main.pop());
                }
                helper.push(data);

                while(!helper.isEmpty()){
                    main.push(helper.pop());
                }
            
        }

        public void pop(){
            if(main.isEmpty()){
                System.out.println("Queue is empty");
            }else{
                main.pop();
            }
        }

        public void display(){
             if(main.isEmpty()){
                System.out.println("Queue is empty");
            }else{
                while(!main.isEmpty()){
                    System.out.print(main.peek()+" ");
                    helper.push(main.pop());
                }

                while(!helper.isEmpty()){
                    main.push(helper.pop());
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
         custom_queue3 qu = new custom_queue3();
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
