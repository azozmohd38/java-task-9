public class Task386 {

    public static int findMax(int[] numbers) {
        return findMaxHelper(numbers, 0);
    }

    private static int findMaxHelper(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index];
        }
        int maxOfRest = findMaxHelper(numbers, index + 1);
        return Math.max(numbers[index], maxOfRest);
    }

    public static void main(String[] args) {
        IO.println(findMax(new int[]{3, 7, 2, 9, 4}));
    }
}
