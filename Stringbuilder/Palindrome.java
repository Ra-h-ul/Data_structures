import java.util.*;
public class Palindrome {

    public static boolean checkPalindrome(StringBuilder S)
    {
        for(int i=0 , j=S.length()-1 ; i<S.length()/2 ; i++ , j--)
        {
            
            char ch = S.charAt(i);
            char cx=  S.charAt(j);
            if(ch!=cx)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.nextLine());
        System.out.println(checkPalindrome(S));
    }
}
