public class Task380 {
    public static int sumDigits(int number) {
        if (number == 0) {
            return 0;
        }
        int lastDigit = number % 10;
        return lastDigit + sumDigits(number / 10);
    }

    private static void runExamples() {
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(999));
        System.out.println(sumDigits(4021));
    }

    public static void main(String[] args) {
        runExamples();
    }
}
