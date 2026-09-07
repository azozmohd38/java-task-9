public class Task380 {
    public static int sumDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) + sumDigits(number / 10);
    }

    public static void main(String[] args) {
       IO.println(sumDigits(4021));
    }
}
