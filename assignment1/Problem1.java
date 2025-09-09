/* Student Name: Colin Tan, Lab Section: 18535 #> */
package assignment1;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume the newline after the number
        String s = sc.nextLine(); // read the entire line containing the digits

        int maxProduct = 0;

        // Check all possible subsequence lengths from 1 to n
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= s.length() - len; i++) {
                int product = 1;
                for (int j = 0; j < len; j++) {
                    int digit = Integer.parseInt(String.valueOf(s.charAt(i + j)));
                    product *= digit;
                }
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        System.out.println(maxProduct);
        sc.close();
    }
}
