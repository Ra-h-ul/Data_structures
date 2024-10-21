// rearrange elements by +ve and -ve sign

/*
step 1 . create 2 arraylist and insert +ve and -ve numbers in them respectively
step 2 . then add +ve followed by a negative in the original array 
step 3 . add rest of the elements left in either of the list 
 */

import java.util.ArrayList;
import java.util.Arrays;
public class AR16 {

    public static void rearrange(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0)
                arr1.add(arr[i]);
            else
                arr2.add(arr[i]);
        }

        if (arr1.size() >= arr2.size()) {
            for (int i = 0; i < arr2.size(); i++) {
                arr[i * 2] = arr1.get(i);
                arr[(i * 2) + 1] = arr2.get(i);

            }
            int index = arr2.size();
            for (int i = arr2.size(); i < arr1.size(); i++) {
                arr[index++] = arr1.get(i);
            }
        } else {
            for (int i = 0; i < arr1.size(); i++) {
                arr[i * 2] = arr2.get(i);
                arr[(i * 2) + 1] = arr1.get(i);

            }
            int index = arr1.size();
            for (int i = arr1.size(); i < arr2.size(); i++) {
                arr[index++] = arr2.get(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -1, 1, -3, -5, 6, -7 ,6,5};
        rearrange(arr);
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }
}
