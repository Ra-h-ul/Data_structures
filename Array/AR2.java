// remove dublicates from a sorted array (hashset approach)
// remove dublicates from a sorted array withour using hashset
import java.util.HashSet;
public class AR2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,4,5,6,6,7};
        HashSet<Integer> set =new HashSet();
        for(int i=0 ; i<arr.length ; i++){
            set.add(arr[i]);
        }
        System.out.println(set);


        int[] arr2 = {1,1,2,2,3,3,3,4,5,6,6,7};
        int k = 0 ;
        for(int j=1 ; j<arr2.length ; j++){
            if(arr2[j]!=arr2[k]){
                arr2[++k]=arr2[j];
            }
        }

        for(int i=0 ; i<=k ; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
