package kattis;

import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] letters = scanner.nextLine().toCharArray();
        char current = letters[0];

        System.out.print(current);
        for (int i = 1; i < letters.length; i++) {
            if (current == letters[i]) {
                continue;
            }
            current = letters[i];
            System.out.print(current);
        }

        System.out.println();

        scanner.close();
    }
}
