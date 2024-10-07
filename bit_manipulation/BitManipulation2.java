//set kth bit
public class BitManipulation2 {
    public static void main(String[] args) {
        int k=3;
        int num = 5;
        int bit = 1<<k;

        num = num|bit;
        System.out.println(num);
    }
}
