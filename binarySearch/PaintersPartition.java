package binarySearch;

public class PaintersPartition {
    public static int minimizedSubarraySum(int[] arr, int maxSum) {
        int possibleSubarrays = 1;
        int subarraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + subarraySum <= maxSum) {
                subarraySum += arr[i];
            } else {
                possibleSubarrays++;
                subarraySum = arr[i];
            }
        }
        return possibleSubarrays;
    }

    public static int splitArray(int[] nums, int k) {
        if (k > nums.length)
            return -1;
        int high = 0;
        int low = nums[0];
        for(int i=0 ; i<nums.length;i++){
            if(nums[i] > low ) low = nums[i];
            high+=nums[i];
        }

        // for (int maxSum = low; maxSum <= high; maxSum++) {
        //     if (minimizedSubarraySum(nums, maxSum) == k) {
        //         return maxSum;
        //     }
        // }
        // return low;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (minimizedSubarraySum(nums, mid) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return low;
    }
    public static void main(String[] args) {
        
    }
}
