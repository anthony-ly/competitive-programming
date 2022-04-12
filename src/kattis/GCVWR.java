package kattis;

import java.util.Scanner;

public class GCVWR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int G = scanner.nextInt();
        int T = scanner.nextInt();
        int N = scanner.nextInt();

        int towingCapacity = (int) ((G - T) * 0.9);
        int maxWeight = 0;

        for (int i = 0; i < N; i++) {
            maxWeight += scanner.nextInt();
        }

        System.out.println(towingCapacity - maxWeight);
        scanner.close();
    }
}
