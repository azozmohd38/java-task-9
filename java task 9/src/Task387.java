public class Task387 {

    public static int countVowels(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        return countVowels(text.substring(1));
    }
}
