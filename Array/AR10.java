// 2 sum in a unsorted array
import java.util.HashMap;
public class AR10 {
    
    public static void sum(int arr[] , int sum){
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i = 0  ; i<arr.length ; i++){
            int x = sum - arr[i]; 
            if(hs.isEmpty()) hs.put(arr[i], i);
            else{
                if(hs.containsKey(x)){
                    System.out.println("index 1: "+ hs.get(x) + " \nindex 2: " + i);
                    break;
                }else{
                    hs.put(arr[i],i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,11,22,4,2,5,3,6,7,10};
        sum(arr,12);
    }
}
