public class Task385 {

    public static int sumArray(int[] numbers) {
        return sumArrayHelper(numbers, 0);
    }

    private static int sumArrayHelper(int[] numbers, int index) {
        if (index >= numbers.length) {
            return 0;
        }
        return numbers[index] + sumArrayHelper(numbers, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(sumArray(new int[]{10, 20, 30, 40}));
    }
}
