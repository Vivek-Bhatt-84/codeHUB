import java.util.*;

class MergerSort {
    public static void mergesort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = (s + e) / 2;
        mergesort(arr, s, mid);
        mergesort(arr, mid + 1, e);
        merger(arr, s, mid, e);
    }

    public static void merger(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }

        while (right <= high) {
            list.add(arr[right]);
            right++;
        }

        // merge two arrays
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // merge sort
        mergesort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
