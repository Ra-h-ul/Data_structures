// unset kth bit 
public class BitManipulation4 {
 public static void main(String[] args) {
    int num =5;
    int k = 0;
    int bit = 1<<k;
    bit = ~bit;

    num=num&bit;
    System.out.println(num);

 }   
}
