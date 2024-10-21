// check if array is sorted
public class AR1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,6,8,9};
        boolean sorted = true;
        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        System.out.println("sorted "+sorted);
    }
}
