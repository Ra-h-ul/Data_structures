// 3 sum

/*
step1 . sort the array
step2 . put 3 pointers i at start j at front of i and k at end 
step3 . move j and k just like we do in 2 sum
step4 . after all possible combinations of  j and k move i
step5 . repeat the process for new i till i reaches arr.length -2

 */
import java.util.ArrayList;
public class AR17 {

    public static void sum(int[] arr, int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
                int k = arr.length-1;
                
                while(j<k){
                    int tempsum=arr[i]+arr[j]+arr[k];

                    if(tempsum<sum){
                        j++;
                    }else if(tempsum>sum){
                        k--;
                    }else if (tempsum==sum){
                        ArrayList<Integer> ar = new ArrayList<>();
                        ar.add(arr[i]);
                        ar.add(arr[j]);
                        ar.add(arr[k]);
                        ans.add(ar);

                        j++;
                        k--;
                        while (j < k && arr[j] == arr[j - 1]) j++;
                        while (j < k && arr[k] == arr[k + 1]) k--;
                    }
                }

            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 2, 2, 3, 3, 5, 6, 7, 7, 8, 8, 10, 11, 12, 12, 15 };
        sum(arr, 17);
    }
}
