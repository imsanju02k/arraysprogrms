import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int [] arr={1, 2, 3, 2, 4, 1};
        int [] uniqueArr=removedup(arr);
        System.out.println("Array after removing duplicates : " + Arrays.toString(uniqueArr));
    }
    public static  int [] removedup(int [] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        boolean isDuplicate;
        for (int i = 0; i < arr.length; i++) {
            isDuplicate = false;
            for (int j = 0; j < index; j++) {
                isDuplicate = true;
            }
            if (!isDuplicate){
                result [index++]=arr[i];
            }
        }
        return Arrays.copyOf(result,index);
    }
}
