package slidingwindow;

import java.util.*;

public class longestReapitingCharReplace {
    public static int characterReplacement(String s, int k) {
        int n = s.length(), l = 0, r = 0, maxLen = 0,maxF = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (r < n) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxF = Math.max(maxF, map.get(s.charAt(r)));

            if ((r - l + 1) - maxF > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }

            if ((r - l + 1) - maxF <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        return maxLen;



    }
    public static void main(String[] args) {
        String str = "AABABBA";
        int k = 1;
        System.out.println("ans is : " + characterReplacement(str, k));
    }
}
