// Print name N times
// Tc:O(N) SC:O(N)


public class Print_Name{

    public static void Print(String S , int N)
    {
        if(N==0) return;
        Print(S,N-1);
        System.out.println(S);
    }

    public static void main(String[] args) {
        Print("Rahul",5);
    }
}