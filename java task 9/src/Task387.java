public class Task387 {

    public static int countVowels(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        char first = Character.toLowerCase(text.charAt(0));
        int current = 0;

        if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
            current = 1;
        }

        return current + countVowels(text.substring(1));
    }

    private static void runExamples() {
        System.out.println(countVowels("hello"));
        System.out.println(countVowels("programming"));
        System.out.println(countVowels("sky"));
        System.out.println(countVowels("aeiou"));
    }

    public static void main(String[] args) {
        runExamples();
    }
}
