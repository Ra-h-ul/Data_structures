/*
 given an unsorted array find the longest squence of elements
 eg:1,2,100,4,3,199,101,0,200  : 0,1,2,3,4  100,101  199,200   : longest sequence
 TC ~ O(N)
 */
import java.util.*;
public class Longest_sequence {
    public static void main(String[] args) {
        
        Set<Integer> st = new HashSet<>();
        int arr[]={1,2,100,4,3,199,101,0,200};
        int len=0 ; int max_len=1;


        for(var v : arr){
            st.add(v);
        }

        for(var v : arr)
        {
            if(!st.contains(v-1))
            {
                int num=v;
                len=1;

                while(st.contains(num+1))
                {
                    num++;
                    len++;
                }
            }

            max_len=Math.max(len,max_len);
        }

        System.out.println(max_len);
       
    }
}
