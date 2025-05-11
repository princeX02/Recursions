import java.*;
import java.util.ArrayList;
import java.util.List;
public class  SubsequenceSumK1 {
    public static boolean sumK(int idx,int arr[],int sum,int k,ArrayList<Integer> ds){
        if(idx==arr.length){
            if(sum==k){
                System.out.println(ds);
                return true;
            }
            return false;
        }

        ds.add(arr[idx]);
        if(sumK(idx+1, arr, sum+arr[idx], k, ds)){
            return true;
        }
        ds.remove(ds.size()-1);

        if(sumK(idx+1, arr, sum, k, ds)){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        System.out.println(sumK(0, arr,0, 2,new ArrayList<>()));
    }
}
