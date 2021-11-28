import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int hands = scanner.nextInt();
        String suit = scanner.next();
        int output = 0;

        for (int i = 0; i < 4*hands; i++) {
            String card = scanner.next();
            
            if (card.substring(1).equals(suit)) {
                if (card.substring(0,1).equals("J")) {
                    output += 20;
                    continue;  
                } 
                if (card.substring(0,1).equals("9")) {
                    output += 14;
                    continue;
                }
            }

            if (card.substring(0,1).equals("A")) output += 11;
            if (card.substring(0,1).equals("K")) output += 4;
            if (card.substring(0,1).equals("Q")) output += 3;
            if (card.substring(0,1).equals("J")) output += 2;
            if (card.substring(0,1).equals("T")) output += 10;
        }
        System.out.println(output);
        scanner.close();
    }
}
