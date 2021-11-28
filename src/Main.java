import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.substring(0,3).equals("555")) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        scanner.close();
    }
}
