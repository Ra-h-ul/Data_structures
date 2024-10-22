// pascal triangle variation 1 , variation 2 , variation 3 
// naive approach
public class AR19 {

    // give ans for specific row and coln
    public static void pascal1(int row , int col){
        int res =1;
        for(int i=0 ; i<col ; i++){
            res*=row-i;
            res/=i+1;
        }
        System.out.print(res+" ");
    }

    // prints whole row
    public static void pascal2(int n){
        for(int i=0 ; i<=n ; i++){
            pascal1(n, i);    
        }
    }

    // prints whole triangle
    public static void pascal3(int n){
        for(int i =0  ; i<n ; i++){
            pascal2(i);
            System.out.println();
        }
    }



    public static void main(String[] args) {
        pascal3(4);
    }
}
