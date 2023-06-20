public class sortedAscendingOrder {
    public static void main(String[] args) {
        int [] arr={9,2,3,4,5,6};
        boolean sorted=isSorted(arr);
        System.out.println("Is the array sorted ? " +sorted);
    }
    public static  boolean isSorted(int []arr){
        for (int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
