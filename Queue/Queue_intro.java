import java.util.*;
public class Queue_intro{
    public static void main(String[] args){
        
        // intilization of queue
        Queue<Integer> qu = new LinkedList<>();
        Queue<Character> que = new ArrayDeque<>(); 
    
    
        // add elements
        System.out.println( qu.add(1));  // returns true
        qu.add(2);
        qu.add(3);


        //peek
        System.out.println(qu.peek()); // returns the element which is added first in the queue
        

        // remove elements
        System.out.println(qu.remove());  // return removed element
        qu.remove();
        qu.remove();
     


        qu.add(1);
        qu.add(3);

        //size
        System.out.println(qu.size());  //return length

        // is empty or not
        System.out.println(qu.isEmpty());  // returns true if empty

        // if queue contains an element or not
        System.out.println(qu.contains(1)); //return true
        System.out.println(qu.contains(2)); //return false


        // if two queues are equal or not
        System.out.println(qu.equals(qu)); // return true
        System.out.println(qu.equals(que)); // return false


        


    
    }

    
}