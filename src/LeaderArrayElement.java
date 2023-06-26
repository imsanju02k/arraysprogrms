import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderArrayElement {
    public static List<Integer> findLeaders(int [] arr){
        List<Integer> leaders=new ArrayList<>();
        int n= arr.length;
        int maxRight=Integer.MIN_VALUE;

        for(int i=n-1;i>=0;i--){
            if(arr[i]>maxRight){
                leaders.add(arr[i]);
                maxRight=arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr={7,4,9,3,9,2};
        List<Integer> leaders=findLeaders(arr);
        System.out.println("Leaders : " +leaders);
    }
}
