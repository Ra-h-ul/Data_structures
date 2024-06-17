/*
    Java StringBuilder class is used to create mutable (modifiable) String. The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized

    default capacity of string builder is 16
    key operations : append , insert , charAt , replace , delete , length , capacity , reverse , substring
 */
public class String_builder_intro {

    public static void main(String[] args) {

        // Initilization of string builder
        StringBuilder sb = new StringBuilder();  //empty string
        StringBuilder sc = new StringBuilder(100); //string builder with capacity 100
        StringBuilder sd = new StringBuilder("Rahul"); // string where sd = "Rahul"

        // adding elements
        sd.append(" pa");
        sd.append("ndita");  // here original string is modified
        System.out.println(sd);

        // inserting at certain index
        sd.insert(5," kumar");  
        System.out.println(sd);

        // getting specific character
        System.out.println(sd.charAt(0));

        //getting a substring
        System.out.println(sd.substring(1, 5));

        //replace
        sd.replace(5,11, " king"); // first delete element from index  5 to 11 then add king at index 5 
        System.out.println(sd); 
        sd.replace(5, 5, " King"); // deletes nothing then add king from index 5 
        System.out.println(sd);
        sd.replace(5, sd.length(), ""); // removes everything after index 5 
        System.out.println(sd);


        // delete
        System.out.println(sd.delete(1, 1));  // remove nothing since can not remove elements from 1,1-1 == 1,0
        System.out.println(sd.delete(1, 2));  // removes elements from 1 , 2-1
        System.out.println(sd.delete(1, sd.length())); // removes all elements after  0 index
        // works same as sd.replace(1,sd.length,"");

        // reverse a string
        sd.append("ahul");
        System.out.println(sd.reverse());


        //capacity and length
        StringBuilder sde = new StringBuilder(""); // Default capacity 16 
        sde.append("1234567812345678");
        System.out.println(sde.capacity()); // capacity remains same till 16
        sde.append(1);
        System.out.println(sde.capacity()); // after 16 capacity is filled new capacity(old capacity*2)+2 =34
        
        StringBuilder sdf=new StringBuilder("Rahul"); // newDefultCapacity = Default capacity + sdf length 
        System.out.println(sdf.capacity()); 
        
        
        System.out.println(sde.length()); // current length of the string




    }
}