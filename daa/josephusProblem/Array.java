package josephusProblem;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the total number of people: ");
        int totalPeople = inputScanner.nextInt();
        System.out.print("Enter the Kill Index ");
        int killIndex = inputScanner.nextInt();

        int[] peopleArray = new int[totalPeople];
        for (int i = 0; i < totalPeople; i++) {
            peopleArray[i] = 1;
        }

        int aliveCount = totalPeople;
        int counter = 0;
        int currentIndex = 0;
        while (aliveCount > 1) {
            if (peopleArray[currentIndex] == 1) {
                counter++;
            }
            if (counter == killIndex) {
                peopleArray[currentIndex] = 0;
                aliveCount--;
                counter = 0;
                for (int m = 0; m < totalPeople; m++) {
                    System.out.print(" " + peopleArray[m]);
                }
                System.out.println();
            }
            currentIndex++;
            if (currentIndex == totalPeople) {
                currentIndex = 0;
            }
        }

        for (int m = 0; m < totalPeople; m++) {
            if (peopleArray[m] == 1) {
                System.out.println("\nThe final person remaining: " + (m + 1));
            }
        }
        inputScanner.close();
    }
}