import java.util.HashMap;
import java.util.HashSet;

public class ST16 {
    
    public static boolean isomorphic(String str1 , String str2){
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            char d = str2.charAt(i);

            if (!map.containsKey(c)) {
                if (set.contains(d)) return false;
                map.put(c, d);
                set.add(d);
            } else {
                if (!map.get(c).equals(d)) {
                    return false;
                }
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        String str1 = "xxaa";
        String str2 = "yyzy";
        System.out.println(isomorphic(str1, str2)); 
    }
}
