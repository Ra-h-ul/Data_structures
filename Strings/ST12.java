// maximum common subsequence in two strings
public class ST12 {

    public static int subsequence(String str1 , String str2 , int i , int j  ){
       if(i==0 || j==0) return 0;

       if(str1.charAt(i-1)==str2.charAt(j-1)){
        return 1 + subsequence(str1, str2, i-1, j-1);
       }else{
        return Math.max(subsequence(str1, str2, i-1, j), subsequence(str1, str2, i, j-1));
       }
    }

    public static void main(String[] args) {
        String str1 = "1233";
        String str2 = "123";
        System.out.println(subsequence(str1, str2, str1.length(), str2.length()));
      

    }
}
