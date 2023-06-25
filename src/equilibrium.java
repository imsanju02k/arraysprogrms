import java.util.Arrays;

public class equilibrium {
    public static int [] findEquilibriumIndex(int [] arr){
       int n=arr.length;
       int totalSum=0;
       int leftSum=0;

       for(int num:arr){
           totalSum+=num;
       }
       for(int i=0;i<n;i++){
           totalSum-=arr[i];
           if(leftSum==totalSum){
               return new int[]{i};
           }
           leftSum+=arr[i];
       }
       return new int[]{-1};
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3, 0};
        int[] equilibriumIndex = findEquilibriumIndex(arr);
        System.out.println("Equilibrium index: " + Arrays.toString(equilibriumIndex) );
    }

}
