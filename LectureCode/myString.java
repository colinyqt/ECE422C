package LectureCode;
public class myString {
    char[] chars;
    public myString(char[] chars) {
        this.chars = chars;
    }

    public int length() {
        return chars.length;
    }

    public int indexOf(char c) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                return i;
            }
        }
        return -1; // Character not found
    }
}

