package kattis;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();
        int columns = scanner.nextInt();
        int classes = scanner.nextInt();
        String uniqueClass = "";
        String leader = "";
        String[] assembly = new String[lines];

        for (int i = 0; i < classes; i++) {
            uniqueClass += Character.toString((char) 65 + i);
        }

        for (int i = 0; i < lines; i++) {
            assembly[i] = scanner.next();
        }

        /**
         * if the letter exists in uniqueclass and not in leaders
         * add it to leaders
         * so now even if a child is a leader, leader will already have saved its value
         */
        for (int c = 0; c < columns; c++) { // loop through the columns
            // add unique colour leader
            if (uniqueClass.contains(assembly[0].substring(c, c + 1))
                    && !leader.contains(assembly[0].substring(c, c + 1))) {
                leader += assembly[0].substring(c, c + 1);
            }
            for (int r = 1; r < lines; r++) { // loop through the lines
                String current = assembly[r].substring(c, c + 1);
                if (uniqueClass.contains(current)) {
                    uniqueClass = uniqueClass.replace(current, "");
                }
            }
        }

        System.out.println(leader.length());
        scanner.close();
    }
}

/**
 * 
 */