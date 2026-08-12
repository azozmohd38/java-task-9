public class Task386 {

    public static int findMax(int[] arr) {
        return findMaxHelper(arr, 0);
    }

    private static int findMaxHelper(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int maxOfRest = findMaxHelper(arr, index + 1);
        return Math.max(arr[index], maxOfRest);
    }

    public static void main(String[] args) {
        IO.println(findMax(new int[]{3, 7, 2, 9, 4})); // 9
    }
}
