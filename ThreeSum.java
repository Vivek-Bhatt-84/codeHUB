import java.util.*;

public class ThreeSum {
    // public static List<List<Integer>> threeSum(int[] nums) {
    //     Arrays.sort(nums);
    //     int n = nums.length;
    //     Set<List<Integer>> set = new HashSet<>();
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             for (int k = j + 1; k < n; k++) {
    //                 if (nums[i] + nums[j] + nums[k] == 0) {
    //                     List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
    //                     set.add(list);
    //                 }

    //             }
    //         }
    //     }

    //     List<List<Integer>> ans = new ArrayList<>(set);
    //     return ans;
    //     //time complexity -> O(n^3)*log(no of unique elements ) for set 
    //     // space complexity -> 2* O(no of triplets);    
    // }  
    // public static List<List<Integer>> threeSum(int[] nums) {
    //     int n = nums.length;
    //     Set<List<Integer>> set = new HashSet<>();

    //     for (int i = 0; i < n; i++) {
    //         Set<Integer> s = new HashSet<>();
    //         for (int j = i + 1; j < n; j++) {
    //             int third = -(nums[i] + nums[j]);
    //             if (s.contains(third)) {
    //                 List<Integer> tmp = Arrays.asList(nums[i], nums[j], third);
    //                 tmp.sort(null);
    //                 set.add(tmp);
    //             }
    //             s.add(nums[j]);
    //         }
    //     }
    //     List<List<Integer>> res = new ArrayList<>(set);
    //     return res;

    //     // time complexity -> O(n^2);
    //     //space complexity -> O(N)+O(no of triplets)
    // }   

    public static List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                    while (j > k && arr[j] == arr[j - 1])
                        j++;
                    while (j > k && arr[k] == arr[k + 1])
                        k--;

                }
            }
        }
        return res;
        // time complexity -> O(n^2)
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);

        sc.close();
    }
}
