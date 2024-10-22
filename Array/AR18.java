// 4 sum
import  java.util.*;
public class AR18 {
    
     public static void sum(int[] arr, int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < arr.length-2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
                int k = j+1;
                int l = arr.length-1;
                
                while(k<l){
                    int tempsum = arr[i]+arr[j]+arr[k]+arr[l];

                    if(tempsum>sum){
                        l--;
                    }else if(tempsum<sum){
                        k++;
                    }else{
                        ArrayList<Integer> ar = new ArrayList<>();
                        ar.add(arr[i]);
                        ar.add(arr[j]);
                        ar.add(arr[k]);
                        ar.add(arr[l]);
                        ans.add(ar);

                        k++;
                        l--;

                        while(arr[k]==arr[k-1] && k<arr.length) k++;
                        while(arr[l]==arr[l+1] && l>0 ) l--;
                    }
                }
                
               
            }
        }
        System.out.println(ans);
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 2, 2, 3, 3, 5, 6, 7, 7, 8, 8, 10, 11, 12, 12, 15 };
        sum(arr, 16);
    }
}
