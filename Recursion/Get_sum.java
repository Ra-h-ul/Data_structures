// get sum of first N numbers
// Parameterized does not return anything

public class Get_sum{


    private  static void Sum(int N , int sum)
    {
       if(N==0)
       {
        System.out.println(sum);
        return ;
       } 
       Sum(N-1,sum+N);
       
    }

    public static void Sum(int N)
    {
       Sum(N,0);
    }

    public static void main(String[] args) {
        Sum(100);
    }
}