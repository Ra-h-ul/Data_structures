// find missing element
// approach 1 check for each element in the array will take n2 complexity
// approach 2 use XOR operator
public class AR7 {

    public static void approach1(int arr[]) {
        boolean present =false;
        for(int i =1 ; i<arr.length+2 ; i++){
            present=false;
            for(int j=0 ; j<arr.length ; j++){
                if(arr[j]==i){
                    present = true;
                    break;
                }
            }
            if(present==false){
                System.out.println(i);
                break;
            }
            
        }
    }

    public  static void approach2(int arr[]){
        int ans = arr.length+1;
        for(int j=0  ; j<arr.length ; j++){
            ans^=arr[j];
            ans^=j+1;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 2 ,6 };
        approach1(arr);
        approach2(arr);

    }
}
