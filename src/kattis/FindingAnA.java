package kattis;

import java.util.Scanner;

public class FindingAnA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();

        System.out.println(in.substring(in.indexOf("a")));
        scanner.close();
    }
}
