public class MaximumSubarray {
    // leetcode 53
     public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            maxi = Math.max(sum,maxi);
           if(sum < 0 ) sum =0 ;  

        }
        return maxi;
        
    }
    public static void main(String args[]) {
        int[] arr = {  -2 ,  1,  -3 , 4 ,  -1 , 2 ,  1, -5, 4 };
        int ans = maxSubArray(arr);
        System.out.println(ans);
    }
}
