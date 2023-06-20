import java.util.Arrays;

public class reverseElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        reverseElm(arr);
        System.out.println("the reverseElement  are " + Arrays.toString(arr));
    }
    public static void reverseElm(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
