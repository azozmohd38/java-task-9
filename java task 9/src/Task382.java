public class Task382 {
    public static boolean isEven(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return true;
        }
        if (n == 1) {
            return false;
        }
        return isEven(n - 2);
    }

    public static void main(String[] args) {
        IO.println(isEven(8));
        IO.println(isEven(15));
    }
}
