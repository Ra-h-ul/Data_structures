// remove right most set bit
public class BitManipulation7 {
    public static void main(String[] args) {
        int num =15;
        int bit = num--;
        num = num &bit;
        System.out.println(num);
    }   
}
