public class Stack_custom_array {
    
    public static class Stack{
        final private  int[] arr = new int[500];
        private int index=0;
        final  private int size = arr.length;

        // push
        void push(int data)
        {   
            if(index==size)
            {
                System.out.println("stack is full");
                return ;
            }
            arr[index]=data;
            index++;
        }

        //pop
        int pop()
        {
            if(index==0)
            {
                System.out.println("stack is empty");
                return -1;
            }
            int x = arr[index-1];
            index--;
            return x;
        }


        //peek
        int peek()
        {
            if(index==0)
            {
                System.out.println("stack is empty");
                return -1;
            }
            int x = arr[index-1];
            return x;
        }

        //size
        int size()
        {
            return index;
        }

        //capacity
        int capacity()
        {
            return arr.length;
        }

        //display
        void display_reverse()
        {
             if(index==0)
            {
                System.out.println("stack is empty");
                return ;
            }
            
            for(int i =index-1 ; i >=0 ; i--)
            {
                System.out.print(arr[i]);
            }
            System.out.println();
        }


        //display
        void display()
        {
            if(index==0)
            {
                System.out.println("stack is empty");
                return ;
            }
            
            for(int i =0 ; i <index ; i++)
            {
                System.out.print(arr[i]);
            }
            System.out.println();
        }





    }
    
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // st.push(6);
        System.out.println(st.pop()); // 5
        System.out.println(st.pop()); // 4 

        System.out.println(st.peek()); //3
        st.push(4);  

        st.display();   // 1 2 3 4 
        st.display_reverse(); // 4 3 2 1

        
        System.out.println(st.size()); 


        System.out.println(st.capacity());
        
   
    }
}
