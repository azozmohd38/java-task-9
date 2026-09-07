public class Task375 {
    public static void countDownUp(int number) {
        if (number < 1) {
            return;
        }

        System.out.println(number);
        countDownUp(number - 1);

        if (number > 1) {
            System.out.println(number);
        }
    }

    private static void runExamples() {
        countDownUp(3);
        System.out.println("---");
        countDownUp(1);
        System.out.println("---");
        countDownUp(4);
    }

    public static void main(String[] args) {
        runExamples();
    }
}
