

public class Circular_queue {

    public static class Queue_C {
        private final int[] arr = new int[5];
        private int front = -1, rear = -1, size = 0;

        // push
        void push(int data) throws Exception {
            if (size == arr.length)
                throw new Exception("Queue is full");

            if (front == -1) {
                front = rear = 0;
                arr[rear] = data;
            } else {
                if (rear == arr.length - 1) {
                    rear = 0;
                    arr[rear] = data;
                } else {
                    arr[++rear] = data;
                }
            }
            size++;
        }

        // pop
        int pop() throws Exception{
            if(size==0) throw new Exception("Queue is Empty");
            int x = arr[front++];
            size--;
            return x;
        }


        // peek
        int peek() throws Exception{
            if (size==0) throw new Exception("Queue is Empty");
            return arr[front];
        }

        // size
        int size() {
            return size;
        }

        // is empty
        boolean is_Empty() {
            return size == 0;
        }

        //display   -> 1 2 3 4 5 ->  3 4 5  -> 1 2 3 4 5 ( 3 4(R) 5(f) 1 2 ) size=5   2%5=2  3%5=3  4%5=4  5%5=0 6%5=1
        void display()
        {   
            
            for(int i=0 , j = front ; i<size ; i++ , j++)
            {
                System.out.print(arr[j%size] +" ");
            }
            System.out.println();
        }

        // display_reverse

        void display_reverse()
        {
            for(int i=0 , j=rear ; i<size ; i++ , j--)
            {
                int x = Math.floorMod(j, size);
                System.out.print(arr[x] + " ");  
            }
            System.out.println();
        }
    }

    public static void main(String[] args)  throws  Exception {
        Queue_C qu = new Queue_C();
         System.out.println(qu.size()); // 0
         System.out.println(qu.is_Empty()); // true
        qu.push(1);
        qu.push(2);
        qu.push(3);
        qu.push(4);
        qu.push(5);

        System.out.println(qu.peek()); // 1
        System.out.println(qu.size()); // 5
        System.out.println(qu.is_Empty());  // false
            qu.display();
            qu.display_reverse();
        System.out.println(qu.pop()); // 1
        System.out.println(qu.pop()); // 2

        System.out.println(qu.peek()); // 3
        System.out.println(qu.size()); // 3


        qu.push(6);
        qu.push(7);

        System.out.println(qu.peek()); // 3
        System.out.println(qu.size()); // 5   
        qu.display(); //3 4 5 6 7
        qu.display_reverse();


        
    }
}
