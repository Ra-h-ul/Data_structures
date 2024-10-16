// implement stack using array
public class ST0 {

    public static class custom_stack{
        private final int[] arr = new int[100];
        int top =-1;
        int size=0;
        
        public void push(int data){
            if(size==arr.length){
                System.out.println("Stack is full");
            }else{
                arr[++top]=data;
                size++;
            }
        }

        public void pop(){
            if(size==0){
                System.out.println("Stack is empty");
            }else{
                arr[top--]=-1;
                size--;
            }
        }

        public void display(){
            for(int i =0 ; i<=top ; i++){
                System.out.print(arr[i]+" ");
            }System.out.println();
        }

        public void size(){
            System.out.println(size);
        }
    }
    
    public static void main(String[] args) {
        custom_stack st = new custom_stack();
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