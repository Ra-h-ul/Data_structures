// left shift an array by 1

/*
1.save arr[0]
2.replace each cell with it's next element
3.replace last cell with previously saved arr[0] 
*/

public class AR13 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int x = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=x;

        for(int j=0 ;  j<arr.length ; j++){
            System.out.print(arr[j]+" ");
        }
    }
}
