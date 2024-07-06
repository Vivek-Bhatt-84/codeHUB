package binarySearch;

/* 
 * lower bound -> smallest index where arr[ind] >= x
 * upper bound -> smallest index where arr[ind] > x 
 */
import java.util.Arrays;

class Pair {
    int floor, ceil;

    Pair() {
        this.floor = 0; // largest no in array <= target 
        this.ceil = 0; // smallest no in array >= target 
    }

    Pair(int floor, int ceil) {
        this.floor = floor;
        this.ceil = ceil;
    }
}
public class BinarySearch {
    public static int bs(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return 0;
    }

    public static Pair getFloorAndCeil(int[] arr, int n, int x) {
        Arrays.sort(arr);
        int getfloor = floor(arr, x);
        int getCeil = ceil(arr, x);
        return new Pair(getfloor, getCeil);

    }

    public static int floor(int[] arr ,int target) {
         int s = 0 , e = arr.length - 1;
         int ans = -1;
         while (s <= e) {
             int mid = s + (e - s) / 2;
             if (arr[mid] <= target) {
                 ans = mid;
                 e = mid - 1;
             }
             else{
                s=mid+1;
             }
        }
        return ans;
    }
    public static int ceil(int[] arr ,int target) {
         int s = 0 , e = arr.length - 1;
         int ans = -1;
         while (s <= e) {
             int mid = s + (e - s) / 2;
             if (arr[mid] >= target) {
                 ans = mid;
                 s = mid + 1;
             }
             else{
                 e = mid - 1;
             }
        }
        return ans;
    }
public static void main(String[] args) {
    
    int[] arr = { 3, 4, 6, 7, 9, 12, 16, 17 };
    int ans = bs(arr, 6);
    System.out.println(ans);
}
    
}
