public class Task375 {
    public static void countDownUp(int n) {
        if (n <= 0) {
            return;
        }
        IO.println(n);
        countDownUp(n - 1);
        if (n > 1) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        countDownUp(3);
    }
}