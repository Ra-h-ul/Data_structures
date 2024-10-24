// compress string
public class ST9 {

    public static String code(String str){
        StringBuilder st = new StringBuilder();
        if(str.length()==0) return st.toString();
        
        int count =1;
        st.append(str.charAt(0));
        for(int i =1 ; i<str.length() ; i++){
            if(str.charAt(i)==str.charAt(i-1)) count++;
            else{
                if(count>1) st.append(count);
                st.append(str.charAt(i));
                count=1;
            }
        }
        if(count>1) st.append(count);
        return st.toString();
    } 
    public static void main(String[] args) {
        String str = "rraahuuullxx";
        System.out.println(code(str));
    }
}
