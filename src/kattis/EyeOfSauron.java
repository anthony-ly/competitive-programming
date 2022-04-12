package kattis;

import java.util.Scanner;

public class EyeOfSauron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sauron = scanner.next();

        // System.out.println(sauron.indexOf("()"));
        // System.out.println(sauron.length());
        if (sauron.length() % 2 == 0 && sauron.indexOf("()") + 1 == sauron.length() / 2) {
            System.out.println("correct");
        } else {
            System.out.println("fix");
        }

        scanner.close();
    }
}
