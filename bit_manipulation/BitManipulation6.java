//count the number of set bits
public class BitManipulation6 {
    public static void main(String[] args) {
        int num =15;
        int count = 0;
        while(num>0){
           count +=(num&1);
           num >>=1;
        }
        System.out.println(count);
    }
}
