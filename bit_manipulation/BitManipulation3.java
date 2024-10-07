//toggele kth bit 
public class BitManipulation3 {
    public static void main(String[] args) {
        int k = 1;
        int num = 5 ;
        int bit = 1<<k;
        
        num = num^bit;
        System.out.println(num);
    }
}
