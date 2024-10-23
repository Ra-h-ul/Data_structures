// reverse vowels
public class ST7 {

    public static String reverse(String str){
        StringBuilder st = new StringBuilder(str);

        int i = 0 ;
        int j=st.length()-1;
        while(i<j){
            // System.out.println(st.charAt(i));
            // System.out.println(st.charAt(j));
            while(i<st.length()){
                if(st.charAt(i)!='a' && st.charAt(i)!='e' && st.charAt(i)!='i' && st.charAt(i)!='o' && st.charAt(i)!='u')i++;
                else break;
            }
            while(j>=0 ){
                if((st.charAt(j)!='a' && st.charAt(j)!='e' && st.charAt(j)!='i' && st.charAt(j)!='o' && st.charAt(j)!='u'))j--;
                else break;
            }

            if(i<j ){
                System.out.println(st.charAt(i)+" "+st.charAt(j) );
                char a = st.charAt(i);
                st.setCharAt(i, st.charAt(j));
                st.setCharAt(j, a);
                i++;
                j--;
            }
            
        }
        
        return st.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("rahul"));
    }   
}
