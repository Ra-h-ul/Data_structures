package src.package1;

public class DynamicStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public DynamicStack(int size) {
        this.data = new int[size];
    }

    public DynamicStack() {
        this(DEFAULT_SIZE);
    }

    int ptr = 0;

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr < 0;
    }

    public void addData(int value) {
        if (isFull()) {
            int[] temp = new int[data.length * 2];

            for (int i = 0; i <= ptr; i++) {
                temp[i] = data[i];
            }
            data = temp;

        }
        data[ptr++] = value;

    }

    public int RemoveData() throws CustomStackException {
        if (isEmpty()) {
            throw new CustomStackException("Can not remove data:stack is empty");

        } else {
            return data[ptr--];
        }
    }

    public void peek() throws CustomStackException {
        if (ptr < 0) {
            throw new CustomStackException("Can not peek : Stack is empty");

        } else {
            System.out.println(data[ptr]);
        }

    }

    public void printStack() {
        if (!isEmpty()) {
            for (int i = ptr; i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

    }


}
