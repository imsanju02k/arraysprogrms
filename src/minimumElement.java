public class minimumElement {
    public static void main(String[] args) {
        int arr[]={9,4,6,2,0,1};
        int min=findmin(arr);
        System.out.println("Minimum of the array " +min);
    }
    public static int findmin(int[] arr){
       int min=arr[0];
       for(int i=0;i<arr.length;i++){
           if (arr[i]<min){
               min=arr[i];
           }
       }
       return min;
    }
}
