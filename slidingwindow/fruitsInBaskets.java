package slidingwindow;

import java.util.*;

public class fruitsInBaskets {
    public static int totalFruit(int[] arr) {
        int n = arr.length, maxLen = 0, l = 0, r = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (r < n) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);
            System.out.println("map after adding " +  arr[r] +" "+ map);

            if (map.size() > 2) {
                map.put(arr[l], map.get(arr[l]) - 1);
                System.out.println("map after updating " +  arr[l]+" " + map);
                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                    System.out.println("map after removing " +arr[l] +" " + map);
                }
                l++;
            }
            if (map.size() <= 2) {
                maxLen = Math.max(maxLen, r - l + 1);
                System.out.println("max length is " + maxLen);
            }
            r++;
        }
        return maxLen;

    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 2};
        System.out.println("ans is : " + totalFruit(arr));
    }
}
