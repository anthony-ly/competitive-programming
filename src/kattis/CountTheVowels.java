package kattis;

import java.util.Scanner;

public class CountTheVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] letters = scanner.nextLine().toCharArray();
        int counter = 0;

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a' || letters[i] == 'A'
                    || letters[i] == 'e' || letters[i] == 'E'
                    || letters[i] == 'i' || letters[i] == 'I'
                    || letters[i] == 'o' || letters[i] == 'O'
                    || letters[i] == 'u' || letters[i] == 'U') {
                counter++;
            }
        }

        System.out.println(counter);

        scanner.close();
    }
}
