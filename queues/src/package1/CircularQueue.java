package package1;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    int front = 0;
    int back = 0;
    int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void addData(int value) throws QueueException {
        if (isFull()) {
            throw new QueueException("can not add data : queue is full");
        } else {
            data[back++] = value;
            back = back % data.length;
            size++;
        }
    }

    public int RemoveData() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("can not remove data : queue is emptyt");
        }

        int remove = data[front++];
        front = front % data.length;
        size--;
        return remove;

    }

    public int getFront() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("can not get front : queue is empty");

        }
        return data[front];
    }

     public void printQueue() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != back);
        System.out.println("END");
    }

}
