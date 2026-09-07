public class Task376 {
    public static void printUp(int number) {
        if (number <= 0) {
            return;
        }
        printUp(number - 1);
        System.out.println(number);
    }

    public static void main(String[] args) {
        printUp(5);
    }
}
