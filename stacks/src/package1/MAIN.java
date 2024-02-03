package src.package1;

public class MAIN {
    public static void main(String[] args) throws CustomStackException {
        DynamicStack stk = new DynamicStack(5);
        stk.addData(10);
        stk.addData(11);
        stk.addData(12);
        stk.addData(13);
        stk.addData(14);
        stk.addData(15);
        stk.addData(16);
        
      

        stk.RemoveData();
        stk.printStack();
        stk.RemoveData();
        stk.printStack();
        stk.RemoveData();
        stk.printStack();
        stk.RemoveData();
        stk.printStack();
        stk.RemoveData();
        stk.printStack();
        stk.RemoveData();
        stk.printStack();
        stk.RemoveData();
        

        

        stk.RemoveData();

    }
}
