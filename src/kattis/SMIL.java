package kattis;

import java.util.Scanner;

public class SMIL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int index = -1;

        // if char is : or ;, reset the index
        // if char is -, continue
        // if char is ), print the index, then reset

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ':' || input.charAt(i) == ';') {
                index = i;
            } else if (index != -1 && input.charAt(i) == '-') {
                continue;
            } else if (index != -1 && input.charAt(i) == ')') {
                System.out.println(index);
                index = -1;
            } else {
                index = -1;
            }
        }

        scanner.close();
    }
}
