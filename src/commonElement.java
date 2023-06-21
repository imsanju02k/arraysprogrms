import java.util.*;

public class commonElement {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6};
        int [] arr2={3,4,5,6,7};
        int common[]=findcommon(arr1,arr2);
        System.out.println("Common elements :" + Arrays.toString(common));
    }
    public static int[] findcommon(int arr1[],int arr2[]){
        Set<Integer> set=new HashSet<>();
        List<Integer> commonElements=new ArrayList<>();
        for (int num:arr1)
            set.add(num);
        for (int num:arr2){
            if (set.contains(num)){
                commonElements.add(num);
            }
        }
        int [] result=new int[commonElements.size()];
        for (int i=0;i<commonElements.size();i++){
            result[i]=commonElements.get(i);
        }
        return result;
    }
}
