import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int inputNums = scanner.nextInt();
        int output = 0;
        for (int i = 0; i < inputNums; i++) {
            output += scanner.nextInt();
        }
        System.out.println(output);
        scanner.close();
    }
}
