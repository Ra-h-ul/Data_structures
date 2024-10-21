// longest subarray with sum K

import java.util.HashMap;

public class AR12 {
    
    public static void subarray(int[] arr , int k){
        HashMap<Integer,Integer> prefixSum = new HashMap<>();
        int sum =0 , len = 0;
        int start = 0 , end =0;
        for(int i=0 ; i<arr.length ; i++){
            sum+=arr[i];

            if(sum==k){
                len = i+1;
                start=0;
                end=i;
            }

            if(prefixSum.containsKey(sum-k)){
                int prevIndex =prefixSum.get(sum-k);

                if(i-prevIndex>len){
                len=i-prevIndex;
                start = prevIndex+1;
                end = i ;
                }
                 
            }

            if(!prefixSum.containsKey(sum)){
                prefixSum.put(sum, i);
            }
        }
        System.out.println(start+" "+end);
        System.out.println(len);
        

    }
    
    public static void main(String[] args) {
        int[] arr = { 1, -1, 5, -2, 3 };
        int k = 3;
        subarray(arr, k);
    }
}
