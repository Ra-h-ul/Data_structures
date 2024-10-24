// common prefix among strings 
public class ST17 {
   
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        String prefix = strs[0];  // Start with the first string
        
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {  // Check if the current prefix is found in each string
                System.out.println(strs[i].indexOf(prefix) );
                prefix = prefix.substring(0, prefix.length() - 1);  // Reduce the prefix by one character
                if (prefix.isEmpty()) return "";  // If no common prefix, return an empty string
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs));
    }
}
