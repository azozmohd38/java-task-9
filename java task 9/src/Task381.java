public class Task381 {
    public static boolean isPowerOfTwo(int number) {
        if (number == 1) {
            return true;
        }
        if (number <= 0 || number % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(number / 2);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(20));
    }
}
