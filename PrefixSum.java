import java.util.*;

class PrefixSum {
    public int pivot(int[] arr) {
        /*
        724. Find Pivot Index
        Input: nums = [1,7,3,6,5,6]
        Output: 3
        
        */
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            int lSum = 0;
            if (i > 0) {
                lSum = pre[i];
            }
            int rSum = 0;
            if (rSum < n) {
                rSum = pre[n - 1] - pre[i];
            }
            if (lSum == rSum) {
                return i;
            }
        }
        return -1;
        // Time Complexity -> O(n) + O(n);
    }

    // public int[] twoSum(int[] numbers, int target) {
    //     // brute force 
    //     int arr[] = new int[2];
    //     for(int i = 0 ; i< numbers.length ; i++){
    //         for(int j = i+1 ; j<numbers.length;j++){
    //             if(numbers[i] + numbers[j] == target ){
    //                return new int[] {i+1 , j+1};
    //             }
    //         }
    //     }

    //     return arr;
    //     // time complexity -> O(n^2);

    // }

    // public static int[] twoSum(int[] nums, int target) {
    //     int n = nums.length;
    //     for (int i = 0; i < n; i++) {
    //         int s = i + 1;
    //         int e = n - 1;
    //         while (s <= e) {
    //             int mid = s + (e - s) / 2;
    //             if (nums[i] + nums[mid] == target) {
    //                 return new int[] { i + 1, mid + 1 };
    //             }
    //             if (nums[i] + nums[mid] < target) {
    //                 s = mid + 1;
    //             } else {
    //                 e = mid - 1;
    //             }
    //         }
    //     }
    //     return new int[] {};
    //     // time complexity -> O(nlogn)

    // }
    public static int[] twoSum(int[] nums, int target) {
    
}
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // int[] pre = new int[n];
        // pre[0] = arr[0];

        // for (int i = 1; i < n; i++) {
        //     pre[i] = pre[i - 1] + arr[i];
        // }

        // // no of queries 
        // int q = sc.nextInt();

        // for (int i = 0; i < q; i++) {
        //     int s = sc.nextInt();
        //     int e = sc.nextInt();

        //     int ans = pre[e] - pre[s - 1];
        //     System.out.println("sum form " + s + " till " + e + " is " + ans);
        // }
        // // time complexity :- o(n) + O(q) 

        // // System.out.println(Arrays.toString(pre));

        // sc.close();

        // two sum II 

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = twoSum(arr, 9);
        System.out.println(Arrays.toString(ans));

        sc.close();

    }
}