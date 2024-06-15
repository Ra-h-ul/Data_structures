package josephusProblem;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedL {
    public static int josephus(int n, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int index = 0;
        while (list.size() > 1) {
            index = (index + k - 1) % list.size();
            list.remove(index);
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people (n): ");
        int n = scanner.nextInt();
       
        System.out.print("Enter the number of people (n): "); 
        int k = scanner.nextInt();

        int survivor = josephus(n, k);
        
        System.out.println("The survivor is at position: " + survivor);
        scanner.close();
    }
}