//check if ith bit is set or not

public class BitManipulation1 {
    public static void main(String[] args) {
        int  a=5;
        int bit =0;
        int b = 1<<bit;

        int ans = a&b;

        if(ans==0)System.out.println("False");
        else System.out.println("True");



    }    
}
