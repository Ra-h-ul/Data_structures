// functional recursion
// return (N + f(N-1)) pattern
public class Get_sum_I{



    public static int Sum(int N)
    {
       if(N==0) return 0;
       return N + Sum(N-1);
    }

    public static void main(String[] args) {
       System.out.println(Sum(100));
    }
}