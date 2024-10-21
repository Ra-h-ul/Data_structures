// 2 sum in a sorted array
public class AR9 {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,10,15};
        int sum =10;
        int i =0 ;
        int j=arr.length-1;
        int ans =0 ;
        while(i<j){
            ans =arr[i]+arr[j];
            if(ans <sum){
                i++;
            }else if (ans >sum){
                j--;
            }else{
                break;
            }
        }
        System.out.println(i+" "+j);
    }
}
