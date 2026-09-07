public class Task379 {
    public static int length(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        return 1 + length(text.substring(1));
    }

    public static void main(String[] args) {
        IO.println(length("hello"));
    }
}
