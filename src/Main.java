import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        String output = "";
        for (int i = 0; i < inputNum; i++) {
            String input = scanner.next();
            if (i % 2 != 1) {
                output += input +"\n";
            }
        }
        System.out.println(output);
        scanner.close();
    }
}
