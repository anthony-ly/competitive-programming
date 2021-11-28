import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        if (date.equals("OCT 31") || date.equals("DEC 25")) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
        scanner.close();
    }
}
