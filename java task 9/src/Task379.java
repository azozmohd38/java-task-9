public class Task379 {
    public static int length(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return 1 + length(str.substring(1));
    }

    public static void main(String[] args) {
        IO.println(length("hello")); // 5
    }
}
