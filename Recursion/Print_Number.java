// Print from 1 to N
public class Print_Number {

    public static void Print(int N)
    {
        if(N==0) return;
        Print(N-1);
        System.out.print(N+" ");
    } 

    public static void main(String[] args) {
        Print(5);
    }
}