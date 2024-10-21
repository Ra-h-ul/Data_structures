// majority element in an array
// moore voting algorithm
public class AR8 {

    public static void main(String[] args) {

        int arr[] = { 1, 1, 4, 4, 4, 1, 4, 1, 1, };
        int freq = 1;
        int curr = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==curr){
                freq++;
            }else {
                if(arr[i]!=curr && freq>1){
                    freq--;
                }else{
                    curr=arr[i];
                }
            }
        }
        System.out.println(curr);
    }
}
