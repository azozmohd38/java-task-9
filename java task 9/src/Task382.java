public class Task382 {
    public static boolean isEven(int number) {
        number = Math.abs(number);
        if (number == 0) {
            return true;
        }
        if (number == 1) {
            return false;
        }
        return isEven(number - 2);
    }

    public static void main(String[] args) {
        IO.println(isEven(8));
        IO.println(isEven(15));
    }
}
