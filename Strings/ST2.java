// reverse words in a sentence
public class ST2 {

    public static String reverse(String str) {
        StringBuilder sx = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                sx.reverse();
                ans.append(sx);
                ans.append(" ");
                sx.delete(0, sx.length());
            } else {
                sx.append(c);
            }
        }
        sx.reverse();
        ans.append(sx);
        ans.append(" ");
        

        return ans.toString();

    }

    public static void main(String[] args) {
        String str = "THIS IS A JAVA CODE";
        System.out.println(str);
        str= reverse(str);
        System.out.println(str);
    }
}
