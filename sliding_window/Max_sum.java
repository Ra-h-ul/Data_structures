

public class Max_sum{
    public static void main(String[] args) {
        int cnt=0;
        int arr[] = {0,1,2,10,100,20,10,5,8};
        int k = 4 ;
        int lsum =0, rsum =0, maxsum=0;
        int LIndex=arr.length-1;
        int RINdex=arr.length-1;

        for(int i=0 ; i<k;i++)
        {
            lsum+=arr[i];
        }
        maxsum=lsum;

        for(int  i = k-1 ; i>=0 ; i--)
        {
            lsum-=arr[i];
            rsum+=arr[RINdex];
            RINdex--;
            
            if(lsum+rsum>maxsum) maxsum=lsum+rsum;
        }
             
        while(RINdex>=0)
        {
            lsum-=arr[LIndex--];
            rsum+=arr[RINdex--];
           
            if(lsum+rsum>maxsum) maxsum=lsum+rsum;
        }

        System.out.println(maxsum);
    }
}