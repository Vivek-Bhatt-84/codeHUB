package binarySearch;

/*
 * time complexity -> brute force -> O(n*maxi)
 * optimized BINARY SEARCH-> O(nlog(maxi))
 */
public class SmallestDivisorOfThreshold {
    public static int resDivision(int[] arr, int divisor) {
        int sum = 0;
            for (int i = 0; i < arr.length; i++) {
            sum += Math.ceil((double) arr[i] / (double) divisor);
        }
        return sum;
    }

    public static int maxArr(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }
    // public static int smallestDivisor(int[] nums, int threshold) {
    //     int maxi = maxArr(nums);
    //     int res = Integer.MAX_VALUE;
    //     for (int i = 1; i <= maxi; i++) {
    //         int sum = resDivision(nums, i);
    //         if (sum <= threshold) {
    //             res = Math.min(res, i);
    //         }
    //     }
    //     return res;
    // }
    public static int smallestDivisor(int[] nums, int threshold) {
        int maxi = maxArr(nums);
        int low = 1, high = maxi;
        // int res = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = resDivision(nums, mid);
            if (sum > threshold) {
                low = mid + 1;
            } else {
                // res = Math.min(res, mid);
                high = mid - 1;
            }

        }
        return low;
    
    }
    public static void main(String[] args) {
        int[] arr = { 44,  22 , 33,  11, 1 };
        int threshold = 5;
        System.out.println(smallestDivisor(arr, threshold));
    }
}
