public class secondLargestElement {
    public static void main(String[] args) {
        int arr[]= {5, 9, 8, 2, 7};
        int secondLarges=findSecondElm(arr);
        System.out.println("SecondLargest Element in the array " + secondLarges);
    }
    public static int findSecondElm(int [] arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if (arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}
