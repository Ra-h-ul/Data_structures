//Integer to roman

/*
I->1
V->5
X->10
L->50
C->100
D->500
M->1000
*/

public class ST6 {
    
    public static String integer_to_roman(int num){
        StringBuilder sb = new StringBuilder();
        
       
            if(num>=1000){
                sb.append('M');
                sb.append(integer_to_roman(num-1000));
            }else if(num>=900){
                sb.append("CM");
                sb.append(integer_to_roman(num-900));
            }else if(num>=500){
                sb.append('D');
                sb.append(integer_to_roman(num-500));
            }else if(num>=400){
                sb.append("CD");
                sb.append(integer_to_roman(num-400));
            }else if(num>=100){
                sb.append('C');
                sb.append(integer_to_roman(num-100));
            }else if(num>=90){
                sb.append("XC");
                sb.append(integer_to_roman(num-90));
            }else if(num>=50){
                sb.append('L');
                sb.append(integer_to_roman(num-50));
            }else if(num>=40){
                sb.append("XL");
                sb.append(integer_to_roman(num-40));
            }else if(num>=10){
                sb.append('X');
                sb.append(integer_to_roman(num-10));
            }else if(num>=9){
                sb.append("IX");
                sb.append(integer_to_roman(num-9));
            }else if(num>=5){
                sb.append('V');
                sb.append(integer_to_roman(num-5));
            }else if(num>=4){
                sb.append("IV");
                sb.append(integer_to_roman(num-4));
            }else if(num>=1){
                sb.append('I');
                sb.append(integer_to_roman(num-1));
            }
            

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(integer_to_roman(9801));
    }
}
