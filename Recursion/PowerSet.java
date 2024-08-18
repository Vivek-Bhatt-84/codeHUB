import java.util.*;
public class PowerSet {
     public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<Integer> ref = new ArrayList<>();
         List<List<Integer>> res = new ArrayList<>();
         f(nums, n - 1, ref, res);
         return res;
        
    }

    public static void f(int[] nums, int n, List<Integer> ref, List<List<Integer>> res) {
        if (n < 0) {
            res.add(new ArrayList<>(ref));
            return;
        }

        //pick
        ref.add(nums[n]);
        f(nums, n - 1, ref, res);
       
        //not pick
        ref.remove(ref.size() - 1);
        f(nums, n-1, ref, res);

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int n = nums.length;

        int tmp = (1 << n) - 1;

        for (int num = 0; num <= tmp; num++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((num & (1 << i)) != 0) {
                    list.add(nums[i]);
                }
            }
                System.out.println(list);
        }
       
        // List<List<Integer>> res = new ArrayList<>();
        // res = subsets(nums);
        // System.out.println(res);
        //  String nums = "abc";
        // int n = nums.length();
        // int tmp = (1 << n) - 1;
        // for (int num = 0; num <= tmp; num++) {
        //     String str = "";
        //     for (int i = 0; i < n; i++) {
        //         if((num & (1 << i)) != 0) {
        //             str += nums.charAt(i);
        //         }
        //     }
        //     System.out.print(str+" ");
        // }

    }
}
