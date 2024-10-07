//Binary to decimal
public class BitManipulation10 {
    public static void main(String[] args) {
        String s = "1001";
        int ans = 0 ;
        int power =1;
        for(int i = s.length()-1 ; i>=0 ; i--){
            char c = s.charAt(i);
            if(c=='1') ans+=power;
            power*=2;
        }
        System.out.println(ans);
    }
}
