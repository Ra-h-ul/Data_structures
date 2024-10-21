// second largest element in array

public class AR0 {

    public static void main(String[] args) {
        int[] arr = {10,8,9,2,1,4,11,10,5};
        int max = arr[0];
        int second_max  = Integer.MIN_VALUE;

        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]>max){
                second_max=max;
                max=arr[i];
            }else if (arr[i]>second_max) {
                second_max=arr[i];
            }
        }

        System.out.println(second_max);
    }
    
}