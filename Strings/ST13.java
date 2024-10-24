// longest common subsequence between two strings
public class ST13 {

    public static StringBuilder subsequence(String str1 , String str2 , int i , int  j){
        if(i==0||j==0) return new StringBuilder(); 
        
        if(str1.charAt(i-1)==str2.charAt(j-1)){
            StringBuilder lcs = subsequence(str1, str2, i-1, j-1);
            lcs.append(str1.charAt(i-1));
            return lcs;
        }else{
            StringBuilder lcs1 = subsequence(str1, str2, i, j-1);
            StringBuilder lcs2 = subsequence(str1, str2, i-1, j);
            return (lcs1.length()>lcs2.length())?lcs1:lcs2;
        }
    }  

    public static void main(String[] args) {
        System.out.println( subsequence("123","14213",3,5));
       
    }
}
