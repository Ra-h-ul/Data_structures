
import java.util.ArrayList;

// print all subsequence
public class ST11 {

    public static void subsequence(String str , int idx, ArrayList<Character> ds ){
        if(idx<str.length()){
        // Take 
        ds.add(str.charAt(idx));
        subsequence(str, idx+1, ds);

        //Not take
        ds.remove(ds.size()-1);
        subsequence(str, idx+1, ds);
        }else{
            if(!ds.isEmpty()){
                System.out.println(ds);
            }else{
                System.out.println("{}");
            }
          
        }

        
    }



    public static void main(String[] args) {
        String str = "123";
        ArrayList<Character> ds = new ArrayList<>();
        subsequence(str,0,ds);
    }
}
