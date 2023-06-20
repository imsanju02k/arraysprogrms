public class sumOfAllElements {
    public static void main(String[] args) {
        int[] arr={9,8,1,3};
        int sum=calsum(arr);
        System.out.println("Sum of the elements in array " +sum);
    }
    public static int calsum(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
