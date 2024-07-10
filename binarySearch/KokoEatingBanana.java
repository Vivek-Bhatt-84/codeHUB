package binarySearch;

/**
 * Math.ceil and Math.floor gfg 
 * leetcode 875
 * constraints -> 
 * 1 <= piles.length <= 10^4
* piles.length <= h <= 10^9
 * 1 <= piles[i] <= 10^9 
 * 1 sec -> 10^13 TLE 
 * 
 * in case there is a pattern where ans is in range possiblle to not possible use binary search on ans 
 */

public class KokoEatingBanana {
    // time complexity -> O(max(arr[]) * n)
    public static int maxArr(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    public static int reqTime(int[] arr, int hour) {
        int totalTime = 0;
        for (int i = 0; i < arr.length; i++) {
            totalTime += Math.ceil((double) arr[i] / (double) hour);
        }
        return totalTime;
    }

    // public static int minEatingSpeed(int[] piles, int h) {
    //     int maxi = maxArr(piles);

    //     for (int i = 0; i < maxi; i++) {
    //         int requiredTime = reqTime(piles, i);
    //         if (requiredTime <= h) {
    //             return i;
    //         }
    //     }
    //     return maxi;
    // }
        //binary search 
     public  static int minEatingSpeed(int[] piles, int h) {
        int maxi = maxArr(piles);
        int low = 1,high = maxi;
        while(low<=high){
            int mid = low+(high-low)/2;
            int requiredTime = reqTime(piles,mid);
            if(requiredTime <= h){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        int h = 6;
        System.out.println(minEatingSpeed(arr, h));
    }
}
