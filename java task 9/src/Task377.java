public class Task377 {
    public static int countDigits(int number) {
        number = Math.abs(number);

        if (number < 10) {
            return 1;
        }
        return 1 + countDigits(number / 10);
    }

    public static void main(String[] args) {
        System.out.println(countDigits(1000));
    }
}
