public class Task378 {
    public static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + multiply(a, b - 1);
    }

    public static void main(String[] args) {
        IO.println(multiply(3, 4));
    }
}