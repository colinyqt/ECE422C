package assignment1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] words = s.split(" ");
        
        for(String word : words) {
            int price = 0;
            for(char c : word.toCharArray()) {
                if(Character.isLetter(c)) {
                    char low = Character.toLowerCase(c);
                    price += low - 'a' + 1;
                }
            }
            if (price == 100) {
                System.out.println(word);
            }
        }
        sc.close();
    }
}
