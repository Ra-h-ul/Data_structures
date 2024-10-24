// minimum insertion and deletion to make s into s1
public class ST14 {
    public static int subsequence(String str1 , String str2 , int i , int j){
        if(i==0 || j==0) return 0;

        if(str1.charAt(i-1)==str2.charAt(j-1)){
            return 1+subsequence(str1, str2, i-1, j-1);
        }else{
            return Math.max(subsequence(str1, str2, i, j-1), subsequence(str1, str2, i-1, j));
        }
    }

    public static int min(String str1 , String str2 , int i , int j){
        int lcs = subsequence(str1, str2, i, j);
        System.out.println(lcs);
        int min_deletion = i-lcs;
        int min_insertion = j-lcs;
        return min_deletion + min_insertion;
    }
    
    public static void main(String[] args) {
        String str1 = " 1";
        String str2 = " 14213";

        System.out.println( min(str1,str2,str1.length(),str2.length()));
    }
}
