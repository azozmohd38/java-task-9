public class Task386 {

    public static int findMax(int[] numbers) {
        return findFromIndex(numbers, 0);
    }

    private static int findFromIndex(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index];
        }
        int maxOfRest = findFromIndex(numbers, index + 1);
        return Math.max(numbers[index], maxOfRest);
    }

    private static void runExamples() {
        System.out.println(findMax(new int[]{3, 7, 2, 9, 4}));
        System.out.println(findMax(new int[]{1, 1, 1}));
        System.out.println(findMax(new int[]{-5, -2, -8}));
        System.out.println(findMax(new int[]{42}));
    }

    public static void main(String[] args) {
        runExamples();
    }
}
