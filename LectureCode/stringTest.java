package LectureCode;
public class stringTest {
    public static void main(String[] args) {
        char[] charArray = {'h', 'e', 'l', 'l', 'o'};
        myString myStr = new myString(charArray);
        System.out.println("Length of myString: " + myStr.length());
        System.out.println("Index of 'l': " + myStr.indexOf('l'));
        System.out.println("Index of 'z': " + myStr.indexOf('z'));
    }
}
