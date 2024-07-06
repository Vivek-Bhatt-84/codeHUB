package binarySearch;


public class BinarySearch {
    public static int bs(int[]arr,int target){
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
public static void main(String[] args) {
    
    int[] arr = { 3, 4, 6, 7, 9, 12, 16, 17 };
    int ans = bs(arr, 6);
    System.out.println(ans);
}
    
}
