// number occuring only once
public class BitManipulation5 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,1,3,3,10,2,4,5};
        int ans =0;
        for(int i=0 ; i<arr.length ;i++){
            ans^=arr[i];
        }
        System.out.println(ans);

    }
}
