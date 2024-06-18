/*
    Strings are basically character array
 */
import java.util.*;
public class String_intro {
    public static void main(String[] args) {
        
        // how to initilize a string
        String str = "Rahul";
        System.out.println(str);
        

        //How to take input
        Scanner sc = new Scanner(System.in);

        // if you give "rahul pandita " it will only read "rahul"
        //      String stx = sc.next() ;
        //      System.out.println(stx);


        // if you give "rahul pandita" it will read rahul pandita
        //      String stz=sc.nextLine();
        //      System.out.println(stz);


        //how to get a char out of string
        System.out.println(str.charAt(1));
        

        // how to calculate length of the string
        System.out.println(str.length());   // in array we use str.length

        // get index of a character
        System.out.println(str.indexOf('a')); // returns first index of character
        
        // compare two strings
        String stx = "Rahul";
        String stz = "xn";

        System.out.println(str.compareTo(stx));  // returns 0  if s1==s2
        System.out.println(stz.compareTo(stx));  // returns >0 if s1>s2 lexographically (ascii value of s1[i]>s2[i]) i= first index where s1[i]!=s2[i]  
        System.out.println(stx.compareTo(stz));  // returns <0 if s1<s2 lexographicaly (ascii value of s1[i]<s2[i])
        
        // number returned above is s1[i]-s2[i] where i= first index where s1[i]!=s2[i]
        

        // check if a string contains a certain string (not character)
        System.out.println("rahul".contains("rah"));  // returns true
        System.out.println("pan".contains("ra")); // returns false


        // check if a string starts with certain string (not character)
        System.out.println("rahul".startsWith("ra"));
        System.out.println("pand".startsWith("paa"));


        // check if a string ends with certain string (not character)
        System.out.println("rahul".endsWith("ul"));
        System.out.println("rahul".endsWith("uul"));


        
        // conver to lower case and uppercase
        String  a = "raHUl";
        System.out.println(a.toLowerCase());
        System.out.println(a);  // original string remains unchanged
        
        System.out.println("RahuL".toUpperCase());



        //concat a string
        System.out.println("Rahul".concat(" Pandita")); // way 1 1 
        
        System.out.println("Rahul" + "Pandita");  // way 2 
        System.out.println("rahul" + 10 + 20);
        System.out.println("rahul" + (10+20));

        String b = "Rahul";  // way 3 (string is still immutable we are just making a new string and pointing b to the new string)
        b = b+ " pan" ;  
        System.out.println(b);
        b+=1;
        System.out.println(b);

        // Since Strings are immutable in nature toLowerCase , toUpperCase , concat won't change the original string


        // get desired substring from a string substring 
        System.out.println("Rahul".substring(0)); // starts from 0 index to n 
        System.out.println("Rahul".substring(1)); // starts from 1 to n 
        System.out.println("Rahul".substring(3)); // starts from 3 to n
        System.out.println("Rahul".substring(2,5)); // starts from 2 to 5-1
        System.out.println("Rahul".substring(0,0)); // prints nothing
        

        
        
/*
    Interning of String in Java :String Interning is a method of storing only one copy of each distinct String Value, which must be immutable. Applying String.intern() on a couple of strings will ensure that all strings having the same contents share the same memory.
    
    String str = "Hello";
    String gtr = "Hello";
    str==gtr

    only one Hello will be created and is stored into interning pool / string pool with an address and str and gtr both will be  pointing to the same adress of Hello

    str and gtr-> stack(address) -> heap(Hello , address)

    To avoid interning we can use new keyword to create two different String objects
    String se = new String("Kid");
    String sf = new String("Kid");
    se==sf

    se and sf will be stored as 2 different strings with different address
*/
        String see = "Kid";
        String sff = "Kid";
        System.out.println(see==sff); // return true (since address is same)

        String se = new String("Kid");
        String sf = new String("Kid");
        System.out.println(se==sf); // returns false  (since address is not same)


    // how to check for equality in strings

    // == operator  and .equals method

    System.out.println(se==sf);   // it will return false since  == is checking for address which is different for se and sf
    System.out.println(se.equals(sf));  // it will return true because se.equals(sf) will first check if address is same if not then it will check weather se and sf have same characters



        


        sc.close();
    }
}
