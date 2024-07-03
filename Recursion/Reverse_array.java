public class Reverse_array {
    
    
    public static int[] Reverse(int[] arr , int i  ,int j );
    {
        return arr;
    }

    public static int[] Reverse(int[] arr)
    {
        return (Reverse(arr, 0,arr.length-1));
    }
    
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        arr=Reverse(arr);
    }
}
