package kattis;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String questions = scanner.next();

        int totalQs = 0;

        String[] questionNums = questions.split(";");
        for (int i = 0; i < questionNums.length; i++) {
            if (questionNums[i].contains("-")) {
                String[] qRange = questionNums[i].split("-");
                totalQs += Integer.parseInt(qRange[1]) - Integer.parseInt(qRange[0]) + 1;
            } else {
                totalQs++;
            }
        }

        System.out.println(totalQs);
        scanner.close();
    }
}
