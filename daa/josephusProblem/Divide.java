package josephusProblem;

import java.util.*;

class Divide {
    static void Josh(List<Integer> person, int k, int index) {
        if (person.size() == 1) {
            System.out.println(person.get(0));
            return;
        }
        index = ((index + k) % person.size());
        person.remove(index);
        Josh(person, k, index);
    }

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the total number of people: ");
        int n = inputScanner.nextInt();
        System.out.print("Enter the Kill Index ");
        int k = inputScanner.nextInt();

        k--;
        int index = 0;

        List<Integer> person = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            person.add(i);
        }

        Josh(person, k, index);

        inputScanner.close();
    }
}
