package package1;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    int front = 0;
    int back = 0;

    public boolean isEmpty() {
        return back == front;
    }

    public boolean isFull() {
        return back == data.length;
    }

    public void addData(int value) throws QueueException {
        if (isFull()) {
            throw new QueueException("can not add data : Queue is full");
        } else {
            data[back++] = value;
        }
    }

    public void RemoveData() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("can not remove data : Queue is Empty");
        } else {
            data[front++] = -1;
        }
    }

    public void printQueue() {

        if (back != front) {
            for (int i = front; i < back; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws QueueException {
        CustomQueue que = new CustomQueue(15);
        que.addData(1);
        que.addData(2);

        que.RemoveData();

        que.printQueue();
        System.out.println(que.isEmpty() + " " + que.isFull());
    }
}
