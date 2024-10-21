// longest sub array with sum max 
// kdane's algorithm

public class AR11 {
    
    public static void kdane(int[] arr){
        int start=0 ;
        int end=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        int tempstart=0;

        for(int i=0 ; i<arr.length ; i++){
            
            sum+=arr[i];

            if(sum>max){
                max = sum ;
                start=tempstart;
                end = i;
            }
            
            if(sum<0){
                tempstart = i+1;
                sum=0;
            }
        }
        System.out.println(max);
        System.out.println(start + " " + end);
    }

    public static void main(String[] args) {    
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        kdane(arr);
    }    

}
