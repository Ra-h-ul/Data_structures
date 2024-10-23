// reverse a string
public class ST1 {

    public static String reverse(String str){
        StringBuilder st = new StringBuilder();
        for(int i = str.length()-1 ; i>=0 ; i--){
            st.append(str.charAt(i));
        }
        String stx = st.toString();
        return stx;

    }

    public static void main(String[] args) {
        String str = "RAHUL";
        System.out.println(str);
        str = reverse(str);
        System.out.println(str);
    }
}
