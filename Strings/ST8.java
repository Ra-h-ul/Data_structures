// merge string alternatively
public class ST8 {

    public static String merge(String str1, String str2) {
        StringBuilder st = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < str1.length() && j < str2.length()) {
            st.append(str1.charAt(i));
            st.append(str2.charAt(j));
            i++;
            j++;
        }

        while (i < str1.length()) {
            st.append(str1.charAt(i));
            i++;
        }

        while (j < str2.length()) {
            st.append(str2.charAt(j));
            j++;
        }

        return st.toString();

    }

    public static void main(String[] args) {
        String str1 = "rahul";
        String str2 = "pandita";
        String str = merge(str1, str2);
        System.out.println(str);
    }
}
