public class Task385 {

    public static int sumArray(int[] arr) {
        return sumArrayHelper(arr, 0);
    }

    private static int sumArrayHelper(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + sumArrayHelper(arr, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(sumArray(new int[]{10, 20, 30, 40})); // 100
    }
}
