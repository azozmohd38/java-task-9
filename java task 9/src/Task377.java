public class Task377 {
    public static int countDigits(int number) {
        number = Math.abs(number);

        if (number < 10) {
            return 1;
        }
        int smaller = number / 10;
        return 1 + countDigits(smaller);
    }

    private static void runExamples() {
        System.out.println(countDigits(7));
        System.out.println(countDigits(45));
        System.out.println(countDigits(1000));
        System.out.println(countDigits(999999));
    }

    public static void main(String[] args) {
        runExamples();
    }
}
