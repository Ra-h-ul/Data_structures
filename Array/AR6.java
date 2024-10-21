// union of 2 sorted array
public class AR6 {

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,6,7,8};
        int[] arr2 = {1,2,6,9,10};
        int[] arr3 = new int[arr1.length + arr2.length];

        int i =0 ;
        int j=0 ;
        int k = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }else{
                arr3[k++]=arr2[j++];
            }
        }

        while(i<arr1.length){
            arr3[k++]=arr1[i++];
        }

        while(j<arr2.length){
            arr3[k++]=arr2[j++];
        }

        for(int q =0  ;q <arr3.length ; q++){
            System.out.print(arr3[q]+" ");
        }
    }
}