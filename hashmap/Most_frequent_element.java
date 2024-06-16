import java.util.*;

public class Most_frequent_element {
    public static void main(String[] args) {
    int max= 0 , key = 0 , value=0 ;
    Map<Integer,Integer> mp = new HashMap<>();
    int arr[] = {1,1,3,3,2,2,3};

    for(int i=0 ; i<arr.length ; i++)
    {
        
        if(mp.containsKey(arr[i])) mp.put(arr[i], mp.get(arr[i])+1 );     
        else mp.put(arr[i],1);
        
        if(max<mp.get(arr[i])){
            max=mp.get(arr[i]);
            key=arr[i];
            
        }
    }

    System.out.println(mp.entrySet());
    System.out.println(key);
}


    }
   
