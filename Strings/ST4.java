 // check if a number is divisible by 7 without using modulu  operator
public class ST4 {
 
    public static boolean check( int num){
        if(num<0) return check(-num);
        if(num==0 || num==7) return true;
        if(num<10) return false;
        return check(num/10 - 2*(num- num/10 * 10));
    }

    public static void main(String[] args) {
       
        System.out.println( check(105));
    }
}
