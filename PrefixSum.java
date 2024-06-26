import java.util.*;
class PrefixSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] pre = new int[n];
        pre[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + arr[i];
        }

        // no of queries 
        int q = sc.nextInt();
       
        for (int i = 0; i < q; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            int ans = pre[e] - pre[s - 1];
            System.out.println("sum form " +s  + " till " + e + " is "+ans);
        }
        // time complexity :- o(n) + O(q) 
        


        // System.out.println(Arrays.toString(pre));

        sc.close();

    }
}