import java.util.*;

public class SubsequenceWithSumk {
    public static boolean print(int[] arr, int i, int sum, List<List<Integer>> res, int k, List<Integer> ref) {
        //Base Case 
        if (i == arr.length ) {
            if (sum == k) {
                res.add(new ArrayList<>(ref));
                return true;
            }
            else
                return false;

        }

        // pick 
        ref.add(arr[i]);
        sum += arr[i];
        if (print(arr, i + 1, sum, res, k, ref))
            return true;
        
        sum -= arr[i];
        ref.remove(ref.size() - 1);
        // not pick 
        if (print(arr, i + 1, sum, res, k, ref))
            return true;

        return false;    
        }
    public static int count(int[] arr, int i, int sum, List<List<Integer>> res, int k, List<Integer> ref) {
        //Base Case 
        if (i == arr.length ) {
            if (sum == k) {

                return 1;
            }
            else
                return 0;

        }

        // pick 
        ref.add(arr[i]);
        sum += arr[i];
        int left = count(arr, i + 1, sum, res, k, ref);
           
        
        sum -= arr[i];
        ref.remove(ref.size() - 1);
        // not pick 
        int right = count(arr, i + 1, sum, res, k, ref);
           

        return left + right;   
        }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        List<Integer> ref = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        print(arr, 0, 0, res, 2, ref);
        System.out.println(res);
        System.out.println(count(arr, 0, 0, res, 2, ref));

    }
}
