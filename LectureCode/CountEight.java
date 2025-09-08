package LectureCode;
public class CountEight {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0; i <= 100; i++) {
            String numStr = Integer.toString(i);
            for(char c : numStr.toCharArray()) {
                if(c == '8') {
                    count++;
                }
            }
        }
        System.out.println("The digit eight appears " + count + " times.");
    }
}

