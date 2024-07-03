// functional recursion
// return (N * Fact(N-1)) pattern

public class Get_factorial {

    public static int Fact(int N){
        if(N==0) return 1;
        return N* Fact(N-1);
    }

    public static void main(String[] args) {
       
        System.out.println( Fact(0));
    }
}
