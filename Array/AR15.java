// intersection of two sorted arrays
import java.util.HashSet;
public class AR15 {

    public static void intersection(int[] arr1 , int[]arr2){
        int i=0 , j=0;
        HashSet<Integer> set = new HashSet<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                set.add(arr1[i]);
                i++;
                j++;
            }else{
                if(arr1[i]>arr2[j]){
                    j++;
                }else{
                    i++;
                }
            }
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = {0,3,5};
        intersection(arr1, arr2);
        
    }
}
