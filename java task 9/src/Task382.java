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

    private static void runExamples() {
        System.out.println(isEven(0));
        System.out.println(isEven(8));
        System.out.println(isEven(7));
        System.out.println(isEven(15));
        System.out.println(isEven(100));
    }

    public static void main(String[] args) {
        runExamples();
    }
}
