// move zeros to end of an array
public class AR3 {

    public static void main(String[] args) {
        
        int[] arr = {0,1,0,0,3,0,3,0,5,7,0,0};
        int j=0;
        
     for(int i=0 ; i<arr.length ; i++){
         if(arr[i]!=0){
            arr[j]=arr[i];
            j++;
            arr[i]=0;
        }
    }
    
    for(int i=0 ; i<arr.length ; i++){
        System.out.print(arr[i]+" ");
    }
}
}
