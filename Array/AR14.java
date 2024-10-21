// rotate an array by K elements
/*
step 1. rotate whole array
step 2. rotate first k elements
step 3. rotate last arr.length-k elements
 */


import java.util.Arrays;
public class AR14 {

    public static void rotate_helper(int[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int x = arr[i];
            arr[i] = arr[j];
            arr[j] = x;
        }
    }

    public static void rotate(int[] arr , int k){
        rotate_helper(arr,0,arr.length-1);
        rotate_helper(arr, 0, k-1);
        rotate_helper(arr, k, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 3;
        System.out.println("Original array: " + Arrays.toString(arr));
        rotate(arr, k);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
