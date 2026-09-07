public class Task378 {
    public static int multiply(int first, int second) {
        if (second == 0) {
            return 0;
        }
        return first + multiply(first, second - 1);
    }

    public static void main(String[] args) {
        IO.println(multiply(3, 4));
    }
}