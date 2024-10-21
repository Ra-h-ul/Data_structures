
import java.util.HashMap;

// find the number appearing once in an array
// approach 1 use hashmap
public class AR4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1,2,3,4,6,7,7};
        HashMap<Integer,Integer> hs = new HashMap(); // number , frequency
        for(int i=0 ; i<arr.length ; i++){
            if(!hs.containsKey(arr[i])){
                hs.put(arr[i], 1);
            }else{
                int val = hs.get(arr[i])+1; 
                hs.put(arr[i], val);
            }
        }

         for (HashMap.Entry<Integer, Integer> entry : hs.entrySet()) {
          
            if(entry.getValue()==1){
                 System.out.println("Number: " + entry.getKey());
            }
           
        }
    }
}
