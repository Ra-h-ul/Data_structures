package package1;

public class CustomDynamicQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomDynamicQueue(int size) {
        this.data = new int[size];
    }

    public CustomDynamicQueue() {
        this(DEFAULT_SIZE);
    }

    int front = 0;
    int back = 0;

    public boolean isEmpty() {
        return front == back;
    }

    public boolean isFull() {
        return back == data.length - 1;
    }

    public int RemoveData() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Can not remove data : queue is empty");
        }
        int removed = data[front++];
        return removed;
    }

    public void addData(int value) {
        if (isFull()) {
            DynamicReSize();
        }
        data[back++] = value;

    }

    public void printQueue()
    {
        for(int i=front ; i<back ; i++)
        {
            System.out.println(data[i]);
        }
        System.out.println();
    }

    public void DynamicReSize() {
        int temp[] = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
         data=temp;
    }

    public static void main(String[] args) throws QueueException{
        CustomDynamicQueue cq  = new CustomDynamicQueue(2);
        cq.addData(1);
        cq.addData(1);
        cq.addData(1);
        cq.addData(1);
        cq.addData(1);
        cq.addData(1);
        
        cq.printQueue();
    }
}
