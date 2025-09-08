package assignment1;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();

        int maxProduct = 0;

        for (int i = 0; i <= s.length() - n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                int digit = Integer.parseInt(String.valueOf(s.charAt(i + j)));
                if (digit == 0) {
                    product = 0;
                    break;
                }
                product *= digit;
            }
            if (product > maxProduct) {
                maxProduct = product;
            }
        }
        System.out.println(maxProduct);
        scanner.close();
    }
}
