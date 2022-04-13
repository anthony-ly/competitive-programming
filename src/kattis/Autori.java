package kattis;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] initials = scanner.next().split("-");

        for (int i = 0; i < initials.length; i++) {
            System.out.print(initials[i].substring(0, 1));
        }
        System.out.println("");
        scanner.close();
    }
}
