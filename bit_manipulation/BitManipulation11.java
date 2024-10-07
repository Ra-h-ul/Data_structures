// minimum flips to get a number
public class BitManipulation11 {
    public static void main(String[] args) {
        int num =3;
        int goal = 15;
        int count = num^goal;
        int ans =0;
        while(count >0){
            if((count&1)==1){
                ans++;
            }
            count=count>>1;
        }
        System.out.println(ans);

    }   
}
