// check if a sting is a palindrome or not


public class ST0 {

    public static boolean  palindrome(String str){
        int i =0;
        int j = str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String st = "rr";
        System.out.println(palindrome(st));
    }
}