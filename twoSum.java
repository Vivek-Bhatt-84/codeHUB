import java.util.*;
public class twoSum {
    public static void coinChange(int[] arr,int i,int target, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> res ) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;

        }
        if (target < 0 || i<0) {
            return;
        }
            
        if (target - arr[i] >= 0) {
            list.add(arr[i]);
            coinChange(arr, i, target - arr[i], list, res);
            list.remove(list.size() - 1);
       }
        coinChange(arr, i - 1, target,list,res);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5};
        int target = 11;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        coinChange(arr, arr.length-1, target, list, res);
        System.out.println(res);
        

    }
}
