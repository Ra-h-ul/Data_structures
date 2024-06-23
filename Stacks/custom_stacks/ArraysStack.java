/**
 * ArraysStack
 */

public class ArraysStack {

    public static class Stack_A{
        int[] arr = new int[5];
        int size=0;
        int index=0;

        // push
        void push(int data)
        {
            if(index==arr.length)
            {
                System.out.println("stack is full");
                
            }else{
                arr[index++] = data;
                size++;
            }
        }
        
        //pop
        int pop(){
            if(index==0)
            {
                System.out.println("Stack is empty");
                return -1;
            }else{
                int data = arr[--index]; // 0 1 2  
                size--;
                return data;
            }
        }

        //peek
        int peek()
        {
            if(index==0)
            {
                System.out.println("Stack is empty");
                return -1;
            }else
            {
                int x = index-1;
                return arr[x];
            }
        }

        //display
        void display()
        {
            for(int i=size ; i>=0 ; i--)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // display reverse
        void display_reverse()
        {
            for(int i=0 ; i<=size ; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        // capacity

        int size()
        {
            return index;
        }

        int capacity()
        {
            return arr.length;
        }

    } 

    public static void main(String[] args) {
        Stack_A st = new Stack_A();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.capacity());
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.peek());


        st.display();
        st.display_reverse();
    }    

}