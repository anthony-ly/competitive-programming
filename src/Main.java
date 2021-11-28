import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int articles = scanner.nextInt();
        int impact = scanner.nextInt();
        System.out.println((articles*impact)-articles+1);
        scanner.close();
    }
}
