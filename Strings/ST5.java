
import java.util.HashMap;

//Roman to Integer Conversion
public class ST5 {

    public static int roman_to_integer(String str){
        int ans =0 ;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        for(int i=0 ; i<str.length() ; i++){
            

            if(i+1<str.length() && map.get(str.charAt(i))<map.get(str.charAt(i+1)) ){
                ans-=map.get(str.charAt(i));
                ans+=map.get(str.charAt(i+1));
                i++;
            }else{
                ans+=map.get(str.charAt(i));
            }
        }
        return ans;
        
    }

    public static void main(String[] args) {
        String str = "MCCLIV";
        System.out.println(roman_to_integer(str));
    }
}
