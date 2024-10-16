// implement deque using array
public class QU5 {
    
    public static class custom_queue6{
        private final int[] arr = new int[5];
        int size=0;
        int rear =-1, front = -1;

        public void push_front(int data){
            if(size==arr.length){
                System.out.println("Queue is full");
            }else{
                if(front==-1){
                front=rear=0;
                arr[front]=data;
                }else if (front==0 && size<arr.length-1){
                    front = arr.length-1;
                    arr[front]=data;
                }else{
                    front--;
                    arr[front]=data;
                }
                size++;
            }

        }

        public void push_back(int data){
            if(size==arr.length){
                System.out.println("Queue is full");
            }else{
                if(rear==-1){
                    front=rear=0;
                    arr[rear]=data;
                }else if(rear==arr.length-1){
                    rear=0;
                    arr[rear]=data;
                }else{
                    rear++;
                    arr[rear]=data;
                }
                size++;
            }
        }

        public void pop_front(){
            if(size==0){
                System.out.println("Queue is empty");
            }else{
                arr[front]=-1;
                if(front==rear){
                    front=rear=-1;
                }else if(front==arr.length-1) {
                    front=0;
                }else{
                    front++;
                }
                size--;
            }
        }

        public void pop_back(){
            if(size==0){
                System.out.println("Queue is empty");
            }else{
                arr[rear]=-1;
                if(rear==front){
                    rear=front=-1;
                }else if (rear==0){
                    rear=arr.length-1;
                }else{
                    rear--;
                }
                size--;
            }
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
            }else{
                for(int i=front , j=1  ; j<=size ; i++ , j++){
                    System.out.print(arr[i%arr.length]+" ");
                }
                System.out.println();
            }
        }

        public void size(){
            System.out.println(size);
        }

    }
    
    public static void main(String[] args) {
        custom_queue6 qu = new custom_queue6();
        qu.push_front(1);
        qu.push_front(0);
        qu.push_back(2);
        qu.push_back(3);
        qu.push_front(-1);
        qu.size();
        qu.display();

        qu.pop_back();
        qu.pop_front();
        qu.display();
        qu.pop_back();
        qu.pop_back();
        qu.pop_front();
        qu.push_front(1);
        qu.push_front(0);
        qu.push_back(2);
        qu.push_back(3);
        qu.push_front(-1);
        qu.display();
    }
}
