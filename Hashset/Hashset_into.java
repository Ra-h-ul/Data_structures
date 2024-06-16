
import java.util.HashSet;
import java.util.Set;

/*
  similar to hashmap but instead of storing key value pairs we only store a single key 

  Hashset implements Set interface in java
  Hashset stores elemnts in unordered fashion 
  hashset only stores unique elements

  Set interface is implemented by 2 classes
  and 1 interface
  
    1.Hashset: above explained 

    2.LinkedHashset:
        order of insertion is maintained
        Linkedlist + hashtable
  
    3.Sorted Set: is  an interface which is implemented by Treeset 
        It has sorted order of insertion
        self balancing Bst
        red black tree

 */


public class Hashset_into {

    public static void main(String[] args) {
    
    // initilization
    Set<Integer> st = new HashSet<>();
    HashSet<Character> sx = new HashSet<>();
    

    // how to add elements
    System.out.println(st.add(1)); // if can be added return true
    System.out.println(st.add(1)); // if can't be added returns false
    
    st.add(2);
    st.add(3);
    sx.add('A');

    //check the size of the hashset
    System.out.println(st.size()); //returns size


    // how to remove an element 
    System.out.println(st.remove(3)); // if can be removed returns true
    System.out.println(st.remove(3)); // if can't be removed returns false
    

    //if hashset contains certain element
    System.out.println(st.contains(1)); // if is present returns true
    System.out.println(st.contains(3)); // if it is not present returns false


    // if hashset is empty
    System.out.println(st.isEmpty());  // if is empty=true vice versa
    

    // check if two hashsets are equal
    System.out.println(st.equals(sx)); // if is not then return false and vice versa

    //print all elements of hashset
    System.out.println(st);
    

    //how to traverse elements in hashset

     for(Integer S : st){
        System.out.print(S + " ");
        }
    
    System.out.println();

    for(var v : st){
        System.out.print(v + " ");
    }    

    System.out.println();

   


    }
    
}