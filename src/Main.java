import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> outcomes = new HashMap<Integer, Integer>(); // HashMap storing outcomes
        int d1 = scanner.nextInt(); // Dice 1
        int d2 = scanner.nextInt(); // Dice 2

        for (int i = 1; i <= d1; i++) { // Dice 1 Loop
            for (int j = 1; j <= d2; j++) { // Dice 2 Loop
                int value = 1;
                if (outcomes.containsKey(i+j)) { // Check if the outcome already exists in HashMap
                    value = outcomes.get(i+j) + 1; // Increment by 1
                }
                outcomes.put(i+j, value); // Place outcome in the HashMap
            }
        }
        int max = Collections.max(outcomes.values()); // Find max value in outcomes
        
        outcomes.entrySet().forEach(entry -> { // Lambda for printing out max outcome values
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        });
        
        scanner.close();
    }
}
