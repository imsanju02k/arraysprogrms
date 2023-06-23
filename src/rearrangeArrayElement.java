import java.util.Arrays;

public class rearrangeArrayElement {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, -5, 6};
        rearrangeArray(arr);
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }

    private static void rearrangeArray(int[] arr) {
        int positiveIndex = 0;
        int negativeIndex = 1;
        int n = arr.length;
        while (positiveIndex < n && negativeIndex < n) {
            while (positiveIndex < n && arr[positiveIndex] >= 0) {
                positiveIndex += 2;
            }
            while (negativeIndex < n && arr[negativeIndex] <= 0) {
                negativeIndex += 2;
            }
            if (positiveIndex < n && negativeIndex < n) {
                int temp = arr[positiveIndex];
                arr[positiveIndex] = arr[negativeIndex];
                arr[negativeIndex] = temp;
            }
        }
            }
}
