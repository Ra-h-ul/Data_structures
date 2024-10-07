// check if a number is prime or not 
public class BitManipulation8 {
    public static void main(String[] args) {
        int num = 8;
        int bit = num--;
        int ans = num & bit;

        if(ans==0)System.out.println("True"); 
        else System.out.println("False");
    }
}
