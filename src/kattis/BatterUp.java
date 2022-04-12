package kattis;

import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int bats = scanner.nextInt();
        int sum = 0;
        int nSum = 0;

        for (int i = 0; i < bats; i++) {
            int bases = scanner.nextInt();
            if (bases == -1) {
                nSum += 1;
                continue;
            }
            sum += bases;
        }

        System.out.println((double) sum / (bats - nSum));
        scanner.close();
    }
}
