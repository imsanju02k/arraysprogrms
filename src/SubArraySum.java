public class SubArraySum {
    public static int findMaxSubArraySum(int[] arr){
        int maxSoFar=arr[0];
        int maxEndingHere=arr[0];

        for(int i=1;i<arr.length;i++){
            maxEndingHere=Math.max(maxEndingHere + arr[i],arr[i]);
            maxSoFar=Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int [] arr={-2,-3,4,-1,-2,1,5,-3};
        int maxSum=findMaxSubArraySum(arr);
        System.out.println("Maximum subArray sum : " + maxSum);
    }
}
