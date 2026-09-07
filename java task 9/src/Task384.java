public class Task384 {
    public static int countChar(String text, char letter) {
        if (text.isEmpty()) {
            return 0;
        }
        int match = (text.charAt(0) == letter) ? 1 : 0;
        return match + countChar(text.substring(1), letter);
    }

    private static void runExamples() {
        System.out.println(countChar("banana", 'a'));
        System.out.println(countChar("hello", 'l'));
        System.out.println(countChar("apple", 'z'));
        System.out.println(countChar("mississippi", 's'));
    }

    public static void main(String[] args) {
        runExamples();
    }
}
