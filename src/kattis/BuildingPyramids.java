package kattis;

import java.util.Scanner;

public class BuildingPyramids {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int blocks = scanner.nextInt();

        int i = 1;
        int levels = 0;
        while (blocks - i * i >= 0) {
            blocks -= i * i;
            i += 2;
            levels++;
        }

        System.out.println(levels);

        scanner.close();
    }
}
