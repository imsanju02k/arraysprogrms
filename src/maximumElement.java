public class maximumElement {
    public static void main(String[] args) {
      int [] arr={5,9,8,7,3};
      int max=findmax(arr);
        System.out.println(" Maximum element : " + max);
    }
    public static int findmax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
