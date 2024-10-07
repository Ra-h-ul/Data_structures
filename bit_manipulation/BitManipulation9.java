// decimal to binary 
public class BitManipulation9 {
    public static void main(String[] args) {
        int num = 14 ;
        StringBuilder ans = new StringBuilder();
        
        while(num>0)
        {
            if((num&1)==1){
                ans.append(1);
            }else{
                ans.append(0);
            }
            num=num>>1;
        }
        System.out.println(ans.reverse());
    }
}
