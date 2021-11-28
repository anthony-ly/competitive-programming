import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new StringBuilder(scanner.next()).reverse().toString());
        scanner.close();
    }
}
