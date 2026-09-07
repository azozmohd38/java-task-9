public class Task381 {
    public static boolean isPowerOfTwo(int number) {
        if (number == 1) {
            return true;
        }
        if (number <= 0 || number % 2 != 0) {
            return false;
        }

        int smaller = number / 2;
        return isPowerOfTwo(smaller);
    }

    private static void runExamples() {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(6));
        System.out.println(isPowerOfTwo(20));
    }

    public static void main(String[] args) {
        runExamples();
    }
}
