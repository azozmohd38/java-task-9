public class Task384 {
    public static int countChar(String str, char ch) {
        if (str.isEmpty()) {
            return 0;
        }
        int match = (str.charAt(0) == ch) ? 1 : 0;
        return match + countChar(str.substring(1), ch);
    }

    public static void main(String[] args) {
        IO.println(countChar("banana", 'a'));
    }
}
