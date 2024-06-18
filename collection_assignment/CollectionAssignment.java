package collectionAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionAssignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] scoresArray = new int[n];

        System.out.println("Enter " + n + "Marks (separated by space):");
        for (int i = 0; i < n; i++) {
            scoresArray[i] = scanner.nextInt();
        }

        ArrayList<Integer> scoresList = new ArrayList<>();
        for (int score : scoresArray) {
            scoresList.add(score);
        }

        System.out.println("Marks in the ArrayList:");
        for (int score : scoresList) {
            System.out.println(score);
        }

        scanner.close();

    }

}
