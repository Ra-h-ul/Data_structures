// Print from 1 to N in reverse
public class Print_Number_I {

    public static void Print(int N)
    {
        if(N<=0) return;
        System.out.print(N+" ");
        Print(N-1);
    } 

    public static void main(String[] args) {
        Print(5);
    }
}