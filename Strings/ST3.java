//check if a string is moved 2 steps clock wise or anti clock wise 
/*
999check for char at  i in one string ans (i+2)%n in another string
 */
public class ST3 {

    public static boolean check(String str1 ,  String str2){
        boolean anticlock=true , clockwise=true;

        if(str1.length() !=str2.length()) return false;

        //clockwise
        for(int i =0 ; i<str1.length() ; i++){
            if(str1.charAt(i)!=str2.charAt((i+2)%str2.length())) {
                clockwise=false;
                break;
            }
        }

        //anticlock
        for(int i =0 ; i<str1.length() ; i++){
            //System.out.println(str1.charAt((i+2)%str1.length())+" "+str2.charAt(i));
           if(str2.charAt(i)!=str1.charAt((i+2)%str1.length())){
            anticlock=false;
            break;
           }
        }


        return anticlock || clockwise;
    } 

    public static void main(String[] args) {
        
        String str1 = "amazon";
        String str2 = "onamaz";
        String str3 = "azonam";

        System.out.println(check(str1, str2));
        System.out.println(check(str1, str3));
        System.out.println(check("amazon", "amazon"));
    }

}
