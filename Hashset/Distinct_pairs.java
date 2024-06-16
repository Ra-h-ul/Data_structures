/*
 given n distinct pairs from 1 to n in an unsorted order in a bag you can take 1 element from the bag and place it on the table 
 if a pairs is on the table you can remove those 2 elements from the table 
 if it is not you need to keep it on the table till you find it's pair 
 what are the max elements placed on the table at any given time

 */
import java.util.*;
public class Distinct_pairs {
    public static void main(String[] args) {
     HashSet<Integer> st = new HashSet<>();
     int arr[]={1,2,5,5,4,3,2,3,1,4};
     int len=0 ,  max_len=0;

     for(var v : arr)
     {
        if(st.contains(v))
        {
            st.remove(v);
            len--;
        }
        else{
            st.add(v);
            len++;
        }
        max_len=Math.max(len, max_len);
     }
     System.out.println(max_len);


    }
}
