public class Task378 {
    public static int multiply(int first, int second) {
        if (second == 0) {
            return 0;
        }
        int rest = multiply(first, second - 1);
        return first + rest;
    }

    private static void runExamples() {
        System.out.println(multiply(3, 4));
        System.out.println(multiply(5, 2));
        System.out.println(multiply(0, 9));
        System.out.println(multiply(6, 1));
    }

    public static void main(String[] args) {
        runExamples();
    }
}