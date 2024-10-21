// find the number appearing once in an array 2nd approach
public class AR5 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 6, 7, 7 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        System.out.println(ans);
    }

}
