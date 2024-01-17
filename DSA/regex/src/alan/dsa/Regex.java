package alan.dsa;
import java.util.Scanner;
public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input string
        String input = scanner.nextLine().trim();

        // Split the string into tokens using the given regular expression
        String[] tokens = input.split("[A-Za-z !,?._'@]+");

        // Print the number of tokens
        System.out.println(tokens.length);

        // Print each token on a new line
        for (String token : tokens) {
            // Skip empty tokens
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }

        scanner.close();
    }
}
