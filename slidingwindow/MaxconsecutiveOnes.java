package slidingwindow;

public class MaxconsecutiveOnes {
    public static int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, n = nums.length, zeros = 0, maxLen = 0;

        while (r < n) {
            if (nums[r] == 0) {
                zeros++;
            }
            
            while (zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }
            if (zeros <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        return maxLen;  

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println("ans is : " + longestOnes(arr,k));
    }
}
