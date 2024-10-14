
// find nth node from the end in inbuild java ll
import java.util.*;

public class LL1 {


    

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.get(1));
        
        System.out.println(list.get(list.size()-6));
        // 0-1-2-3-4-5
        // find 2nd node from the end
    }
}
