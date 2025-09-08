package LectureCode;
import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to encode: ");
        String input = sc.next();

        String encoded = "";
        
        for(int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            int count = 1;

            while(i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
                i++;
            }
            encoded += Integer.toString(count) + current;

        }
        System.out.println("Encoded string: " + encoded);
    }
}