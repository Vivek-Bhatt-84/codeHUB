package binarySearch;

public class CapacityToShipPackagesWithinDays {
    static int totalSum = 0;
    //  public static boolean validWeight(int[] arr,int days,int weight){
    //     int sum =0,cnt=1;
    //     for(int i=0;i<arr.length;i++){
    //         // System.out.println("sum at index " + i + " "+ sum );
    //         if (sum + arr[i] > weight) {
    //             cnt++;
    //             sum = arr[i];
    //             // System.out.println("count at index " + i + " " + cnt);
    //             // System.out.println("sum at index " + i + " "+ sum );

    //         }
    //         else {
    //             sum += arr[i];
    //         }

    //     }
    //     if(cnt <= days){
    //         return true;
    //     }
    //     return false;
    // }
    public static boolean validWeight(int[] arr, int days, int weight) {
        int sum = 0, cnt = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > weight) {
                cnt++;
                sum = 0;
                sum = arr[i];
            }
        }
        if (cnt <= days) {
            return true;
        }
        return false;
    }

    public static int maxElement(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            maxi = Math.max(arr[i], maxi);
        }
        return maxi;
    }
     public static int shipWithinDays(int[] weights, int days) {
        int low = maxElement(weights);
        int high = totalSum;
        // int res = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (validWeight(weights, days, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
       
        
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        //  int maxi = maxElement(arr);
        // int total = totalSum;
        int res = shipWithinDays(arr, 5);
        // for(int i = maxi ; i<= total;i++){
        //     if(validWeight(arr,5,i)){
        //         res = Math.min(res,i);
        //     }
        // }
        System.out.println(res);
        // System.out.println(maxElement(arr));
        // System.out.println(totalSum);
        // System.out.println(validWeight(arr, 5, 15));

    }
}
