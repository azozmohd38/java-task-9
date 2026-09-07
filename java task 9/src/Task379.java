public class Task379 {
    public static int length(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        String rest = text.substring(1);
        return 1 + length(rest);
    }

    private static void runExamples() {
        System.out.println(length("cat"));
        System.out.println(length("hello"));
        System.out.println(length(""));
        System.out.println(length("a"));
    }

    public static void main(String[] args) {
        runExamples();
    }
}
