public class Task377 {
    public static int countDigits(int n) {

        n = Math.abs(n);

        if (n < 10) {
            return 1;
        }
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        IO.println(countDigits(1000)); // 4
    }
}
