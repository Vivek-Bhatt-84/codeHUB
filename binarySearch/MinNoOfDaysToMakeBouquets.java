package binarySearch;

/**
 * time complexity -> brute force -> (maxi - mini +1) *O(n);
 * optimized -> o(nlog(max(arr)))
 */
public class MinNoOfDaysToMakeBouquets {
    public static boolean isPossible(int[] arr, int day, int m, int k) {
        int cnt = 0, bouq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                bouq += cnt / k;
                cnt = 0;
            }
        }
        bouq += cnt / k;
        if (bouq >= m)
            return true;
        return false;
    }

    public static int maxArr(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    public static int minArr(int[] arr) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            mini = Math.min(mini, arr[i]);
        }
        return mini;
    }
    // public int minDays(int[] bloomDay, int m, int k) {
    //     if(k*m > bloomDay.length) return -1;
    //     int max = maxArr(bloomDay);
    //     int min = minArr(bloomDay);
    //     int res = Integer.MAX_VALUE;
    //     for(int i=min ; i<=max ; i++){
    //         if(isPossible(bloomDay,i,m,k)){
    //             res = Math.min(res,i);
    //         }
    //     }
    //     return res; 
    // }
    public static int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length)
            return -1;
        int maxi = maxArr(bloomDay);
        int mini = minArr(bloomDay);
        int low = mini;
        int high = maxi;
        int res = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (!isPossible(bloomDay, mid, m, k)) {
                low = mid + 1;
            } else {
                res = Math.min(res, mid);
                high = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = { 1,10,3,10,2};
        int m = 3;
        int k = 1;
        System.out.println(minDays(arr, m, k));
    }
}
