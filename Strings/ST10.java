// add binary strings
public class ST10 {

    public static String add(String str1 , String str2){
        StringBuilder st = new StringBuilder();
        int carry=0;
        int i = str1.length()-1;
        int j = str2.length()-1;
        while(i>=0 || j >=0 || carry>0){
            char a = (i>=0)?str1.charAt(i):'0';
            char b = (j>=0)?str2.charAt(j):'0';

            
            if(a=='1' && b=='1'){
                carry+=2;
            }else if(a=='0' && b=='0'){
                carry+=0;
            }else{
                carry+=1;
            }
            st.append(carry%2);
            carry=carry/2;
            i--;
            j--;
        }
        st.reverse();
        return st.toString();
    }

    public static void main(String[] args) {
        System.out.println(add("11000", "11"));
    }
}
