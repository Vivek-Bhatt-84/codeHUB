package binarySearch;

/**
 * leetcode 33
 * identify the sorted half
 * low < mid  -> hence that part is sorted 
 * 
 * in case of array with duplicate elements 
 * approach problem with method of unique elements then handle case of duplicates 
 * 
 * in case of roated array first identify which half is soretd then proceed
 */

public class SearchInrotatedSortedArray {
    //finding peak element 
    //  public int findPeakElement(int[] nums) {
    //     for(int i=0;i<nums.length;i++){
    //         if((i==0 || nums[i-1] < nums[i]) && ( i == nums.length-1 || nums[i] > nums[i+1])){
    //             return i;
    //         }
    //     }
    //     return -1;
    //     /*
    //      * time complexity O(n);
    //      */
    // }

    public static int findPeakElement(int[] arr) {
        int n = arr.length ;
        if (arr[0] > arr[1])
            return 0;
        if (arr[n-1] > arr[n - 2])
            return n - 1;
        int low = 1;
        int high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;
    }

    
    // finding min in rotated sorted array
    public static int findMin(int[] arr) {
        int l = 0, h = arr.length - 1, ans = Integer.MAX_VALUE;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            //check for left half if sorted
            if (arr[l] <= arr[mid]) {
                ans = Math.min(ans, arr[l]);
                l = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                h = mid - 1;

            }
        }
        return ans;

    }

    // array with duplicate elements 
    public boolean searcharr(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return true;

            //handle case of duplicates 
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high++;
                continue;
            }

            // check for left half sorted 
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid])
                    high = mid - 1;
                else {
                    low = mid + 1;
                }
            }
            //  check if right half sorted 
            else {
                if (arr[mid] <= target && target <= arr[high])
                    low = mid + 1;
                else {
                    high = mid - 1;
                }
            }

        }
        return false;
    }

    public static int search(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target)
                return mid;

            //identify left sorted or right sorted 
            //left sorted 
            // here we perform operation between low and mid i.e on left half 
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target <= nums[mid])
                    h = mid - 1;
                else {
                    l = mid + 1;
                }
            }
            // right half is sorted 
            // perform operations on right half i.e from mid to high 
            else {
                if (nums[mid] <= target && target <= nums[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3,4,5,7,3,1,2,4,6,3 };
        System.out.println(findPeakElement(arr));
    }
}