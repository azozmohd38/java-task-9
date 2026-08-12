public class task376 {

    public static void main(String[] args) {
        countDownUp(3);
    }

    // Count Down and Count Up
    public static void countDownUp(int n) {
        if (n <= 0) {
            return;
        }

        IO.println(n);
        countDownUp(n - 1);
        IO.println(n);
    }
}