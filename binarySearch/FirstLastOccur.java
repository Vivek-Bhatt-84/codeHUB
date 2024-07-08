package binarySearch;

/*
 * first and last occurance using binary search 
 * using upper bound lower bound 
 * brute force O(n).
 */
public class FirstLastOccur {
    public static int first(int[] arr, int x) {
        int n = arr.length;
        int l = 0, h = n - 1, first = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == x) {
                first = mid;
                h = mid - 1;
            }
            else if (arr[mid] < x) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return first;
    }
    public static int last(int[] arr, int x) {
        int n = arr.length;
        int l = 0, h = n - 1, last = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == x) {
                last = mid;
                l = mid + 1;
            }
            else if (arr[mid] < x) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int[] arr = {  10,11 };
        int x = 10;
        int ans = last(arr, x);
        int first = first(arr, x);
        System.out.println(first);
        System.out.println(ans);
    }
}
