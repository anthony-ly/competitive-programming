package kattis;

import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input:
        // L - lower bounds
        // D - upper bounds
        // X - target
        int L = scanner.nextInt();
        int D = scanner.nextInt();
        int X = scanner.nextInt();

        int num = L;

        // find min
        while (num <= D) {
            if (digitSum(num) == X) {
                System.out.println(num);
                break;
            }
            num++;
        }

        // find max
        num = D;
        while (num >= L) {
            if (digitSum(num) == X) {
                System.out.println(num);
                break;
            }
            num--;
        }
        scanner.close();
    }

    public static int digitSum(int num) {
        int total = 0;
        while (num != 0) {
            total += num % 10;
            num /= 10;
        }

        return total;
    }
}
