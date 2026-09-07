public class Task383 {
    public static boolean isPalindrome(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        String middle = text.substring(1, text.length() - 1);
        return isPalindrome(middle);
    }

    private static void runExamples() {
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("a"));
    }

    public static void main(String[] args) {
        runExamples();
    }
}