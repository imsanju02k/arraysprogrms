import java.util.Arrays;

public class rotateArray {
    public static void rotateArrayElement(int arr[],int steps){
        int n = arr.length;
        steps %= n;

        reverse(arr,0,n-1);
        reverse(arr,0,steps-1);
        reverse(arr,steps,n-1);
    }
    public static void reverse (int []arr,int start,int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int steps=6;
        rotateArrayElement(arr,steps);
        System.out.println("Rotated array : " + Arrays.toString(arr));
    }
}
