public class Task376 {
    public static void printUp(int number) {
        if (number <= 0) {
            return;
        }
        printUp(number - 1);
        System.out.println(number);
    }

    private static void runExamples() {
        printUp(3);
        System.out.println("---");
        printUp(5);
    }

    public static void main(String[] args) {
        runExamples();
    }
}
