/*
 Toggle given string RaHul -> rAhUL
 Rahul !#@! Pandita -> rAHUL !#@! pANDITA

 */
import java.util.*;

public class Toggle_character {
    
    public static StringBuilder ToggleCharacter(StringBuilder S)
        {
            StringBuilder sb = new StringBuilder();
            for(int i =0 ; i<S.length() ; i++)
            {
                char ch = S.charAt(i);
                int Ascii = (int)ch;

                if(Ascii>96 && Ascii<=122)
                {
                    Ascii-=32;
                }
                else if(Ascii>64 && Ascii<=90)
                {
                    Ascii+=32;
                }
                char cx = (char)Ascii;
                sb.append(cx);

            }
            return sb;
        }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.nextLine());
        System.out.println(ToggleCharacter(S));

    }   
}
