package slidingwindow;

import java.util.*;

public class binarySubarraySum {
    public static int binarySubarraywithSum(int[] nums ,int goal) {
        int n = nums.length, cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <=j; k++) {
                    sum += nums[k];
                }
                // System.out.println("sum is : "+ sum);
                if (sum == goal) {
                    cnt++;
                }

            }
        }
        return cnt;

    }

    public static void subarray(Integer[] arr, int n, List<Integer> tmp, List<List<Integer>> list) {
        if (n < 0) {
            list.add(new ArrayList<>(tmp));
            return;

        }
        tmp.add(arr[n]);
        //pick
        subarray(arr, n-1, tmp, list);
        // not pick 
        tmp.remove(tmp.size() - 1);
        subarray(arr, n - 1, tmp, list);

  }
    public static void main(String[] args) {
        Integer arr[] = {25,4,7 };
        int n = arr.length;
        // System.out.println("ans is : " + binarySubarraywithSum(arr, goal));
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        Arrays.sort(arr,Collections.reverseOrder());
        subarray(arr, n-1, tmp, list);
        System.out.println(list);
        
    }
}
