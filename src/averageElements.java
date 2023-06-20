public class averageElements {
    public static void main(String[] args) {
        int [] arr={4,8,9,6,3,1};
        double avg=average(arr);
        System.out.println("Average of the all the elements in array " + avg);
    }
    public  static double average(int [] arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
}
