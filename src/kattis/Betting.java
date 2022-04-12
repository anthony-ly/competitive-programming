package kattis;

import java.util.Scanner;

public class Betting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int switchPointsA = scanner.nextInt();
        int switchPointsB = 100 - switchPointsA;

        System.out.println((float) 100 / switchPointsA);
        System.out.println((float) 100 / switchPointsB);

        scanner.close();
    }

}