package kattis;

import java.util.Scanner;

public class TransitWoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // s - time left the house
        // t - time first class starts
        // n - number of transit routes
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int n = scanner.nextInt();

        scanner.nextLine();

        // d - time to walk from one transit route to another (or between stops and home
        // and class)
        // b - time on bus
        // c - bus comes at intervals of c
        String[] d = scanner.nextLine().split(" ");
        String[] b = scanner.nextLine().split(" ");
        String[] c = scanner.nextLine().split(" ");

        int[] intD = toIntArr(d);
        int[] intB = toIntArr(b);
        int[] intC = toIntArr(c);

        int tripTime = s; // equal to time left house + first trip to stop
        for (int i = 0; i < n; i++) {
            // find next multiple in interval
            tripTime += intD[i];

            // calculate the next interval
            if ((nextMultiple(tripTime, intC[i]) - tripTime) % intC[i] != 0) {
                tripTime += nextMultiple(tripTime, intC[i]) - tripTime;
            }

            tripTime += intB[i];
        }

        tripTime += intD[n];

        if (tripTime <= t) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        scanner.close();
    }

    public static int[] toIntArr(String[] s) {
        int[] ints = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            ints[i] = Integer.parseInt(s[i]);
        }
        return ints;
    }

    public static int nextMultiple(int n, int a) {
        return n + (a - n % a);
    }
}
