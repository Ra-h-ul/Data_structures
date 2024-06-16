/*
used to store key value pairs (mapping)
Hashmap can't hava duplicates key 
Hashmap can also store null as a key once and null as a value multiple times
To access an element in hashmap one must know it's key 
In java insertion in hashmap has no order 
eg : <items,frequency> <items , index>
searching , insertion , seletion , contains is done in constant time O(1)


hashmap , linkedHashmap and sortedmap implements map interface in collection framework of java

hashmap has unordered insertion  and uses Hashtable
linkedHashmap has ordered insertion and uses linkedList + hashtable

hasmap has best performance as compared to other 2 

Applications :
mapping problems , frequency problems , storage optimization  , dictionary , phonebook 
*/

import java.util.*;

public class Hashmap_intro {
    public static void main(String[] args) {
    // implementation of Hashmap using collection framework
    // we write map then HashMap beacuse Map is a interface and HashMap is a class which implements this interface 
    // also we can not make an object of an interface  

    Map<String, Integer> mp = new HashMap<>();

    // Adding elements
    mp.put("Rahul", 21);
    mp.put("pandita", 22);

    // getting value of any key
    System.out.println(mp.get("Rahul")); // returns value 21 
    System.out.println(mp.get("rahul")); // return null 

    //updation
    mp.put("Rahul", 69);
    System.out.println(mp.get("Rahul"));
    

    // removing a key 
    System.out.println(mp.remove("Rahul")); //return key 
    // removing a key which does not exist 
    System.out.println(mp.remove("Rahul")); // return null


    //checking if  a key is in the hashmap
    
    // if it does not exists
    System.out.println(mp.containsKey("Rahul")); // return false
    // if it exists
    System.out.println(mp.containsKey("pandita")); //returns true


    // check if it contains this value or not
    System.out.println(mp.containsValue(21));
    
    //Adding new element if it does not exist
    mp.putIfAbsent("Rahul", 12);  // returns false 
    mp.putIfAbsent("notRahul",11);  // returns true

    // get all value in the hashmap
    System.out.println(mp.keySet()); // print all keys
    System.out.println(mp.values()); // print all values
    System.out.println(mp.entrySet()); // print all key value pairs
    
    // Traversing all entries in the hashmap

    for(String key : mp.keySet()){
        System.out.print(mp.get(key) + " ");
    }
    
    System.out.println();

    for(Integer entries : mp.values()){
        System.out.print(entries + " ");
    }

    System.out.println();

    for( Map.Entry<String,Integer> e : mp.entrySet()){
        System.out.print(e.getKey() + " " + e.getValue() + " ");
    }
    System.out.println();


    // Traversing all entries in the hashmap (java updated veresion)

    for(var e : mp.entrySet()){
        System.out.print(e.getKey() + " " + e.getValue() + " " );
    }
    System.out.println();

    for(var e : mp.keySet()){
        System.out.print(e+ " ");
    }
    System.out.println();

    for(var  e : mp.values()){
        System.out.print(e + " ");
    }
}
}
